package mwj;

import com.revolut.retail.feature.api.userauth.models.UserAuthElement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import nwj.a0;
import nwj.a1;
import nwj.b0;
import nwj.b1;
import nwj.c0;
import nwj.c1;
import nwj.d0;
import nwj.d1;
import nwj.e0;
import nwj.e1;
import nwj.f0;
import nwj.f1;
import nwj.g0;
import nwj.h0;
import nwj.i0;
import nwj.j0;
import nwj.k0;
import nwj.l0;
import nwj.m0;
import nwj.n0;
import nwj.o0;
import nwj.p0;
import nwj.r0;
import nwj.s;
import nwj.s0;
import nwj.t;
import nwj.t0;
import nwj.u;
import nwj.u0;
import nwj.v;
import nwj.v0;
import nwj.w;
import nwj.w0;
import nwj.x;
import nwj.x0;
import nwj.y;
import nwj.y0;
import nwj.z;
import nwj.z0;
import org.joda.time.Duration;
import yt8.e;
import zhm.q0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f209485a = q0.c(new Pair("CREATION", com.revolut.retail.feature.api.userauth.models.b.CREATION));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f209486b = q0.c(new Pair("DUPLICATE", com.revolut.retail.feature.api.userauth.models.a.DUPLICATE));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f209487c = q0.c(new Pair("AU_ADDITIONAL_VERIFICATION_REQUIRED", e.AU_ADDITIONAL_VERIFICATION));

    public static final UserAuthElement a(f1 f1Var) {
        com.revolut.retail.feature.api.userauth.models.b bVar;
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        if (f1Var instanceof b0) {
            b0 b0Var = (b0) f1Var;
            return new UserAuthElement.Country(b0Var.getJuniorGraduationPreselectedCountry(), b0Var.getSupportsResubmission());
        }
        if (f1Var instanceof x0) {
            return new UserAuthElement.RetailAndCreditTerms(((x0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof t) {
            return new UserAuthElement.Address(((t) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof m0) {
            return new UserAuthElement.Name(false, ((m0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof n0) {
            return new UserAuthElement.Name(true, ((n0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof c0) {
            return new UserAuthElement.DateOfBirth(((c0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof g0) {
            g0 g0Var = (g0) f1Var;
            boolean supportsResubmission = g0Var.getSupportsResubmission();
            Boolean isVerificationRequired = g0Var.getIsVerificationRequired();
            return new UserAuthElement.Email(isVerificationRequired != null ? isVerificationRequired.booleanValue() : false, supportsResubmission);
        }
        if (f1Var instanceof v0) {
            return new UserAuthElement.PurposeOfAccount(((v0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof o0) {
            return new UserAuthElement.Occupation(((o0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof a1) {
            return new UserAuthElement.TaxResidencies(((a1) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof f0) {
            f0 f0Var = (f0) f1Var;
            return new UserAuthElement.DuplicateAccount((com.revolut.retail.feature.api.userauth.models.a) u1.u(f0Var.getAccountSimilarity(), f209486b), f0Var.getSupportsResubmission());
        }
        if (f1Var instanceof p0) {
            p0 p0Var = (p0) f1Var;
            String passwordOperation = p0Var.getPasswordOperation();
            if (passwordOperation == null || (bVar = (com.revolut.retail.feature.api.userauth.models.b) u1.v(passwordOperation, f209485a)) == null) {
                bVar = com.revolut.retail.feature.api.userauth.models.b.CREATION;
            }
            return new UserAuthElement.Password(bVar, p0Var.getSupportsResubmission());
        }
        if (f1Var instanceof c1) {
            return new UserAuthElement.WaitingList(j6.a.p("toString(...)"), ((c1) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof s) {
            return new UserAuthElement.ActivationReady(((s) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof z) {
            return new UserAuthElement.ContactsPermission(((z) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof z0) {
            z0 z0Var = (z0) f1Var;
            return new UserAuthElement.SelfieKyc(z0Var.getVerificationToken(), z0Var.getSupportsResubmission());
        }
        if (f1Var instanceof u0) {
            return new UserAuthElement.ProfileDetails(((u0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof e0) {
            e0 e0Var = (e0) f1Var;
            boolean required = e0Var.getRequired();
            List alerts = e0Var.getAlerts();
            e eVar = null;
            if (alerts != null) {
                Iterator it8 = alerts.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    e eVar2 = (e) u1.v((String) it8.next(), f209487c);
                    if (eVar2 != null) {
                        eVar = eVar2;
                        break;
                    }
                }
            }
            return new UserAuthElement.DocumentKyc(required, eVar, e0Var.getSupportsResubmission());
        }
        if (f1Var instanceof u) {
            u uVar = (u) f1Var;
            return new UserAuthElement.AddressVerificationKyc(uVar.getRequired(), uVar.getSupportsResubmission());
        }
        long millis = 5000;
        if (f1Var instanceof y0) {
            y0 y0Var = (y0) f1Var;
            String estimatedTime = y0Var.getEstimatedTime();
            if (estimatedTime != null) {
                try {
                    millis = Duration.parse(estimatedTime).getMillis();
                } catch (IllegalArgumentException unused) {
                }
            }
            return new UserAuthElement.RiskCheck(millis, y0Var.getSupportsResubmission());
        }
        if (f1Var instanceof x) {
            x xVar = (x) f1Var;
            Boolean invisible = xVar.getInvisible();
            return new UserAuthElement.BankTerms(invisible != null ? invisible.booleanValue() : false, xVar.getSupportsResubmission());
        }
        if (f1Var instanceof h0) {
            h0 h0Var = (h0) f1Var;
            boolean supportsResubmission2 = h0Var.getSupportsResubmission();
            Boolean isVerificationRequired2 = h0Var.getIsVerificationRequired();
            return new UserAuthElement.EmailWithMarketingConsent(isVerificationRequired2 != null ? isVerificationRequired2.booleanValue() : false, supportsResubmission2);
        }
        if (f1Var instanceof k0) {
            return new UserAuthElement.MarketingConsent(((k0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof r0) {
            return new UserAuthElement.PoliticallyExposedPersonDeclaration(((r0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof i0) {
            i0 i0Var = (i0) f1Var;
            return new UserAuthElement.JuniorGraduation(i0Var.getJuniorFirstName(), i0Var.getSupportsResubmission());
        }
        if (f1Var instanceof j0) {
            return new UserAuthElement.JuniorGraduationAccountLinked(((j0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof l0) {
            return new UserAuthElement.MonthlyIncome(((l0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof y) {
            return new UserAuthElement.Citizenship(((y) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof b1) {
            return new UserAuthElement.Unsupported(j6.a.p("toString(...)"), ((b1) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof d0) {
            d0 d0Var = (d0) f1Var;
            return new UserAuthElement.DocumentId(d0Var.getRequired(), d0Var.getSupportsResubmission());
        }
        if (f1Var instanceof e1) {
            e1 e1Var = (e1) f1Var;
            return new UserAuthElement.Workflow(e1Var.getWorkflowId(), j6.a.p("toString(...)"), e1Var.getSupportsResubmission());
        }
        if (f1Var instanceof w0) {
            return new UserAuthElement.Qes(((w0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof a0) {
            return new UserAuthElement.ContactsSync(((a0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof v) {
            return new UserAuthElement.AiCallsConsent(((v) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof w) {
            w wVar = (w) f1Var;
            Boolean isAnalyticsConsentRequired = wVar.getIsAnalyticsConsentRequired();
            return new UserAuthElement.TrackingConsent(isAnalyticsConsentRequired != null ? isAnalyticsConsentRequired.booleanValue() : true, wVar.getSupportsResubmission());
        }
        if (f1Var instanceof nwj.q0) {
            return new UserAuthElement.PodBeneficiaries(((nwj.q0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof d1) {
            d1 d1Var = (d1) f1Var;
            String waitingPeriod = d1Var.getWaitingPeriod();
            if (waitingPeriod != null) {
                try {
                    millis = Duration.parse(waitingPeriod).getMillis();
                } catch (IllegalArgumentException unused2) {
                }
            }
            return new UserAuthElement.WaitingVerification(millis, d1Var.getSupportsResubmission());
        }
        if (f1Var instanceof s0) {
            return new UserAuthElement.ProductLifecycle(((s0) f1Var).getSupportsResubmission());
        }
        if (f1Var instanceof t0) {
            return new UserAuthElement.ProductOnboarding(((t0) f1Var).getSupportsResubmission());
        }
        throw new NoWhenBranchMatchedException();
    }
}
