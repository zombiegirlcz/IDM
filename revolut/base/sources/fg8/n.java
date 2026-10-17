package fg8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f134969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f134970c;

    public /* synthetic */ n(q qVar, String str, int i) {
        this.f134968a = i;
        this.f134969b = qVar;
        this.f134970c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f134968a) {
            case 0:
                mf8.e childKyc = (mf8.e) obj2;
                Intrinsics.checkNotNullParameter(childKyc, "childKyc");
                mf8.d dVar = childKyc.f204961a;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                if (dVar != mf8.d.PASSED) {
                    efm.r rVarError = efm.r.error(new IllegalStateException("Kyc status is not passed for allowance creation deeplink."));
                    Intrinsics.h(rVarError);
                    return rVarError;
                }
                q qVar = this.f134969b;
                return pd.b.r(qVar.f134987b.k(false), new n(qVar, this.f134970c, 1));
            default:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                kotlinx.coroutines.d dVar2 = skm.p0.f264003c;
                q qVar2 = this.f134969b;
                sfm.b bVarG = pd.b.n(dVar2, new ewa.d(qVar2, null, 15)).g(rd0.e.c(nim.a.v(qVar2.f134986a.g(this.f134970c, w4l.h.f294642c), new a2f.j(user, 6)), kotlin.coroutines.g.f186406a));
                Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                return bVarG;
        }
    }
}
