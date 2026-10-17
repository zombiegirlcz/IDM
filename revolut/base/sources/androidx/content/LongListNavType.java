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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J%\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J(\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Landroidx/navigation/LongListNavType;", "Landroidx/navigation/CollectionNavType;", "", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "put", "", "bundle", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "key", "value", "get", "parseValue", "previousValue", "valueEquals", "", "other", "serializeAsValues", "emptyCollection", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LongListNavType extends CollectionNavType<List<? extends Long>> {
    public LongListNavType() {
        super(true);
    }

    @Override // androidx.content.CollectionNavType
    @NotNull
    public List<? extends Long> emptyCollection() {
        return f0.f322471a;
    }

    @Override // androidx.content.NavType
    @NotNull
    public String getName() {
        return "List<Long>";
    }

    @Override // androidx.content.CollectionNavType
    public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Long> list) {
        return serializeAsValues2((List<Long>) list);
    }

    @Override // androidx.content.NavType
    public List<Long> get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM3590constructorimpl = SavedStateReader.m3590constructorimpl(bundle);
        if (!SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, key) || SavedStateReader.m3612isNullimpl(bundleM3590constructorimpl, key)) {
            return null;
        }
        return d.u0(SavedStateReader.m3602getLongArrayimpl(bundleM3590constructorimpl, key));
    }

    @Override // androidx.content.NavType
    public void put(@NotNull Bundle bundle, @NotNull String key, List<Long> value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM3615constructorimpl = SavedStateWriter.m3615constructorimpl(bundle);
        if (value != null) {
            SavedStateWriter.m3624putLongArrayimpl(bundleM3615constructorimpl, key, d0.e1(value));
        } else {
            SavedStateWriter.m3625putNullimpl(bundleM3615constructorimpl, key);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(List<Long> value) {
        if (value == null) {
            return f0.f322471a;
        }
        List<Long> list = value;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(String.valueOf(((Number) it8.next()).longValue()));
        }
        return arrayList;
    }

    @Override // androidx.content.NavType
    public boolean valueEquals(List<Long> value, List<Long> other) {
        return n.b(value != null ? (Long[]) value.toArray(new Long[0]) : null, other != null ? (Long[]) other.toArray(new Long[0]) : null);
    }

    @Override // androidx.content.NavType
    @NotNull
    public List<Long> parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return u.c(NavType.LongType.parseValue(value));
    }

    @Override // androidx.content.NavType
    public List<Long> parseValue(@NotNull String value, List<Long> previousValue) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (previousValue == null) {
            return parseValue(value);
        }
        return d0.E0(parseValue(value), previousValue);
    }
}
