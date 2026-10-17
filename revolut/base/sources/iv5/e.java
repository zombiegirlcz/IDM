package iv5;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$ActionButtonParcel;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$SpotMarginTradingItemsProvider$Parcel$ActionButtonParcel;
import com.revolut.feature.crypto_investments.impl.ui.widget.split.earn_accounts.EarnAccountsWidgetContract$Parcel$ActionButtonParcel;
import com.revolut.feature.crypto_investments.impl.ui.widget.split.main_accounts.MainAccountsWidgetContract$Parcel$ActionButtonParcel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVar = this.v;
        ut5.i iVar2 = iVar.k;
        Intrinsics.h(model);
        Object obj3 = model.i;
        iVar2.b3(model);
        j2 j2Var = ((ov5.e) iVar.i).d;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "CryptoInvestmentsWidgetContract.SHOW_MORE_BUTTON_ITEM_ID")) {
            do {
                value10 = j2Var.getValue();
                ((Boolean) value10).getClass();
            } while (!j2Var.h(value10, Boolean.TRUE));
        } else if (Intrinsics.f(str, "CryptoInvestmentsWidgetContract.SEE_LESS_BUTTON_ITEM_ID")) {
            do {
                value = j2Var.getValue();
                ((Boolean) value).getClass();
            } while (!j2Var.h(value, Boolean.FALSE));
        }
        j2 j2Var2 = ((nv5.h) iVar.e).i;
        Intrinsics.checkNotNullParameter(model, "model");
        if (obj3 instanceof MainAccountsWidgetContract$Parcel$ActionButtonParcel) {
            if (Intrinsics.f(str, "CryptoInvestmentsWidgetContract.SHOW_MORE_BUTTON_ITEM_ID")) {
                do {
                    value9 = j2Var2.getValue();
                    ((Boolean) value9).getClass();
                } while (!j2Var2.h(value9, Boolean.FALSE));
            } else if (Intrinsics.f(str, "CryptoInvestmentsWidgetContract.SEE_LESS_BUTTON_ITEM_ID")) {
                do {
                    value8 = j2Var2.getValue();
                    ((Boolean) value8).getClass();
                } while (!j2Var2.h(value8, Boolean.TRUE));
            }
        }
        j2 j2Var3 = ((mv5.f) iVar.f).f209149h;
        Intrinsics.checkNotNullParameter(model, "model");
        if (obj3 instanceof EarnAccountsWidgetContract$Parcel$ActionButtonParcel) {
            if (Intrinsics.f(str, "CryptoInvestmentsWidgetContract.SHOW_MORE_BUTTON_ITEM_ID")) {
                do {
                    value7 = j2Var3.getValue();
                    ((Boolean) value7).getClass();
                } while (!j2Var3.h(value7, Boolean.FALSE));
            } else if (Intrinsics.f(str, "CryptoInvestmentsWidgetContract.SEE_LESS_BUTTON_ITEM_ID")) {
                do {
                    value6 = j2Var3.getValue();
                    ((Boolean) value6).getClass();
                } while (!j2Var3.h(value6, Boolean.TRUE));
            }
        }
        j2 j2Var4 = ((qv5.b) iVar.f168724g).f249538c;
        Intrinsics.checkNotNullParameter(model, "model");
        if (obj3 instanceof SplitAccountsWidgetContract$SpotMarginTradingItemsProvider$Parcel$ActionButtonParcel) {
            if (Intrinsics.f(str, "CryptoInvestmentsWidgetContract.SHOW_MORE_BUTTON_ITEM_ID")) {
                do {
                    value5 = j2Var4.getValue();
                    ((Boolean) value5).getClass();
                } while (!j2Var4.h(value5, Boolean.FALSE));
            } else if (Intrinsics.f(str, "CryptoInvestmentsWidgetContract.SEE_LESS_BUTTON_ITEM_ID")) {
                do {
                    value4 = j2Var4.getValue();
                    ((Boolean) value4).getClass();
                } while (!j2Var4.h(value4, Boolean.TRUE));
            }
        }
        j2 j2Var5 = ((pv5.b) iVar.f168725h).d;
        Intrinsics.checkNotNullParameter(model, "model");
        if (obj3 instanceof SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$ActionButtonParcel) {
            if (Intrinsics.f(str, "CryptoInvestmentsWidgetContract.SHOW_MORE_BUTTON_ITEM_ID")) {
                do {
                    value3 = j2Var5.getValue();
                    ((Boolean) value3).getClass();
                } while (!j2Var5.h(value3, Boolean.FALSE));
            } else if (Intrinsics.f(str, "CryptoInvestmentsWidgetContract.SEE_LESS_BUTTON_ITEM_ID")) {
                do {
                    value2 = j2Var5.getValue();
                    ((Boolean) value2).getClass();
                } while (!j2Var5.h(value2, Boolean.TRUE));
            }
        }
        return Unit.f186387a;
    }
}
