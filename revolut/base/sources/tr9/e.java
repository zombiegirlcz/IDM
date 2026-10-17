package tr9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.messaging.common.api.R$string;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;
import oq9.l;
import oq9.m;
import oq9.n;
import oq9.o;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements nq9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f273768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl3.f f273769b;

    public e(f01.c uiKitResources, dl3.f contactMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(contactMapper, "contactMapper");
        this.f273768a = uiKitResources;
        this.f273769b = contactMapper;
    }

    public static RowDelegate.Model.MainImage.Image40 b(String str, String str2, CircleBadgeModel circleBadgeModel) {
        return new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, str, (String) null, (String) null, str2, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4059), circleBadgeModel, null, false, null, false, 60);
    }

    public static Clause d(o oVar, boolean z) {
        if ((oVar instanceof l) || (oVar instanceof m)) {
            return new TextClause(oi0.d.p(oVar), (Style) (z ? null : new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254)), (Integer) null, false, (o9) null, (List) null, 124);
        }
        if (oVar instanceof n) {
            return new CompositeClause(v.k(new TextLocalisedClause(R$string.payments_groups_members_unknown_member_name, null, null, 14), new DotDividerClause(Integer.valueOf(R$attr.uikit_colorGreyTone20)), new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_members_unknown_member_update_app, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254), 10)), null, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final RowDelegate.Model.MainImage.Avatar a(zm3.l lVar, CircleBadgeModel circleBadgeModel) {
        i1 i1Var = null;
        if (lVar != null) {
            return new RowDelegate.Model.MainImage.Avatar(dl3.f.b(this.f273769b, lVar, circleBadgeModel != null ? new dl3.b(new AvatarModel.BadgeModel(circleBadgeModel, com.revolut.core.ui_kit.models.avatar.b.BOTTOM)) : null, 4), i1Var, 6);
        }
        return null;
    }

    public final Clause c(o member, do3.n user) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(user, "user");
        return oi0.d.G(member, user) ? new TextLocalisedClause(R$string.payments_groups_common_you, null, null, 14) : d(member, true);
    }

    public final Image e(o member, do3.n user) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(user, "user");
        if (oi0.d.G(member, user)) {
            String strP = oi0.d.p(member);
            zj.SMALL.c();
            return new UserAvatarImage(new UserNamePlaceholder.Default(strP, 0), null, null, 6);
        }
        if (member instanceof l) {
            return new ContactImage((String) null, (String) null, pq9.a.a(((l) member).d), (String) null, (String) null, oi0.d.p(member), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4059);
        }
        if (member instanceof m) {
            return new ContactImage((String) null, (String) null, pq9.a.a(((m) member).d), (String) null, (String) null, oi0.d.p(member), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4059);
        }
        if (!(member instanceof n)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, this.f273768a.b(new TextLocalisedClause(R$string.payments_groups_members_unknown_member_name, null, null, 14)).toString(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model f(oq9.o r28, do3.n r29) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr9.e.f(oq9.o, do3.n):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (((oq9.m) r3).f227845h != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return com.revolut.core.ui_kit.models.badge.RetailBadge.f58066a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (((oq9.l) r3).f227840h != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.badge.RetailBadge g(oq9.o r3) {
        /*
            r2 = this;
            java.lang.String r0 = "member"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof oq9.l
            r1 = 0
            if (r0 == 0) goto L11
            oq9.l r3 = (oq9.l) r3
            boolean r3 = r3.f227840h
            if (r3 == 0) goto L1e
            goto L1b
        L11:
            boolean r0 = r3 instanceof oq9.m
            if (r0 == 0) goto L1f
            oq9.m r3 = (oq9.m) r3
            boolean r3 = r3.f227845h
            if (r3 == 0) goto L1e
        L1b:
            com.revolut.core.ui_kit.models.badge.RetailBadge r3 = com.revolut.core.ui_kit.models.badge.RetailBadge.f58066a
            return r3
        L1e:
            return r1
        L1f:
            boolean r3 = r3 instanceof oq9.n
            if (r3 == 0) goto L24
            return r1
        L24:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tr9.e.g(oq9.o):com.revolut.core.ui_kit.models.badge.RetailBadge");
    }

    public final RowDelegate.Model.MainImage h(o member, CircleBadgeModel circleBadgeModel) {
        Intrinsics.checkNotNullParameter(member, "member");
        if (member instanceof l) {
            RowDelegate.Model.MainImage.Avatar avatarA = a(((l) member).i, circleBadgeModel);
            return avatarA != null ? avatarA : b(oi0.d.k(member), oi0.d.p(member), circleBadgeModel);
        }
        if (member instanceof m) {
            RowDelegate.Model.MainImage.Avatar avatarA2 = a(((m) member).i, circleBadgeModel);
            return avatarA2 != null ? avatarA2 : b(oi0.d.k(member), oi0.d.p(member), circleBadgeModel);
        }
        if (member instanceof n) {
            return new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, this.f273768a.b(new TextLocalisedClause(R$string.payments_groups_members_unknown_member_name, null, null, 14)).toString(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), circleBadgeModel, null, false, null, false, 60);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final RowDelegate.Model.MainImage i(o member, do3.n user, CircleBadgeModel circleBadgeModel) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(user, "user");
        if (!oi0.d.G(member, user)) {
            return h(member, circleBadgeModel);
        }
        String strP = oi0.d.p(member);
        zj.SMALL.c();
        return new RowDelegate.Model.MainImage.Image40(new UserAvatarImage(new UserNamePlaceholder.Default(strP, 0), null, null, 6), null, null, false, null, false, 62);
    }

    public final Clause j(o member, do3.n user, boolean z) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(user, "user");
        if (oi0.d.G(member, user)) {
            return new TextLocalisedClause(R$string.payments_groups_common_you, null, z ? null : new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        return d(member, z);
    }

    public final Clause k(o member) {
        Intrinsics.checkNotNullParameter(member, "member");
        if (!(member instanceof l) && !(member instanceof m)) {
            if (member instanceof n) {
                return new TextLocalisedClause(R$string.payments_groups_members_unknown_member_name, null, null, 10);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new TextClause(oi0.d.r(member), (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
    }

    public final Clause l(o member, do3.n user) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(user, "user");
        return oi0.d.G(member, user) ? new TextLocalisedClause(R$string.payments_groups_common_you, null, null, 10) : k(member);
    }
}
