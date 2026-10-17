package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c6 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f163684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f163685h;
    public final LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rr0.g f163686j;
    public final fp0.p k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fp0.p f163687l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsActionList_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsActionList_endText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.f163684g = textView;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsActionList_endImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163685h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsActionList_actionsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.cellDetailsActionList_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163686j = vc.s.d(this, new nq0.e(itemView), null, 12);
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.b.f137017a);
        mVar.getClass();
        this.k = fp0.m.a((ConstraintLayout) viewFindViewById5, gVar);
        this.f163687l = fp0.m.a(textView, gp0.b.f145198a);
    }
}
