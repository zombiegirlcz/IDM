package fxc;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.select.payment.impl.ui.select_card.SelectPaymentScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import nii.l0;
import nii.y0;
import nii.z;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectPaymentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SelectPaymentScreen selectPaymentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = selectPaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t61.g gVar;
        Object next;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD3 = this.v.R2();
        String listId = model.f53228a;
        u uVar = (u) lVarD3;
        y yVar = uVar.f138808s;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (a0.H(listId, "EXTERNAL_CARD_ID_PREFIX", false)) {
            String strE0 = d0.e0(listId, "EXTERNAL_CARD_ID_PREFIX");
            List list = ((i) ((j2) yVar.f22677a).getValue()).d;
            Continuation continuation = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((t61.g) next).f268137a, strE0)) {
                        break;
                    }
                }
                gVar = (t61.g) next;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                b bVar = uVar.f138807r;
                h hVar = (h) ((i) ((j2) yVar.f22677a).getValue()).f138793a.getContent();
                wi0.b bVar2 = hVar != null ? hVar.f138792b : null;
                if (bVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                boolean z = uVar.o.d;
                bVar.getClass();
                int i = r.f138802a[b.a(gVar, bVar2, z).ordinal()];
                if (i != 1) {
                    int i2 = 2;
                    if (i == 2) {
                        uVar.X1(new y0("SELECT_UNAVAILABLE_DIALOG_ID", new z(new TextLocalisedClause(R$string.emergency_payment_setup_select_card_unavailable_dialog_title, null, null, 14), new TextLocalisedClause(R$string.emergency_payment_setup_select_card_unavailable_dialog_description, null, null, 14), new TextLocalisedClause(R$string.emergency_payment_setup_select_card_unavailable_dialog_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4));
                    } else if (i == 3) {
                        yji.l.a1(uVar, uVar.X1(new y0("SELECT_UNVERIFIED_DIALOG_ID", new l0(new TextLocalisedClause(R$string.emergency_payment_setup_select_card_unverified_dialog_title, null, null, 14), null, null, new TextLocalisedClause(R$string.emergency_payment_setup_select_card_unverified_dialog_button_primary_title, null, null, 14), new TextLocalisedClause(R$string.emergency_payment_setup_select_card_unverified_dialog_button_secondary_title, null, null, 14), null, false, null, 998), false, 4)), null, null, new s(uVar, gVar, continuation, i2), 3);
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uVar.C2(new k(gVar));
                    }
                } else {
                    uVar.X1(new y0("SELECT_EXPIRED_DIALOG_ID", new z(new TextLocalisedClause(R$string.emergency_payment_setup_select_card_expired_dialog_title, null, null, 14), new TextLocalisedClause(R$string.emergency_payment_setup_select_card_expired_dialog_description, null, null, 14), new TextLocalisedClause(R$string.emergency_payment_setup_select_card_expired_dialog_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4));
                }
            }
        }
        return Unit.f186387a;
    }
}
