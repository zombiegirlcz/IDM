package mll;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.sso.api.models.BankIdEvidence;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import mhd.p0;
import vkm.v1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c f207060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BankIdEvidence f207061c;

    public /* synthetic */ g(com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, BankIdEvidence bankIdEvidence, int i) {
        this.f207059a = i;
        this.f207060b = cVar;
        this.f207061c = bankIdEvidence;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f207059a) {
            case 0:
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = this.f207060b;
                return cVar.l2(new p0(cVar, this.f207061c, null, 9), new yi5.b(26));
            default:
                v1 v1VarI = ta6.a.I(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, TimeUnit.MILLISECONDS);
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar2 = this.f207060b;
                return yji.l.b1(cVar2, v1VarI, null, new mkk.q(cVar2, this.f207061c, null, 3), 3);
        }
    }
}
