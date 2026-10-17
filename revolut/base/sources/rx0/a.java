package rx0;

import androidx.dynamicanimation.animation.SpringAnimation;
import com.revolut.core.ui_kit.views.input.InputText;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputText f257995b;

    public /* synthetic */ a(InputText inputText, int i) {
        this.f257994a = i;
        this.f257995b = inputText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f257994a) {
            case 0:
                InputText.l0(this.f257995b);
                break;
            default:
                InputText inputText = this.f257995b;
                SpringAnimation springAnimation = inputText.f59103r0;
                if (springAnimation != null) {
                    springAnimation.animateToFinalPosition(inputText.f59105s0);
                }
                inputText.f59103r0 = null;
                break;
        }
    }
}
