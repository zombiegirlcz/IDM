package tx0;

import android.view.View;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class b2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarLargeCentred f275088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBarLargeCentred f275089c;

    public /* synthetic */ b2(NavBarLargeCentred navBarLargeCentred, NavBarLargeCentred navBarLargeCentred2, int i) {
        this.f275087a = i;
        this.f275088b = navBarLargeCentred;
        this.f275089c = navBarLargeCentred2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f275087a) {
            case 0:
                h30.l.w(view, view).a(view, this.f275088b, null);
                this.f275089c.f59298t.onNext(Unit.f186387a);
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f275088b, null);
                this.f275089c.u.onNext(Unit.f186387a);
                break;
            case 2:
                h30.l.w(view, view).a(view, this.f275088b, null);
                this.f275089c.f59292m.onNext(Unit.f186387a);
                break;
            case 3:
                h30.l.w(view, view).a(view, this.f275088b, null);
                this.f275089c.f59294p.onNext(Unit.f186387a);
                break;
            default:
                h30.l.w(view, view).a(view, this.f275088b, null);
                this.f275089c.f59293n.onNext(Unit.f186387a);
                break;
        }
    }
}
