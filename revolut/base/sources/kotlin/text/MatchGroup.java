package kotlin.text;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MatchGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntRange f187890b;

    public MatchGroup(String value, IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f187889a = value;
        this.f187890b = range;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF187889a() {
        return this.f187889a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj2;
        return Intrinsics.f(this.f187889a, matchGroup.f187889a) && Intrinsics.f(this.f187890b, matchGroup.f187890b);
    }

    public final int hashCode() {
        return this.f187890b.hashCode() + (this.f187889a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f187889a + ", range=" + this.f187890b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
