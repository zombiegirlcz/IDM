package mae;

import android.webkit.URLUtil;
import c55.l0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import le.u1;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import tof.i3;
import tof.k3;
import tof.l2;
import tof.l3;
import zh9.j0;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f204008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vi9.b f204009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m35.q f204010c;
    public final m3j.j d;
    public final thf.c e;
    public final a9e.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vb8.b f204011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dl3.f f204012h;
    public final k i;

    public m(h subscriptionsAppMapper, vi9.b payLaterMerchantIconMapper, m35.q loanTransactionCategoryIconMapper, m3j.j beneficiaryAvatarMapper, thf.c transactionCategoryResourcesMapper, c6c.a deferredPaymentMerchantIconMapper, a9e.c recurringPaymentIconMapper, c pricingPlanSubscriptionIconMapper, vb8.b juniorAllowanceRecurringPaymentUiMapper, dl3.f contactMapper, k subscriptionsBadgeMapper, a cobrandSubscriptionIconMapper) {
        Intrinsics.checkNotNullParameter(subscriptionsAppMapper, "subscriptionsAppMapper");
        Intrinsics.checkNotNullParameter(payLaterMerchantIconMapper, "payLaterMerchantIconMapper");
        Intrinsics.checkNotNullParameter(loanTransactionCategoryIconMapper, "loanTransactionCategoryIconMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(deferredPaymentMerchantIconMapper, "deferredPaymentMerchantIconMapper");
        Intrinsics.checkNotNullParameter(recurringPaymentIconMapper, "recurringPaymentIconMapper");
        Intrinsics.checkNotNullParameter(pricingPlanSubscriptionIconMapper, "pricingPlanSubscriptionIconMapper");
        Intrinsics.checkNotNullParameter(juniorAllowanceRecurringPaymentUiMapper, "juniorAllowanceRecurringPaymentUiMapper");
        Intrinsics.checkNotNullParameter(contactMapper, "contactMapper");
        Intrinsics.checkNotNullParameter(subscriptionsBadgeMapper, "subscriptionsBadgeMapper");
        Intrinsics.checkNotNullParameter(cobrandSubscriptionIconMapper, "cobrandSubscriptionIconMapper");
        this.f204008a = subscriptionsAppMapper;
        this.f204009b = payLaterMerchantIconMapper;
        this.f204010c = loanTransactionCategoryIconMapper;
        this.d = beneficiaryAvatarMapper;
        this.e = transactionCategoryResourcesMapper;
        this.f = recurringPaymentIconMapper;
        this.f204011g = juniorAllowanceRecurringPaymentUiMapper;
        this.f204012h = contactMapper;
        this.i = subscriptionsBadgeMapper;
    }

    public static UrlImage b(String str) {
        return new UrlImage(str, null, Integer.valueOf(R$drawable.uikit_icn_40_coins_shape), null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507898);
    }

    public final AvatarModel.Default a(qua.p subscription, List vaults, CircleBadgeModel circleBadgeModel, Map contactsWithPaidPlan) {
        zm3.a aVar;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        Image imageC = c(subscription, vaults, contactsWithPaidPlan);
        if (circleBadgeModel == null) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            Image imageA = this.i.a(subscription);
            circleBadgeModel = imageA != null ? new RawImageBadge(imageA) : null;
        }
        vua.a aVar2 = subscription.f249330s;
        String str = aVar2 != null ? aVar2.f : null;
        return new AvatarModel.Default(imageC, null, (str == null || (aVar = (zm3.a) contactsWithPaidPlan.get(str)) == null) ? null : ((xl3.d) this.f204012h).g(aVar), null, circleBadgeModel != null ? new AvatarModel.BadgeModel(circleBadgeModel, com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, 106);
    }

    public final Image c(qua.p subscription, List vaults, Map contactsWithPaidPlan) {
        ContactImage contactImageA;
        String logo;
        k3 k3VarA;
        l2 l2VarC;
        zm3.a aVar;
        String strDisplayName;
        rua.c cVar;
        String str;
        String str2;
        String str3;
        String str4;
        d6c.a aVar2;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        f5j.a aVar3 = subscription.f249329r;
        vua.a aVar4 = subscription.f249330s;
        String str5 = subscription.f249325m;
        qua.h hVar = subscription.C;
        qua.g gVar = subscription.f249332w;
        Intrinsics.checkNotNullParameter(subscription, "<this>");
        ibd.e eVar = subscription.f249314a;
        if (eVar.f160152c == ibd.h.WALLET) {
            return ((f) this.f).b(subscription);
        }
        Intrinsics.checkNotNullParameter(subscription, "<this>");
        if (eVar.f160152c == ibd.h.BILL_MONEY_BOX) {
            return fpg.a.a();
        }
        Intrinsics.checkNotNullParameter(subscription, "<this>");
        ibd.h hVar2 = eVar.f160152c;
        ibd.h hVar3 = ibd.h.LOAN_PAYMENT;
        m35.q qVar = this.f204010c;
        Object obj2 = null;
        contactImageH = null;
        ContactImage contactImageH = null;
        if (hVar2 == hVar3) {
            return ((l0) qVar).a(null);
        }
        List list = qua.u.f249338a;
        Intrinsics.checkNotNullParameter(subscription, "<this>");
        if (eVar.f160152c == ibd.h.MORTGAGE_PAYMENT) {
            return ((l0) qVar).a(b95.a.MORTGAGE_LOAN);
        }
        Intrinsics.checkNotNullParameter(subscription, "<this>");
        ibd.h hVar4 = eVar.f160152c;
        if (hVar4 == ibd.h.SAVINGS_POCKET || hVar4 == ibd.h.VAULT) {
            Iterator it8 = vaults.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((pcd.s) next).f234881a, subscription.f249318c)) {
                    obj2 = next;
                    break;
                }
            }
            return w0.j((pcd.s) obj2);
        }
        Intrinsics.checkNotNullParameter(subscription, "<this>");
        ibd.h hVar5 = eVar.f160152c;
        ibd.h hVar6 = ibd.h.CREDIT_CARD_PAYMENT;
        h hVar7 = this.f204008a;
        if (hVar5 == hVar6) {
            return hVar7.f204002a.a();
        }
        if (ofm.q.D(subscription)) {
            tua.d dVarM = qua.u.M(subscription);
            return this.f204009b.c(new j0(dVarM.f274554j, dVarM.f274552g, dVarM.f274553h), null);
        }
        if (ofm.q.p(subscription)) {
            String str6 = gVar != null ? gVar.d : null;
            String str7 = gVar != null ? gVar.f249294c : null;
            if (str7 == null || (aVar2 = (d6c.a) u1.v(str7, d7c.c.c())) == null) {
                aVar2 = d6c.a.UNKNOWN;
            }
            return q7c.b.a(str6, q7c.b.b(aVar2));
        }
        Intrinsics.checkNotNullParameter(subscription, "<this>");
        if (eVar.f160152c == ibd.h.PAID_PLAN) {
            return c.a(subscription.O);
        }
        Intrinsics.checkNotNullParameter(subscription, "<this>");
        if (eVar.f160152c == ibd.h.COBRANDS) {
            return a.a(subscription.z);
        }
        boolean zE = ofm.q.E(subscription);
        thf.c cVar2 = this.e;
        if (zE) {
            qua.i iVar = subscription.Q;
            return (iVar == null || (str4 = iVar.f249299a) == null) ? iVar != null ? ((wjf.e) cVar2).i(iVar.d, null, null) : h5k.a.c() : b(str4);
        }
        if (qua.u.D(subscription)) {
            return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, subscription.k, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        }
        if (qua.u.m(subscription)) {
            return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, subscription.f249325m, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        }
        if (qua.u.j(subscription)) {
            return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, (hVar == null || (str3 = hVar.f249298b) == null) ? str5 : str3, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        }
        if (qua.u.y(subscription)) {
            return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, (hVar == null || (str2 = hVar.f249298b) == null) ? str5 : str2, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        }
        if (qua.u.I(subscription)) {
            return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, (hVar == null || (str = hVar.f249298b) == null) ? str5 : str, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        }
        if (qua.u.J(subscription)) {
            return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, subscription.k, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        }
        if (qua.u.K(subscription)) {
            rua.d dVar = subscription.D;
            if (dVar == null || (cVar = dVar.f257508a) == null || (strDisplayName = cVar.displayName()) == null) {
                strDisplayName = subscription.k;
            }
            return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, strDisplayName, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        }
        if (qua.u.x(subscription)) {
            return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, subscription.k, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        }
        if (ofm.q.w(subscription)) {
            return this.f204011g.a(subscription);
        }
        if (aVar4 != null) {
            String str8 = aVar4.f;
            if (str8 != null && (aVar = (zm3.a) contactsWithPaidPlan.get(str8)) != null) {
                contactImageH = ((xl3.d) this.f204012h).h(aVar);
            }
            return contactImageH == null ? new ContactImage(aVar4.f292279a, (String) null, aVar4.f, (String) null, (String) null, aVar4.a(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4058) : contactImageH;
        }
        uua.a aVar5 = subscription.f249331t;
        if (aVar5 != null) {
            String str9 = aVar5.f283190c;
            return new UrlImage(str9 == null ? "" : str9, null, null, null, 0L, null, null, null, null, h5k.a.c(), false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 506878);
        }
        if (gVar == null) {
            wua.a aVar6 = subscription.f249328q;
            if (aVar6 == null) {
                return (aVar3 == null || (contactImageA = this.d.a(aVar3)) == null) ? h5k.a.c() : contactImageA;
            }
            String str10 = aVar6.f300093b;
            logo = str10 != null ? str10 : "";
            return new CurrencyImage(logo, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        String str11 = gVar.d;
        logo = str11 != null ? str11 : "";
        if (URLUtil.isValidUrl(logo)) {
            return b(logo);
        }
        if (logo.length() > 0 && jli.g.j(logo).size() == 1) {
            hVar7.getClass();
            Intrinsics.checkNotNullParameter(logo, "logo");
            return b(hVar7.f204003b.a(logo, false));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "SubscriptionsIconMapper", "Can not build logo for name '".concat(logo), null, null, 16);
        String str12 = gVar.f249294c;
        if (str12 == null || (l2VarC = l3.c(str12)) == null) {
            i3.Companion.getClass();
            k3VarA = i3.a.a();
        } else {
            k3VarA = new k3(l2VarC);
        }
        return ((wjf.e) cVar2).i(k3VarA, null, null);
    }
}
