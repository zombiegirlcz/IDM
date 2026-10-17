package ij6;

import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.BrazilConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.BrazilConsentDetailsScreenContract$OutputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.a0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BrazilConsentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BrazilConsentDetailsScreen brazilConsentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = brazilConsentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        LimitConfig dailyLimit;
        Object next2;
        Object next3;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.O.getValue();
        Object obj3 = model.o;
        com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.a) gVar;
        y yVar = aVar2.f72551q;
        if (obj3 instanceof OpenBankingBrazilPayment.EditableMoneyField) {
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c cVar = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) ((f) ((j2) yVar.f22677a).getValue()).f161713a.getContent();
            if (cVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Consent details content was null when limit edit was clicked");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                List list = cVar.d.f72409a;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    a0.x(((OpenBankingBrazilPayment.InfoGroup) it8.next()).f72405a, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    OpenBankingBrazilPayment.EditableMoneyField editableMoneyField = ((OpenBankingBrazilPayment.Item) it9.next()).f72408c;
                    if (editableMoneyField != null) {
                        arrayList2.add(editableMoneyField);
                    }
                }
                Iterator it10 = arrayList.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it10.next();
                    if (((OpenBankingBrazilPayment.Item) next).d != null) {
                        break;
                    }
                }
                OpenBankingBrazilPayment.Item item = (OpenBankingBrazilPayment.Item) next;
                OpenBankingBrazilPayment.EditableDateField editableDateField = item != null ? item.d : null;
                OpenBankingBrazilPayment.EditableMoneyField editableMoneyField2 = (OpenBankingBrazilPayment.EditableMoneyField) obj3;
                boolean z = editableMoneyField2.f72403b;
                dj0.d dVar = editableMoneyField2.f72404c;
                dj0.d dVar2 = editableMoneyField2.d;
                String str = editableMoneyField2.f72402a;
                if (Intrinsics.f(str, "singleTransactionLimit")) {
                    if (dVar2 == null) {
                        dVar2 = new dj0.d(0L, dVar.f115083b);
                    }
                    Iterator it11 = arrayList2.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it11.next();
                        if (Intrinsics.f(((OpenBankingBrazilPayment.EditableMoneyField) next3).f72402a, "dailyLimit")) {
                            break;
                        }
                    }
                    OpenBankingBrazilPayment.EditableMoneyField editableMoneyField3 = (OpenBankingBrazilPayment.EditableMoneyField) next3;
                    dailyLimit = new LimitConfig.SingleTransactionLimit(dVar2, dVar, z, editableMoneyField3 != null ? editableMoneyField3.d : null);
                } else if (Intrinsics.f(str, "dailyLimit")) {
                    if (dVar2 == null) {
                        dVar2 = new dj0.d(0L, dVar.f115083b);
                    }
                    Iterator it12 = arrayList2.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it12.next();
                        if (Intrinsics.f(((OpenBankingBrazilPayment.EditableMoneyField) next2).f72402a, "singleTransactionLimit")) {
                            break;
                        }
                    }
                    OpenBankingBrazilPayment.EditableMoneyField editableMoneyField4 = (OpenBankingBrazilPayment.EditableMoneyField) next2;
                    dailyLimit = new LimitConfig.DailyLimit(dVar2, dVar, z, editableMoneyField4 != null ? editableMoneyField4.d : null);
                } else {
                    dailyLimit = null;
                }
                if (dailyLimit != null) {
                    aVar2.C2(new BrazilConsentDetailsScreenContract$OutputData.LimitUpdate(str, dailyLimit, arrayList2, editableDateField));
                } else {
                    IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("Limit field not found: ", str));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                }
            }
        } else if (obj3 instanceof OpenBankingBrazilPayment.EditableDateField) {
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c cVar2 = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) ((f) ((j2) yVar.f22677a).getValue()).f161713a.getContent();
            if (cVar2 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Consent details content was null when date edit was clicked");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
            } else {
                List list2 = cVar2.d.f72409a;
                ArrayList arrayList3 = new ArrayList();
                Iterator it13 = list2.iterator();
                while (it13.hasNext()) {
                    a0.x(((OpenBankingBrazilPayment.InfoGroup) it13.next()).f72405a, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it14 = arrayList3.iterator();
                while (it14.hasNext()) {
                    OpenBankingBrazilPayment.EditableMoneyField editableMoneyField5 = ((OpenBankingBrazilPayment.Item) it14.next()).f72408c;
                    if (editableMoneyField5 != null) {
                        arrayList4.add(editableMoneyField5);
                    }
                }
                aVar2.C2(new BrazilConsentDetailsScreenContract$OutputData.ExpiryDateUpdate((OpenBankingBrazilPayment.EditableDateField) obj3, arrayList4));
            }
        } else {
            IllegalStateException illegalStateException4 = new IllegalStateException(a0.d.m(obj3, "Unexpected parcel for cell end text click "));
            h0 h0Var4 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException4, h0Var4);
        }
        return Unit.f186387a;
    }
}
