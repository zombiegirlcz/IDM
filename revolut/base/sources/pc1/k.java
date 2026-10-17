package pc1;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import fa1.o;
import fa1.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.y0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((fa1.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        final q qVar = this.v;
        xc1.d dVar = qVar.v;
        final fa1.l lVar = (fa1.l) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        fa1.o oVar = lVar.f133190a;
        final int i = 0;
        if (oVar instanceof o.g) {
            dVar.Q(new Function0() { // from class: pc1.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    TextLocalisedClause textLocalisedClause;
                    TextLocalisedClause titleClause;
                    boolean z;
                    TextLocalisedClause textLocalisedClause2;
                    switch (i) {
                        case 0:
                            fa1.l lVar2 = lVar;
                            Intrinsics.h(lVar2);
                            q qVar2 = qVar;
                            dj0.d dVarY2 = qVar2.y2();
                            Continuation continuation = null;
                            switch (f.f234785a[lVar2.f133192c.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.merchant_card_reader_transaction_flow_event_waiting_for_card_title, null, null, 14);
                                    textLocalisedClause = new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_payment_description, u.c(new MoneyClause(dVarY2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                                    titleClause = textLocalisedClause3;
                                    z = true;
                                    break;
                                case 6:
                                    textLocalisedClause2 = new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_cancelling_payment, null, null, 14);
                                    textLocalisedClause = new TextLocalisedClause(R$string.merchant_card_reader_common_please_wait, null, null, 14);
                                    titleClause = textLocalisedClause2;
                                    z = false;
                                    break;
                                default:
                                    textLocalisedClause2 = new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_payment_in_progress, null, null, 14);
                                    textLocalisedClause = new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_payment_description, u.c(new MoneyClause(dVarY2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                                    titleClause = textLocalisedClause2;
                                    z = false;
                                    break;
                            }
                            TextLocalisedClause textLocalisedClause4 = textLocalisedClause;
                            qVar2.u.getClass();
                            Intrinsics.checkNotNullParameter(titleClause, "titleClause");
                            yji.l.a1(qVar2, qVar2.X1(new y0(null, new c0(titleClause, textLocalisedClause4, null, true, new TextLocalisedClause(R$string.merchant_card_reader_common_action_cancel, null, null, 14), z, false, null, 1804), false, 5)), null, null, new h(qVar2, continuation, 1), 3);
                            return Unit.f186387a;
                        default:
                            y yVar = lVar.e;
                            if (yVar == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            String str = yVar.d;
                            q qVar3 = qVar;
                            dj0.d dVarY22 = qVar3.y2();
                            q.z2("Payment approved");
                            qVar3.u.getClass();
                            yji.l.a1(qVar3, qVar3.X1(b.a(dVarY22, str)), null, null, new l(qVar3, str, dVarY22, null), 3);
                            return Unit.f186387a;
                    }
                }
            });
        } else {
            final int i2 = 1;
            if (oVar instanceof o.a) {
                dVar.Q(new Function0() { // from class: pc1.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        TextLocalisedClause textLocalisedClause;
                        TextLocalisedClause titleClause;
                        boolean z;
                        TextLocalisedClause textLocalisedClause2;
                        switch (i2) {
                            case 0:
                                fa1.l lVar2 = lVar;
                                Intrinsics.h(lVar2);
                                q qVar2 = qVar;
                                dj0.d dVarY2 = qVar2.y2();
                                Continuation continuation = null;
                                switch (f.f234785a[lVar2.f133192c.ordinal()]) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.merchant_card_reader_transaction_flow_event_waiting_for_card_title, null, null, 14);
                                        textLocalisedClause = new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_payment_description, u.c(new MoneyClause(dVarY2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                                        titleClause = textLocalisedClause3;
                                        z = true;
                                        break;
                                    case 6:
                                        textLocalisedClause2 = new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_cancelling_payment, null, null, 14);
                                        textLocalisedClause = new TextLocalisedClause(R$string.merchant_card_reader_common_please_wait, null, null, 14);
                                        titleClause = textLocalisedClause2;
                                        z = false;
                                        break;
                                    default:
                                        textLocalisedClause2 = new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_payment_in_progress, null, null, 14);
                                        textLocalisedClause = new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_payment_description, u.c(new MoneyClause(dVarY2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                                        titleClause = textLocalisedClause2;
                                        z = false;
                                        break;
                                }
                                TextLocalisedClause textLocalisedClause4 = textLocalisedClause;
                                qVar2.u.getClass();
                                Intrinsics.checkNotNullParameter(titleClause, "titleClause");
                                yji.l.a1(qVar2, qVar2.X1(new y0(null, new c0(titleClause, textLocalisedClause4, null, true, new TextLocalisedClause(R$string.merchant_card_reader_common_action_cancel, null, null, 14), z, false, null, 1804), false, 5)), null, null, new h(qVar2, continuation, 1), 3);
                                return Unit.f186387a;
                            default:
                                y yVar = lVar.e;
                                if (yVar == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                String str = yVar.d;
                                q qVar3 = qVar;
                                dj0.d dVarY22 = qVar3.y2();
                                q.z2("Payment approved");
                                qVar3.u.getClass();
                                yji.l.a1(qVar3, qVar3.X1(b.a(dVarY22, str)), null, null, new l(qVar3, str, dVarY22, null), 3);
                                return Unit.f186387a;
                        }
                    }
                });
            } else if (oVar instanceof o.d) {
                dVar.Q(new ky4.f(qVar, 26, lVar, oVar));
            } else if (oVar instanceof o.b) {
                dVar.Q(new Function0() { // from class: pc1.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                q.z2("Payment cancelled");
                                q qVar2 = qVar;
                                qVar2.u.getClass();
                                yji.l.b1(qVar2, qVar2.X1(b.b()), null, new m(qVar2, null), 3);
                                break;
                            case 1:
                                q.z2("Terminal needs update");
                                q qVar3 = qVar;
                                qVar3.u.getClass();
                                yji.l.b1(qVar3, qVar3.X1(b.h()), null, new p(qVar3, null), 3);
                                break;
                            case 2:
                                q qVar4 = qVar;
                                dj0.d dVarY2 = qVar4.y2();
                                q.z2("Payment failed - reader disconnected");
                                qVar4.u.getClass();
                                yji.l.b1(qVar4, qVar4.X1(b.e(dVarY2)), null, new o(qVar4, null), 3);
                                break;
                            case 3:
                                q qVar5 = qVar;
                                dj0.d dVarY22 = qVar5.y2();
                                q.z2("Payment failed - unsupported card");
                                qVar5.u.getClass();
                                yji.l.b1(qVar5, qVar5.X1(b.i(dVarY22)), null, new o(qVar5, null), 3);
                                break;
                            default:
                                q qVar6 = qVar;
                                dj0.d dVarY23 = qVar6.y2();
                                q.z2("Payment failed - card wait failed");
                                qVar6.u.getClass();
                                yji.l.b1(qVar6, qVar6.X1(b.c(dVarY23)), null, new o(qVar6, null), 3);
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
            } else if (oVar instanceof o.h) {
                dVar.Q(new Function0() { // from class: pc1.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                q.z2("Payment cancelled");
                                q qVar2 = qVar;
                                qVar2.u.getClass();
                                yji.l.b1(qVar2, qVar2.X1(b.b()), null, new m(qVar2, null), 3);
                                break;
                            case 1:
                                q.z2("Terminal needs update");
                                q qVar3 = qVar;
                                qVar3.u.getClass();
                                yji.l.b1(qVar3, qVar3.X1(b.h()), null, new p(qVar3, null), 3);
                                break;
                            case 2:
                                q qVar4 = qVar;
                                dj0.d dVarY2 = qVar4.y2();
                                q.z2("Payment failed - reader disconnected");
                                qVar4.u.getClass();
                                yji.l.b1(qVar4, qVar4.X1(b.e(dVarY2)), null, new o(qVar4, null), 3);
                                break;
                            case 3:
                                q qVar5 = qVar;
                                dj0.d dVarY22 = qVar5.y2();
                                q.z2("Payment failed - unsupported card");
                                qVar5.u.getClass();
                                yji.l.b1(qVar5, qVar5.X1(b.i(dVarY22)), null, new o(qVar5, null), 3);
                                break;
                            default:
                                q qVar6 = qVar;
                                dj0.d dVarY23 = qVar6.y2();
                                q.z2("Payment failed - card wait failed");
                                qVar6.u.getClass();
                                yji.l.b1(qVar6, qVar6.X1(b.c(dVarY23)), null, new o(qVar6, null), 3);
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
            } else if (oVar instanceof o.f) {
                final int i3 = 2;
                dVar.Q(new Function0() { // from class: pc1.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                q.z2("Payment cancelled");
                                q qVar2 = qVar;
                                qVar2.u.getClass();
                                yji.l.b1(qVar2, qVar2.X1(b.b()), null, new m(qVar2, null), 3);
                                break;
                            case 1:
                                q.z2("Terminal needs update");
                                q qVar3 = qVar;
                                qVar3.u.getClass();
                                yji.l.b1(qVar3, qVar3.X1(b.h()), null, new p(qVar3, null), 3);
                                break;
                            case 2:
                                q qVar4 = qVar;
                                dj0.d dVarY2 = qVar4.y2();
                                q.z2("Payment failed - reader disconnected");
                                qVar4.u.getClass();
                                yji.l.b1(qVar4, qVar4.X1(b.e(dVarY2)), null, new o(qVar4, null), 3);
                                break;
                            case 3:
                                q qVar5 = qVar;
                                dj0.d dVarY22 = qVar5.y2();
                                q.z2("Payment failed - unsupported card");
                                qVar5.u.getClass();
                                yji.l.b1(qVar5, qVar5.X1(b.i(dVarY22)), null, new o(qVar5, null), 3);
                                break;
                            default:
                                q qVar6 = qVar;
                                dj0.d dVarY23 = qVar6.y2();
                                q.z2("Payment failed - card wait failed");
                                qVar6.u.getClass();
                                yji.l.b1(qVar6, qVar6.X1(b.c(dVarY23)), null, new o(qVar6, null), 3);
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
            } else if (oVar instanceof o.i) {
                final int i5 = 3;
                dVar.Q(new Function0() { // from class: pc1.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                q.z2("Payment cancelled");
                                q qVar2 = qVar;
                                qVar2.u.getClass();
                                yji.l.b1(qVar2, qVar2.X1(b.b()), null, new m(qVar2, null), 3);
                                break;
                            case 1:
                                q.z2("Terminal needs update");
                                q qVar3 = qVar;
                                qVar3.u.getClass();
                                yji.l.b1(qVar3, qVar3.X1(b.h()), null, new p(qVar3, null), 3);
                                break;
                            case 2:
                                q qVar4 = qVar;
                                dj0.d dVarY2 = qVar4.y2();
                                q.z2("Payment failed - reader disconnected");
                                qVar4.u.getClass();
                                yji.l.b1(qVar4, qVar4.X1(b.e(dVarY2)), null, new o(qVar4, null), 3);
                                break;
                            case 3:
                                q qVar5 = qVar;
                                dj0.d dVarY22 = qVar5.y2();
                                q.z2("Payment failed - unsupported card");
                                qVar5.u.getClass();
                                yji.l.b1(qVar5, qVar5.X1(b.i(dVarY22)), null, new o(qVar5, null), 3);
                                break;
                            default:
                                q qVar6 = qVar;
                                dj0.d dVarY23 = qVar6.y2();
                                q.z2("Payment failed - card wait failed");
                                qVar6.u.getClass();
                                yji.l.b1(qVar6, qVar6.X1(b.c(dVarY23)), null, new o(qVar6, null), 3);
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
            } else if (oVar instanceof o.c) {
                final int i6 = 4;
                dVar.Q(new Function0() { // from class: pc1.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                q.z2("Payment cancelled");
                                q qVar2 = qVar;
                                qVar2.u.getClass();
                                yji.l.b1(qVar2, qVar2.X1(b.b()), null, new m(qVar2, null), 3);
                                break;
                            case 1:
                                q.z2("Terminal needs update");
                                q qVar3 = qVar;
                                qVar3.u.getClass();
                                yji.l.b1(qVar3, qVar3.X1(b.h()), null, new p(qVar3, null), 3);
                                break;
                            case 2:
                                q qVar4 = qVar;
                                dj0.d dVarY2 = qVar4.y2();
                                q.z2("Payment failed - reader disconnected");
                                qVar4.u.getClass();
                                yji.l.b1(qVar4, qVar4.X1(b.e(dVarY2)), null, new o(qVar4, null), 3);
                                break;
                            case 3:
                                q qVar5 = qVar;
                                dj0.d dVarY22 = qVar5.y2();
                                q.z2("Payment failed - unsupported card");
                                qVar5.u.getClass();
                                yji.l.b1(qVar5, qVar5.X1(b.i(dVarY22)), null, new o(qVar5, null), 3);
                                break;
                            default:
                                q qVar6 = qVar;
                                dj0.d dVarY23 = qVar6.y2();
                                q.z2("Payment failed - card wait failed");
                                qVar6.u.getClass();
                                yji.l.b1(qVar6, qVar6.X1(b.c(dVarY23)), null, new o(qVar6, null), 3);
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
            } else {
                if (!(oVar instanceof o.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar.Q(new ot1.p(qVar, oVar, 25));
            }
        }
        return Unit.f186387a;
    }
}
