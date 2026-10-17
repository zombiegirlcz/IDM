package ip0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.delegates.SelectableIconDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r5 extends koi.b {
    public final RecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f166117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f166118h;
    public final AppCompatImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f166119j;
    public final z4l.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f166120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f166121m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(View view, SelectableIconDelegate iconDelegate) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(iconDelegate, "iconDelegate");
        View viewFindViewById = view.findViewById(R$id.internalCardPersonalisationToolbar_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f = recyclerView;
        View viewFindViewById2 = view.findViewById(R$id.internalCardPersonalisationToolbar_leftActionBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166117g = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.internalCardPersonalisationToolbar_leftActionImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166118h = (AppCompatImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.internalCardPersonalisationToolbar_rightActionImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.internalCardPersonalisationToolbar_rightActionBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166119j = viewFindViewById5;
        koi.c cVar = new koi.c(0);
        cVar.a(iconDelegate);
        z4l.j jVar = new z4l.j(cVar, false, 14);
        this.k = jVar;
        this.f166120l = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 16.0f);
        this.f166121m = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 16.0f);
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new tw0.c(12.0f));
        this.itemView.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 9));
    }
}
