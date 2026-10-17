package ip0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.Tabs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pj0 extends koi.b {
    public final Tabs f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f165836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final es0.j f165837h;
    public final es0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final es0.q f165838j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f165839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f165840m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.tabs);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (Tabs) viewFindViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) itemView;
        this.f165836g = constraintLayout;
        this.f165837h = new es0.j(constraintLayout);
        this.i = new es0.j(constraintLayout, es0.i.LEADING);
        this.f165838j = new es0.q(constraintLayout);
        this.f165839l = -1;
        this.f165840m = -1;
    }
}
