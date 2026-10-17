package com.revolut.ui_kit.payments.transition;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import au0.b5;
import au0.l5;
import byl.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import dyl.b;
import dyl.f;
import dyl.k;
import dyl.m;
import dyl.n;
import dyl.p;
import gw0.t;
import h01.c;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.Sequence;
import nkm.g;
import nkm.y;
import rim.d;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToChatTransitionFlowContainerLayout f107133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f107134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f107135c;
    public final /* synthetic */ Ref$BooleanRef d;
    public final /* synthetic */ ViewGroup e;
    public final /* synthetic */ f f;

    public a(TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout, RecyclerView recyclerView, String str, Ref$BooleanRef ref$BooleanRef, ViewGroup viewGroup, f fVar) {
        this.f107133a = transferToChatTransitionFlowContainerLayout;
        this.f107134b = recyclerView;
        this.f107135c = str;
        this.d = ref$BooleanRef;
        this.e = viewGroup;
        this.f = fVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        final BackgroundWallpaperView backgroundWallpaperView;
        int i33;
        Bitmap bitmapDrawToBitmap$default;
        RecyclerView recyclerView;
        final Bitmap bitmap;
        final float f;
        float baseline;
        List listC;
        Sequence<View> children;
        Object next;
        RecyclerView recyclerView2 = this.f107134b;
        final TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout = this.f107133a;
        try {
            Pair pairA = TransferToChatTransitionFlowContainerLayout.a(transferToChatTransitionFlowContainerLayout, recyclerView2, this.f107135c);
            final t tVar = (t) pairA.f186385a;
            View view2 = (View) pairA.f186386b;
            this.d.f186407a = true;
            recyclerView2.removeOnLayoutChangeListener(this);
            final ViewGroup transferScreen = this.e;
            View view3 = (View) y.q(ViewGroupKt.getChildren(transferScreen));
            ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
            if (viewGroup == null || (children = ViewGroupKt.getChildren(viewGroup)) == null) {
                backgroundWallpaperView = null;
            } else {
                g gVar = new g(y.n(children, p.f121173a));
                while (true) {
                    if (!gVar.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = gVar.next();
                        if (((BackgroundWallpaperView) next).getVisibility() == 0) {
                            break;
                        }
                    }
                }
                backgroundWallpaperView = (BackgroundWallpaperView) next;
            }
            TextView textView = (TextView) view2.findViewById(R$id.chatPaymentBubble_title);
            if (textView != null) {
                h01.g gVar2 = transferToChatTransitionFlowContainerLayout.sensitiveDataManager;
                if ((gVar2 != null ? gVar2.a() : null) == c.HIDDEN) {
                    bitmapDrawToBitmap$default = ViewKt.drawToBitmap$default(textView, null, 1, null);
                    i33 = 1;
                } else {
                    String string = textView.getText().toString();
                    TextPaint paint = textView.getPaint();
                    paint.setColor(textView.getCurrentTextColor());
                    Rect rect = new Rect();
                    float fMeasureText = paint.measureText(string);
                    paint.getTextBounds(string, 0, string.length(), rect);
                    i33 = 1;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(d.c(fMeasureText), rect.height(), Bitmap.Config.ARGB_8888);
                    ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap).drawText(string, BitmapDescriptorFactory.HUE_RED, -rect.top, paint);
                    bitmapDrawToBitmap$default = bitmapCreateBitmap;
                }
            } else {
                i33 = 1;
                bitmapDrawToBitmap$default = null;
            }
            f fVar = this.f;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(transferScreen, "transferScreen");
            b bVarA = fVar.d.a(transferScreen);
            k kVar = (textView == null || bitmapDrawToBitmap$default == null || bVarA == null) ? null : new k(textView, bitmapDrawToBitmap$default, bVarA.f121138a, bVarA.f121139b);
            if (kVar == null) {
                TransferToChatTransitionFlowContainerLayout.b(transferToChatTransitionFlowContainerLayout, transferScreen);
                return;
            }
            Bitmap bitmap2 = kVar.f121161c;
            View view4 = kVar.d;
            TextView textView2 = kVar.f121159a;
            final Bitmap bitmap3 = kVar.f121160b;
            view4.getLocationOnScreen(new int[2]);
            float width = ((view4.getWidth() / 2.0f) + r11[0]) - (bitmap2.getWidth() / 2.0f);
            final float height = ((view4.getHeight() / 2.0f) + r11[i33]) - (bitmap2.getHeight() / 2.0f);
            int[] iArr = new int[2];
            textView2.getLocationOnScreen(iArr);
            final float f4 = iArr[0];
            h01.g gVar3 = transferToChatTransitionFlowContainerLayout.sensitiveDataManager;
            if ((gVar3 != null ? gVar3.a() : null) == c.HIDDEN) {
                baseline = iArr[i33];
                recyclerView = recyclerView2;
                bitmap = bitmap2;
                f = width;
            } else {
                String string2 = textView2.getText().toString();
                recyclerView = recyclerView2;
                bitmap = bitmap2;
                f = width;
                textView2.getPaint().getTextBounds(string2, 0, string2.length(), new Rect());
                baseline = textView2.getBaseline() + r15.top + iArr[i33];
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.setDuration(400L);
            int i43 = i33;
            valueAnimatorOfFloat.addListener(new cx0.b(view4, i43));
            final float f5 = baseline;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dyl.h
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i59 = TransferToChatTransitionFlowContainerLayout.f107124p;
                    float fFloatValue = ((Float) z9h.n.g(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                    TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout2 = transferToChatTransitionFlowContainerLayout;
                    transferToChatTransitionFlowContainerLayout2.getClass();
                    Bitmap bitmap4 = bitmap;
                    float f6 = 1 - fFloatValue;
                    Bitmap bitmap5 = bitmap3;
                    int width2 = (int) ((bitmap5.getWidth() * fFloatValue) + (bitmap4.getWidth() * f6));
                    int height2 = (int) ((bitmap5.getHeight() * fFloatValue) + (bitmap4.getHeight() * f6));
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap4, width2, height2, true);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                    Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap5, width2, height2, true);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap2, "createScaledBitmap(...)");
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                    Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap2, "createBitmap(...)", bitmapCreateBitmap2);
                    Paint paint2 = new Paint(1);
                    float f32 = 255;
                    paint2.setAlpha((int) (f6 * f32));
                    canvasE.drawBitmap(bitmapCreateScaledBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint2);
                    paint2.setAlpha((int) (f32 * fFloatValue));
                    canvasE.drawBitmap(bitmapCreateScaledBitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint2);
                    transferToChatTransitionFlowContainerLayout2.i = bitmapCreateBitmap2;
                    float f35 = f4;
                    float f36 = f;
                    float fA = j6.a.a(f35, f36, fFloatValue, f36);
                    float f37 = f5;
                    float f41 = height;
                    int i66 = (int) fA;
                    int iA = (int) j6.a.a(f37, f41, fFloatValue, f41);
                    transferToChatTransitionFlowContainerLayout2.f107128j.set(i66, iA, bitmapCreateBitmap2.getWidth() + i66, bitmapCreateBitmap2.getHeight() + iA);
                    transferToChatTransitionFlowContainerLayout2.invalidate();
                }
            });
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
            int[] iArr2 = new int[2];
            view2.getLocationOnScreen(iArr2);
            int i59 = iArr2[0];
            int i66 = iArr2[i43];
            final float width2 = (view2.getWidth() - transferToChatTransitionFlowContainerLayout.e) / transferScreen.getWidth();
            final float height2 = view2.getHeight() / transferScreen.getHeight();
            float f6 = 1;
            transferScreen.setPivotX(i59 / (f6 - width2));
            transferScreen.setPivotY(i66 / (f6 - height2));
            View view5 = (View) y.q(ViewGroupKt.getChildren(transferScreen));
            if (backgroundWallpaperView != null) {
                Intrinsics.i(view5, "null cannot be cast to non-null type android.view.ViewGroup");
                listC = y.J(y.n(ViewGroupKt.getChildren((ViewGroup) view5), new dwi.f(28)));
            } else {
                listC = u.c(view5);
            }
            List list = listC;
            final float[] fArr = new float[8];
            final GradientDrawable gradientDrawable = new GradientDrawable();
            transferScreen.setBackground(gradientDrawable);
            transferScreen.setClipToOutline(true);
            transferScreen.setOutlineProvider(new n(new Path(), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, transferScreen.getWidth(), transferScreen.getHeight()), fArr));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat2.setDuration(400L);
            Context context = transferScreen.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            final int iS = kli.a.s(R$attr.uikit_colorPopoverBackground, context);
            final int iD = TransferToChatTransitionFlowContainerLayout.d(view2);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dyl.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i74 = TransferToChatTransitionFlowContainerLayout.f107124p;
                    float fFloatValue = ((Float) z9h.n.g(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                    float f32 = 1;
                    float f35 = 1.0f - ((f32 - width2) * fFloatValue);
                    float f36 = 1.0f - ((f32 - height2) * fFloatValue);
                    ViewGroup viewGroup2 = transferScreen;
                    viewGroup2.setScaleX(f35);
                    viewGroup2.setScaleY(f36);
                    transferToChatTransitionFlowContainerLayout.c(fFloatValue, f35, f36, tVar, fArr);
                    viewGroup2.invalidateOutline();
                    if (backgroundWallpaperView == null) {
                        gradientDrawable.setColor(ColorUtils.blendARGB(iS, iD, fFloatValue));
                    }
                }
            });
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat3.setDuration(100L);
            valueAnimatorOfFloat3.addUpdateListener(new b5(list, 11));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat2);
            animatorSet.addListener(new cx0.b(view2, 2));
            int iD2 = TransferToChatTransitionFlowContainerLayout.d(view2);
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat4.setDuration(200L);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            RecyclerView recyclerView3 = recyclerView;
            valueAnimatorOfFloat4.addListener(new m(view2, ref$ObjectRef, transferToChatTransitionFlowContainerLayout, recyclerView3, tVar, backgroundWallpaperView, transferScreen));
            valueAnimatorOfFloat4.addUpdateListener(new com.google.android.material.sidesheet.d(view2, iD2, ref$ObjectRef, recyclerView3));
            valueAnimatorOfFloat4.addListener(new i(recyclerView3, 2, ref$ObjectRef, transferToChatTransitionFlowContainerLayout));
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat4, "apply(...)");
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(valueAnimatorOfFloat, animatorSet);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(animatorSet2, valueAnimatorOfFloat4);
            animatorSet3.addListener(new l5(transferToChatTransitionFlowContainerLayout, 4));
            animatorSet3.start();
        } catch (TransferToChatTransitionFlowContainerLayout.a unused) {
        }
    }
}
