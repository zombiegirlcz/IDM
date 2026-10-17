package pij;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingProgress;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OutputData;
import fej.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b f236552b;

    public /* synthetic */ i0(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, int i) {
        this.f236551a = i;
        this.f236552b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object b0Var;
        Object obj3;
        EsimPhoneNumberPortingProgress.Action.Data url2;
        switch (this.f236551a) {
            case 0:
                v update = (v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v.a(update, null, null, null, null, null, null, null, null, null, wp5.y.u(this.f236552b.f101082p, "toString(...)"), null, null, null, null, null, null, null, null, null, null, 2096639);
            case 1:
                EsimProfile esimProfile = (EsimProfile) obj2;
                Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = this.f236552b;
                bVar.L2(esimProfile, pd.b.j((Boolean) ((v) ((j2) bVar.f101081e0.f22677a).getValue()).f236585l.getContent()));
                return Unit.f186387a;
            case 2:
                EsimProfile esimProfile2 = (EsimProfile) obj2;
                Intrinsics.checkNotNullParameter(esimProfile2, "esimProfile");
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar2 = this.f236552b;
                bVar2.R2(esimProfile2, new j0(bVar2, esimProfile2, 1));
                return Unit.f186387a;
            case 3:
                fej.d output = (fej.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean zF = Intrinsics.f(output, d.a.f134638a);
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar3 = this.f236552b;
                if (zF) {
                    bVar3.l2(new b1(bVar3, null, 0), new yi5.b(26));
                } else {
                    if (!Intrinsics.f(output, d.b.f134639a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar3.C2(EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked.f101051a);
                }
                return Unit.f186387a;
            case 4:
                List subscriptions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                return nim.a.v(this.f236552b.f101089y.n(subscriptions, hfj.a.ALWAYS_INCLUDE), new d(11));
            case 5:
                khj.d output2 = (khj.d) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                khj.i iVar = output2.f184148a;
                if (iVar instanceof khj.f) {
                    obj3 = z.f236604a;
                } else {
                    if (iVar instanceof khj.g) {
                        b0Var = new a0(((khj.g) iVar).f184150a.f71914a);
                    } else {
                        if (!(iVar instanceof khj.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b0Var = new b0(((khj.h) iVar).f184153a);
                    }
                    obj3 = b0Var;
                }
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar4 = this.f236552b;
                cli.y yVar = bVar4.f101081e0;
                if ((((v) ((j2) yVar.f22677a).getValue()).f236587n instanceof g0) && Intrinsics.f(((v) ((j2) yVar.f22677a).getValue()).f236587n.getView(), obj3)) {
                    return Unit.f186387a;
                }
                bVar4.H2(yVar, new pb2.v(obj3, 29));
                return Unit.f186387a;
            case 6:
                List subscriptions2 = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions2, "subscriptions");
                return this.f236552b.z.W(subscriptions2, hfj.a.ALWAYS_INCLUDE);
            default:
                tjj.g result = (tjj.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof tjj.f) {
                    url2 = new EsimPhoneNumberPortingProgress.Action.Data.Url(((tjj.f) result).f271798a.f100253a);
                } else {
                    if (!(result instanceof tjj.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj4 = ((tjj.e) result).f271797a;
                    url2 = obj4 instanceof EsimPhoneNumberPortingProgress.Action.Data ? (EsimPhoneNumberPortingProgress.Action.Data) obj4 : null;
                }
                if (url2 != null) {
                    boolean z = url2 instanceof EsimPhoneNumberPortingProgress.Action.Data.Url;
                    com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar5 = this.f236552b;
                    if (z) {
                        bVar5.l2(new q0(bVar5, url2, null), new yi5.b(26));
                    } else if (url2 instanceof EsimPhoneNumberPortingProgress.Action.Data.CreatePorting) {
                        bVar5.l2(new s0(bVar5, url2, null), new yi5.b(26));
                    } else {
                        if (!(url2 instanceof EsimPhoneNumberPortingProgress.Action.Data.UpdatePorting)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar5.l2(new u0(bVar5, url2, null), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
        }
    }
}
