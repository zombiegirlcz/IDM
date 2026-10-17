package et0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.chat.ChatReactionDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatParentLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import kotlin.Unit;
import mx0.p0;
import mx0.x4;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f129026b;

    public /* synthetic */ f0(Object obj2, int i) {
        this.f129025a = i;
        this.f129026b = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f129025a;
        x4 x4Var = x4.f210104a;
        Object obj2 = this.f129026b;
        switch (i) {
            case 0:
                ((ChatParentLayout) obj2).onSideStatusBadgeLongClick.invoke();
                return true;
            case 1:
                ((ChatReactionDelegate) obj2).d.onNext(null);
                throw null;
            case 2:
                mx0.p0 p0Var = (mx0.p0) obj2;
                p0.a aVar = mx0.p0.Companion;
                p0Var.startActionMode(new mx0.q0(p0Var), 1);
                return true;
            case 3:
                ((ky4.f) obj2).invoke();
                return true;
            case 4:
                ((NavBarWithContainerHeaderView) obj2).Q.onNext(Unit.f186387a);
                return true;
            case 5:
                ((wx0.e) obj2).d.onNext(x4Var);
                return false;
            default:
                ((wx0.f) obj2).f300721c.onNext(x4Var);
                return false;
        }
    }
}
