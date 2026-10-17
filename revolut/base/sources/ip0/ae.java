package ip0;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ae extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f163423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fp0.p f163424h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TagView f163425j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(View itemView) {
        super(itemView);
        View viewFindViewById = itemView.findViewById(R$id.detailGridItemDelegate_logo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView logo = (ImageView) viewFindViewById;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f = new xv0.n(new ie7.a(logo, 5));
        this.f163423g = logo;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.b.f137017a);
        mVar.getClass();
        this.f163424h = fp0.m.a(itemView, gVar);
        View viewFindViewById2 = itemView.findViewById(R$id.detailGridItemDelegate_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.detailGridItemDelegate_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163425j = (TagView) viewFindViewById3;
    }

    @Override // xv0.m
    public final void f(Image image, ImageView to6, Function1 function1, Function0 function0, boolean z) {
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f.f(image, to6, function1, null, z);
    }

    @Override // xv0.m
    public final xv0.i getItemRenderState() {
        return this.f.f309159b;
    }

    @Override // xv0.m
    public final View getRenderView() {
        return this.f.getRenderView();
    }

    @Override // xv0.m
    public final void setItemRenderState(xv0.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        xv0.n nVar = this.f;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        nVar.f309159b = iVar;
    }
}
