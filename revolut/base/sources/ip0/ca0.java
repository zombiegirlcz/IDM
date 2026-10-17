package ip0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ca0 extends koi.b implements xv0.m {
    public final /* synthetic */ AvatarView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AvatarView f163704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fp0.p f163705h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f163706j;
    public final TagView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewGroup f163707l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (AvatarView) itemView.findViewById(R$id.referralContact_avatar);
        View viewFindViewById = itemView.findViewById(R$id.referralContact_avatar);
        AvatarView avatarView = (AvatarView) viewFindViewById;
        avatarView.t0(null);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "apply(...)");
        this.f163704g = avatarView;
        fp0.m mVar = fp0.p.Companion;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gp0.h hVar = new gp0.h(new hp0.c(null, dr0.l.c(context, new Color.Solid(R$attr.uikit_colorForeground)), 1), new gp0.f(gp0.c.FOREGROUND, avatarView), new fp0.g(new Color.Solid(R$attr.uikit_colorForeground)));
        mVar.getClass();
        this.f163705h = fp0.m.a(itemView, hVar);
        View viewFindViewById2 = itemView.findViewById(R$id.referralContact_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.i = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.referralContact_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163706j = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.referralContact_badgeTag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.k = (TagView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.referralContact_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163707l = (ViewGroup) viewFindViewById5;
    }

    @Override // xv0.m
    public final void f(Image image, ImageView to6, Function1 function1, Function0 function0, boolean z) {
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f.f(image, to6, function1, null, z);
    }

    @Override // xv0.m
    public final xv0.i getItemRenderState() {
        return this.f.getItemRenderState();
    }

    @Override // xv0.m
    public final View getRenderView() {
        return this.f.getRenderView();
    }

    @Override // xv0.m
    public final void setItemRenderState(xv0.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f.setItemRenderState(iVar);
    }
}
