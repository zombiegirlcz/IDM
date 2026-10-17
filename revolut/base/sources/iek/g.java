package iek;

import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodNominee f160756a;

    public g(PodNominee podNominee) {
        Intrinsics.checkNotNullParameter(podNominee, "podNominee");
        this.f160756a = podNominee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f160756a, ((g) obj2).f160756a);
    }

    public final int hashCode() {
        return this.f160756a.hashCode();
    }
}
