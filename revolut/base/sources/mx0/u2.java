package mx0;

import com.revolut.core.ui_kit.views.CardPersonalisationView;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class u2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardPersonalisationView f210029b;

    public /* synthetic */ u2(CardPersonalisationView cardPersonalisationView, int i) {
        this.f210028a = i;
        this.f210029b = cardPersonalisationView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f210028a) {
            case 0:
                CardPersonalisationView.g0(this.f210029b);
                break;
            default:
                CardPersonalisationView.o0(this.f210029b);
                break;
        }
    }
}
