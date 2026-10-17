package ip0;

import android.content.Context;
import com.revolut.core.ui_kit.delegates.SwipeableCardCoverItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardFullSizeContentItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardLoadingItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardVideoItemDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final class li0 extends bx0.r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f165211c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li0(BaseRecyclerViewDelegate baseRecyclerViewDelegate, Context context, int i) {
        super(context, true);
        this.f165211c = i;
        this.d = baseRecyclerViewDelegate;
    }

    @Override // bx0.r
    public final void a() {
        switch (this.f165211c) {
            case 0:
                ((SwipeableCardCoverItemDelegate) this.d).d.onNext(Unit.f186387a);
                break;
            case 1:
                ((SwipeableCardFullSizeContentItemDelegate) this.d).f53511c.onNext(Unit.f186387a);
                break;
            case 2:
                ((SwipeableCardLoadingItemDelegate) this.d).d.onNext(Unit.f186387a);
                break;
            case 3:
                ((SwipeableCardVideoItemDelegate) this.d).f.onNext(Unit.f186387a);
                break;
            default:
                ((ms0.g0) this.d).f.onNext(Unit.f186387a);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li0(Context context, ms0.g0 g0Var) {
        super(context, false);
        this.f165211c = 4;
        this.d = g0Var;
    }
}
