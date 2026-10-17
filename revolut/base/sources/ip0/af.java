package ip0;

import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.revolut.core.ui_kit.delegates.DraggableRowDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class af implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseRecyclerViewDelegate f163433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f163434c;
    public final /* synthetic */ Object d;

    public /* synthetic */ af(BaseRecyclerViewDelegate baseRecyclerViewDelegate, Object obj2, Object obj3, int i) {
        this.f163432a = i;
        this.f163433b = baseRecyclerViewDelegate;
        this.f163434c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f163432a) {
            case 0:
                DraggableRowDelegate draggableRowDelegate = (DraggableRowDelegate) this.f163433b;
                df dfVar = (df) this.f163434c;
                bf bfVar = (bf) this.d;
                ItemTouchHelper itemTouchHelper = draggableRowDelegate.f52206c;
                if (itemTouchHelper != null) {
                    itemTouchHelper.startDrag(dfVar);
                }
                draggableRowDelegate.e.onNext(bfVar);
                break;
            default:
                ((IconDelegate) this.f163433b).d.onNext(new Pair((IconDelegate.Model) this.f163434c, ((com.revolut.core.ui_kit.delegates.g7) this.d).f54204l));
                break;
        }
        return true;
    }
}
