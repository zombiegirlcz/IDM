package jq0;

import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.revolut.core.ui_kit.views.input.InputText;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k implements DynamicAnimation.OnAnimationUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f177371b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f177370a = i;
        this.f177371b = obj2;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f4) {
        int i = this.f177370a;
        Object obj2 = this.f177371b;
        switch (i) {
            case 0:
                p pVar = (p) obj2;
                View view = pVar.f177378a;
                view.setScaleX(f);
                view.setScaleY(f);
                if (pVar.f177383j && f >= pVar.k) {
                    pVar.f177383j = false;
                    pVar.f177386n.post(pVar.o);
                    break;
                }
                break;
            default:
                InputText.a aVar = InputText.Companion;
                ((Function1) obj2).invoke(Float.valueOf(f));
                break;
        }
    }
}
