package ro8;

import com.revolut.feature.junior_settings.impl.ui_kompot.phone_removal_confirmation.PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod f255935c;

    public d(String juniorId, String juniorFirstName, PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod phoneNumberRemovalMethod) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(phoneNumberRemovalMethod, "phoneNumberRemovalMethod");
        this.f255933a = juniorId;
        this.f255934b = juniorFirstName;
        this.f255935c = phoneNumberRemovalMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f255933a, dVar.f255933a) && Intrinsics.f(this.f255934b, dVar.f255934b) && Intrinsics.f(this.f255935c, dVar.f255935c);
    }

    public final int hashCode() {
        return this.f255935c.hashCode() + p.a.c(this.f255933a.hashCode() * 31, 31, this.f255934b);
    }
}
