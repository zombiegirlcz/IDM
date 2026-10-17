package r83;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardActivationMethodsFlowDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import h93.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252308a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f252309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f252310c;

    public /* synthetic */ a(String str, q qVar) {
        this.f252309b = str;
        this.f252310c = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        f0 card = (f0) obj2;
        switch (this.f252308a) {
            case 0:
                Intrinsics.checkNotNullParameter(card, "card");
                boolean zJ = card.J();
                q qVar = this.f252310c;
                return (zJ && cp5.c.j(qVar.f252343b)) ? new FeatureCommand(new KompotOverlayFeatureConfig(new CardActivationMethodsFlowDestination(card), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)) : qVar.d.c(new CardScreenAction.Select(this.f252309b, 6, false, false), AccountId.Personal.f51414a);
            default:
                Intrinsics.checkNotNullParameter(card, "card");
                boolean zA = card.a();
                String str = this.f252309b;
                return this.f252310c.d.c(zA ? new CardScreenAction.OneClickActivate(str) : new CardScreenAction.Select(str, 6, false, false), AccountId.Personal.f51414a);
        }
    }

    public /* synthetic */ a(q qVar, String str) {
        this.f252310c = qVar;
        this.f252309b = str;
    }
}
