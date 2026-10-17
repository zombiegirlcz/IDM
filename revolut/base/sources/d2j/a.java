package d2j;

import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.balance.picker.api.flow.CurrencyChooserFlowContract$State;
import com.revolut.retail.feature.balance.picker.api.flow.CurrencyChooserFlowContract$Step;
import com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData;
import com.revolut.retail.feature.balance.picker.impl.new_picker.currency.CurrencyChooserScreen;
import cui.v;
import dki.g;
import io3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k1j.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m2j.t;
import xi0.b;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends g implements h1j.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f110870t;
    public final CurrencyChooserFlowContract$Step u;
    public final CurrencyChooserFlowContract$State v;

    public a(CurrencyChooserFlowDestination.InputData inputData, t balancesFilterInteractor) {
        CurrencyChooserFlowContract$Step currencyChooser;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        this.f110870t = balancesFilterInteractor;
        CurrencyChooserFlowDestination.StartType startType = inputData.f99473a;
        if (startType instanceof CurrencyChooserFlowDestination.StartType.BalancePicker) {
            CurrencyChooserFlowDestination.StartType.BalancePicker balancePicker = (CurrencyChooserFlowDestination.StartType.BalancePicker) startType;
            String str = balancePicker.f99474a;
            b bVar = balancePicker.f99475b;
            d dVar = balancePicker.d;
            l lVar = balancePicker.f99476c;
            Set set = balancePicker.e;
            Set set2 = balancePicker.f;
            Set set3 = balancePicker.f99477g;
            currencyChooser = new CurrencyChooserFlowContract$Step.BalanceChooser(balancePicker.f99478h, lVar, balancePicker.f99479j, str, set, set2, set3, balancePicker.k, dVar, bVar, balancePicker.i);
        } else {
            if (!(startType instanceof CurrencyChooserFlowDestination.StartType.CurrencyChooser)) {
                throw new NoWhenBranchMatchedException();
            }
            CurrencyChooserFlowDestination.StartType.CurrencyChooser currencyChooser2 = (CurrencyChooserFlowDestination.StartType.CurrencyChooser) startType;
            currencyChooser = new CurrencyChooserFlowContract$Step.CurrencyChooser(currencyChooser2.f99480a, currencyChooser2.f99481b, currencyChooser2.f99482c, currencyChooser2.d, currencyChooser2.e, currencyChooser2.f);
        }
        this.u = currencyChooser;
        this.v = new CurrencyChooserFlowContract$State();
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        SupportedTargetCurrencies.Unordered unordered;
        CurrencyChooserFlowContract$Step step = (CurrencyChooserFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CurrencyChooserFlowContract$Step.BalanceChooser) {
            CurrencyChooserFlowContract$Step.BalanceChooser balanceChooser = (CurrencyChooserFlowContract$Step.BalanceChooser) step;
            String str = balanceChooser.f99384a;
            ViewController viewControllerE1 = e1(new g1j.a(new BalanceSelector$InputData(balanceChooser.f99387g, balanceChooser.f99386c, balanceChooser.d, null, balanceChooser.f, balanceChooser.e, null, str, balanceChooser.k, 72), this.f110870t));
            v block = new v(balanceChooser, this, 22);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (!(step instanceof CurrencyChooserFlowContract$Step.CurrencyChooser)) {
            throw new NoWhenBranchMatchedException();
        }
        CurrencyChooserFlowContract$Step.CurrencyChooser currencyChooser = (CurrencyChooserFlowContract$Step.CurrencyChooser) step;
        d dVar = currencyChooser.f99390a;
        AccountId accountId = currencyChooser.f99391b;
        b bVar = currencyChooser.f99392c;
        List list = currencyChooser.d;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((b) it8.next()).f306286a);
            }
            unordered = new SupportedTargetCurrencies.Unordered(d0.i1(arrayList));
        } else {
            unordered = null;
        }
        CurrencyChooserScreen currencyChooserScreen = new CurrencyChooserScreen(new CurrencyChooserInputData(dVar, accountId, bVar, unordered, currencyChooser.e, false, null, 96));
        v block2 = new v(currencyChooser, this, 23);
        Intrinsics.checkNotNullParameter(block2, "block");
        currencyChooserScreen.H = block2;
        return currencyChooserScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
