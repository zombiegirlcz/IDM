package ao;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f7841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f7842c;

    public e(int i, Instant instant, Instant instant2) {
        this.f7840a = i;
        this.f7841b = instant;
        this.f7842c = instant2;
    }

    public final int a() {
        return this.f7840a;
    }

    public final Instant b() {
        return this.f7842c;
    }

    public final Instant c() {
        return this.f7841b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f7840a == eVar.f7840a && Intrinsics.f(this.f7841b, eVar.f7841b) && Intrinsics.f(this.f7842c, eVar.f7842c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f7840a) * 31;
        Instant instant = this.f7841b;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f7842c;
        return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
    }
}
