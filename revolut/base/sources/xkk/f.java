package xkk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f306847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f306848b;

    public f(Data subscription, Data benefitsToLose) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(benefitsToLose, "benefitsToLose");
        this.f306847a = subscription;
        this.f306848b = benefitsToLose;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f306847a, fVar.f306847a) && Intrinsics.f(this.f306848b, fVar.f306848b);
    }

    public final int hashCode() {
        return this.f306848b.hashCode() + (this.f306847a.hashCode() * 31);
    }
}
