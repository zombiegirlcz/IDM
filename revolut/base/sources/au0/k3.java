package au0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import aw0.ha;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k3 extends koi.b implements o3, x2, dr0.v {
    public final RoundedBackgroundDrawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f9249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f9250h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fp0.p f9251j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public tx0.u0 f9253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9254n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(View itemView, RoundedBackgroundDrawable backgroundDrawable) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(backgroundDrawable, "backgroundDrawable");
        this.f = backgroundDrawable;
        View viewFindViewById = itemView.findViewById(R$id.navBarMenuItemLabel_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f9249g = textView;
        View viewFindViewById2 = itemView.findViewById(R$id.navBarMenuItemLabel_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f9250h = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.navBarMenuItemLabel_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = viewFindViewById3;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        this.f9251j = fp0.m.a(itemView, gVar);
        this.f9252l = true;
        this.f9254n = backgroundDrawable.d;
        ((bp0.y) or0.u.k(itemView).b0()).w(textView, ha.IGNORE);
    }

    public final void F(float f) {
        this.f9249g.setAlpha(f);
        this.f9250h.setAlpha(f);
    }

    public final void H() {
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        tx0.u0 u0Var = this.f9253m;
        if (u0Var == null) {
            u0Var = tx0.u0.SECONDARY_ACCENT;
        }
        int iS = kli.a.s(u0Var.b(), context);
        if (this.f9252l) {
            this.f9250h.setColorFilter(iS);
        }
        this.f9249g.setTextColor(iS);
    }

    public final void I(tx0.u0 style) {
        int iS;
        Intrinsics.checkNotNullParameter(style, "style");
        if (this.f9253m == style) {
            return;
        }
        this.f9253m = style;
        int iS2 = S();
        if (this.f9252l) {
            this.f9250h.setColorFilter(iS2);
        }
        this.f9249g.setTextColor(iS2);
        tx0.u0 u0Var = this.f9253m;
        if (u0Var == null) {
            u0Var = tx0.u0.SECONDARY_ACCENT;
        }
        Integer numA = u0Var.a();
        if (numA != null) {
            int iIntValue = numA.intValue();
            Context context = this.i.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iS = kli.a.s(iIntValue, context);
        } else {
            iS = this.f9254n;
        }
        this.f.d(iS2, iS);
    }

    public final void J(tx0.v0 type) {
        boolean z;
        float f;
        float f4;
        Intrinsics.checkNotNullParameter(type, "type");
        boolean z3 = this.f9252l;
        int[] iArr = j3.f9241a;
        int i = iArr[type.ordinal()];
        if (i == 1) {
            z = true;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        this.f9252l = z;
        int i2 = iArr[type.ordinal()];
        if (i2 == 1) {
            f = 16.0f;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 24.0f;
        }
        int i3 = iArr[type.ordinal()];
        if (i3 == 1) {
            f4 = 8.0f;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f4 = 10.0f;
        }
        ImageView imageView = this.f9250h;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, f);
        or0.u.A(imageView, iK, iK);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        or0.u.z(imageView, kli.a.k(context2, f4), 0, 0, 0, false, 30);
        if (!this.f9252l) {
            imageView.clearColorFilter();
        } else {
            if (z3) {
                return;
            }
            imageView.setColorFilter(S());
        }
    }

    public final boolean K() {
        return this.k;
    }

    public final View M() {
        return this.i;
    }

    public final fp0.p N() {
        return this.f9251j;
    }

    public final ImageView O() {
        return this.f9250h;
    }

    public final TextView P() {
        return this.f9249g;
    }

    public final void R() {
        int iS = S();
        if (this.f9252l) {
            this.f9250h.setColorFilter(iS);
        }
        this.f9249g.setTextColor(iS);
    }

    public final int S() {
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        tx0.u0 u0Var = this.f9253m;
        if (u0Var == null) {
            u0Var = tx0.u0.SECONDARY_ACCENT;
        }
        return kli.a.s(u0Var.b(), context);
    }

    public final void U(boolean z) {
        this.k = z;
    }

    @Override // au0.o3
    public final void i(int i) {
        if (this.k) {
            if (this.f9252l) {
                this.f9250h.setColorFilter(i);
            }
            this.f9249g.setTextColor(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    @Override // au0.x2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r6, java.lang.Integer r7) {
        /*
            r5 = this;
            tx0.u0 r0 = r5.f9253m
            if (r0 != 0) goto L6
            tx0.u0 r0 = tx0.u0.SECONDARY_ACCENT
        L6:
            java.lang.Integer r0 = r0.a()
            r1 = 0
            java.lang.String r2 = "getContext(...)"
            android.view.View r3 = r5.i
            com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable r4 = r5.f
            if (r0 != 0) goto L24
            android.content.Context r0 = r3.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r2 = r5.k
            if (r2 == 0) goto L1f
            goto L20
        L1f:
            r7 = r1
        L20:
            uj3.b.a(r4, r0, r6, r7)
            return
        L24:
            if (r7 == 0) goto L33
            boolean r6 = r5.k
            if (r6 == 0) goto L2b
            goto L2c
        L2b:
            r7 = r1
        L2c:
            if (r7 == 0) goto L33
            int r6 = r7.intValue()
            goto L37
        L33:
            int r6 = r5.S()
        L37:
            android.content.Context r7 = r3.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            int r0 = r0.intValue()
            int r7 = kli.a.s(r0, r7)
            r4.d(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au0.k3.o(int, java.lang.Integer):void");
    }

    @Override // dr0.v
    public final void q(boolean z) {
        this.f.q(z);
    }

    @Override // au0.x2
    public final void s(aw0.v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f.a(colorScheme);
    }
}
