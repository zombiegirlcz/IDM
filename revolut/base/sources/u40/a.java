package u40;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import w30.n;
import w30.v;
import w30.w;
import w30.x;
import w30.y;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f276956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f276958c;
    public final Instant d;

    public a(n callRequest) {
        boolean z;
        Intrinsics.checkNotNullParameter(callRequest, "callRequest");
        this.f276956a = callRequest;
        String string = callRequest.f294102a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f276957b = string;
        Intrinsics.checkNotNullParameter(callRequest, "<this>");
        y yVar = callRequest.f294106h;
        if (yVar instanceof v) {
            z = false;
        } else {
            if (!(yVar instanceof w) && !(yVar instanceof x) && !(yVar instanceof y.a) && !(yVar instanceof y.b)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        this.f276958c = z;
        this.d = callRequest.f294104c;
    }

    @Override // u40.d
    public final String a() {
        return this.f276957b;
    }

    @Override // u40.d
    public final Instant b() {
        return this.d;
    }

    @Override // u40.d
    public final boolean c() {
        return this.f276958c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f276956a, ((a) obj2).f276956a);
    }

    public final int hashCode() {
        return this.f276956a.hashCode();
    }
}
