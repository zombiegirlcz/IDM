package com.revolut.feature.freelancer.impl.ui.onboarding.validation;

import au0.j0;
import au6.r1;
import au6.z0;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.network.services.FreelancerOnboardingService;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import efm.d0;
import efm.r;
import et6.y1;
import ft6.j;
import ft6.k;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import st6.e;
import sx4.c;
import te0.w;
import ufm.i;
import vr6.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements sz6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f74006a;

    public a(y1 onboardingInteractor) {
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        this.f74006a = onboardingInteractor;
    }

    public final r a(String str, d params) {
        String str2;
        y1 y1Var = this.f74006a;
        y1Var.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        r1 r1Var = y1Var.f129383a;
        r1Var.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        FreelancerOnboardingService freelancerOnboardingService = r1Var.f9607a;
        gs6.a aVar = params.f291515c;
        String str3 = params.f291514b;
        String str4 = params.f291513a;
        Map map = k.f137948a;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = j.f137947a[aVar.ordinal()];
        if (i == 1) {
            str2 = "regular";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "eCommerce";
        }
        Intrinsics.checkNotNullParameter(params, "<this>");
        d0<List<st6.d>> d0VarVerifyOnboardingInput = freelancerOnboardingService.verifyOnboardingInput(str2, new e(str4, str3));
        z0 z0Var = new z0(new j0(25), 8);
        d0VarVerifyOnboardingInput.getClass();
        i iVar = new i(d0VarVerifyOnboardingInput, z0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        r map2 = w.i0(iVar).x().map(new c(new sef.j(str, 16), 6));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarStartWith = ue0.e.E(map2, new OnboardingInputDataValidator$ValidationState.NotValid(str3 != null ? new TextLocalisedClause(R$string.freelancer_business_website_validation_error_message, null, null, 14) : str4 != null ? new TextLocalisedClause(R$string.freelancer_business_description_validation_error_message, null, null, 14) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str)).startWith(new OnboardingInputDataValidator$ValidationState.Loading(str));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    public final r b(String url2, gs6.a verificationMode) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        return a(url2, new d(null, url2, verificationMode, 1));
    }
}
