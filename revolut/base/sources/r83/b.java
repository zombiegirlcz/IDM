package r83;

import androidx.lifecycle.Lifecycle;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.PhysicalCardReplacementDialogDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import h93.f0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252311a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f252312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f252313c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ b(q qVar, String str, boolean z) {
        this.f252312b = qVar;
        this.f252313c = str;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        Object next;
        switch (this.f252311a) {
            case 0:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                Iterator it8 = cards.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    str = this.f252313c;
                    if (zHasNext) {
                        next = it8.next();
                        if (Intrinsics.f(((f0) next).o, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                f0 f0Var = (f0) next;
                boolean z = this.d;
                if (f0Var != null) {
                    return q.u(new FeatureCommand(new KompotOverlayFeatureConfig(new PhysicalCardReplacementDialogDestination(f0Var.f150110a), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)), z && !this.f252312b.f252345g.getState().isAtLeast(Lifecycle.State.STARTED));
                }
                return q.u(new FeatureCommand(new CardDesignFeatureConfig(b93.e.PHYSICAL, null, str, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 536870902)), z);
            default:
                f0 card = (f0) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                return q.u(card.f150124w ? new FeatureCommand(new CardsScreenFeatureConfig(null, null, null, null, null, 31)) : card.J() ? this.f252312b.d.c(new CardScreenAction.AddToGooglePayDialog(this.f252313c), AccountId.Personal.f51414a) : new FeatureCommand(new CardOrderNewFeatureConfig(null, null, null, null, null, false, zn3.a.DEEPLINK, null, null, null, null, null, 16255)), this.d);
        }
    }

    public /* synthetic */ b(boolean z, q qVar, String str) {
        this.d = z;
        this.f252312b = qVar;
        this.f252313c = str;
    }
}
