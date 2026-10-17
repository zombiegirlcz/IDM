package xxi;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f309536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f309537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f309538c;

    public e(Data passActivityData, Data passActivityFiltersData, Map selectedFilters) {
        Intrinsics.checkNotNullParameter(passActivityData, "passActivityData");
        Intrinsics.checkNotNullParameter(passActivityFiltersData, "passActivityFiltersData");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f309536a = passActivityData;
        this.f309537b = passActivityFiltersData;
        this.f309538c = selectedFilters;
    }

    public static e a(e eVar, Data passActivityData, Data passActivityFiltersData, Map selectedFilters, int i) {
        if ((i & 1) != 0) {
            passActivityData = eVar.f309536a;
        }
        if ((i & 2) != 0) {
            passActivityFiltersData = eVar.f309537b;
        }
        if ((i & 4) != 0) {
            selectedFilters = eVar.f309538c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(passActivityData, "passActivityData");
        Intrinsics.checkNotNullParameter(passActivityFiltersData, "passActivityFiltersData");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        return new e(passActivityData, passActivityFiltersData, selectedFilters);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f309536a, eVar.f309536a) && Intrinsics.f(this.f309537b, eVar.f309537b) && Intrinsics.f(this.f309538c, eVar.f309538c);
    }

    public final int hashCode() {
        return this.f309538c.hashCode() + kii.e.c(this.f309537b, this.f309536a.hashCode() * 31, 31);
    }
}
