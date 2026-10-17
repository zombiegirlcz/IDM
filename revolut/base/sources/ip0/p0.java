package ip0;

import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 extends koi.b {
    public nx0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nx0.a f165746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nx0.a f165747h;
    public nx0.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f165748j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.amountDualEdit_directionArrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f165748j = (ImageView) viewFindViewById;
    }

    public static void F(nx0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.setSuggestionsSourceId("AmountEdit_" + aVar.F().getId());
    }
}
