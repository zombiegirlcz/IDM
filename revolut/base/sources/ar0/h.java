package ar0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends koi.b implements es0.a {
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f8493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f8494h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f8495j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f8496l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View itemView, boolean z) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = z;
        View viewFindViewById = itemView.findViewById(R$id.internalTabDelegate_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f8493g = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.internalTabDelegate_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f8494h = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.internalTabDelegate_endImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.internalTabDelegate_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f8495j = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.internalTabDelegate_deleteIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.internalTabDelegate_deleteClickArea);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f8496l = viewFindViewById6;
    }

    public final void F(Function0 onCleared) {
        Intrinsics.checkNotNullParameter(onCleared, "onCleared");
        this.f8493g.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).withEndAction(new a3l.c(1, onCleared));
    }
}
