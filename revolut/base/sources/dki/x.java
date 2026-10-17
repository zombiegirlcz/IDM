package dki;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f115560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yji.l f115561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f115562c;
    public final com.revolut.kompot.navigable.b d;
    public final View e;
    public final Integer f;

    public x(com.revolut.kompot.navigable.a controller, yji.l controllerModel, com.revolut.kompot.navigable.a aVar, com.revolut.kompot.navigable.b parentControllerManager, View view) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        Intrinsics.checkNotNullParameter(parentControllerManager, "parentControllerManager");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f115560a = controller;
        this.f115561b = controllerModel;
        this.f115562c = aVar;
        this.d = parentControllerManager;
        this.e = view;
        Drawable background = view.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        this.f = colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null;
    }

    public final void a(int i, boolean z) {
        View view = this.e;
        if (!z) {
            view.setBackgroundColor(i);
            return;
        }
        Drawable background = view.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        int color = colorDrawable != null ? colorDrawable.getColor() : 0;
        if (color != i) {
            OneShotPreDrawListener.add(view, new v(view, color, i, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aii.n b(aii.m r11) {
        /*
            r10 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.revolut.kompot.navigable.a r0 = r11.f5291a
            com.revolut.kompot.navigable.a r1 = r10.f115560a
            if (r0 != 0) goto Ld
            r11.f5291a = r1
        Ld:
            boolean r0 = r11 instanceof hji.b
            com.revolut.kompot.navigable.a r2 = r10.f115562c
            r3 = 0
            if (r0 == 0) goto L6e
            r0 = r11
            hji.b r0 = (hji.b) r0
            boolean r4 = r0 instanceof hji.a
            if (r4 == 0) goto L5f
            hji.a r0 = (hji.a) r0
            java.lang.Integer r4 = r10.f
            if (r4 == 0) goto L58
            com.revolut.kompot.navigable.a r5 = r0.f152825b
            com.revolut.kompot.navigable.flow.BaseFlow r6 = r0.f152826c
            boolean r0 = r0.d
            android.view.View r5 = r5.D2()
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            boolean r7 = r5 instanceof android.graphics.drawable.ColorDrawable
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L48
            android.graphics.drawable.ColorDrawable r5 = (android.graphics.drawable.ColorDrawable) r5
            int r4 = r5.getColor()
            if (r0 != 0) goto L43
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L44
        L43:
            r8 = r9
        L44:
            r10.a(r4, r8)
            goto L58
        L48:
            int r4 = r4.intValue()
            if (r0 != 0) goto L54
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L55
        L54:
            r8 = r9
        L55:
            r10.a(r4, r8)
        L58:
            com.revolut.kompot.navigable.b r0 = r10.d
            boolean r0 = r0.f98422h
            if (r0 == 0) goto L5f
            goto L85
        L5f:
            boolean r0 = r2 instanceof aii.o
            if (r0 == 0) goto L66
            aii.o r2 = (aii.o) r2
            goto L67
        L66:
            r2 = r3
        L67:
            if (r2 == 0) goto L85
            aii.n r11 = r2.M0(r11)
            return r11
        L6e:
            yji.l r0 = r10.f115561b
            aii.n r0 = r0.o2(r11)
            if (r0 != 0) goto L86
            boolean r0 = r2 instanceof aii.o
            if (r0 == 0) goto L7d
            aii.o r2 = (aii.o) r2
            goto L7e
        L7d:
            r2 = r3
        L7e:
            if (r2 == 0) goto L85
            aii.n r11 = r2.M0(r11)
            return r11
        L85:
            return r3
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dki.x.b(aii.m):aii.n");
    }
}
