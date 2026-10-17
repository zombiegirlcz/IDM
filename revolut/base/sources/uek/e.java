package uek;

import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodNominee f279466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f279467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f279468c;

    public e(PodNominee nominee, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(nominee, "nominee");
        this.f279466a = nominee;
        this.f279467b = j2;
        this.f279468c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f279466a, eVar.f279466a) && this.f279467b == eVar.f279467b && this.f279468c == eVar.f279468c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f279468c) + a0.d.c(this.f279466a.hashCode() * 31, 31, this.f279467b);
    }
}
