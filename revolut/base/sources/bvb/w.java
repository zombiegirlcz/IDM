package bvb;

import bn4.y;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.buying.api.R$string;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreenContract$InputData;
import com.revolut.feature.rev_points.models.RevPoints;
import ip0.ak0;
import ip0.q10;
import ip0.t10;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsBuyingControllerScreenContract$InputData f19016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f19017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jub.a f19018c;

    public w(RevPointsBuyingControllerScreenContract$InputData inputData, l80.e dateProvider, jub.a revPointsDisclaimerProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(revPointsDisclaimerProvider, "revPointsDisclaimerProvider");
        this.f19016a = inputData;
        this.f19017b = dateProvider;
        this.f19018c = revPointsDisclaimerProvider;
    }

    public static TextLocalisedClause a(e eVar, rub.i iVar) {
        RevPoints revPointsA;
        rub.j jVar = eVar.f18981b;
        if (jVar != null) {
            revPointsA = qvb.a.a(jVar.a());
        } else {
            RevPoints.INSTANCE.getClass();
            revPointsA = RevPoints.Companion.a(0L);
        }
        RevPoints other = qvb.a.a(iVar.f257517a);
        Intrinsics.checkNotNullParameter(other, "other");
        if (revPointsA.f83960a.f(other.f83960a)) {
            return new TextLocalisedClause(R$string.points_buying_recurring_bottom_sheet_increment_active_description, null, null, 14);
        }
        int i = R$string.points_buying_recurring_bottom_sheet_active_description;
        Long l2 = iVar.f;
        return new TextLocalisedClause(i, zhm.u.c(new TimeClause(l2 != null ? l2.longValue() : 0L, TimeClause.Format.DateLong.f57962b, null, null, 12)), null, 12);
    }

    public static boolean b(rub.j jVar, rub.i iVar) {
        if (!(jVar == null ? true : jVar instanceof rub.i)) {
            return false;
        }
        rub.i iVar2 = (rub.i) jVar;
        return Intrinsics.f(iVar2 != null ? qvb.a.a(iVar2.f257517a) : null, qvb.a.a(iVar.f257517a)) || n14.e.s(iVar, iVar2);
    }

    public static qv0.i d(Data data, Function1 function1) {
        if (data.getContent() == null && data.getLoading() && data.getError() == null) {
            return new t10("SECTION_TERMS_TEXT_ID", q10.f165912a);
        }
        return new TextDelegate.Model("SECTION_TERMS_TEXT_ID", (Clause) function1.invoke(data.getContent()), false, new ak0(null, null, 3), null, null, 0, R$attr.uikit_dp0, 0, 0, 1780);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static aw0.e e(rub.j r12, java.util.List r13, boolean r14) {
        /*
            if (r13 == 0) goto La6
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L8:
            boolean r0 = r13.hasNext()
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r13.next()
            r2 = r0
            rub.i r2 = (rub.i) r2
            boolean r2 = b(r12, r2)
            if (r2 == 0) goto L8
            goto L1e
        L1d:
            r0 = r1
        L1e:
            rub.i r0 = (rub.i) r0
            if (r0 == 0) goto La6
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.feature.rev_points.buying.api.R$string.points_buying_recurring_bottom_sheet_cta_label
            com.revolut.core.ui_kit.models.MoneyClause r4 = new com.revolut.core.ui_kit.models.MoneyClause
            dj0.d r5 = r0.f257518b
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r6 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r10 = 0
            r11 = 15
            r7 = 0
            r8 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r9 = 12
            r4.<init>(r5, r6, r7, r8, r9)
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.rev_points.buying.api.R$string.points_buying_common_period_month
            r5 = 14
            r13.<init>(r2, r1, r1, r5)
            java.lang.Object[] r13 = new java.lang.Object[]{r4, r13}
            java.util.List r13 = zhm.v.k(r13)
            com.revolut.core.ui_kit.models.TextClause r4 = new com.revolut.core.ui_kit.models.TextClause
            r10 = 0
            r11 = 126(0x7e, float:1.77E-43)
            java.lang.String r5 = " / "
            r6 = 0
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            com.revolut.core.ui_kit.models.CompositeClause r13 = yoj.b.m(r4, r13)
            java.util.List r13 = zhm.u.c(r13)
            r2 = 12
            r3.<init>(r12, r13, r1, r2)
            com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle$DefaultFilledButton r4 = com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.f58725a
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r12 = com.revolut.analytics.tracking.v3.AnalyticsContext.INSTANCE
            com.revolut.tracking.v3.RevPointsBuyingContext$a r13 = com.revolut.tracking.v3.RevPointsBuyingContext.newBuilder()
            double r1 = r0.f257517a
            r13.j(r1)
            java.lang.Boolean r0 = r0.i
            boolean r0 = pd.b.j(r0)
            r13.h(r0)
            r13.c()
            com.google.protobuf.w0 r0 = r13.f49761b
            com.revolut.tracking.v3.RevPointsBuyingContext r0 = (com.revolut.tracking.v3.RevPointsBuyingContext) r0
            com.revolut.tracking.v3.RevPointsBuyingContext.j(r0, r14)
            r14 = 1
            r13.i(r14)
            com.google.protobuf.w0 r13 = r13.a()
            r12.getClass()
            com.google.protobuf.w0 r12 = com.revolut.analytics.tracking.v3.AnalyticsContext.Companion.a(r13)
            aw0.n6 r2 = new aw0.n6
            com.revolut.analytics.tracking.v3.AnalyticsContext r8 = new com.revolut.analytics.tracking.v3.AnalyticsContext
            r8.<init>(r12)
            r10 = 908(0x38c, float:1.272E-42)
            r5 = 0
            java.lang.String r6 = "PAYMENT_BUTTON_LOADING_ID"
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        La4:
            r7 = r2
            goto Lb0
        La6:
            aw0.m6 r12 = aw0.n6.Companion
            r12.getClass()
            aw0.n6 r2 = aw0.m6.a()
            goto La4
        Lb0:
            aw0.e r3 = new aw0.e
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 55
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bvb.w.e(rub.j, java.util.List, boolean):aw0.e");
    }

    public static lw0.a f() {
        return new lw0.a(new TextLocalisedClause(R$string.points_buying_recurring_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.points_buying_one_off_bottom_sheet_description, null, null, 14), null, null, false, 28);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        lw0.a aVar;
        final e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f18980a;
        final int i = 0;
        List list = (List) iii.c.f(data, new bnj.n(this, domainState, 26), new y(26), new Function3(this) { // from class: bvb.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f19010b;

            {
                this.f19010b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:92:0x079a  */
            /* JADX WARN: Type inference failed for: r7v0 */
            /* JADX WARN: Type inference failed for: r7v38, types: [aw0.o9, com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.Style, java.util.List, nub.g] */
            /* JADX WARN: Type inference failed for: r7v48 */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r78, java.lang.Object r79, java.lang.Object r80) {
                /*
                    Method dump skipped, instruction units count: 2164
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: bvb.s.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        boolean z = this.f19016a.f83566a;
        if (z) {
            final int i2 = 1;
            aVar = (lw0.a) iii.c.f(data, new bt9.t(this, 16), new y(this, 29), new Function3(this) { // from class: bvb.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w f19010b;

                {
                    this.f19010b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:92:0x079a  */
                /* JADX WARN: Type inference failed for: r7v0 */
                /* JADX WARN: Type inference failed for: r7v38, types: [aw0.o9, com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.Style, java.util.List, nub.g] */
                /* JADX WARN: Type inference failed for: r7v48 */
                @Override // kotlin.jvm.functions.Function3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r78, java.lang.Object r79, java.lang.Object r80) {
                    /*
                        Method dump skipped, instruction units count: 2164
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: bvb.s.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            });
        } else {
            aVar = new lw0.a(new TextLocalisedClause(R$string.points_buying_one_off_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.points_buying_one_off_bottom_sheet_description, null, null, 14), null, null, false, 28);
        }
        return new cii.b(z ? (aw0.i) iii.c.f(data, new bt9.t(14), new y(27), new u(this, domainState)) : (aw0.e) iii.c.f(data, new bt9.t(15), new y(28), new u(domainState, this)), list, aVar);
    }
}
