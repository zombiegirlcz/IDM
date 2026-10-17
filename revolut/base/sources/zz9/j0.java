package zz9;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillFeatureConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.b4;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d f326615w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i, com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f326615w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j0 j0Var = new j0(0, this.f326615w, continuation);
                j0Var.v = obj2;
                return j0Var;
            case 1:
                j0 j0Var2 = new j0(1, this.f326615w, continuation);
                j0Var2.v = obj2;
                return j0Var2;
            case 2:
                j0 j0Var3 = new j0(2, this.f326615w, continuation);
                j0Var3.v = obj2;
                return j0Var3;
            case 3:
                j0 j0Var4 = new j0(3, this.f326615w, continuation);
                j0Var4.v = obj2;
                return j0Var4;
            default:
                j0 j0Var5 = new j0(4, this.f326615w, continuation);
                j0Var5.v = obj2;
                return j0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j0) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j0) create((fu9.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j0) create((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j0) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j0) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = 25;
        switch (this.u) {
            case 0:
                n nVar = (n) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar = this.f326615w;
                dVar.H2(dVar.I, new zrd.q(nVar, 25));
                break;
            case 1:
                fu9.a aVar2 = (fu9.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar2 = this.f326615w;
                dVar2.H2(dVar2.I, new zrd.q(aVar2, 26));
                break;
            case 2:
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a aVar4 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (this.f326615w.H) {
                    this.f326615w.H = false;
                    com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar3 = this.f326615w;
                    dVar3.H2(dVar3.I, new zp5.f(aVar4, dVar3, i));
                } else {
                    com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar4 = this.f326615w;
                    dVar4.H2(dVar4.I, new zrd.q(aVar4, 27));
                }
                break;
            case 3:
                s sVar = (s) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar5 = this.f326615w;
                dVar5.H2(dVar5.I, new zrd.q(sVar, 28));
                break;
            default:
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar6 = this.f326615w;
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String f53900a = popupMenuItem.getF52302a();
                if (Intrinsics.f(f53900a, "POPUP_ITEM_GIF_LIST_ID")) {
                    dVar6.J2(b4.REACTIONS_KEYBOARD);
                } else if (Intrinsics.f(f53900a, "POPUP_ITEM_SPLIT_BILL_LIST_ID")) {
                    e0a.i iVar = (e0a.i) dVar6.v;
                    iVar.A2(u0.c(new SplitBillFeatureConfig.ChooseBills(zhm.u.c(iVar.f121497l.f79768a), x0a.a.CHAT)));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unexpected listId=", popupMenuItem.getF52302a()));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
        }
        return Unit.f186387a;
    }
}
