package ch1;

import com.revolut.data.model.Data;
import com.revolut.feature.cards.models.revolutcard.LocationMismatch;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f24106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutCardOtp f24107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationMismatch f24108c;
    public final boolean d;
    public final co3.a e;

    public i(Data cardWrapper, RevolutCardOtp cardOtp, LocationMismatch locationMismatch, boolean z, co3.a aVar) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        Intrinsics.checkNotNullParameter(locationMismatch, "locationMismatch");
        this.f24106a = cardWrapper;
        this.f24107b = cardOtp;
        this.f24108c = locationMismatch;
        this.d = z;
        this.e = aVar;
    }

    public static i a(i iVar, Data data, co3.a aVar, int i) {
        if ((i & 1) != 0) {
            data = iVar.f24106a;
        }
        Data cardWrapper = data;
        RevolutCardOtp cardOtp = iVar.f24107b;
        LocationMismatch locationMismatch = iVar.f24108c;
        boolean z = iVar.d;
        if ((i & 16) != 0) {
            aVar = iVar.e;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        Intrinsics.checkNotNullParameter(locationMismatch, "locationMismatch");
        return new i(cardWrapper, cardOtp, locationMismatch, z, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f24106a, iVar.f24106a) && Intrinsics.f(this.f24107b, iVar.f24107b) && Intrinsics.f(this.f24108c, iVar.f24108c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f24108c.hashCode() + ((this.f24107b.hashCode() + (this.f24106a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        co3.a aVar = this.e;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
