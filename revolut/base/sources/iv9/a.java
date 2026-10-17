package iv9;

import com.revolut.feature.payments.messaging.data.api.model.MessageMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f168779c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f168780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f168781h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f168782j;
    public final MessageMetadata k;

    public a(String id10, String senderId, String recipientId, String str, String str2, boolean z, long j2, long j3, String status, String state, MessageMetadata messageMetadata) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f168777a = id10;
        this.f168778b = senderId;
        this.f168779c = recipientId;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.f168780g = j2;
        this.f168781h = j3;
        this.i = status;
        this.f168782j = state;
        this.k = messageMetadata;
    }

    public static a a(a aVar, String str) {
        String id10 = aVar.f168777a;
        String senderId = aVar.f168778b;
        String recipientId = aVar.f168779c;
        String str2 = aVar.e;
        boolean z = aVar.f;
        long j2 = aVar.f168780g;
        long j3 = aVar.f168781h;
        String status = aVar.i;
        String state = aVar.f168782j;
        MessageMetadata messageMetadata = aVar.k;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        return new a(id10, senderId, recipientId, str, str2, z, j2, j3, status, state, messageMetadata);
    }

    public final long b() {
        return this.f168780g;
    }

    public final String c() {
        return this.f168777a;
    }

    public final String d() {
        return this.d;
    }

    public final MessageMetadata e() {
        return this.k;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f168777a, aVar.f168777a) && Intrinsics.f(this.f168778b, aVar.f168778b) && Intrinsics.f(this.f168779c, aVar.f168779c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && this.f168780g == aVar.f168780g && this.f168781h == aVar.f168781h && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f168782j, aVar.f168782j) && Intrinsics.f(this.k, aVar.k);
    }

    public final String f() {
        return this.f168779c;
    }

    public final String g() {
        return this.f168778b;
    }

    public final String h() {
        return this.f168782j;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f168777a.hashCode() * 31, 31, this.f168778b), 31, this.f168779c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iC2 = p.a.c(p.a.c(a0.d.c(a0.d.c(j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.f168780g), 31, this.f168781h), 31, this.i), 31, this.f168782j);
        MessageMetadata messageMetadata = this.k;
        return iC2 + (messageMetadata != null ? messageMetadata.hashCode() : 0);
    }

    public final String i() {
        return this.i;
    }

    public final String j() {
        return this.e;
    }

    public final long k() {
        return this.f168781h;
    }

    public final boolean l() {
        return this.f;
    }
}
