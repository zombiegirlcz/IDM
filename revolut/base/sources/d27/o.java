package d27;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr6.c f110760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110761b;

    public o() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f110760a == oVar.f110760a && this.f110761b == oVar.f110761b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110761b) + (this.f110760a.hashCode() * 31);
    }

    public o(lr6.c cardProcessorStatus, boolean z) {
        Intrinsics.checkNotNullParameter(cardProcessorStatus, "cardProcessorStatus");
        this.f110760a = cardProcessorStatus;
        this.f110761b = z;
    }

    public /* synthetic */ o(int i) {
        this(lr6.c.UNKNOWN, false);
    }
}
