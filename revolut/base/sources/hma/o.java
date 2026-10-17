package hma;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import g48.r0;
import grl.k9;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import s7a.e0;
import s7a.f0;
import s7a.g0;
import s7a.h0;
import s7a.i0;
import s7a.z;
import vkm.v1;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends x7a.c {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f153609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gbd.a f153610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8b.b f153611c;
    public final r0 d;
    public final ang.f e;
    public volatile gk3.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile i f153612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile String f153613h;

    public o(fk3.a configurationInteractor, gbd.a dialogProvider, n8b.b countryUtils, r0 jointAccountsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f153609a = configurationInteractor;
        this.f153610b = dialogProvider;
        this.f153611c = countryUtils;
        this.d = jointAccountsInteractor;
        this.e = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(hma.o r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof hma.l
            if (r0 == 0) goto L13
            r0 = r5
            hma.l r0 = (hma.l) r0
            int r1 = r0.f153605w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f153605w = r1
            goto L18
        L13:
            hma.l r0 = new hma.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f153605w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            g48.r0 r4 = r4.d
            w4l.i r5 = w4l.i.f294643c
            cxe.u r4 = r4.h(r5)
            zfd.e r4 = zi0.c.w(r4)
            r0.f153605w = r3
            java.lang.Object r5 = vkm.q.z(r4, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            if (r5 == 0) goto L58
            java.lang.Object r4 = r5.getContent()
            od0.i r4 = (od0.i) r4
            if (r4 == 0) goto L58
            java.lang.Object r4 = r4.f224257a
            n38.a r4 = (n38.a) r4
            return r4
        L58:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hma.o.q(hma.o, gim.c):java.lang.Object");
    }

    public static g0 r(String str) {
        return new g0(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter(str, 2))));
    }

    public static ArrayList s(int i, String str, List list) {
        return yp0.b.g(list, new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    @Override // x7a.d
    public final i0 b(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "id");
        gk3.g gVar = this.f;
        if (gVar != null) {
            wi0.b countryCode2 = com.bumptech.glide.d.c(countryCode);
            i iVar = this.f153612g;
            if (!Intrinsics.f(this.f153613h, countryCode)) {
                if (iVar != null) {
                    gbd.a aVar = this.f153610b;
                    String jointMemberDisplayName = iVar.f153603a;
                    String currentCountryCode = this.f153613h;
                    if (currentCountryCode == null) {
                        currentCountryCode = "";
                    }
                    kma.a aVar2 = (kma.a) aVar;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(jointMemberDisplayName, "jointMemberDisplayName");
                    Intrinsics.checkNotNullParameter(currentCountryCode, "currentCountryCode");
                    Intrinsics.checkNotNullParameter(countryCode, "targetCountryCode");
                    o8b.g gVar2 = (o8b.g) aVar2.f185742a;
                    String strA = gVar2.a(currentCountryCode);
                    String strA2 = gVar2.a(countryCode);
                    lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R.string.change_country_dialog_more_information_title, u.c(strA2), null, 12), new TextLocalisedClause(R$string.change_country_dialog_blocking_joint_account_subtitle, v.k(jointMemberDisplayName, strA, strA2), null, 12), null, null, false, 28);
                    aw0.g gVar3 = new aw0.g(new n6(new TextLocalisedClause(R.string.change_country_dialog_negative, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(R.string.change_country_dialog_unsupported_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var = k9.FinCrime;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    return new i0(new dii.a(aVar3, gVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24), "JOINT");
                }
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                if (gVar.f144325c.contains(countryCode2)) {
                    kma.a aVar4 = (kma.a) this.f153610b;
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    lw0.a aVar5 = new lw0.a(new TextLocalisedClause(R.string.change_country_dialog_more_information_title, null, null, 14), new TextLocalisedClause(R.string.change_country_dialog_more_information_subtitle, u.c(((o8b.g) aVar4.f185742a).a(countryCode)), null, 12), null, null, false, 28);
                    aw0.g gVar4 = new aw0.g(new n6(new TextLocalisedClause(R.string.change_country_dialog_negative, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(R.string.change_country_dialog_unsupported_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var2 = k9.FinCrime;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    return new i0(new dii.a(aVar5, gVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24), "FAQ");
                }
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                if (gVar.f144324b.contains(countryCode2)) {
                    ((kma.a) this.f153610b).getClass();
                    lw0.a aVar6 = new lw0.a(new TextLocalisedClause(R.string.change_country_dialog_change_feature_title, null, null, 14), new TextLocalisedClause(R.string.change_country_dialog_change_feature_subtitle, null, null, 14), null, null, false, 28);
                    aw0.g gVar5 = new aw0.g(new n6(new TextLocalisedClause(R.string.change_country_dialog_negative, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var3 = k9.FinCrime;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    return new i0(new dii.a(aVar6, gVar5, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24), "CONFIRMATION");
                }
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                if (gVar.d.contains(countryCode2)) {
                    kma.a aVar7 = (kma.a) this.f153610b;
                    aVar7.getClass();
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    lw0.a aVar8 = new lw0.a(new TextLocalisedClause(R.string.change_country_dialog_unsupported_title, u.c(((o8b.g) aVar7.f185742a).a(countryCode)), null, 12), new TextLocalisedClause(R.string.change_country_dialog_unsupported_subtitle, null, null, 14), null, null, false, 28);
                    aw0.g gVar6 = new aw0.g(new n6(new TextLocalisedClause(R.string.change_country_dialog_negative, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(R.string.change_country_dialog_unsupported_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var4 = k9.FinCrime;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    return new i0(new dii.a(aVar8, gVar6, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24), "UNSUPPORTED");
                }
            }
        }
        return null;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        String str = (String) d0.c0(ids);
        return str == null ? z.f260661a : new c8a.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    @Override // x7a.c, x7a.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(com.revolut.data.model.Data r40, java.util.Set r41, java.util.List r42, java.lang.String r43, java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hma.o.d(com.revolut.data.model.Data, java.util.Set, java.util.List, java.lang.String, java.lang.Object):java.util.List");
    }

    @Override // x7a.d
    public final h0 f(s7a.d0 action, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!Intrinsics.f(action.f260604a, dii.f.f115069a)) {
            return f0.f260606a;
        }
        j jVarValueOf = j.valueOf(str);
        int i = jVarValueOf == null ? -1 : k.f153604a[jVarValueOf.ordinal()];
        e0 e0Var = e0.f260605a;
        if (i == -1) {
            super.f(action, null);
            return e0Var;
        }
        if (i == 1) {
            return r("question.how-do-i-change-my-country-of-residence");
        }
        if (i == 2) {
            return e0Var;
        }
        if (i == 3) {
            return r("question.how-do-i-change-my-country-of-residence");
        }
        if (i == 4) {
            return r("question.how-do-i-close-my-joint-account");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // x7a.c
    public final String k(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return ((o8b.g) this.f153611c).a(countryCode.f297794a);
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        return new v1(new n(this, null, 0));
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        return new v1(new n(this, null, 1));
    }
}
