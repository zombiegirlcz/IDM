package pnd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nnd.a1;
import nnd.b1;
import nnd.c1;
import nnd.l0;
import nnd.m0;
import nnd.n0;
import nnd.o0;
import nnd.p0;
import nnd.q0;
import nnd.r0;
import nnd.s0;
import nnd.t0;
import nnd.u0;
import nnd.v0;
import nnd.w0;
import nnd.x0;
import nnd.y0;
import nnd.z0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f237692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iob.c f237693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6e.b f237694c;
    public final e d;
    public final gte.a e;

    public c(je6.h externalInstitutionLogoMapper, iob.c savingsAccountMapper, g6e.b subAccountBackgroundInteractor, e accountPickerAccountsSelectionMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(savingsAccountMapper, "savingsAccountMapper");
        Intrinsics.checkNotNullParameter(subAccountBackgroundInteractor, "subAccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(accountPickerAccountsSelectionMapper, "accountPickerAccountsSelectionMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f237692a = externalInstitutionLogoMapper;
        this.f237693b = savingsAccountMapper;
        this.f237694c = subAccountBackgroundInteractor;
        this.d = accountPickerAccountsSelectionMapper;
        this.e = featureToggleInteractor;
    }

    public static String a(c1 c1Var) {
        String strValueOf;
        AnalyticsAccount analyticsAccountA = c1Var.a();
        if ((analyticsAccountA instanceof AnalyticsAccount.Personal.All) || (analyticsAccountA instanceof AnalyticsAccount.Pro.All) || (analyticsAccountA instanceof AnalyticsAccount.Joint.All) || (analyticsAccountA instanceof AnalyticsAccount.Savings.PersonalAll) || (analyticsAccountA instanceof AnalyticsAccount.Savings.JointAll)) {
            strValueOf = String.valueOf(analyticsAccountA.getClass());
        } else if (analyticsAccountA instanceof AnalyticsAccount.Personal.CurrencyPocket) {
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Personal.CurrencyPocket) analyticsAccountA).f99194a;
        } else if (analyticsAccountA instanceof AnalyticsAccount.Personal.Subaccount) {
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Personal.Subaccount) analyticsAccountA).f99195a;
        } else if (analyticsAccountA instanceof AnalyticsAccount.Joint.CurrencyPocket) {
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Joint.CurrencyPocket) analyticsAccountA).f99181b;
        } else if (analyticsAccountA instanceof AnalyticsAccount.Joint.Subaccount) {
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Joint.Subaccount) analyticsAccountA).f99183b;
        } else if (analyticsAccountA instanceof AnalyticsAccount.Pro.CurrencyPocket) {
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Pro.CurrencyPocket) analyticsAccountA).f99197a;
        } else if (analyticsAccountA instanceof AnalyticsAccount.Linked) {
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Linked) analyticsAccountA).f99189a;
        } else if (analyticsAccountA instanceof AnalyticsAccount.Personal.CreditCard) {
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Personal.CreditCard) analyticsAccountA).f99193a;
        } else if (analyticsAccountA instanceof AnalyticsAccount.Junior.All) {
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Junior.All) analyticsAccountA).f99184a;
        } else if (analyticsAccountA instanceof AnalyticsAccount.Junior.CurrencyPocket) {
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Junior.CurrencyPocket) analyticsAccountA).f99188c;
        } else if (analyticsAccountA instanceof AnalyticsAccount.Savings.JointIndividual) {
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Savings.JointIndividual) analyticsAccountA).f99200b;
        } else if (analyticsAccountA instanceof AnalyticsAccount.Savings.PersonalIndividual) {
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Savings.PersonalIndividual) analyticsAccountA).f99204a;
        } else {
            if (!(analyticsAccountA instanceof AnalyticsAccount.Savings.JuniorSaving)) {
                throw new NoWhenBranchMatchedException();
            }
            strValueOf = analyticsAccountA.getClass() + "+" + ((AnalyticsAccount.Savings.JuniorSaving) analyticsAccountA).f99201a;
        }
        return j6.a.q("ACCOUNT_ROW_ID", strValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.RowDelegate.Model.c.b c(dj0.d r11, dj0.d r12) {
        /*
            r0 = 0
            if (r11 == 0) goto L1a
            com.revolut.core.ui_kit.models.MoneyClause r1 = new com.revolut.core.ui_kit.models.MoneyClause
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r2 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r6 = 0
            r7 = 15
            r3 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r5 = 0
            r6 = 12
            r3 = r2
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r3 = r1
            goto L1c
        L1a:
            r2 = r11
            r3 = r0
        L1c:
            if (r12 == 0) goto L52
            xi0.b r11 = r12.f115083b
            if (r2 == 0) goto L25
            xi0.b r1 = r2.f115083b
            goto L26
        L25:
            r1 = r0
        L26:
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r1)
            if (r11 != 0) goto L52
            boolean r11 = r12.k()
            if (r11 != 0) goto L52
            com.revolut.core.ui_kit.models.MoneyClause r4 = new com.revolut.core.ui_kit.models.MoneyClause
            if (r12 == 0) goto L4a
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r5 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r9 = 0
            r10 = 15
            r6 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r8 = 0
            r9 = 12
            r6 = r5
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            goto L53
        L4a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Required value was null."
            r11.<init>(r12)
            throw r11
        L52:
            r4 = r0
        L53:
            com.revolut.core.ui_kit.delegates.RowDelegate$Model$c$b r2 = new com.revolut.core.ui_kit.delegates.RowDelegate$Model$c$b
            r5 = 0
            r6 = 0
            r7 = 124(0x7c, float:1.74E-43)
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pnd.c.c(dj0.d, dj0.d):com.revolut.core.ui_kit.delegates.RowDelegate$Model$c$b");
    }

    public static RowDelegate.Model.c.b d(c1 c1Var) {
        if (c1Var instanceof x0) {
            return c(((x0) c1Var).f217606b, null);
        }
        if (c1Var instanceof q0) {
            return c(((q0) c1Var).f217581b, null);
        }
        if (c1Var instanceof o0) {
            dj0.d dVar = ((o0) c1Var).f217576b;
            dj0.d dVarA = dVar != null ? dVar.a() : null;
            if (dVarA != null) {
                return new RowDelegate.Model.c.b(dVarA != null ? otd.f.c(3, null, null, dVarA) : null, new TextLocalisedClause(R$string.analytics_account_picker_credit_card_spent, null, null, 14), null, false, 124);
            }
            return null;
        }
        if (c1Var instanceof a1) {
            return c(((a1) c1Var).f217524b, null);
        }
        if (c1Var instanceof b1) {
            b1 b1Var = (b1) c1Var;
            return c(b1Var.f217531c, b1Var.d);
        }
        if (c1Var instanceof n0) {
            return c(((n0) c1Var).f217573b.f255591b, null);
        }
        if (c1Var instanceof p0) {
            rnd.d dVar2 = ((p0) c1Var).f217579b;
            return c(dVar2.f255601c, dVar2.d);
        }
        if (c1Var instanceof w0) {
            w0 w0Var = (w0) c1Var;
            return c(w0Var.f217603b, w0Var.f217604c);
        }
        if (c1Var instanceof m0) {
            return c(((m0) c1Var).f217570b, null);
        }
        if (c1Var instanceof u0) {
            u0 u0Var = (u0) c1Var;
            return c(u0Var.f217598c, u0Var.d);
        }
        if (c1Var instanceof v0) {
            return c(((v0) c1Var).f217601b.f255606c, null);
        }
        if (c1Var instanceof l0) {
            return c(((l0) c1Var).f217567b.f255591b, null);
        }
        if (c1Var instanceof s0) {
            rnd.d dVar3 = ((s0) c1Var).f217591b;
            return c(dVar3.f255601c, dVar3.d);
        }
        if (c1Var instanceof r0) {
            r0 r0Var = (r0) c1Var;
            return c(r0Var.f217587c, r0Var.d);
        }
        if (c1Var instanceof t0) {
            t0 t0Var = (t0) c1Var;
            return c(t0Var.f217595c, t0Var.d);
        }
        if (c1Var instanceof y0) {
            y0 y0Var = (y0) c1Var;
            return c(y0Var.f217609c, y0Var.d);
        }
        if (!(c1Var instanceof z0)) {
            throw new NoWhenBranchMatchedException();
        }
        z0 z0Var = (z0) c1Var;
        return c(z0Var.f217612c, z0Var.d);
    }

    public static TextLocalisedQuantityClause h(int i) {
        return new TextLocalisedQuantityClause(R$plurals.analytics_dashboard_account_multi_accounts, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0547 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qv0.l b(nnd.c1 r30, nnd.k r31, java.util.List r32) {
        /*
            Method dump skipped, instruction units count: 1405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pnd.c.b(nnd.c1, nnd.k, java.util.List):qv0.l");
    }

    public final tf e(c1 c1Var, Set set) {
        boolean zContains;
        if ((c1Var instanceof l0) || (c1Var instanceof n0) || (c1Var instanceof q0) || (c1Var instanceof x0) || (c1Var instanceof a1)) {
            zContains = set.contains(new nnd.d(c1Var.a()));
        } else {
            if (!(c1Var instanceof m0)) {
                if ((c1Var instanceof o0) || (c1Var instanceof p0) || (c1Var instanceof r0) || (c1Var instanceof s0) || (c1Var instanceof t0) || (c1Var instanceof u0) || (c1Var instanceof v0) || (c1Var instanceof w0) || (c1Var instanceof y0) || (c1Var instanceof z0) || (c1Var instanceof b1)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!((jte.d) this.e).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c)) {
                return null;
            }
            zContains = set.contains(new nnd.d(((m0) c1Var).f217569a));
        }
        return new tf(new yy0.h(zContains ? new TextLocalisedClause(R$string.analytics_account_picker_accessibility_collapse, null, null, 14) : new TextLocalisedClause(R$string.analytics_account_picker_accessibility_expand, null, null, 14), new ResourceImage(zContains ? R$drawable.uikit_icn_24_chevron_up : R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246)));
    }

    public final Clause f(ncd.j jVar, boolean z) {
        return this.f237693b.b(jVar, z ? new njb.f(new ImageClauseTint.Color(R$attr.uikit_colorForeground), null, 5) : new njb.h(null, 3));
    }

    public final TextLocalisedQuantityClause g(nnd.j jVar, Function1 function1) {
        int iB = this.d.b(jVar, function1);
        if (iB > 0) {
            return h(iB);
        }
        return null;
    }
}
