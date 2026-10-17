package aek;

import aii.e;
import com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesFlowUseCase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodNomineesFlowUseCase f3594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3595b;

    public a(PodNomineesFlowUseCase podNomineesFlowUseCase, boolean z) {
        Intrinsics.checkNotNullParameter(podNomineesFlowUseCase, "podNomineesFlowUseCase");
        this.f3594a = podNomineesFlowUseCase;
        this.f3595b = z;
    }

    public final boolean b() {
        return this.f3595b;
    }

    public final PodNomineesFlowUseCase c() {
        return this.f3594a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f3594a, aVar.f3594a) && this.f3595b == aVar.f3595b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3595b) + (this.f3594a.hashCode() * 31);
    }
}
