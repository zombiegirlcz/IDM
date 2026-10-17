package au0;

import android.text.Editable;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final class w4 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f9417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchView f9418c;

    public /* synthetic */ w4(SearchView searchView, SearchView searchView2, int i) {
        this.f9416a = i;
        this.f9417b = searchView;
        this.f9418c = searchView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9416a) {
            case 0:
                h30.l.w(view, view).a(view, this.f9417b, null);
                this.f9418c.f57339p.onNext(Unit.f186387a);
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f9417b, null);
                this.f9418c.f57336l.onNext(Unit.f186387a);
                break;
            default:
                h30.l.w(view, view).a(view, this.f9417b, null);
                Editable text = this.f9418c.getSearch().getText();
                if (text != null) {
                    text.clear();
                }
                break;
        }
    }
}
