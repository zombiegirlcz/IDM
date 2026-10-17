package zw7;

import com.revolut.feature.address.models.Address;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f325758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f325759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f325760c;

    public c(Address newAddress, dj0.d refund, LocalDate cancellationDate) {
        Intrinsics.checkNotNullParameter(newAddress, "newAddress");
        Intrinsics.checkNotNullParameter(refund, "refund");
        Intrinsics.checkNotNullParameter(cancellationDate, "cancellationDate");
        this.f325758a = newAddress;
        this.f325759b = refund;
        this.f325760c = cancellationDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f325758a, cVar.f325758a) && Intrinsics.f(this.f325759b, cVar.f325759b) && Intrinsics.f(this.f325760c, cVar.f325760c);
    }

    public final int hashCode() {
        return this.f325760c.hashCode() + v7.c(this.f325758a.hashCode() * 31, 31, this.f325759b);
    }
}
