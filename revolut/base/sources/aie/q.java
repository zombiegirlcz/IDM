package aie;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesScreen;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountSpacesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AccountSpacesScreen accountSpacesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountSpacesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        koi.b bVarF;
        RowDelegate.Model rowDelegateModel = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.h(rowDelegateModel);
        Intrinsics.checkNotNullParameter(rowDelegateModel, "<this>");
        Object obj3 = rowDelegateModel.u;
        SpaceContentListMapper$ItemParcel.SubspaceValueItem subspaceValueItem = obj3 instanceof SpaceContentListMapper$ItemParcel.SubspaceValueItem ? (SpaceContentListMapper$ItemParcel.SubspaceValueItem) obj3 : null;
        boolean z = subspaceValueItem == null ? false : subspaceValueItem.d;
        AccountSpacesScreen accountSpacesScreen = this.v;
        if (z && (bVarF = yp0.y.f(((tki.b) accountSpacesScreen.k()).f271959b.h(), rowDelegateModel.f53228a)) != null) {
            ((tki.b) accountSpacesScreen.k()).f271959b.h().requestDisallowInterceptTouchEvent(false);
            ((ItemTouchHelper) accountSpacesScreen.R.getValue()).startDrag(bVarF);
            ((r70.e) ((com.revolut.feature.tab.accounts.impl.ui.spaces.i) accountSpacesScreen.k3()).f89641t).c(r70.b.SHORT, true);
        }
        com.revolut.feature.tab.accounts.impl.ui.spaces.i iVar = (com.revolut.feature.tab.accounts.impl.ui.spaces.i) accountSpacesScreen.k3();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(rowDelegateModel, "rowDelegateModel");
        SpaceContentListMapper$ItemParcel.SubspaceValueItem subspaceValueItem2 = obj3 instanceof SpaceContentListMapper$ItemParcel.SubspaceValueItem ? (SpaceContentListMapper$ItemParcel.SubspaceValueItem) obj3 : null;
        if (subspaceValueItem2 != null) {
            ProductAccountDescriptor$Value productAccountDescriptor$Value = subspaceValueItem2.f89621c;
            if (productAccountDescriptor$Value.getF89727a() != ProductId.ON_HOLD && productAccountDescriptor$Value.getF89727a() != ProductId.BEREAVEMENT) {
                iVar.K2();
                iVar.H = iVar.n2(new com.revolut.feature.tab.accounts.impl.ui.spaces.h(iVar, productAccountDescriptor$Value, subspaceValueItem2, rowDelegateModel, null), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
