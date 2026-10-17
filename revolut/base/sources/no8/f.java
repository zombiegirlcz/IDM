package no8;

import com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.LogoutConfirmationControllerContract$PhoneNumberRemovalAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f217949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f217950c;
    public final LogoutConfirmationControllerContract$PhoneNumberRemovalAction d;

    public f(String juniorId, String juniorFirstName, String juniorPhoneNumber, LogoutConfirmationControllerContract$PhoneNumberRemovalAction phoneNumberRemovalAction) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(juniorPhoneNumber, "juniorPhoneNumber");
        Intrinsics.checkNotNullParameter(phoneNumberRemovalAction, "phoneNumberRemovalAction");
        this.f217948a = juniorId;
        this.f217949b = juniorFirstName;
        this.f217950c = juniorPhoneNumber;
        this.d = phoneNumberRemovalAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f217948a, fVar.f217948a) && Intrinsics.f(this.f217949b, fVar.f217949b) && Intrinsics.f(this.f217950c, fVar.f217950c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f217948a.hashCode() * 31, 31, this.f217949b), 31, this.f217950c);
    }
}
