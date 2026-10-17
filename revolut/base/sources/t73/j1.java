package t73;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_management.api.CardManagementApi$Toggles;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class j1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268484b;

    public /* synthetic */ j1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, int i) {
        this.f268483a = i;
        this.f268484b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f268483a) {
            case 0:
                return Boolean.valueOf(((jte.d) this.f268484b.O).c(CardManagementApi$Toggles.NewChecksForMxMCYClosure.f64774c));
            case 1:
                return Boolean.valueOf(((jte.d) this.f268484b.O).c(CardsCoreApi$Toggles.VirtualCardDesignChange.f65573c));
            default:
                this.f268484b.X1(new mii.k("unblock_cvv_successfully_toast", new TextLocalisedClause(R$string.card_unblock_pin_cvv_unblock_toast, null, null, 14), null, null, null, 28));
                return Unit.f186387a;
        }
    }
}
