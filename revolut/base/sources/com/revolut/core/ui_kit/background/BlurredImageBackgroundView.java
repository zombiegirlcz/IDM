package com.revolut.core.ui_kit.background;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import com.revolut.core.ui_kit.internal.drawables.CrossfadeDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import oqk.i;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import po0.m;
import po0.n;
import skm.a2;
import skm.c2;
import skm.e0;
import skm.p0;
import zkm.o;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0003\r\u0014\u0015B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/revolut/core/ui_kit/background/BlurredImageBackgroundView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "visibility", "", "setVisibility", "(I)V", "Lpo0/n;", "model", "setModel", "(Lpo0/n;)V", "anchor", "setAnchorY", "Companion", "po0/o", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlurredImageBackgroundView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zkm.d f51493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a2 f51494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qo0.c f51495c;
    public final m d;
    public final int e;
    public CrossfadeDrawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f51496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f51497h;
    public Integer i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurredImageBackgroundView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        c2 c2VarE = e0.e();
        p0 p0Var = p0.f264001a;
        this.f51493a = e0.c(e.d(c2VarE, o.f323119a.e));
        ro0.a blurEffectStyle = ro0.a.f255730a;
        Intrinsics.checkNotNullParameter(blurEffectStyle, "blurEffectStyle");
        this.f51495c = new qo0.c(context, new qo0.a());
        this.d = new m(PKIFailureInfo.badSenderNonce);
        this.e = kli.a.s(R$attr.uikit_colorBackground, context);
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(500L);
        this.f = crossfadeDrawable;
        setBackground(crossfadeDrawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.revolut.core.ui_kit.background.BlurredImageBackgroundView r17, po0.n r18, android.graphics.drawable.Drawable r19, gim.c r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof po0.q
            if (r3 == 0) goto L19
            r3 = r2
            po0.q r3 = (po0.q) r3
            int r4 = r3.f237860x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f237860x = r4
            goto L1e
        L19:
            po0.q r3 = new po0.q
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f237860x
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L39
            if (r5 != r6) goto L31
            po0.n r1 = r3.u
            yhm.o.b(r2)
            goto La5
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            yhm.o.b(r2)
            po0.o r2 = r1.f237857c
            if (r2 == 0) goto L66
            int[] r5 = po0.p.f237858a
            int r2 = r2.ordinal()
            r2 = r5[r2]
            if (r2 != r6) goto L60
            android.content.Context r2 = r0.getContext()
            java.lang.String r5 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            int r5 = com.revolut.core.ui_kit_resources.R$drawable.uikit_pic_602_card_freeze
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r2, r5)
            r10 = r2
            goto L67
        L60:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L66:
            r10 = r7
        L67:
            qo0.c r11 = r0.f51495c
            int r13 = r0.getWidth()
            int r14 = r0.getHeight()
            java.lang.Integer r15 = r0.i
            int r2 = r0.e
            java.lang.Integer r5 = r1.f237856b
            if (r5 == 0) goto L84
            int r5 = r5.intValue()
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            int r2 = androidx.core.graphics.ColorUtils.blendARGB(r2, r5, r8)
        L84:
            r12 = r2
            r3.u = r1
            r3.f237860x = r6
            r11.getClass()
            if (r13 <= 0) goto La1
            if (r14 > 0) goto L91
            goto La1
        L91:
            elm.g r2 = skm.p0.f264002b
            c2d.y r8 = new c2d.y
            r16 = 0
            r9 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = skm.e0.J(r2, r8, r3)
            goto La2
        La1:
            r2 = r7
        La2:
            if (r2 != r4) goto La5
            return r4
        La5:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 != 0) goto Laa
            return r7
        Laa:
            po0.m r3 = r0.d
            r3.d(r1, r2)
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.background.BlurredImageBackgroundView.a(com.revolut.core.ui_kit.background.BlurredImageBackgroundView, po0.n, android.graphics.drawable.Drawable, gim.c):java.lang.Object");
    }

    public final void b() {
        n nVar = this.f51496g;
        if (nVar == null) {
            return;
        }
        a2 a2Var = this.f51494b;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f51494b = null;
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        Bitmap bitmap = (Bitmap) this.d.c(nVar);
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), bitmap);
            this.f51497h = true;
            this.f.b(bitmapDrawable, true);
            return;
        }
        if (!this.f51497h) {
            Integer num = nVar.f237856b;
            int iBlendARGB = this.e;
            if (num != null) {
                iBlendARGB = ColorUtils.blendARGB(iBlendARGB, num.intValue(), 0.2f);
            }
            this.f.b(new ColorDrawable(iBlendARGB), true);
        }
        this.f51494b = e0.C(this.f51493a, null, null, new i(this, nVar, continuation, 28), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a2 a2Var = this.f51494b;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f51494b = null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        if (i == 0 || i2 == 0) {
            return;
        }
        this.d.i(-1);
        b();
    }

    public final void setAnchorY(int anchor) {
        Integer num = this.i;
        if (num != null && anchor == num.intValue()) {
            return;
        }
        this.i = Integer.valueOf(anchor);
        this.d.i(-1);
        b();
    }

    public final void setModel(@NotNull n model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.f51496g, model)) {
            return;
        }
        this.f51496g = model;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if (visibility != 0) {
            a2 a2Var = this.f51494b;
            if (a2Var != null) {
                a2Var.f(null);
            }
            this.f51494b = null;
            CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(500L);
            this.f = crossfadeDrawable;
            setBackground(crossfadeDrawable);
            this.f51497h = false;
            this.f51496g = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurredImageBackgroundView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
