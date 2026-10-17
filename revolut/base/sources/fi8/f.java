package fi8;

import com.revolut.data.model.Data;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f135345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f135346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f135347c;
    public final Map d;

    public f(Data user, Data onboardingTerms, Set checkedIds, Map consentsState) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(onboardingTerms, "onboardingTerms");
        Intrinsics.checkNotNullParameter(checkedIds, "checkedIds");
        Intrinsics.checkNotNullParameter(consentsState, "consentsState");
        this.f135345a = user;
        this.f135346b = onboardingTerms;
        this.f135347c = checkedIds;
        this.d = consentsState;
    }

    public static f a(f fVar, Data user, Data onboardingTerms, Set checkedIds, Map consentsState, int i) {
        if ((i & 1) != 0) {
            user = fVar.f135345a;
        }
        if ((i & 2) != 0) {
            onboardingTerms = fVar.f135346b;
        }
        if ((i & 4) != 0) {
            checkedIds = fVar.f135347c;
        }
        if ((i & 8) != 0) {
            consentsState = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(onboardingTerms, "onboardingTerms");
        Intrinsics.checkNotNullParameter(checkedIds, "checkedIds");
        Intrinsics.checkNotNullParameter(consentsState, "consentsState");
        return new f(user, onboardingTerms, checkedIds, consentsState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f135345a, fVar.f135345a) && Intrinsics.f(this.f135346b, fVar.f135346b) && Intrinsics.f(this.f135347c, fVar.f135347c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.f(kii.e.c(this.f135346b, this.f135345a.hashCode() * 31, 31), 31, this.f135347c);
    }
}
