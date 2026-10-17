package bmj;

import blh.y;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_cancellation_preview.EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData f16845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f16846b;

    public i(EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData inputData, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f16845a = inputData;
        this.f16846b = phoneToolsProvider;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plans_secondary_number_termination_title, u.c(z80.b.b(this.f16846b, this.f16845a.f101365a.f100472c, null, null, 6)), null, 12), null, null, null, false, 30);
        return new cii.b((aw0.i) iii.c.f(domainState.f16838a, new y(14), new bk6.n(14), new b0c.a(11)), (List) iii.c.f(domainState.f16838a, new y(this, 13), new bk6.n(13), new b0c.a(this, 10)), aVar);
    }
}
