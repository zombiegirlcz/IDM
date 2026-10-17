package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/ranges/c;", "", "", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class c implements Iterable<Integer>, pim.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f186448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f186449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f186450c;

    /* JADX INFO: renamed from: kotlin.ranges.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/c$a;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public c(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f186448a = i;
        this.f186449b = iim.b.a(i, i2, i3);
        this.f186450c = i3;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final vim.f iterator() {
        return new vim.f(this.f186448a, this.f186449b, this.f186450c);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj2).isEmpty()) {
            return true;
        }
        c cVar = (c) obj2;
        return this.f186448a == cVar.f186448a && this.f186449b == cVar.f186449b && this.f186450c == cVar.f186450c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f186448a * 31) + this.f186449b) * 31) + this.f186450c;
    }

    public boolean isEmpty() {
        int i = this.f186450c;
        int i2 = this.f186449b;
        int i3 = this.f186448a;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    public String toString() {
        StringBuilder sb6;
        int i = this.f186449b;
        int i2 = this.f186448a;
        int i3 = this.f186450c;
        if (i3 > 0) {
            sb6 = new StringBuilder();
            sb6.append(i2);
            sb6.append("..");
            sb6.append(i);
            sb6.append(" step ");
            sb6.append(i3);
        } else {
            sb6 = new StringBuilder();
            sb6.append(i2);
            sb6.append(" downTo ");
            sb6.append(i);
            sb6.append(" step ");
            sb6.append(-i3);
        }
        return sb6.toString();
    }
}
