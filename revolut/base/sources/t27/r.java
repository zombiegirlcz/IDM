package t27;

import cli.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends oki.h implements dli.b {
    public final zjh.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f267442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f267443q;

    public r(zjh.i freelancerTaxPocketsInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerTaxPocketsInteractor, "freelancerTaxPocketsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerTaxPocketsInteractor;
        z1 z1VarB = vkm.q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f267442p = z1VarB;
        this.f267443q = mra.d.b(this, new i(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f267442p, new s9b.n(continuation, this, 19)), null, null, new sy6.j(this, continuation, 9), 3);
    }

    public final void I2(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Float fValueOf = null;
        try {
            if (kotlin.text.y.h(str)) {
                fValueOf = Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        H2(this.f267443q, new j3i.n(str, fValueOf != null ? fValueOf.floatValue() : BitmapDescriptorFactory.HUE_RED, 4));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f267443q;
    }
}
