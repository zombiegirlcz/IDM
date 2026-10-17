package ni4;

import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorPopupScreenConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f215640b;

    public /* synthetic */ f(n nVar, int i) {
        this.f215639a = i;
        this.f215640b = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SpousalConsentInitiatorPopupScreenConfig.Action action;
        switch (this.f215639a) {
            case 0:
                n nVar = this.f215640b;
                nVar.y2(nVar.v.f66404c.f66411b);
                break;
            case 1:
                n nVar2 = this.f215640b;
                SpousalConsentInitiatorPopupScreenConfig.Button button = nVar2.v.d;
                if (button == null || (action = button.f66411b) == null) {
                    action = SpousalConsentInitiatorPopupScreenConfig.Action.CloseScreen.f66406a;
                }
                nVar2.y2(action);
                break;
            default:
                n nVar3 = this.f215640b;
                nVar3.y2(nVar3.v.e);
                break;
        }
        return Unit.f186387a;
    }
}
