package wx0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import h30.l;
import kotlin.jvm.internal.Intrinsics;
import mx0.w4;
import vu0.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f300714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f300715c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj2, int i, Object obj3, Object obj4) {
        this.f300713a = i;
        this.f300714b = obj2;
        this.f300715c = obj3;
        this.d = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f300713a) {
            case 0:
                l.w(view, view).a(view, (TrackableItem) this.f300714b, (py0.d) this.f300715c);
                ((e) this.d).d.onNext(w4.f210071a);
                break;
            case 1:
                l.w(view, view).a(view, (TrackableItem) this.f300714b, (py0.d) this.f300715c);
                ((f) this.d).f300721c.onNext(w4.f210071a);
                break;
            default:
                Intrinsics.h(view);
                ((yu0.c) this.f300714b).f316855b.invoke((o) this.f300715c, (SwipeToActionDelegate.SwipeAction) this.d);
                break;
        }
    }
}
