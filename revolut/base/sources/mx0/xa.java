package mx0;

import android.view.View;
import android.widget.Button;
import com.revolut.core.ui_kit.views.NumpadView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class xa implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NumpadView f210110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Button f210111c;
    public final /* synthetic */ NumpadView d;

    public /* synthetic */ xa(NumpadView numpadView, Button button, NumpadView numpadView2, int i) {
        this.f210109a = i;
        this.f210110b = numpadView;
        this.f210111c = button;
        this.d = numpadView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f210109a) {
            case 0:
                NumpadView.a(this.f210110b, this.f210111c);
                this.d.f58810a.onNext(0);
                break;
            case 1:
                NumpadView.a(this.f210110b, this.f210111c);
                this.d.f58811b.onNext(Unit.f186387a);
                break;
            default:
                NumpadView.a(this.f210110b, this.f210111c);
                this.d.f58812c.onNext(Unit.f186387a);
                break;
        }
    }
}
