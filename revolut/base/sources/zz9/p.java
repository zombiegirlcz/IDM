package zz9;

import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageType.Sticker f326622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f326623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f326624c;
    public final boolean d;

    public p(MessageType.Sticker sticker, boolean z, boolean z3, boolean z4) {
        this.f326622a = sticker;
        this.f326623b = z;
        this.f326624c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f326622a, pVar.f326622a) && this.f326623b == pVar.f326623b && this.f326624c == pVar.f326624c && this.d == pVar.d;
    }

    public final int hashCode() {
        MessageType.Sticker sticker = this.f326622a;
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c((sticker == null ? 0 : sticker.f79559b.hashCode()) * 31, 31, this.f326623b), 31, this.f326624c);
    }
}
