package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.core.ui_kit.delegates.ed;
import com.revolut.core.ui_kit.delegates.rd;
import ip0.z60;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import or0.u;
import oyl.f;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class c implements AccessibilityViewCommand, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49138c;

    public /* synthetic */ c(Object obj2, int i, int i2) {
        this.f49136a = i2;
        this.f49138c = obj2;
        this.f49137b = i;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        int i = this.f49136a;
        int i2 = this.f49137b;
        Object obj2 = this.f49138c;
        switch (i) {
            case 1:
                ed edVar = (ed) obj2;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "insets");
                int iSystemBars = WindowInsetsCompat.Type.systemBars();
                Insets insets2 = insets.getInsets(iSystemBars);
                Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                int i3 = insets2.top;
                ImageView imageView = edVar.i;
                int i5 = i2 + i3;
                imageView.setPadding(imageView.getPaddingLeft(), i5, imageView.getPaddingRight(), imageView.getPaddingBottom());
                ImageView imageView2 = edVar.f54111j;
                imageView2.setPadding(imageView2.getPaddingLeft(), i5, imageView2.getPaddingRight(), imageView2.getPaddingBottom());
                WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(insets).setInsets(iSystemBars, w0.G(13, insets2)).build();
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
                return windowInsetsCompatBuild;
            case 2:
                rd rdVar = (rd) obj2;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "insets");
                int iSystemBars2 = WindowInsetsCompat.Type.systemBars();
                Insets insets3 = insets.getInsets(iSystemBars2);
                Intrinsics.checkNotNullExpressionValue(insets3, "getInsets(...)");
                u.z(rdVar.f54664h, 0, i2 + insets3.top, 0, 0, false, 29);
                rdVar.H();
                Insets insetsOf = Insets.of(insets.getSystemWindowInsetLeft(), 0, insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
                Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
                WindowInsetsCompat windowInsetsCompatBuild2 = new WindowInsetsCompat.Builder(insets).setSystemWindowInsets(insetsOf).setInsets(iSystemBars2, Insets.of(insets3.left, 0, insets3.right, insets3.bottom)).build();
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild2, "build(...)");
                return windowInsetsCompatBuild2;
            case 3:
                z60 z60Var = (z60) obj2;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "insets");
                u.z(z60Var.f167401g, 0, i2 + insets.getInsets(WindowInsetsCompat.Type.systemBars()).top, 0, 0, false, 29);
                z60Var.F();
                return insets.consumeSystemWindowInsets();
            case 4:
                f fVar = (f) obj2;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(insets, "insets");
                int iSystemBars3 = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
                Insets insets4 = insets.getInsets(iSystemBars3);
                Intrinsics.checkNotNullExpressionValue(insets4, "getInsets(...)");
                int i6 = insets4.bottom;
                nyl.b bVar = fVar.d;
                int paddingStart = bVar.getPaddingStart();
                nyl.b bVar2 = fVar.d;
                bVar.setPaddingRelative(paddingStart, bVar2.getPaddingTop(), bVar2.getPaddingEnd(), i6);
                TextView textView = fVar.e;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i2 + i6;
                textView.setLayoutParams(marginLayoutParams);
                Insets insetsOf2 = Insets.of(insets4.left, insets4.top, insets4.right, 0);
                Intrinsics.checkNotNullExpressionValue(insetsOf2, "of(...)");
                WindowInsetsCompat windowInsetsCompatBuild3 = new WindowInsetsCompat.Builder(insets).setInsets(iSystemBars3, insetsOf2).build();
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild3, "build(...)");
                return windowInsetsCompatBuild3;
            default:
                View view2 = (View) obj2;
                int i21 = CameraKitView.o;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "insets");
                int iSystemBars4 = WindowInsetsCompat.Type.systemBars();
                Insets insets5 = insets.getInsets(iSystemBars4);
                Intrinsics.checkNotNullExpressionValue(insets5, "getInsets(...)");
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = i2 + insets5.bottom;
                view2.setLayoutParams(marginLayoutParams2);
                return new WindowInsetsCompat.Builder(insets).setInsets(iSystemBars4, insets5).build();
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return ((SideSheetBehavior) this.f49138c).lambda$createAccessibilityViewCommandForState$2(this.f49137b, view, null);
    }
}
