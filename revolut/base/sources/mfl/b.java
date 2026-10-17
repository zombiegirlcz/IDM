package mfl;

import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.CurrencyChooserScreen;
import com.revolut.feature.shops.impl.model.ShopsInstruction;
import com.revolut.shared.feature.wealth.statements.impl.costchargesreport.CostChargesController;
import ip0.on0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205021a;

    public /* synthetic */ b(int i) {
        this.f205021a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f205021a) {
            case 0:
                KProperty[] kPropertyArr = CostChargesController.R;
                break;
            case 2:
                ChecklistChallenge.Companion bVar = ChecklistChallenge.INSTANCE;
                break;
            case 3:
                ChecklistChallenge.Companion bVar2 = ChecklistChallenge.INSTANCE;
                break;
            case 7:
                ChecklistChallengeReward.VirtualAsset.Companion bVar3 = ChecklistChallengeReward.VirtualAsset.INSTANCE;
                break;
            case 8:
                ChecklistChallengeReward.VirtualAsset.Companion bVar4 = ChecklistChallengeReward.VirtualAsset.INSTANCE;
                break;
            case 9:
                ChecklistChallengeState.OptIn.Companion bVar5 = ChecklistChallengeState.OptIn.INSTANCE;
                break;
            case 14:
                List listC = u.c(new on0("TAX_ADVANTAGE_LIMIT_LOADING_WIDGET"));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                break;
            case 17:
                od0.i.Companion.getClass();
                break;
            case 18:
                ShopsInstruction.b bVar6 = ShopsInstruction.Companion;
                break;
            case 21:
                KProperty[] kPropertyArr2 = CurrencyChooserScreen.W;
                break;
            case 22:
                KProperty[] kPropertyArr3 = CurrencyChooserScreen.W;
                break;
            case 23:
                KProperty[] kPropertyArr4 = CurrencyChooserScreen.W;
                break;
            case 24:
                KProperty[] kPropertyArr5 = CurrencyChooserScreen.W;
                break;
            case 25:
                KProperty[] kPropertyArr6 = CurrencyChooserScreen.W;
                break;
        }
        return f0.f322471a;
    }
}
