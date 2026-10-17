package k3k;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f180806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3k.d f180807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f180808c;
    public final PaymentPocketInfo d;
    public final ArrayList e;
    public final hrf.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f2k.h f180809g;

    public x(long j2, e3k.d routeData, List transferOptions, PaymentPocketInfo paymentPocketInfo, ArrayList suggestions, hrf.h errorState, f2k.h hVar) {
        Intrinsics.checkNotNullParameter(routeData, "routeData");
        Intrinsics.checkNotNullParameter(transferOptions, "transferOptions");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        this.f180806a = j2;
        this.f180807b = routeData;
        this.f180808c = transferOptions;
        this.d = paymentPocketInfo;
        this.e = suggestions;
        this.f = errorState;
        this.f180809g = hVar;
    }

    public final List a() {
        z1k.i iVarA;
        List list;
        z1k.o oVarP = gj7.b.p(this.f180807b);
        return (oVarP == null || (iVarA = e3k.a.a(oVarP)) == null || (list = iVarA.d) == null) ? zhm.f0.f322471a : list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f180806a == xVar.f180806a && Intrinsics.f(this.f180807b, xVar.f180807b) && Intrinsics.f(this.f180808c, xVar.f180808c) && Intrinsics.f(this.d, xVar.d) && this.e.equals(xVar.e) && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f180809g, xVar.f180809g);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f180807b.hashCode() + (Long.hashCode(this.f180806a) * 31)) * 31, 31, this.f180808c);
        PaymentPocketInfo paymentPocketInfo = this.d;
        int iHashCode = (this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iD + (paymentPocketInfo == null ? 0 : paymentPocketInfo.hashCode())) * 31, 31)) * 31;
        f2k.h hVar = this.f180809g;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }
}
