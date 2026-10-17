package cgh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements cli.j {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f23977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f23978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1h.g f23979c;

    public l(Data instrument, Data fundDetails, d1h.g gVar) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(fundDetails, "fundDetails");
        this.f23977a = instrument;
        this.f23978b = fundDetails;
        this.f23979c = gVar;
    }

    public static l a(l lVar, Data instrument, Data fundDetails, d1h.g gVar, int i) {
        if ((i & 1) != 0) {
            instrument = lVar.f23977a;
        }
        if ((i & 2) != 0) {
            fundDetails = lVar.f23978b;
        }
        if ((i & 4) != 0) {
            gVar = lVar.f23979c;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(fundDetails, "fundDetails");
        return new l(instrument, fundDetails, gVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f23977a, lVar.f23977a) && Intrinsics.f(this.f23978b, lVar.f23978b) && Intrinsics.f(this.f23979c, lVar.f23979c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f23978b, this.f23977a.hashCode() * 31, 31);
        d1h.g gVar = this.f23979c;
        return iC + (gVar == null ? 0 : gVar.hashCode());
    }
}
