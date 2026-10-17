package qzb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f250494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f250495b;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data onboardingData, Data legalEntityContext, int i) {
        if ((i & 1) != 0) {
            onboardingData = eVar.f250494a;
        }
        if ((i & 2) != 0) {
            legalEntityContext = eVar.f250495b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(onboardingData, "onboardingData");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new e(onboardingData, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f250494a, eVar.f250494a) && Intrinsics.f(this.f250495b, eVar.f250495b);
    }

    public final int hashCode() {
        return this.f250495b.hashCode() + (this.f250494a.hashCode() * 31);
    }

    public e(Data onboardingData, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(onboardingData, "onboardingData");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f250494a = onboardingData;
        this.f250495b = legalEntityContext;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
