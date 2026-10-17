package tgb;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f271145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f271146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f271147c;
    public final Integer d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f271148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f271149h;
    public final i i;

    public l(k type, j state, String str, Integer num, Instant instant, Instant instant2, Instant instant3, Instant instant4, i iVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f271145a = type;
        this.f271146b = state;
        this.f271147c = str;
        this.d = num;
        this.e = instant;
        this.f = instant2;
        this.f271148g = instant3;
        this.f271149h = instant4;
        this.i = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f271145a == lVar.f271145a && this.f271146b == lVar.f271146b && Intrinsics.f(this.f271147c, lVar.f271147c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f271148g, lVar.f271148g) && Intrinsics.f(this.f271149h, lVar.f271149h) && Intrinsics.f(this.i, lVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f271146b.hashCode() + (this.f271145a.hashCode() * 31)) * 31;
        String str = this.f271147c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Instant instant = this.e;
        int iHashCode4 = (iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f;
        int iHashCode5 = (iHashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.f271148g;
        int iHashCode6 = (iHashCode5 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        Instant instant4 = this.f271149h;
        int iHashCode7 = (iHashCode6 + (instant4 == null ? 0 : instant4.hashCode())) * 31;
        i iVar = this.i;
        return iHashCode7 + (iVar != null ? iVar.hashCode() : 0);
    }
}
