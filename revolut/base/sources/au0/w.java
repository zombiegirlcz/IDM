package au0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintHeaderLayout f9410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConstraintHeaderLayout f9411c;

    public /* synthetic */ w(ConstraintHeaderLayout constraintHeaderLayout, ConstraintHeaderLayout constraintHeaderLayout2, int i) {
        this.f9409a = i;
        this.f9410b = constraintHeaderLayout;
        this.f9411c = constraintHeaderLayout2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9409a) {
            case 0:
                h30.l.w(view, view).a(view, this.f9410b, null);
                ConstraintHeaderLayout constraintHeaderLayout = this.f9411c;
                constraintHeaderLayout.f57246j.onNext(constraintHeaderLayout.f57251q);
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f9410b, null);
                ConstraintHeaderLayout constraintHeaderLayout2 = this.f9411c;
                constraintHeaderLayout2.k.onNext(constraintHeaderLayout2.f57251q);
                break;
            default:
                h30.l.w(view, view).a(view, this.f9410b, null);
                this.f9411c.o.onNext(Unit.f186387a);
                break;
        }
    }
}
