package au0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarContentCenterView;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final class l2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomTrackableComponent f9261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBarContentCenterView f9262c;

    public /* synthetic */ l2(CustomTrackableComponent customTrackableComponent, NavBarContentCenterView navBarContentCenterView, int i) {
        this.f9260a = i;
        this.f9261b = customTrackableComponent;
        this.f9262c = navBarContentCenterView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9260a) {
            case 0:
                h30.l.w(view, view).a(view, this.f9261b, null);
                this.f9262c.v.onNext(Unit.f186387a);
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f9261b, null);
                this.f9262c.f57312y.onNext(Unit.f186387a);
                break;
            default:
                h30.l.w(view, view).a(view, this.f9261b, null);
                this.f9262c.f57312y.onNext(Unit.f186387a);
                break;
        }
    }
}
