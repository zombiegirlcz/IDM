package mnl;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.sso.impl.ui.manual_review.ManualReviewFlowContract$Step;
import d67.q;
import d67.s;
import d67.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yji.l;
import zhm.q0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.manual_review.b f207523b;

    public /* synthetic */ h(com.revolut.sso.impl.ui.manual_review.b bVar, int i) {
        this.f207522a = i;
        this.f207523b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        switch (this.f207522a) {
            case 0:
                com.revolut.sso.impl.ui.manual_review.b bVar = this.f207523b;
                yki.a aVar = bVar.f106587w;
                u outputData = (u) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof s) {
                    l.i2(bVar, new PermissionsFlow(q0.c(new Pair("android.permission.POST_NOTIFICATIONS", PermissionsFlowContract$Explanation.None.f98339a))), null, new h(bVar, 3), 1);
                } else if (outputData instanceof q) {
                    oki.h.w2(aVar, ManualReviewFlowContract$Step.AuthCancellation.f106574a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    oki.h.D2(aVar);
                }
                return Unit.f186387a;
            case 1:
                ukl.f outputData2 = (ukl.f) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                boolean zF = Intrinsics.f(outputData2, ukl.c.f280794a);
                com.revolut.sso.impl.ui.manual_review.b bVar2 = this.f207523b;
                if (zF || Intrinsics.f(outputData2, ukl.e.f280796a)) {
                    bVar2.C2(e.f207519a);
                } else {
                    if (!(outputData2 instanceof ukl.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.C2(new c(((ukl.d) outputData2).f280795a));
                }
                return Unit.f186387a;
            case 2:
                skl.c result = (skl.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, skl.c.f263952a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f207523b.C2(e.f207519a);
                return Unit.f186387a;
            default:
                com.revolut.kompot.common.flow.permissions.a outputData3 = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                boolean zF2 = Intrinsics.f(outputData3, a.C0596a.f98352a);
                com.revolut.sso.impl.ui.manual_review.b bVar3 = this.f207523b;
                if (zF2) {
                    z = true;
                } else {
                    if (outputData3 instanceof sii.d) {
                        if (!((sii.d) outputData3).f263635b) {
                            s70.b bVar4 = (s70.b) bVar3.f106582p;
                            bVar4.getClass();
                            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                            intent.putExtra("android.provider.extra.APP_PACKAGE", bVar4.f260499a.a());
                            bVar3.C1(new ExternalDestination.ByIntent(intent, null));
                        }
                    } else if (!(outputData3 instanceof sii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                bVar3.v = z;
                bVar3.J2();
                return Unit.f186387a;
        }
    }
}
