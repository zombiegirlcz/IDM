package tx0;

import android.view.View;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class h3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarWithContainerHeaderView f275151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBarWithContainerHeaderView f275152c;

    public /* synthetic */ h3(NavBarWithContainerHeaderView navBarWithContainerHeaderView, NavBarWithContainerHeaderView navBarWithContainerHeaderView2, int i) {
        this.f275150a = i;
        this.f275151b = navBarWithContainerHeaderView;
        this.f275152c = navBarWithContainerHeaderView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f275150a) {
            case 0:
                h30.l.w(view, view).a(view, this.f275151b, null);
                this.f275152c.P.onNext(Unit.f186387a);
                break;
            default:
                h30.l.w(view, view).a(view, this.f275151b, null);
                this.f275152c.R.onNext(Unit.f186387a);
                break;
        }
    }
}
