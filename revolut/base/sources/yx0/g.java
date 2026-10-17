package yx0;

import android.view.View;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import h30.l;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinCodeView f317527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PinCodeView f317528c;

    public /* synthetic */ g(PinCodeView pinCodeView, PinCodeView pinCodeView2, int i) {
        this.f317526a = i;
        this.f317527b = pinCodeView;
        this.f317528c = pinCodeView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f317526a) {
            case 0:
                l.w(view, view).a(view, this.f317527b, null);
                this.f317528c.getSubtitleClickSubject().onNext(Unit.f186387a);
                break;
            default:
                l.w(view, view).a(view, this.f317527b, null);
                this.f317528c.getDescriptionClickSubject().onNext(Unit.f186387a);
                break;
        }
    }
}
