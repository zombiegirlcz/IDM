package do8;

import aw0.n6;
import cie.l1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final go8.c f116470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fo8.a f116471b;

    public v(go8.c remoteLoginListItemProvider, fo8.a devToolsAcceptInvitationExtension) {
        Intrinsics.checkNotNullParameter(remoteLoginListItemProvider, "remoteLoginListItemProvider");
        Intrinsics.checkNotNullParameter(devToolsAcceptInvitationExtension, "devToolsAcceptInvitationExtension");
        this.f116470a = remoteLoginListItemProvider;
        this.f116471b = devToolsAcceptInvitationExtension;
    }

    public static List a() {
        return zhm.u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_INFO", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new n((m) iii.c.f(domainState.f116451a, new dmj.a(this, 12), new dmb.m(this, 10), new l1(this, 29)), (List) iii.c.f(domainState.f116452b, new dmj.a(this, 10), new dmb.m(8), new dn8.k(this, domainState, 1)), (n6) iii.c.f(domainState.f116452b, new dmj.a(11), new dmb.m(9), new l1(28)));
    }
}
