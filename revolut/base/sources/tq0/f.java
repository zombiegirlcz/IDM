package tq0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends koi.b {
    public final AppCompatTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f273455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f273456h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f273457j;
    public final View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.gridCell_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.gridCell_bottomDotView1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f273455g = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.gridCell_bottomDotView2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f273456h = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.gridCell_bottomDotView3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.gridCell_bottomDotView4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f273457j = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.gridCell_bottomDotView4Actual);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = viewFindViewById6;
    }
}
