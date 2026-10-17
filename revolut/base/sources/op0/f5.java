package op0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f5 extends koi.b {
    public final Guideline f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Guideline f227258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SmallActionButton f227259h;
    public final RecyclerView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConstraintLayout f227260j;
    public final z4l.j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        List listA = com.revolut.core.ui_kit.delegates.widgets.a5.a();
        int size = listA.size();
        for (int i = 0; i < size; i++) {
            ((BaseDraggableWidgetDelegate) listA.get(i)).e = true;
        }
        z4l.j jVar = new z4l.j(7, listA, false);
        this.k = jVar;
        View viewFindViewById = view.findViewById(R$id.widgetCarouselPageDelegate_startGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (Guideline) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.widgetCarouselPageDelegate_endGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f227258g = (Guideline) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.widgetCarouselPageDelegate_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        SmallActionButton smallActionButton = (SmallActionButton) viewFindViewById3;
        this.f227259h = smallActionButton;
        View viewFindViewById4 = view.findViewById(R$id.widgetCarouselPageDelegate_recycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.i = recyclerView;
        View viewFindViewById5 = view.findViewById(R$id.widgetCarouselPageDelegate_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f227260j = (ConstraintLayout) viewFindViewById5;
        recyclerView.addOnItemTouchListener(new xv0.d());
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        smallActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        view.setTag(this);
        ok7.c block = new ok7.c(this, 26);
        Intrinsics.checkNotNullParameter(block, "block");
        recyclerView.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(block, 28));
    }
}
