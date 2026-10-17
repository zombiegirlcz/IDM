package zfk;

import com.revolut.feature.checkout.models.PreorderPreconditions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f322017c;
    public final boolean d;
    public final PreorderPreconditions e;

    public b(String preorderId, String str, Long l2, boolean z, PreorderPreconditions preorderPreconditions) {
        Intrinsics.checkNotNullParameter(preorderId, "preorderId");
        this.f322015a = preorderId;
        this.f322016b = str;
        this.f322017c = l2;
        this.d = z;
        this.e = preorderPreconditions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f322015a, bVar.f322015a) && Intrinsics.f(this.f322016b, bVar.f322016b) && Intrinsics.f(this.f322017c, bVar.f322017c) && this.d == bVar.d && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f322015a.hashCode() * 31;
        String str = this.f322016b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f322017c;
        int iC = j6.a.c((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d);
        PreorderPreconditions preorderPreconditions = this.e;
        return iC + (preorderPreconditions != null ? preorderPreconditions.hashCode() : 0);
    }
}
