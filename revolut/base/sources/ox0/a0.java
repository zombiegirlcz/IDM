package ox0;

import android.view.View;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchButton f230467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchButton f230468c;

    public /* synthetic */ a0(SearchButton searchButton, SearchButton searchButton2, int i) {
        this.f230466a = i;
        this.f230467b = searchButton;
        this.f230468c = searchButton2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f230466a) {
            case 0:
                h30.l.w(view, view).a(view, this.f230467b, null);
                this.f230468c.o.onNext(Unit.f186387a);
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f230467b, null);
                this.f230468c.f59004p.onNext(Unit.f186387a);
                break;
            default:
                h30.l.w(view, view).a(view, this.f230467b, null);
                this.f230468c.f59002m.onNext(Unit.f186387a);
                break;
        }
    }
}
