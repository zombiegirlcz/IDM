package bo2;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.card_digits.BankAccountSwitchingCardDigitsScreen;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.y0;
import vkm.j2;
import yhm.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BankAccountSwitchingCardDigitsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BankAccountSwitchingCardDigitsScreen bankAccountSwitchingCardDigitsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bankAccountSwitchingCardDigitsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        int i = this.u;
        BankAccountSwitchingCardDigitsScreen bankAccountSwitchingCardDigitsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bankAccountSwitchingCardDigitsScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) ((f) bankAccountSwitchingCardDigitsScreen.Q.getValue());
                y yVar = kVar.o;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                int i2 = i.f17279a[((d) j2Var.getValue()).f17273b.ordinal()];
                if (i2 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.account_switch_card_details_confirmation_title, null, null, 14);
                    textLocalisedClause2 = new TextLocalisedClause(R$string.account_switch_card_details_confirmation_subtitle, u.c(new TextClause(((d) j2Var2.getValue()).f17272a.f63894a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.account_switch_card_details_confirmation_title, null, null, 14);
                    textLocalisedClause2 = new TextLocalisedClause(R$string.account_switch_card_details_joint_confirmation_subtitle, v.k(new TextClause(((d) j2Var2.getValue()).f17272a.f63894a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(((d) j2Var2.getValue()).f17272a.f63895b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                }
                yji.l.b1(kVar, kVar.X1(new y0("ID_DIGITS_CONFIRMATION_DIALOG", new nii.v(textLocalisedClause, textLocalisedClause2, null, new TextLocalisedClause(R$string.account_switch_card_details_confirmation_confirm, null, null, 14), new TextLocalisedClause(R$string.account_switch_card_details_confirmation_edit, null, null, 14), null, null, null, false, null, 4032), false, 4)), null, new j(kVar, null, 0), 3);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) ((f) bankAccountSwitchingCardDigitsScreen.Q.getValue());
                int i3 = i.f17279a[((d) ((j2) kVar2.o.f22677a).getValue()).f17273b.ordinal()];
                if (i3 == 1) {
                    textLocalisedClause3 = new TextLocalisedClause(R$string.account_switch_card_details_nocard_title, null, null, 14);
                    textLocalisedClause4 = new TextLocalisedClause(R$string.account_switch_card_details_nocard_subtitle, null, null, 14);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause3 = new TextLocalisedClause(R$string.account_switch_card_details_joint_nocard_title, null, null, 14);
                    textLocalisedClause4 = new TextLocalisedClause(R$string.account_switch_card_details_joint_nocard_subtitle, null, null, 14);
                }
                yji.l.b1(kVar2, kVar2.X1(new y0("ID_SKIP_DIGITS_DIALOG", new nii.v(textLocalisedClause3, textLocalisedClause4, null, new TextLocalisedClause(R$string.account_switch_card_details_nocard_confirm, null, null, 14), new TextLocalisedClause(R$string.account_switch_card_details_nocard_cancel, null, null, 14), null, null, null, false, null, 4032), false, 4)), null, new j(kVar2, null, 1), 3);
                return Unit.f186387a;
        }
    }
}
