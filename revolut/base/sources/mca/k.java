package mca;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.pix.api.R$string;
import fy1.q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.i f204338a;

    public k(lx1.i apmRecipientMapper) {
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        this.f204338a = apmRecipientMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        l lVar = domainState.f204330b;
        PixContact pixContact = domainState.f204329a;
        int i2 = j.f204337a[lVar.ordinal()];
        if (i2 == 1) {
            i = R$string.pix_contact_discovery_warnings_owner_change_title_changes_bank;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.pix_contact_discovery_warnings_owner_change_title_changes_person;
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R$string.pix_contact_discovery_warnings_owner_change_subtitle, null, null, 14), null, null, false, 28);
        m6 m6Var = n6.Companion;
        aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.pix_contact_discovery_warnings_owner_change_actions_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.pix_contact_discovery_warnings_owner_change_actions_change, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
        q qVar = (q) this.f204338a;
        List listC = u.c(new RowDelegate.Model("APM_RECIPIENT_ID", new RowDelegate.Model.MainImage.Image40(qVar.c(pixContact), new RawCutoutImageBadge(qVar.a(pixContact)), null, false, null, false, 60), new TextClause(pixContact.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, qVar.b(pixContact), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new cii.b(hVar, listC, aVar);
    }
}
