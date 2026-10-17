package ip0;

import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatPaymentBubbleDelegate;
import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarDrawable;
import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomTabView;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class xe implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f167147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f167148c;

    public /* synthetic */ xe(Object obj2, Object obj3, int i) {
        this.f167146a = i;
        this.f167147b = obj2;
        this.f167148c = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String str;
        int i = this.f167146a;
        Object obj2 = this.f167148c;
        Object obj3 = this.f167147b;
        switch (i) {
            case 0:
                ze zeVar = (ze) obj2;
                ItemTouchHelper itemTouchHelper = ((DraggableDelegate) obj3).d;
                if (itemTouchHelper != null) {
                    itemTouchHelper.startDrag(zeVar);
                }
                return true;
            case 1:
                ((RewardDelegate) obj3).e.onNext((RewardDelegate.Model) obj2);
                return true;
            case 2:
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                RowDelegate.Companion companion = RowDelegate.INSTANCE;
                Intrinsics.h(view);
                RowDelegate.C(view, model);
                ((RowDelegate) obj3).f53227t.onNext(model);
                return true;
            case 3:
                ((ChatBubbleDelegate) obj3).o.onNext((ChatBubbleDelegate.Model) obj2);
                return true;
            case 4:
                ((ChatPaymentBubbleDelegate) obj3).f53866j.onNext((ChatPaymentBubbleDelegate.Model) obj2);
                return true;
            case 5:
                FloatingBottomBarView floatingBottomBarView = (FloatingBottomBarView) obj2;
                FloatingBottomBarView.Companion companion2 = FloatingBottomBarView.INSTANCE;
                FloatingBottomTabView.DisplayedItemModel displayedItem = ((FloatingBottomTabView) obj3).getDisplayedItem();
                if (displayedItem == null || (str = displayedItem.f57043a) == null) {
                    return false;
                }
                com.revolut.core.ui_kit.internal.views.floatingbottombar.j jVar = floatingBottomBarView.z;
                if (jVar != null) {
                    FloatingBottomBarDrawable floatingBottomBarDrawable = jVar.f57074b;
                    if (jVar.e && jVar.f == mt0.x.TAP_PENDING) {
                        jVar.f57075c.a(jVar.f57078j);
                        jVar.f();
                        floatingBottomBarDrawable.h();
                        floatingBottomBarDrawable.b(null, null, true);
                        jVar.a(true);
                    }
                }
                floatingBottomBarView.p();
                floatingBottomBarView.f58580p.onNext(str);
                return false;
            default:
                ((AccountSelectionNavBarContentView) obj3).f59173n.onNext((tx0.r) obj2);
                return true;
        }
    }
}
