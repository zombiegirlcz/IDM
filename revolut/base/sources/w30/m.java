package w30;

import com.revolut.chat.data.repository.chat.ChatRating;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.chat.domain.model.call.Call;
import com.revolut.chat.domain.model.call.LastCallRequest;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v30.c0;
import v30.o0;
import v30.s0;
import v30.u0;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f294092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f294093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f294094c;
    public final Instant d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f294095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ChatRating f294096h;
    public final o0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u0 f294097j;
    public final MessageAuthor k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Call f294098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f294099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LastCallRequest f294100n;
    public final UUID o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c0 f294101p;

    public m(UUID id10, s0 ticketState, Instant createdAt, Instant updatedAt, Instant instant, Instant instant2, Boolean bool, ChatRating chatRating, o0 o0Var, u0 ticketType, MessageAuthor messageAuthor, Call call, boolean z, LastCallRequest lastCallRequest, UUID uuid, c0 type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketState, "ticketState");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f294092a = id10;
        this.f294093b = ticketState;
        this.f294094c = createdAt;
        this.d = updatedAt;
        this.e = instant;
        this.f = instant2;
        this.f294095g = bool;
        this.f294096h = chatRating;
        this.i = o0Var;
        this.f294097j = ticketType;
        this.k = messageAuthor;
        this.f294098l = call;
        this.f294099m = z;
        this.f294100n = lastCallRequest;
        this.o = uuid;
        this.f294101p = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f294092a, mVar.f294092a) && this.f294093b == mVar.f294093b && Intrinsics.f(this.f294094c, mVar.f294094c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f294095g, mVar.f294095g) && Intrinsics.f(this.f294096h, mVar.f294096h) && Intrinsics.f(this.i, mVar.i) && this.f294097j == mVar.f294097j && Intrinsics.f(this.k, mVar.k) && Intrinsics.f(this.f294098l, mVar.f294098l) && this.f294099m == mVar.f294099m && Intrinsics.f(this.f294100n, mVar.f294100n) && Intrinsics.f(this.o, mVar.o) && this.f294101p == mVar.f294101p;
    }

    public final int hashCode() {
        int iG = t61.a.g(this.d, t61.a.g(this.f294094c, (this.f294093b.hashCode() + (this.f294092a.hashCode() * 31)) * 31, 31), 31);
        Instant instant = this.e;
        int iHashCode = (iG + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f;
        int iHashCode2 = (iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Boolean bool = this.f294095g;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ChatRating chatRating = this.f294096h;
        int iHashCode4 = (iHashCode3 + (chatRating == null ? 0 : chatRating.hashCode())) * 31;
        o0 o0Var = this.i;
        int iHashCode5 = (this.f294097j.hashCode() + ((iHashCode4 + (o0Var == null ? 0 : o0Var.hashCode())) * 31)) * 31;
        MessageAuthor messageAuthor = this.k;
        int iHashCode6 = (iHashCode5 + (messageAuthor == null ? 0 : messageAuthor.hashCode())) * 31;
        Call call = this.f294098l;
        int iC = j6.a.c((iHashCode6 + (call == null ? 0 : call.hashCode())) * 31, 31, this.f294099m);
        LastCallRequest lastCallRequest = this.f294100n;
        int iHashCode7 = (iC + (lastCallRequest == null ? 0 : lastCallRequest.hashCode())) * 31;
        UUID uuid = this.o;
        return this.f294101p.hashCode() + ((iHashCode7 + (uuid != null ? uuid.hashCode() : 0)) * 31);
    }
}
