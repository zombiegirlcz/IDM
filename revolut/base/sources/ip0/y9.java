package ip0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.FadeBottomImageView;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y9 extends koi.b {
    public final FadeBottomImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f167286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProgressBar f167287h;
    public final TagView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f167288j;
    public final fp0.p k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.challengeMediumImageCard_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (FadeBottomImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.challengeMediumImageCard_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167286g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.challengeMediumImageCard_progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ProgressBar progressBar = (ProgressBar) viewFindViewById3;
        this.f167287h = progressBar;
        View viewFindViewById4 = itemView.findViewById(R$id.challengeMediumImageCard_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TagView) viewFindViewById4;
        fp0.m mVar = fp0.p.Companion;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gp0.h hVar = new gp0.h(new hp0.c(null, dr0.l.h(context, qv0.h.LARGE.a(), new Color.Solid(R$attr.uikit_colorForeground), 0, null), 1), new gp0.f(gp0.c.FOREGROUND, 2), fp0.b.f137017a);
        mVar.getClass();
        this.k = fp0.m.a(itemView, hVar);
        Context context2 = progressBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        progressBar.setProgressTintList(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorAccentNeutral, context2)));
        itemView.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 10));
    }
}
