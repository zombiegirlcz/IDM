package c17;

import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f20388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20390c;
    public final OnboardingInputDataValidator$ValidationState d;
    public final boolean e;

    public h(o uiMode, String str, String str2, OnboardingInputDataValidator$ValidationState validationState, boolean z) {
        Intrinsics.checkNotNullParameter(uiMode, "uiMode");
        Intrinsics.checkNotNullParameter(validationState, "validationState");
        this.f20388a = uiMode;
        this.f20389b = str;
        this.f20390c = str2;
        this.d = validationState;
        this.e = z;
    }

    public static h a(h hVar, String str, OnboardingInputDataValidator$ValidationState onboardingInputDataValidator$ValidationState, int i) {
        o uiMode = hVar.f20388a;
        if ((i & 2) != 0) {
            str = hVar.f20389b;
        }
        String str2 = str;
        String str3 = hVar.f20390c;
        if ((i & 8) != 0) {
            onboardingInputDataValidator$ValidationState = hVar.d;
        }
        OnboardingInputDataValidator$ValidationState validationState = onboardingInputDataValidator$ValidationState;
        boolean z = hVar.e;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(uiMode, "uiMode");
        Intrinsics.checkNotNullParameter(validationState, "validationState");
        return new h(uiMode, str2, str3, validationState, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f20388a == hVar.f20388a && Intrinsics.f(this.f20389b, hVar.f20389b) && Intrinsics.f(this.f20390c, hVar.f20390c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f20388a.hashCode() * 31;
        String str = this.f20389b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20390c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
