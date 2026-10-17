package kotlin.collections;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndexedValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f186391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f186392b;

    public IndexedValue(int i, Object obj2) {
        this.f186391a = i;
        this.f186392b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj2;
        return this.f186391a == indexedValue.f186391a && Intrinsics.f(this.f186392b, indexedValue.f186392b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f186391a) * 31;
        Object obj2 = this.f186392b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f186391a + ", value=" + this.f186392b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
