package rp9;

import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection.BillsChooserScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r40.n0;
import rlh.d0;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BillsChooserScreen f256299w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(BillsChooserScreen billsChooserScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f256299w = billsChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f256299w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f256299w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f256299w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((dp9.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((SplitMethod) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BillsChooserScreen billsChooserScreen = this.f256299w;
        switch (i) {
            case 0:
                String searchQuery = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b bVarT2 = billsChooserScreen.T2();
                Intrinsics.h(searchQuery);
                m mVar = (m) bVarT2;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                mVar.u.d(searchQuery);
                mVar.x2(new n0(searchQuery, 22));
                break;
            case 1:
                dp9.b item = (dp9.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b bVarT22 = billsChooserScreen.T2();
                Intrinsics.h(item);
                m mVar2 = (m) bVarT22;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj3 = item.f116849b;
                String str = item.f116848a;
                if (obj3 instanceof BillType) {
                    mVar2.x2(new d0((BillType) obj3, 20));
                } else if (Intrinsics.f(str, "ID_CUSTOM_BILL_ACTION")) {
                    mVar2.n2(new l(mVar2, null), new whi.b(6));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Unknown ListItem click: listId=", str, ", parcelClass=", obj3 != null ? obj3.getClass().getName() : null));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            default:
                SplitMethod splitMethod = (SplitMethod) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b bVarT23 = billsChooserScreen.T2();
                Intrinsics.h(splitMethod);
                m mVar3 = (m) bVarT23;
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(splitMethod, "splitMethod");
                j60.a.v(mVar3.f256305s, false, null, 3);
                mVar3.v2(new bp9.b(((a) mVar3.t2()).f256290b, splitMethod));
                break;
        }
        return Unit.f186387a;
    }
}
