package ack;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbk.a f3162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbk.l f3163c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kbk.a birthdaySharingRequestStrategy, kbk.l source) {
        super(false);
        Intrinsics.checkNotNullParameter(birthdaySharingRequestStrategy, "birthdaySharingRequestStrategy");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f3162b = birthdaySharingRequestStrategy;
        this.f3163c = source;
    }

    @Override // ack.e
    public final kbk.l a() {
        return this.f3163c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f3162b == cVar.f3162b && this.f3163c == cVar.f3163c;
    }

    public final int hashCode() {
        return this.f3163c.hashCode() + (this.f3162b.hashCode() * 31);
    }
}
