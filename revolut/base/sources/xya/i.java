package xya;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f309686a;

    public i(Data allInvites) {
        Intrinsics.checkNotNullParameter(allInvites, "allInvites");
        this.f309686a = allInvites;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f309686a, ((i) obj2).f309686a);
    }

    public final int hashCode() {
        return this.f309686a.hashCode();
    }
}
