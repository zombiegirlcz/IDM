package mx0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e1 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f209667a;

    public e1(c1 c1Var) {
        this.f209667a = c1Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float f;
        float f4;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        c1 c1Var = this.f209667a;
        if (c1Var.f209621a != com.revolut.core.ui_kit.models.avatar.a.CLIPPED || c1Var.a(view)) {
            f = width;
            f4 = height;
        } else {
            f = width / 1.28f;
            f4 = height / 1.28f;
        }
        float f5 = 2;
        int i = (int) ((width - f) / f5);
        int i2 = (int) ((height - f4) / f5);
        outline.setRoundRect(i, i2, i + ((int) f), i2 + ((int) f4), (r8 - i2) / 2.0f);
    }
}
