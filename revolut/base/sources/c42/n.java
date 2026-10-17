package c42;

import b1c.p;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.q;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRecipientListInputData f20993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lx1.i f20994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dl3.f f20995c;

    public n(ApmRecipientListInputData inputData, lx1.i apmRecipientMapper, dl3.f contactsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f20993a = inputData;
        this.f20994b = apmRecipientMapper;
        this.f20995c = contactsMapper;
    }

    public static ActionWidgetDelegate.Model d(Clause clause) {
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("ID_PERMISSIONS_WIDGET", new TextLocalisedClause(R$string.apm_permission_contacts_widget_title, null, null, 14), new TextLocalisedClause(R$string.apm_permission_contacts_widget_description, u.c(clause), null, 12), new com.revolut.core.ui_kit.delegates.m(new GlyphImage(R$drawable.uikit_icn_24_phone_book, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), new ActionWidgetDelegate.Model.b.a(null), new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(R$string.apm_permission_contacts_widget_action, null, null, 14), null, 14), q.REGULAR, null, null, false, 8064);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final aim.e a(a aVar) {
        ApmRecipientListInputData apmRecipientListInputData = this.f20993a;
        RowDelegate.Model model = new RowDelegate.Model("ID_NEW_CONTACT_ACTION", new RowDelegate.Model.MainImage.Image40(apmRecipientListInputData.f, null, null, false, null, false, 60), apmRecipientListInputData.e, null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
        aim.e eVarB = u.b();
        eVarB.add(model);
        eVarB.addAll(aVar.e);
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    public final List b(String str) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_recipient_list_empty_state_search_widget_title, u.c(str), null, 12);
        ApmRecipientListInputData apmRecipientListInputData = this.f20993a;
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_EMPTY_STATE", textLocalisedClause, null, new ComplexImage.Regular(apmRecipientListInputData.f62264c), new l6(8, apmRecipientListInputData.f62266h, new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4.ACCENT), zj.REGULAR, false, null, null, null, 1860);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c((List) iii.c.f(domainState.f20976a, new j(1), new a8a.a(this, domainState, 10), new p(this, domainState, 26)), domainState.f20976a.getContent() != null);
    }
}
