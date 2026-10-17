package ei3;

import a31.w;
import com.revolut.feature.checkout.models.PreorderPlanResult;
import com.revolut.feature.checkout.models.PreorderPreconditions;
import com.revolut.feature.checkout.models.exceptions.PreorderPlanMissingIdException;
import ei3.n;
import java.time.Instant;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f126361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pi3.h f126362c;

    public /* synthetic */ b(m mVar, pi3.h hVar, int i) {
        this.f126360a = i;
        this.f126361b = mVar;
        this.f126362c = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.b bVarN;
        switch (this.f126360a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                m mVar = this.f126361b;
                n nVarB = mVar.k.b(error);
                n.a aVarB = nVarB != null ? nVarB.getParams() : null;
                String strE = aVarB != null ? aVarB.getPreorderId() : null;
                Long lD = aVarB != null ? aVarB.getPreorderEndDate() : null;
                if (!mVar.k(error)) {
                    return new PreorderPlanResult.Error(error);
                }
                if (strE != null) {
                    return new PreorderPlanResult.Preordered(strE, this.f126362c.f236404a.f152287a, lD != null ? Instant.ofEpochMilli(lD.longValue()) : null, aVarB.c());
                }
                return new PreorderPlanResult.Error(new PreorderPlanMissingIdException());
            default:
                PreorderPlanResult result = (PreorderPlanResult) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof PreorderPlanResult.Preordered) {
                    PreorderPlanResult.Preordered preordered = (PreorderPlanResult.Preordered) result;
                    String preorderId = preordered.f65874a;
                    pi3.h hVar = this.f126362c;
                    String str = hVar.f236404a.f152287a;
                    hha.i iVar = hVar.f236405b;
                    if (iVar == null) {
                        iVar = hha.i.MONTHLY;
                    }
                    pi3.p plan = new pi3.p(str, iVar, hVar.d);
                    Instant instant = preordered.f65876c;
                    PreorderPreconditions preorderPreconditions = preordered.d;
                    Intrinsics.checkNotNullParameter(preorderId, "preorderId");
                    Intrinsics.checkNotNullParameter(plan, "plan");
                    bVarN = pd.b.n(kotlin.coroutines.g.f186406a, new w(this.f126361b, preorderId, plan, instant, preorderPreconditions, (Continuation) null));
                } else {
                    bVarN = pfm.m.f235744a;
                }
                return bVarN.f(te0.w.j(result));
        }
    }
}
