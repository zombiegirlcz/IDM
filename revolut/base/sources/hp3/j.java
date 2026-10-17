package hp3;

import android.content.Context;
import androidx.recyclerview.widget.LinearSmoothScroller;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import kotlin.Unit;
import yhm.m;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends LinearSmoothScroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f154407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Context context, Object obj2) {
        super(context);
        this.f154406a = i;
        this.f154407b = obj2;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int getVerticalSnapPreference() {
        switch (this.f154406a) {
            case 0:
                return -1;
            case 1:
                return -1;
            default:
                return 1;
        }
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final void onStop() {
        int i = this.f154406a;
        Object obj2 = this.f154407b;
        switch (i) {
            case 0:
                super.onStop();
                ((CorporateEventsHomeScreen) obj2).f66131b0.onNext(Unit.f186387a);
                break;
            case 1:
                super.onStop();
                ((tw0.v) obj2).f274887a.onNext(Unit.f186387a);
                break;
            default:
                super.onStop();
                m.Companion companion = yhm.m.INSTANCE;
                ((eim.c) obj2).resumeWith(Unit.f186387a);
                break;
        }
    }
}
