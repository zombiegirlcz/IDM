package androidx.content;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.n;
import zhm.p;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0096\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Landroidx/navigation/IntArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "put", "", "bundle", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "key", "value", "get", "parseValue", "previousValue", "valueEquals", "", "other", "serializeAsValues", "", "emptyCollection", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntArrayNavType extends CollectionNavType<int[]> {
    public IntArrayNavType() {
        super(true);
    }

    @Override // androidx.content.CollectionNavType
    @NotNull
    public int[] emptyCollection() {
        return new int[0];
    }

    @Override // androidx.content.NavType
    @NotNull
    public String getName() {
        return "integer[]";
    }

    @Override // androidx.content.NavType
    public int[] get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM3590constructorimpl = SavedStateReader.m3590constructorimpl(bundle);
        if (!SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, key) || SavedStateReader.m3612isNullimpl(bundleM3590constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m3600getIntArrayimpl(bundleM3590constructorimpl, key);
    }

    @Override // androidx.content.NavType
    public void put(@NotNull Bundle bundle, @NotNull String key, int[] value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM3615constructorimpl = SavedStateWriter.m3615constructorimpl(bundle);
        if (value != null) {
            SavedStateWriter.m3622putIntArrayimpl(bundleM3615constructorimpl, key, value);
        } else {
            SavedStateWriter.m3625putNullimpl(bundleM3615constructorimpl, key);
        }
    }

    @Override // androidx.content.CollectionNavType
    @NotNull
    public List<String> serializeAsValues(int[] value) {
        List listT0;
        if (value == null || (listT0 = d.t0(value)) == null) {
            return f0.f322471a;
        }
        List list = listT0;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(String.valueOf(((Number) it8.next()).intValue()));
        }
        return arrayList;
    }

    @Override // androidx.content.NavType
    public boolean valueEquals(int[] value, int[] other) {
        return n.b(value != null ? p.C(value) : null, other != null ? p.C(other) : null);
    }

    @Override // androidx.content.NavType
    @NotNull
    public int[] parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new int[]{NavType.IntType.parseValue(value).intValue()};
    }

    @Override // androidx.content.NavType
    @NotNull
    public int[] parseValue(@NotNull String value, int[] previousValue) {
        Intrinsics.checkNotNullParameter(value, "value");
        int[] elements = parseValue(value);
        if (previousValue == null) {
            return elements;
        }
        Intrinsics.checkNotNullParameter(previousValue, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = previousValue.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(previousValue, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        Intrinsics.h(iArrCopyOf);
        return iArrCopyOf;
    }
}
