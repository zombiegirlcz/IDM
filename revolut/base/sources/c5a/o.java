package c5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends com.revolut.feature.payments.who_to_transfer.impl.ui.chats.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5a.a f21517a;

    public o(i5a.a aVar) {
        this.f21517a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f21517a, ((o) obj2).f21517a);
    }

    public final int hashCode() {
        i5a.a aVar = this.f21517a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
