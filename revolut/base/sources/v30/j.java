package v30;

import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.data.repository.chat.ChatRating;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.chat.domain.model.LastMessage;
import com.revolut.chat.domain.model.call.Call;
import com.revolut.chat.domain.model.call.LastCallRequest;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f285785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f285786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f285787c;
    public final String d;
    public final s0 e;
    public final u0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0 f285788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MessageAuthor f285789h;
    public final ChatRating i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LastMessage f285790j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UUID f285791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Instant f285792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Instant f285793n;
    public final Instant o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Instant f285794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f285795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f285796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f285797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f285798t;
    public final boolean u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Call f285799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LastCallRequest f285800x;

    public j(UUID ticketId, UUID uuid, c0 feedType, String str, s0 ticketState, u0 ticketType, o0 o0Var, MessageAuthor agent, ChatRating rating, LastMessage lastMessage, int i, UUID uuid2, Instant createdAt, Instant updatedAt, Instant instant, Instant instant2, Boolean bool, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, Call call, LastCallRequest lastCallRequest) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Intrinsics.checkNotNullParameter(ticketState, "ticketState");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        Intrinsics.checkNotNullParameter(agent, "agent");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f285785a = ticketId;
        this.f285786b = uuid;
        this.f285787c = feedType;
        this.d = str;
        this.e = ticketState;
        this.f = ticketType;
        this.f285788g = o0Var;
        this.f285789h = agent;
        this.i = rating;
        this.f285790j = lastMessage;
        this.k = i;
        this.f285791l = uuid2;
        this.f285792m = createdAt;
        this.f285793n = updatedAt;
        this.o = instant;
        this.f285794p = instant2;
        this.f285795q = bool;
        this.f285796r = z;
        this.f285797s = z3;
        this.f285798t = z4;
        this.u = z6;
        this.v = z11;
        this.f285799w = call;
        this.f285800x = lastCallRequest;
    }

    public static j a(j jVar, s0 s0Var, int i) {
        UUID ticketId = jVar.f285785a;
        UUID uuid = jVar.f285786b;
        c0 feedType = jVar.f285787c;
        String str = jVar.d;
        s0 ticketState = (i & 16) != 0 ? jVar.e : s0Var;
        u0 ticketType = jVar.f;
        o0 o0Var = jVar.f285788g;
        MessageAuthor agent = jVar.f285789h;
        ChatRating rating = jVar.i;
        LastMessage lastMessage = jVar.f285790j;
        int i2 = (i & 1024) != 0 ? jVar.k : 0;
        UUID uuid2 = (i & 2048) != 0 ? jVar.f285791l : null;
        Instant createdAt = jVar.f285792m;
        Instant updatedAt = jVar.f285793n;
        Instant instant = jVar.o;
        UUID uuid3 = uuid2;
        Instant instant2 = jVar.f285794p;
        Boolean bool = jVar.f285795q;
        boolean z = jVar.f285796r;
        boolean z3 = jVar.f285797s;
        boolean z4 = jVar.f285798t;
        boolean z6 = jVar.u;
        boolean z11 = jVar.v;
        Call call = jVar.f285799w;
        LastCallRequest lastCallRequest = jVar.f285800x;
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Intrinsics.checkNotNullParameter(ticketState, "ticketState");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        Intrinsics.checkNotNullParameter(agent, "agent");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new j(ticketId, uuid, feedType, str, ticketState, ticketType, o0Var, agent, rating, lastMessage, i2, uuid3, createdAt, updatedAt, instant, instant2, bool, z, z3, z4, z6, z11, call, lastCallRequest);
    }

    public final MessageAuthor b() {
        return this.f285789h;
    }

    public final UUID c() {
        MessageAuthor messageAuthor = this.f285789h;
        ChatAgent chatAgent = messageAuthor instanceof ChatAgent ? (ChatAgent) messageAuthor : null;
        if (chatAgent != null) {
            return chatAgent.getId();
        }
        return null;
    }

    public final o0 d() {
        return this.f285788g;
    }

    public final Instant e() {
        return this.f285792m;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f285785a, jVar.f285785a) && Intrinsics.f(this.f285786b, jVar.f285786b) && this.f285787c == jVar.f285787c && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f && Intrinsics.f(this.f285788g, jVar.f285788g) && Intrinsics.f(this.f285789h, jVar.f285789h) && Intrinsics.f(this.i, jVar.i) && Intrinsics.f(this.f285790j, jVar.f285790j) && this.k == jVar.k && Intrinsics.f(this.f285791l, jVar.f285791l) && Intrinsics.f(this.f285792m, jVar.f285792m) && Intrinsics.f(this.f285793n, jVar.f285793n) && Intrinsics.f(this.o, jVar.o) && Intrinsics.f(this.f285794p, jVar.f285794p) && Intrinsics.f(this.f285795q, jVar.f285795q) && this.f285796r == jVar.f285796r && this.f285797s == jVar.f285797s && this.f285798t == jVar.f285798t && this.u == jVar.u && this.v == jVar.v && Intrinsics.f(this.f285799w, jVar.f285799w) && Intrinsics.f(this.f285800x, jVar.f285800x);
    }

    public final Instant f() {
        return this.o;
    }

    public final Instant g() {
        return this.f285794p;
    }

    public final UUID h() {
        return this.f285786b;
    }

    public final int hashCode() {
        int iHashCode = this.f285785a.hashCode() * 31;
        UUID uuid = this.f285786b;
        int iHashCode2 = (this.f285787c.hashCode() + ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31)) * 31;
        String str = this.d;
        int iHashCode3 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        o0 o0Var = this.f285788g;
        int iHashCode4 = (this.i.hashCode() + v1.c.a(this.f285789h, (iHashCode3 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31)) * 31;
        LastMessage lastMessage = this.f285790j;
        int iB = j6.a.b(this.k, (iHashCode4 + (lastMessage == null ? 0 : lastMessage.hashCode())) * 31, 31);
        UUID uuid2 = this.f285791l;
        int iG = t61.a.g(this.f285793n, t61.a.g(this.f285792m, (iB + (uuid2 == null ? 0 : uuid2.hashCode())) * 31, 31), 31);
        Instant instant = this.o;
        int iHashCode5 = (iG + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f285794p;
        int iHashCode6 = (iHashCode5 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Boolean bool = this.f285795q;
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f285796r), 31, this.f285797s), 31, this.f285798t), 31, this.u), 31, this.v);
        Call call = this.f285799w;
        int iHashCode7 = (iC + (call == null ? 0 : call.hashCode())) * 31;
        LastCallRequest lastCallRequest = this.f285800x;
        return iHashCode7 + (lastCallRequest != null ? lastCallRequest.hashCode() : 0);
    }

    public final c0 i() {
        return this.f285787c;
    }

    public final UUID j() {
        return this.f285791l;
    }

    public final Call k() {
        return this.f285799w;
    }

    public final LastCallRequest l() {
        return this.f285800x;
    }

    public final LastMessage m() {
        return this.f285790j;
    }

    public final ChatRating n() {
        return this.i;
    }

    public final UUID o() {
        return this.f285785a;
    }

    public final s0 p() {
        return this.e;
    }

    public final u0 q() {
        return this.f;
    }

    public final String r() {
        return this.d;
    }

    public final int s() {
        return this.k;
    }

    public final Instant t() {
        return this.f285793n;
    }

    public final boolean u() {
        return this.v;
    }

    public final boolean v() {
        return this.u;
    }

    public final boolean w() {
        return this.f285797s;
    }

    public final Boolean x() {
        return this.f285795q;
    }

    public final boolean y() {
        return this.f285796r;
    }
}
