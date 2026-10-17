package dkb;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f115494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f115496c;

    public d(int i, Data onboarding, List contributionLevels) {
        Intrinsics.checkNotNullParameter(onboarding, "onboarding");
        Intrinsics.checkNotNullParameter(contributionLevels, "contributionLevels");
        this.f115494a = onboarding;
        this.f115495b = i;
        this.f115496c = contributionLevels;
    }

    public static d a(d dVar, Data onboarding, int i, List contributionLevels, int i2) {
        if ((i2 & 1) != 0) {
            onboarding = dVar.f115494a;
        }
        if ((i2 & 2) != 0) {
            i = dVar.f115495b;
        }
        if ((i2 & 4) != 0) {
            contributionLevels = dVar.f115496c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(onboarding, "onboarding");
        Intrinsics.checkNotNullParameter(contributionLevels, "contributionLevels");
        return new d(i, onboarding, contributionLevels);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f115494a, dVar.f115494a) && this.f115495b == dVar.f115495b && Intrinsics.f(this.f115496c, dVar.f115496c);
    }

    public final int hashCode() {
        return this.f115496c.hashCode() + j6.a.b(this.f115495b, this.f115494a.hashCode() * 31, 31);
    }
}
