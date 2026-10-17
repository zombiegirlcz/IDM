package wn7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f298715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f298716b;

    public f(Data applicationForms, Data policies) {
        Intrinsics.checkNotNullParameter(applicationForms, "applicationForms");
        Intrinsics.checkNotNullParameter(policies, "policies");
        this.f298715a = applicationForms;
        this.f298716b = policies;
    }

    public static f a(f fVar, Data applicationForms, Data policies, int i) {
        if ((i & 1) != 0) {
            applicationForms = fVar.f298715a;
        }
        if ((i & 2) != 0) {
            policies = fVar.f298716b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(applicationForms, "applicationForms");
        Intrinsics.checkNotNullParameter(policies, "policies");
        return new f(applicationForms, policies);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f298715a, fVar.f298715a) && Intrinsics.f(this.f298716b, fVar.f298716b);
    }

    public final int hashCode() {
        return this.f298716b.hashCode() + (this.f298715a.hashCode() * 31);
    }
}
