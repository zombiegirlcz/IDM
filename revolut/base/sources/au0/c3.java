package au0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c3 extends koi.b implements x2, dr0.v, o3 {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fp0.p f9158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.navBarMenuItemAction_icon);
        Intrinsics.i(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f = (ImageView) viewFindViewById;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        this.f9158g = fp0.m.a(itemView, gVar);
    }

    public final fp0.p F() {
        return this.f9158g;
    }

    public final ImageView H() {
        return this.f;
    }

    @Override // au0.o3
    public final void i(int i) {
        this.f.setColorFilter(i);
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
