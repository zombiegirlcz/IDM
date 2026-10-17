package huc;

import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step;
import com.revolut.feature.security_hub.impl.ui.flow.m;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import eii.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yki.l;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155615a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f155616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f155617c;
    public final /* synthetic */ SecurityHubFlowContract$Step d;

    public /* synthetic */ g(SecurityHubFlowContract$Step securityHubFlowContract$Step, m mVar, l lVar) {
        this.d = securityHubFlowContract$Step;
        this.f155616b = mVar;
        this.f155617c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f155615a) {
            case 0:
                yja.b it8 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                SecurityHubFlowContract$Step.ProductArticle productArticle = (SecurityHubFlowContract$Step.ProductArticle) this.d;
                com.revolut.feature.security_hub.impl.ui.flow.a aVar = productArticle.f85537c;
                int i = aVar == null ? -1 : com.revolut.feature.security_hub.impl.ui.flow.b.f85553a[aVar.ordinal()];
                m mVar = this.f155616b;
                if (i != -1) {
                    if (i == 1) {
                        mVar.B2();
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVar.l2(new com.revolut.feature.security_hub.impl.ui.flow.i(mVar, SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.Main.f85523a, null), new yi5.b(26));
                    }
                }
                SecurityHubFlowContract$Step securityHubFlowContract$Step = productArticle.f85536b;
                if (securityHubFlowContract$Step != null) {
                    boolean z = productArticle.d;
                    l lVar = this.f155617c;
                    if (z) {
                        oki.h.w2(lVar, securityHubFlowContract$Step, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else {
                        oki.h.t2(mVar, lVar, securityHubFlowContract$Step, false, null, false, 12);
                    }
                }
                return Unit.f186387a;
            default:
                k result = (k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z3 = result instanceof eii.g;
                m mVar2 = this.f155616b;
                if (z3) {
                    mVar2.A1(new com.revolut.feature.security_hub.impl.ui.flow.c(mVar2, this.d, null), new yi5.b(25));
                } else {
                    oki.h.t2(mVar2, this.f155617c, new SecurityHubFlowContract$Step.StreetMode(StreetModeFlowContract$Step.SetTrustedLocation.f85661a), true, null, false, 12);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ g(m mVar, l lVar, SecurityHubFlowContract$Step securityHubFlowContract$Step) {
        this.f155616b = mVar;
        this.f155617c = lVar;
        this.d = securityHubFlowContract$Step;
    }
}
