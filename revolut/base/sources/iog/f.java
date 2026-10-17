package iog;

import com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersonalDetails f163318a;

    public f(PersonalDetails personalDetails) {
        Intrinsics.checkNotNullParameter(personalDetails, "personalDetails");
        this.f163318a = personalDetails;
    }

    public static f a(PersonalDetails personalDetails) {
        Intrinsics.checkNotNullParameter(personalDetails, "personalDetails");
        return new f(personalDetails);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f163318a, ((f) obj2).f163318a);
    }

    public final int hashCode() {
        return this.f163318a.hashCode();
    }
}
