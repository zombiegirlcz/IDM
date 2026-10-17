package qx0;

import android.animation.ValueAnimator;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f249978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CodeEditor f249979b;

    public e(CodeEditor codeEditor) {
        this.f249979b = codeEditor;
        this.f249978a = codeEditor.I;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        CodeEditor codeEditor = this.f249979b;
        int iA = codeEditor.getMode().a();
        int iC = rim.d.c(animation.getAnimatedFraction() * (iA - 1));
        if (iC != this.f249978a) {
            this.f249978a = iC;
            int i = 0;
            while (i < iA) {
                codeEditor.f59036b[i].setActivated(i == iC);
                i++;
            }
        }
    }
}
