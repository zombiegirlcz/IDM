package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f240185c;
    public final String d;
    public final DateTime e;
    public final DateTime f;

    public m(String userId, String assetTypesId, eel.c timeSpan, String currency, DateTime start, DateTime end2) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(assetTypesId, "assetTypesId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f240183a = userId;
        this.f240184b = assetTypesId;
        this.f240185c = timeSpan;
        this.d = currency;
        this.e = start;
        this.f = end2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f240183a, mVar.f240183a) && Intrinsics.f(this.f240184b, mVar.f240184b) && this.f240185c == mVar.f240185c && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + m72.b.f(this.e, p.a.c(prk.o.c(this.f240185c, p.a.c(this.f240183a.hashCode() * 31, 31, this.f240184b), 31), 31, this.d), 31);
    }
}
