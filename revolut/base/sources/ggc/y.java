package ggc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143674c;
    public final q d;
    public final Integer e;
    public final a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f143675g;

    public y(String str, String str2, String str3, q channel, Integer num, a0 source, b0 sourceType) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        this.f143672a = str;
        this.f143673b = str2;
        this.f143674c = str3;
        this.d = channel;
        this.e = num;
        this.f = source;
        this.f143675g = sourceType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f143672a, yVar.f143672a) && Intrinsics.f(this.f143673b, yVar.f143673b) && Intrinsics.f(this.f143674c, yVar.f143674c) && this.d == yVar.d && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && this.f143675g == yVar.f143675g;
    }

    public final int hashCode() {
        String str = this.f143672a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f143673b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f143674c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Integer num = this.e;
        return this.f143675g.hashCode() + p.a.c((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f.f143608a);
    }
}
