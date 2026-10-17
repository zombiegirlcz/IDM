package ack;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm3.l f3164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbk.l f3165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zm3.l receiver, kbk.l source) {
        super(true);
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f3164b = receiver;
        this.f3165c = source;
    }

    @Override // ack.e
    public final kbk.l a() {
        return this.f3165c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f3164b, dVar.f3164b) && this.f3165c == dVar.f3165c;
    }

    public final int hashCode() {
        return this.f3165c.hashCode() + (this.f3164b.hashCode() * 31);
    }
}
