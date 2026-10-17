package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details;

import cli.j;
import com.revolut.data.model.Data;
import kii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77055c;
    public final JuniorPersonalDetailsScreenContract$DateOfBirthStatus d;
    public final bj0.b e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f77056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f77057h;
    public final boolean i;

    public a(String firstName, String firstLastName, String secondLastName, JuniorPersonalDetailsScreenContract$DateOfBirthStatus dobStatus, bj0.b bVar, Data planConfigurationData, Data parentBirthDateData, Data onboardingConfiguration, boolean z) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(firstLastName, "firstLastName");
        Intrinsics.checkNotNullParameter(secondLastName, "secondLastName");
        Intrinsics.checkNotNullParameter(dobStatus, "dobStatus");
        Intrinsics.checkNotNullParameter(planConfigurationData, "planConfigurationData");
        Intrinsics.checkNotNullParameter(parentBirthDateData, "parentBirthDateData");
        Intrinsics.checkNotNullParameter(onboardingConfiguration, "onboardingConfiguration");
        this.f77053a = firstName;
        this.f77054b = firstLastName;
        this.f77055c = secondLastName;
        this.d = dobStatus;
        this.e = bVar;
        this.f = planConfigurationData;
        this.f77056g = parentBirthDateData;
        this.f77057h = onboardingConfiguration;
        this.i = z;
    }

    public static a a(a aVar, String str, String str2, String str3, JuniorPersonalDetailsScreenContract$DateOfBirthStatus juniorPersonalDetailsScreenContract$DateOfBirthStatus, bj0.b bVar, Data data, Data data2, Data data3, boolean z, int i) {
        if ((i & 1) != 0) {
            str = aVar.f77053a;
        }
        String firstName = str;
        if ((i & 2) != 0) {
            str2 = aVar.f77054b;
        }
        String firstLastName = str2;
        if ((i & 4) != 0) {
            str3 = aVar.f77055c;
        }
        String secondLastName = str3;
        if ((i & 8) != 0) {
            juniorPersonalDetailsScreenContract$DateOfBirthStatus = aVar.d;
        }
        JuniorPersonalDetailsScreenContract$DateOfBirthStatus dobStatus = juniorPersonalDetailsScreenContract$DateOfBirthStatus;
        if ((i & 16) != 0) {
            bVar = aVar.e;
        }
        bj0.b bVar2 = bVar;
        Data planConfigurationData = (i & 32) != 0 ? aVar.f : data;
        Data parentBirthDateData = (i & 64) != 0 ? aVar.f77056g : data2;
        Data onboardingConfiguration = (i & 128) != 0 ? aVar.f77057h : data3;
        boolean z3 = (i & 256) != 0 ? aVar.i : z;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(firstLastName, "firstLastName");
        Intrinsics.checkNotNullParameter(secondLastName, "secondLastName");
        Intrinsics.checkNotNullParameter(dobStatus, "dobStatus");
        Intrinsics.checkNotNullParameter(planConfigurationData, "planConfigurationData");
        Intrinsics.checkNotNullParameter(parentBirthDateData, "parentBirthDateData");
        Intrinsics.checkNotNullParameter(onboardingConfiguration, "onboardingConfiguration");
        return new a(firstName, firstLastName, secondLastName, dobStatus, bVar2, planConfigurationData, parentBirthDateData, onboardingConfiguration, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f77053a, aVar.f77053a) && Intrinsics.f(this.f77054b, aVar.f77054b) && Intrinsics.f(this.f77055c, aVar.f77055c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f77056g, aVar.f77056g) && Intrinsics.f(this.f77057h, aVar.f77057h) && this.i == aVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f77053a.hashCode() * 31, 31, this.f77054b), 31, this.f77055c)) * 31;
        bj0.b bVar = this.e;
        return Boolean.hashCode(this.i) + e.c(this.f77057h, e.c(this.f77056g, e.c(this.f, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31), 31), 31);
    }
}
