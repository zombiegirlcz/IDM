package qje;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TabCryptoFlow f246839w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TabCryptoFlow tabCryptoFlow, Continuation continuation) {
        super(2, continuation);
        this.f246839w = tabCryptoFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.f246839w, continuation);
        jVar.v = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objC3;
        ActionsView.Item item = (ActionsView.Item) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            l lVarE3 = this.f246839w.R2();
            Intrinsics.h(item);
            this.v = null;
            this.u = 1;
            u uVar = (u) lVarE3;
            uVar.getClass();
            if (Intrinsics.f(item.f58316a, "APPEARANCE_ACTION_ID")) {
                uVar.I2().Z2(RetailBackgroundKey.CryptoHome.f63825b);
                objC3 = Unit.f186387a;
            } else {
                objC3 = uVar.I2().c3(item, this);
                if (objC3 != aVar) {
                    objC3 = Unit.f186387a;
                }
            }
            if (objC3 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
