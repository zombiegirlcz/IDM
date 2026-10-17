package xl3;

import aw0.o9;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d3;
import com.revolut.core.ui_kit.delegates.widgets.e3;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.BusinessBadge;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import hha.w0;
import hx7.q;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import mx0.i1;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yik.g;
import zm3.i;
import zm3.l;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements dl3.f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f306932b = j.b(new a(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f306933c = j.b(new a(1));
    public static final AvatarModel.BadgeModel d;
    public static final AvatarModel.BadgeModel e;
    public static final Lazy f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f306934a;

    static {
        com.revolut.core.ui_kit.models.avatar.b bVar = com.revolut.core.ui_kit.models.avatar.b.BOTTOM;
        d = new AvatarModel.BadgeModel(RetailBadge.f58066a, bVar);
        e = new AvatarModel.BadgeModel(BusinessBadge.f58051a, bVar);
        f = j.b(new a(2));
    }

    public d(g pricingPlanAvatarMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanAvatarMapper, "pricingPlanAvatarMapper");
        this.f306934a = pricingPlanAvatarMapper;
    }

    public static d3 c() {
        return new d3(new e3(R$drawable.uikit_icn_24_arrow_up), new e3(R$drawable.uikit_icn_24_arrow_down), new e3(R$drawable.uikit_icn_24_arrow_split));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.avatar.AvatarModel.Default d(zm3.a r18, dl3.e r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "contact"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            hha.w0 r3 = mif.e0.n(r1)
            yik.g r4 = r0.f306934a
            r5 = 0
            if (r3 == 0) goto L1b
            com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style r6 = r4.d(r3)
        L18:
            r7 = r20
            goto L1d
        L1b:
            r6 = r5
            goto L18
        L1d:
            com.revolut.core.ui_kit_core.displayers.image.models.ContactImage r8 = n14.e.k(r1, r6, r7)
            if (r3 == 0) goto L29
            com.revolut.core.ui_kit.models.avatar.AvatarModel$Border$StaticGradient r1 = r4.c(r3)
            r10 = r1
            goto L2a
        L29:
            r10 = r5
        L2a:
            boolean r1 = r2 instanceof dl3.d
            if (r1 == 0) goto L38
            if (r3 == 0) goto L36
            com.revolut.core.ui_kit.internal.views.tag.TagViewData r3 = r4.e(r3)
            r9 = r3
            goto L49
        L36:
            r9 = r5
            goto L49
        L38:
            boolean r3 = r2 instanceof dl3.b
            if (r3 != 0) goto L36
            boolean r3 = r2 instanceof dl3.c
            if (r3 != 0) goto L36
            if (r2 != 0) goto L43
            goto L36
        L43:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L49:
            boolean r3 = r2 instanceof dl3.b
            if (r3 == 0) goto L56
            r1 = r2
            dl3.b r1 = (dl3.b) r1
            com.revolut.core.ui_kit.models.avatar.AvatarModel$BadgeModel r5 = r1.a()
        L54:
            r12 = r5
            goto L71
        L56:
            boolean r3 = r2 instanceof dl3.c
            if (r3 == 0) goto L66
            r1 = r2
            dl3.c r1 = (dl3.c) r1
            zm3.a r1 = r1.a()
            com.revolut.core.ui_kit.models.avatar.AvatarModel$BadgeModel r5 = r0.e(r1)
            goto L54
        L66:
            if (r1 != 0) goto L54
            if (r2 != 0) goto L6b
            goto L54
        L6b:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L71:
            com.revolut.core.ui_kit.models.avatar.AvatarModel$Default r7 = new com.revolut.core.ui_kit.models.avatar.AvatarModel$Default
            r15 = 0
            r16 = 980(0x3d4, float:1.373E-42)
            r11 = 0
            r13 = 0
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xl3.d.d(zm3.a, dl3.e, boolean):com.revolut.core.ui_kit.models.avatar.AvatarModel$Default");
    }

    public final AvatarModel.BadgeModel e(zm3.a aVar) {
        AvatarModel.BadgeModel badgeModelB = null;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            boolean zK = q.K(lVar);
            AvatarModel.BadgeModel badgeModel = d;
            if (zK) {
                badgeModelB = e;
            } else if (((Boolean) jo0.g.n().getValue()).booleanValue() && q.N(lVar)) {
                badgeModelB = badgeModel;
            } else if (((Boolean) jo0.g.n().getValue()).booleanValue() && e0.n(aVar) != null) {
                badgeModelB = this.f306934a.b(e0.n(aVar));
            }
            if (badgeModelB == null) {
                return badgeModel;
            }
        }
        return badgeModelB;
    }

    public final Image f(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Image imageA = null;
        if (contact instanceof l) {
            l lVar = (l) contact;
            boolean zK = q.K(lVar);
            Lazy lazy = f306932b;
            if (zK) {
                Companion.getClass();
                imageA = (Image) f306933c.getValue();
            } else if (((Boolean) jo0.g.n().getValue()).booleanValue() && q.N(lVar)) {
                Companion.getClass();
                imageA = (Image) lazy.getValue();
            } else if (((Boolean) jo0.g.n().getValue()).booleanValue() && e0.n(contact) != null) {
                imageA = this.f306934a.a(e0.n(contact));
            }
            if (imageA == null) {
                Companion.getClass();
                return (Image) lazy.getValue();
            }
        }
        return imageA;
    }

    public final AvatarModel.Border.StaticGradient g(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        w0 w0VarN = e0.n(contact);
        if (w0VarN != null) {
            return this.f306934a.c(w0VarN);
        }
        return null;
    }

    public final ContactImage h(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        w0 w0VarN = e0.n(contact);
        return n14.e.l(contact, w0VarN != null ? this.f306934a.d(w0VarN) : null, 2);
    }

    public final RowDelegate.Model.MainImage.Avatar i(zm3.a aVar, i1 i1Var) {
        AvatarModel.BadgeModel badgeModelE = e(aVar);
        return new RowDelegate.Model.MainImage.Avatar(dl3.f.b(this, aVar, badgeModelE != null ? new dl3.b(badgeModelE) : null, 4), i1Var, 4);
    }

    public final RewardDelegate.Model j(zm3.a contact, boolean z) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        AvatarModel.BadgeModel badgeModel = z ? new AvatarModel.BadgeModel(new AccentCircleBadge(dw0.a.Checked), com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : e(contact);
        return new RewardDelegate.Model(q.E(contact), dl3.f.b(this, contact, badgeModel != null ? new dl3.b(badgeModel) : null, 4), new TextClause(q.H(contact), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), contact);
    }

    public final ReferralContactDelegate.Model k(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        String strE = q.E(contact);
        AvatarModel.BadgeModel badgeModelE = e(contact);
        return new ReferralContactDelegate.Model(strE, dl3.f.b(this, contact, badgeModelE != null ? new dl3.b(badgeModelE) : null, 4), new TextClause(q.H(contact), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, contact, null, 6136);
    }

    public final RowDelegate.Model l(zm3.a contact, boolean z) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return new RowDelegate.Model(q.E(contact), i(contact, i1.SIZE_56_56), new TextClause(q.v(contact), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 1, z ? dl3.f.a(this, contact) : null, null, null, 1, null, false, null, false, null, null, null, null, null, null, contact, null, 0, 0, 0, 0, 532610760);
    }

    public final RowDelegate.Model m(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return new RowDelegate.Model(q.E(contact), i(contact, i1.SIZE_40_40), new TextClause(q.v(contact), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, dl3.f.a(this, contact), null, null, 0, null, false, null, false, null, null, null, null, null, null, contact, null, 0, 0, 0, 0, 532611032);
    }

    public final QuickActionWidgetDelegate.Model n(String listId, zm3.a contact, int i, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(contact, "contact");
        ContactImage contactImageH = h(contact);
        TextClause textClause = new TextClause(q.H(contact), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Companion.getClass();
        Image image = (Image) f306932b.getValue();
        if (!(contact instanceof l)) {
            image = null;
        }
        BulletImage bulletImageA = i != 0 ? com.revolut.core.ui_kit_core.displayers.image.models.a.a(i, Integer.valueOf(R$attr.uikit_colorOnAccent), Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent), 2.0f) : null;
        d3 d3VarC = contact instanceof i ? c() : (((contact instanceof zm3.j) && z) || (contact instanceof zm3.g)) ? c() : new d3(new e3(R$drawable.uikit_icn_24_arrow_up), (e3) null, 6);
        return new QuickActionWidgetDelegate.Model(listId, contactImageH, image, bulletImageA, textClause, d3VarC, null, null, CaptureActivity.RESULT_EXIT_USER_FLOW);
    }
}
