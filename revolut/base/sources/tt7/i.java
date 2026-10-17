package tt7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f274243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f274244b;

    public i(Data layout, hha.d dVar) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f274243a = layout;
        this.f274244b = dVar;
    }

    public static i a(i iVar, Data layout, hha.d dVar, int i) {
        if ((i & 1) != 0) {
            layout = iVar.f274243a;
        }
        if ((i & 2) != 0) {
            dVar = iVar.f274244b;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new i(layout, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f274243a, iVar.f274243a) && Intrinsics.f(this.f274244b, iVar.f274244b);
    }

    public final int hashCode() {
        int iHashCode = this.f274243a.hashCode() * 31;
        hha.d dVar = this.f274244b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
