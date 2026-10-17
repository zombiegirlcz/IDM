package ro8;

import com.revolut.feature.junior_settings.impl.ui_kompot.phone_removal_confirmation.PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod f255938c;

    public e(String juniorId, String juniorFirstName, PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod phoneNumberRemovalMethod) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(phoneNumberRemovalMethod, "phoneNumberRemovalMethod");
        this.f255936a = juniorId;
        this.f255937b = juniorFirstName;
        this.f255938c = phoneNumberRemovalMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f255936a, eVar.f255936a) && Intrinsics.f(this.f255937b, eVar.f255937b) && Intrinsics.f(this.f255938c, eVar.f255938c);
    }

    public final int hashCode() {
        return this.f255938c.hashCode() + p.a.c(this.f255936a.hashCode() * 31, 31, this.f255937b);
    }
}
