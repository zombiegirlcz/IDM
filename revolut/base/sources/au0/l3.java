package au0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import aw0.ha;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l3 extends koi.b implements v3, x2, o3, dr0.v {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f9263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f9264h;
    public final fp0.p i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.navBarMenuItemPlusAction_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f = textView;
        View viewFindViewById2 = itemView.findViewById(R$id.navBarMenuItemPlusAction_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f9263g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.navBarMenuItemPlusAction_loadingIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f9264h = (ImageView) viewFindViewById3;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        this.i = fp0.m.a(itemView, gVar);
        ((bp0.y) or0.u.k(itemView).b0()).w(textView, ha.IGNORE);
    }

    public final fp0.p F() {
        return this.i;
    }

    public final ImageView H() {
        return this.f9263g;
    }

    public final ImageView I() {
        return this.f9264h;
    }

    public final TextView J() {
        return this.f;
    }

    public final void K(int i) {
        koi.j jVar = this.e;
        PlusActionNavBarMenuItem plusActionNavBarMenuItem = jVar instanceof PlusActionNavBarMenuItem ? (PlusActionNavBarMenuItem) jVar : null;
        if (plusActionNavBarMenuItem != null) {
            boolean z = plusActionNavBarMenuItem.f59451c;
            boolean z3 = plusActionNavBarMenuItem.f;
            TextView textView = this.f;
            if (!z) {
                textView.setTextScaleX(1.0f);
                if (z3) {
                    CharSequence text = textView.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    textView.setVisibility(text.length() <= 0 ? 0 : 4);
                    return;
                } else {
                    CharSequence text2 = textView.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    textView.setVisibility(text2.length() > 0 ? 0 : 8);
                    return;
                }
            }
            if (i != 0) {
                if (z3) {
                    textView.setVisibility(4);
                } else {
                    textView.setVisibility(0);
                }
            }
            textView.setTextScaleX(i / 100);
            if (i == 0) {
                if (z3) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
        }
    }

    @Override // au0.o3
    public final void i(int i) {
        rd0.e.q(this.f9263g, Integer.valueOf(i));
        this.f.setTextColor(i);
    }

    @Override // au0.x2
    public final void o(int i, Integer num) {
        Drawable background = this.itemView.getBackground();
        RoundedBackgroundDrawable roundedBackgroundDrawable = background instanceof RoundedBackgroundDrawable ? (RoundedBackgroundDrawable) background : null;
        if (roundedBackgroundDrawable != null) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uj3.b.a(roundedBackgroundDrawable, context, i, num);
        }
    }

    @Override // dr0.v
    public final void q(boolean z) {
        Drawable background = this.itemView.getBackground();
        RoundedBackgroundDrawable roundedBackgroundDrawable = background instanceof RoundedBackgroundDrawable ? (RoundedBackgroundDrawable) background : null;
        if (roundedBackgroundDrawable != null) {
            roundedBackgroundDrawable.q(z);
        }
    }

    @Override // au0.x2
    public final void s(aw0.v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Drawable background = this.itemView.getBackground();
        RoundedBackgroundDrawable roundedBackgroundDrawable = background instanceof RoundedBackgroundDrawable ? (RoundedBackgroundDrawable) background : null;
        if (roundedBackgroundDrawable != null) {
            roundedBackgroundDrawable.a(colorScheme);
        }
    }
}
