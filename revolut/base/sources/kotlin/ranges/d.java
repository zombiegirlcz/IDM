package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import vim.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/ranges/d;", "", "", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class d implements Iterable<Long>, pim.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f186451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f186452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f186453c;

    /* JADX INFO: renamed from: kotlin.ranges.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/d$a;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public d(long j2, long j3, long j5) {
        if (j5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j5 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f186451a = j2;
        if (j5 > 0) {
            if (j2 < j3) {
                long j16 = j3 % j5;
                long j22 = j2 % j5;
                long j42 = ((j16 < 0 ? j16 + j5 : j16) - (j22 < 0 ? j22 + j5 : j22)) % j5;
                j3 -= j42 < 0 ? j42 + j5 : j42;
            }
        } else {
            if (j5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j2 > j3) {
                long j46 = -j5;
                long j47 = j2 % j46;
                long j57 = j3 % j46;
                long j58 = ((j47 < 0 ? j47 + j46 : j47) - (j57 < 0 ? j57 + j46 : j57)) % j46;
                j3 += j58 < 0 ? j58 + j46 : j58;
            }
        }
        this.f186452b = j3;
        this.f186453c = j5;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj2).isEmpty()) {
            return true;
        }
        d dVar = (d) obj2;
        return this.f186451a == dVar.f186451a && this.f186452b == dVar.f186452b && this.f186453c == dVar.f186453c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j2 = 31;
        long j3 = this.f186451a;
        long j5 = this.f186452b;
        long j16 = (((j3 ^ (j3 >>> 32)) * j2) + (j5 ^ (j5 >>> 32))) * j2;
        long j22 = this.f186453c;
        return (int) (j16 + (j22 ^ (j22 >>> 32)));
    }

    public boolean isEmpty() {
        long j2 = this.f186453c;
        long j3 = this.f186452b;
        long j5 = this.f186451a;
        return j2 > 0 ? j5 > j3 : j5 < j3;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new g(this.f186451a, this.f186452b, this.f186453c);
    }

    public String toString() {
        StringBuilder sb6;
        long j2 = this.f186453c;
        long j3 = this.f186452b;
        long j5 = this.f186451a;
        if (j2 > 0) {
            sb6 = new StringBuilder();
            sb6.append(j5);
            sb6.append("..");
            sb6.append(j3);
            sb6.append(" step ");
            sb6.append(j2);
        } else {
            sb6 = new StringBuilder();
            sb6.append(j5);
            sb6.append(" downTo ");
            sb6.append(j3);
            sb6.append(" step ");
            sb6.append(-j2);
        }
        return sb6.toString();
    }
}
