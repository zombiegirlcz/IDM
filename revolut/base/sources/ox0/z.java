package ox0;

import android.view.View;
import aw0.k9;
import com.revolut.core.ui_kit.views.buttons.SearchButton;

/* JADX INFO: loaded from: classes20.dex */
public final class z implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchButton f230522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchButton f230523c;
    public final /* synthetic */ k9 d;

    public /* synthetic */ z(SearchButton searchButton, SearchButton searchButton2, k9 k9Var, int i) {
        this.f230521a = i;
        this.f230522b = searchButton;
        this.f230523c = searchButton2;
        this.d = k9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f230521a) {
            case 0:
                h30.l.w(view, view).a(view, this.f230522b, null);
                this.f230523c.f59003n.onNext(this.d.f10397a.f10251a);
                break;
            default:
                h30.l.w(view, view).a(view, this.f230522b, null);
                this.f230523c.f59003n.onNext(this.d.f10398b.f10251a);
                break;
        }
    }
}
