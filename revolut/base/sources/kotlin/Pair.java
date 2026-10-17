package kotlin;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Pair<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f186385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f186386b;

    public Pair(Object obj2, Object obj3) {
        this.f186385a = obj2;
        this.f186386b = obj3;
    }

    public static Pair a(Pair pair, Integer num, Serializable serializable, int i) {
        Object obj2 = num;
        if ((i & 1) != 0) {
            obj2 = pair.f186385a;
        }
        Object obj3 = serializable;
        if ((i & 2) != 0) {
            obj3 = pair.f186386b;
        }
        pair.getClass();
        return new Pair(obj2, obj3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getF186385a() {
        return this.f186385a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getF186386b() {
        return this.f186386b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj2;
        return Intrinsics.f(this.f186385a, pair.f186385a) && Intrinsics.f(this.f186386b, pair.f186386b);
    }

    public final int hashCode() {
        Object obj2 = this.f186385a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f186386b;
        return iHashCode + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f186385a + ", " + this.f186386b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
