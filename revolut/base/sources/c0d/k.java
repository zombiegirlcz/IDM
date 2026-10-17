package c0d;

import a08.p0;
import a08.q;
import akl.s;
import c03.u;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sow.impl.ui.help.SowHelpFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ip0.yt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ozc.t;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f20244j;
    public final ozc.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f20245l;

    public k(ozc.d presentationModel, ozc.f router, b mapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f20244j = presentationModel;
        this.k = router;
        this.f20245l = mapper;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        rri.a view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        ((f) this.f20245l).getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.sow_info_what_is_this_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.sow_info_what_is_this_subtitle, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        yt ytVar = yt.TOP;
        List listK = v.k(new ListCellDelegate.Model("WHAT_IS_THIS_ITEM_ID", new j8(resourceImage, ytVar), textLocalisedClause, textLocalisedClause2, false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("WHY_WE_ASKING_ITEM_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.sow_info_why_we_asking_title, null, null, 14), new TextLocalisedClause(R$string.sow_info_why_we_asking_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("WHAT_TO_DO_ITEM_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.sow_info_what_to_do_title, null, null, 14), new HtmlLocalisedClause(R$string.sow_info_what_to_do_subtitle, (List) null, (Integer) null, (Object) null, 30), false, null, null, 0, 0, 0, 0, 4064));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        ((BaseLayoutBuilderFragment) view).setItems(listK);
        efm.b bVarSwitchMapCompletable = ((t) this.f20244j).w3().switchMapCompletable(new u(5, new g(this, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        a0d.g gVar = new a0d.g(6, new b9i.h(new BreadcrumbException(), 29));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        q qVar = new q(15, h.f20240a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new p0(4, sVar), qVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        efm.b bVarSwitchMapCompletable2 = ((ListCellDelegate) ((SowHelpFragment) view).f0.getValue()).d.switchMapCompletable(new u(6, new g(this, 1)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        a0d.g gVar2 = new a0d.g(6, new j(new BreadcrumbException(), 0));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable2, gVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new p0(4, sVar), new q(15, i.f20241a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }
}
