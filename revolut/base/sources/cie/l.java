package cie;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AccountsController accountsController, Continuation continuation) {
        super(2, continuation);
        this.v = accountsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((SmallStockCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RecyclerView.ViewHolder viewHolder;
        AccountsController accountsController = this.v;
        ?? r110 = accountsController.J0;
        SmallStockCardDelegate.Model model = (SmallStockCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f53388p;
        mhe.j jVar = obj3 instanceof mhe.j ? (mhe.j) obj3 : null;
        if (jVar == null) {
            return Unit.f186387a;
        }
        Iterator it8 = accountsController.I0.f319395l.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((koi.j) it8.next()).getF55091b(), model.f53379a)) {
                break;
            }
            i++;
        }
        if (i >= 0 && (viewHolder = ((tki.b) ((tki.a) accountsController.M0.getValue())).f271959b.h().findViewHolderForAdapterPosition(i)) != null && viewHolder.getBindingAdapterPosition() != -1) {
            if (jVar instanceof mhe.i) {
                mhe.d dVar = (mhe.d) r110.getValue();
                dVar.getClass();
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                dVar.f = viewHolder;
                viewHolder.itemView.animate().cancel();
                viewHolder.itemView.animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(mhe.d.f205546h).setDuration(200L).start();
                dVar.f205548b.startDrag(viewHolder);
            } else {
                if (!(jVar instanceof mhe.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                mhe.d dVar2 = (mhe.d) r110.getValue();
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                dVar2.f = viewHolder;
                View itemView = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                dVar2.d = itemView.getElevation();
                itemView.animate().cancel();
                itemView.animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(mhe.d.f205546h).setDuration(200L).start();
            }
            return Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
