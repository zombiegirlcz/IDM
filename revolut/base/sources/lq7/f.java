package lq7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f199194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f199195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f199196c;

    public f(Data policy, Data applicationForm, Data mtaAvailability) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
        Intrinsics.checkNotNullParameter(mtaAvailability, "mtaAvailability");
        this.f199194a = policy;
        this.f199195b = applicationForm;
        this.f199196c = mtaAvailability;
    }

    public static f a(f fVar, Data policy, Data applicationForm, Data mtaAvailability, int i) {
        if ((i & 1) != 0) {
            policy = fVar.f199194a;
        }
        if ((i & 2) != 0) {
            applicationForm = fVar.f199195b;
        }
        if ((i & 4) != 0) {
            mtaAvailability = fVar.f199196c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
        Intrinsics.checkNotNullParameter(mtaAvailability, "mtaAvailability");
        return new f(policy, applicationForm, mtaAvailability);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f199194a, fVar.f199194a) && Intrinsics.f(this.f199195b, fVar.f199195b) && Intrinsics.f(this.f199196c, fVar.f199196c);
    }

    public final int hashCode() {
        return this.f199196c.hashCode() + kii.e.c(this.f199195b, this.f199194a.hashCode() * 31, 31);
    }
}
