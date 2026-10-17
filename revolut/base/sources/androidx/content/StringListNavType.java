package androidx.content;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.n;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J%\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J(\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Landroidx/navigation/StringListNavType;", "Landroidx/navigation/CollectionNavType;", "", "", "<init>", "()V", "name", "getName", "()Ljava/lang/String;", "put", "", "bundle", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "key", "value", "get", "parseValue", "previousValue", "valueEquals", "", "other", "serializeAsValues", "emptyCollection", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StringListNavType extends CollectionNavType<List<? extends String>> {
    public StringListNavType() {
        super(true);
    }

    @Override // androidx.content.CollectionNavType
    @NotNull
    public List<? extends String> emptyCollection() {
        return f0.f322471a;
    }

    @Override // androidx.content.NavType
    @NotNull
    public String getName() {
        return "List<String>";
    }

    @Override // androidx.content.CollectionNavType
    public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends String> list) {
        return serializeAsValues2((List<String>) list);
    }

    @Override // androidx.content.NavType
    public List<String> get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM3590constructorimpl = SavedStateReader.m3590constructorimpl(bundle);
        if (!SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, key) || SavedStateReader.m3612isNullimpl(bundleM3590constructorimpl, key)) {
            return null;
        }
        return d.v0(SavedStateReader.m3608getStringArrayimpl(bundleM3590constructorimpl, key));
    }

    @Override // androidx.content.NavType
    public void put(@NotNull Bundle bundle, @NotNull String key, List<String> value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM3615constructorimpl = SavedStateWriter.m3615constructorimpl(bundle);
        if (value != null) {
            SavedStateWriter.m3631putStringArrayimpl(bundleM3615constructorimpl, key, (String[]) value.toArray(new String[0]));
        } else {
            SavedStateWriter.m3625putNullimpl(bundleM3615constructorimpl, key);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(List<String> value) {
        if (value == null) {
            return f0.f322471a;
        }
        List<String> list = value;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(NavUriUtils.encode$default(NavUriUtils.INSTANCE, (String) it8.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.content.NavType
    public boolean valueEquals(List<String> value, List<String> other) {
        return n.b(value != null ? (String[]) value.toArray(new String[0]) : null, other != null ? (String[]) other.toArray(new String[0]) : null);
    }

    @Override // androidx.content.NavType
    @NotNull
    public List<String> parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return u.c(value);
    }

    @Override // androidx.content.NavType
    public List<String> parseValue(@NotNull String value, List<String> previousValue) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (previousValue == null) {
            return parseValue(value);
        }
        return d0.E0(parseValue(value), previousValue);
    }
}
