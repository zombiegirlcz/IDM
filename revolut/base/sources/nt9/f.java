package nt9;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.groups.impl.ui_new.group_creation.GroupCreationScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupCreationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(GroupCreationScreen groupCreationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupCreationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        st9.b bVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar2 = (com.revolut.feature.payments.groups.impl.ui_new.group_creation.b) iVarE3;
        y yVar = bVar2.f79487w;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "GROUP_SMART_SETTLEMENT_TOGGLE_LIST_ID")) {
            int i = k.f219007a[((g) ((j2) yVar.f22677a).getValue()).f.ordinal()];
            int i2 = 2;
            if (i == 1) {
                bVar = st9.b.SMART;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = st9.b.DUMB;
            }
            bVar2.H2(yVar, new nrd.g(bVar, i2));
        }
        return Unit.f186387a;
    }
}
