package yff;

import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Troubleshooter f313343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransitionAnimation f313344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f313345c;
    public final String d;

    public i(Troubleshooter troubleshooter, TransitionAnimation.NONE none, boolean z, String str) {
        Intrinsics.checkNotNullParameter(troubleshooter, "troubleshooter");
        this.f313343a = troubleshooter;
        this.f313344b = none;
        this.f313345c = z;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f313343a, iVar.f313343a) && Intrinsics.f(this.f313344b, iVar.f313344b) && this.f313345c == iVar.f313345c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f313343a.hashCode() * 31;
        TransitionAnimation transitionAnimation = this.f313344b;
        int iC = j6.a.c((iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode())) * 31, 31, this.f313345c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
