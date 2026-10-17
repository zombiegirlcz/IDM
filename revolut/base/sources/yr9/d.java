package yr9;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts_chooser.api.context.ContextAction;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.impl.members_picker.GroupChatQrAction;
import go.g;
import ip0.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mq9.f;
import mx0.l;
import nd.o;
import yg6.v;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends bn3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final os9.c f316161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f316162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c70.a f316163n;
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f316164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f316165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f01.c f316166r;

    public d(os9.c groupChatMembersInteractor, String groupId, c70.a clipboard, o chooserCommandFactory, f groupsInteractor, wj0.a idempotencyKeyHolder, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(groupChatMembersInteractor, "groupChatMembersInteractor");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(chooserCommandFactory, "chooserCommandFactory");
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f316161l = groupChatMembersInteractor;
        this.f316162m = groupId;
        this.f316163n = clipboard;
        this.o = chooserCommandFactory;
        this.f316164p = groupsInteractor;
        this.f316165q = idempotencyKeyHolder;
        this.f316166r = uiKitResources;
    }

    @Override // yji.n
    public final void D2() {
        this.f316165q.a("payments_group_invite_link_creation");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bn3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.util.List r8, nb6.p r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr9.d.Z2(java.util.List, nb6.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // bn3.a
    public final void b3(ContextAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        T2(new v(this, (GroupChatQrAction) action, null, 20), new yi5.b(27));
    }

    @Override // bn3.a
    public final Flow c3() {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("GROUP_QR_WIDGET_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.group_invite_action_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        l lVar = l.DYNAMIC_CIRCLE_ACTIONS;
        mx0.d dVar = mx0.d.CONTEXTUAL;
        z zVar = new z("GROUP_QR_WIDGET_LIST_ID", zhm.v.k(new ActionsView.Item("GROUP_QR_WIDGET_QR_BUTTON_LIST_ID", dVar, false, null, null, new TextLocalisedClause(R$string.group_invite_action_show_qr, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_scan_qr, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, GroupChatQrAction.SHOW_QR, null, 24476), new ActionsView.Item("GROUP_QR_WIDGET_COPY_LINK_BUTTON_LIST_ID", dVar, false, null, null, new TextLocalisedClause(R$string.group_invite_action_copy_link, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_link, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, GroupChatQrAction.COPY, null, 24476), new ActionsView.Item("GROUP_QR_WIDGET_SHARE_BUTTON_LIST_ID", dVar, false, null, null, new TextLocalisedClause(R$string.group_invite_action_share, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share_android, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, GroupChatQrAction.SHARE, null, 24476)), null, lVar, 0, 0, 116);
        yp0.b.l(zVar, 0, 0, 0, 0, null, false, 63);
        return new g(zhm.v.k(model, zVar), 2);
    }
}
