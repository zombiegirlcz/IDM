package n68;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f212723c;
    public final bj0.b d;
    public final boolean e;
    public final OnboardingTerms f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f212724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f212725h;

    public k(String firstName, String lastName, LocalDate birthDate, bj0.b gender, boolean z, OnboardingTerms onboardingTerms, Data userCountryCode, Data mandatoryCheckboxes) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        Intrinsics.checkNotNullParameter(mandatoryCheckboxes, "mandatoryCheckboxes");
        this.f212721a = firstName;
        this.f212722b = lastName;
        this.f212723c = birthDate;
        this.d = gender;
        this.e = z;
        this.f = onboardingTerms;
        this.f212724g = userCountryCode;
        this.f212725h = mandatoryCheckboxes;
    }

    public static k a(String firstName, String lastName, LocalDate birthDate, bj0.b gender, boolean z, OnboardingTerms onboardingTerms, Data userCountryCode, Data mandatoryCheckboxes) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        Intrinsics.checkNotNullParameter(mandatoryCheckboxes, "mandatoryCheckboxes");
        return new k(firstName, lastName, birthDate, gender, z, onboardingTerms, userCountryCode, mandatoryCheckboxes);
    }

    public static /* synthetic */ k c(k kVar, String str, String str2, LocalDate localDate, bj0.b bVar, OnboardingTerms onboardingTerms, Data data, Data data2, int i) {
        if ((i & 1) != 0) {
            str = kVar.f212721a;
        }
        if ((i & 2) != 0) {
            str2 = kVar.f212722b;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            localDate = kVar.f212723c;
        }
        LocalDate localDate2 = localDate;
        if ((i & 8) != 0) {
            bVar = kVar.d;
        }
        bj0.b bVar2 = bVar;
        boolean z = (i & 16) != 0 ? kVar.e : false;
        if ((i & 32) != 0) {
            onboardingTerms = kVar.f;
        }
        OnboardingTerms onboardingTerms2 = onboardingTerms;
        if ((i & 64) != 0) {
            data = kVar.f212724g;
        }
        Data data3 = data;
        Data data4 = (i & 128) != 0 ? kVar.f212725h : data2;
        kVar.getClass();
        return a(str, str3, localDate2, bVar2, z, onboardingTerms2, data3, data4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f212721a, kVar.f212721a) && Intrinsics.f(this.f212722b, kVar.f212722b) && Intrinsics.f(this.f212723c, kVar.f212723c) && this.d == kVar.d && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f212724g, kVar.f212724g) && Intrinsics.f(this.f212725h, kVar.f212725h);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + wp5.y.a(p.a.c(this.f212721a.hashCode() * 31, 31, this.f212722b), 31, this.f212723c)) * 31, 31, this.e);
        OnboardingTerms onboardingTerms = this.f;
        return this.f212725h.hashCode() + kii.e.c(this.f212724g, (iC + (onboardingTerms == null ? 0 : onboardingTerms.hashCode())) * 31, 31);
    }
}
