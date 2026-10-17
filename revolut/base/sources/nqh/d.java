package nqh;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import kotlin.jvm.internal.Intrinsics;
import uqh.z;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f218452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenerSelectedSorting f218453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f218454c;

    public d(z extensionState, ScreenerSelectedSorting screenerSelectedSorting, Data data) {
        Intrinsics.checkNotNullParameter(extensionState, "extensionState");
        this.f218452a = extensionState;
        this.f218453b = screenerSelectedSorting;
        this.f218454c = data;
    }

    public static d a(d dVar, z extensionState, ScreenerSelectedSorting screenerSelectedSorting, Data data, int i) {
        if ((i & 1) != 0) {
            extensionState = dVar.f218452a;
        }
        if ((i & 2) != 0) {
            screenerSelectedSorting = dVar.f218453b;
        }
        if ((i & 4) != 0) {
            data = dVar.f218454c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(extensionState, "extensionState");
        return new d(extensionState, screenerSelectedSorting, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f218452a, dVar.f218452a) && Intrinsics.f(this.f218453b, dVar.f218453b) && Intrinsics.f(this.f218454c, dVar.f218454c);
    }

    public final int hashCode() {
        int iHashCode = this.f218452a.hashCode() * 31;
        ScreenerSelectedSorting screenerSelectedSorting = this.f218453b;
        int iHashCode2 = (iHashCode + (screenerSelectedSorting == null ? 0 : screenerSelectedSorting.hashCode())) * 31;
        Data data = this.f218454c;
        return iHashCode2 + (data != null ? data.hashCode() : 0);
    }
}
