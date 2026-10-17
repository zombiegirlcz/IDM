package zfk;

import com.revolut.feature.checkout.models.PreorderPreconditions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zfk.c;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends c.b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f322022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PreorderPreconditions f322023c;

    public g(String preorderId, Long l2, PreorderPreconditions preorderPreconditions) {
        Intrinsics.checkNotNullParameter(preorderId, "preorderId");
        this.f322021a = preorderId;
        this.f322022b = l2;
        this.f322023c = preorderPreconditions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f322021a, gVar.f322021a) && Intrinsics.f(this.f322022b, gVar.f322022b) && Intrinsics.f(this.f322023c, gVar.f322023c);
    }

    public final int hashCode() {
        int iHashCode = this.f322021a.hashCode() * 31;
        Long l2 = this.f322022b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        PreorderPreconditions preorderPreconditions = this.f322023c;
        return iHashCode2 + (preorderPreconditions != null ? preorderPreconditions.hashCode() : 0);
    }
}
