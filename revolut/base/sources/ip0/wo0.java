package ip0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wo0 extends wn {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f167053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f167054h;
    public final RoundedBackgroundDrawable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.wallpaperPreview_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.wallpaperPreview_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167053g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.wallpaperPreview_edit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f167054h = imageView;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, 0, 6);
        this.i = roundedBackgroundDrawable;
        imageView.setBackground(roundedBackgroundDrawable);
    }

    @Override // ip0.wn
    public final void F(aw0.x8 picturePalette) {
        Intrinsics.checkNotNullParameter(picturePalette, "picturePalette");
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(picturePalette.f10609a.a(), context);
        this.f167053g.setTextColor(iS);
        rd0.e.q(this.f167054h, Integer.valueOf(iS));
        this.i.e(picturePalette.f10610b);
    }
}
