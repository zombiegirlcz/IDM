package tx0;

import android.view.View;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class x3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarWithToolbar f275272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBarWithToolbar f275273c;

    public /* synthetic */ x3(NavBarWithToolbar navBarWithToolbar, NavBarWithToolbar navBarWithToolbar2, int i) {
        this.f275271a = i;
        this.f275272b = navBarWithToolbar;
        this.f275273c = navBarWithToolbar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f275271a) {
            case 0:
                h30.l.w(view, view).a(view, this.f275272b, null);
                this.f275273c.P0.onNext(Unit.f186387a);
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f275272b, null);
                this.f275273c.Q0.onNext(Unit.f186387a);
                break;
            case 2:
                h30.l.w(view, view).a(view, this.f275272b, null);
                this.f275273c.R0.onNext(Unit.f186387a);
                break;
            case 3:
                h30.l.w(view, view).a(view, this.f275272b, null);
                this.f275273c.P0.onNext(Unit.f186387a);
                break;
            case 4:
                h30.l.w(view, view).a(view, this.f275272b, null);
                this.f275273c.S0.onNext(Unit.f186387a);
                break;
            case 5:
                h30.l.w(view, view).a(view, this.f275272b, null);
                this.f275273c.U0.onNext(Unit.f186387a);
                break;
            default:
                h30.l.w(view, view).a(view, this.f275272b, null);
                this.f275273c.f59410q.onNext(Unit.f186387a);
                break;
        }
    }
}
