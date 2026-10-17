package eq8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ip0.gu;
import ip0.j10;
import ip0.k10;
import ip0.nb0;
import ip0.pb0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f128392b;

    public k0(m0 taskItemsMapper) {
        Intrinsics.checkNotNullParameter(taskItemsMapper, "taskItemsMapper");
        gu guVar = new gu("LIST_ID_TASKS_LOADING", 0, 0, 30);
        nb0 nb0Var = pb0.Companion;
        this.f128391a = zhm.v.k(guVar, nb0.b(nb0Var, "LIST_ID_TASKS_LOADING_0", false, 0, false, 30), nb0.b(nb0Var, "LIST_ID_TASKS_LOADING_1", false, 0, false, 30), nb0.b(nb0Var, "LIST_ID_TASKS_LOADING_2", false, 0, false, 30));
        CdnImage image = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30);
        TextLocalisedClause title = new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14);
        TextLocalisedClause subtitle = new TextLocalisedClause(R.string.common_action_try_again, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_retry, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        Intrinsics.checkNotNullParameter("LIST_ID_ERROR_TASKS", "listId");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        List listC = zhm.u.c(new k10("LIST_ID_ERROR_TASKS", image, new j10(title, subtitle, resourceImage)));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        this.f128392b = listC;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new d0((List) iii.c.f(domainState.f128394b, new g0(this, 0), new h0(this, 0), new dn8.k(domainState, this, 20)), zhm.u.c(new IconNavBarMenuItem("MENU_ITEM_ID_ADD_TASK", new ResourceImage(R$drawable.uikit_icn_24_plus_circle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R.string.common_action_add, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)));
    }
}
