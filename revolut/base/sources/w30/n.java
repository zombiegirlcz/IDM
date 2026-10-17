package w30;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.chat.domain.model.call.Call;
import com.revolut.chat.domain.model.call.LastCallRequest;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v30.c0;
import v30.u0;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f294102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f294103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f294104c;
    public final Instant d;
    public final Instant e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f294105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f294106h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f294107j;
    public final InAppCallStateWithData k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Call f294108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LastCallRequest f294109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MessageAuthor f294110n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v30.s f294111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Instant f294112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final UUID f294113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f294114s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f294115t;

    public n(UUID id10, Instant createdAt, Instant updatedAt, Instant instant, Instant instant2, Boolean bool, u0 ticketType, y state, String str, boolean z, InAppCallStateWithData inAppCallStateWithData, Call call, LastCallRequest lastCallRequest, MessageAuthor messageAuthor, boolean z3, v30.s pricingPlan, Instant instant3, UUID uuid, c0 type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f294102a = id10;
        this.f294103b = createdAt;
        this.f294104c = updatedAt;
        this.d = instant;
        this.e = instant2;
        this.f = bool;
        this.f294105g = ticketType;
        this.f294106h = state;
        this.i = str;
        this.f294107j = z;
        this.k = inAppCallStateWithData;
        this.f294108l = call;
        this.f294109m = lastCallRequest;
        this.f294110n = messageAuthor;
        this.o = z3;
        this.f294111p = pricingPlan;
        this.f294112q = instant3;
        this.f294113r = uuid;
        this.f294114s = type;
        this.f294115t = ticketType == u0.InAppCallRequest;
    }

    public static n a(n nVar, InAppCallStateWithData inAppCallStateWithData, v30.s sVar, Instant instant, int i) {
        Instant instant2;
        Instant instant3;
        UUID id10 = nVar.f294102a;
        Instant createdAt = nVar.f294103b;
        Instant updatedAt = nVar.f294104c;
        Instant instant4 = nVar.d;
        Instant instant5 = nVar.e;
        Boolean bool = nVar.f;
        u0 ticketType = nVar.f294105g;
        y state = nVar.f294106h;
        String str = nVar.i;
        boolean z = (i & 512) != 0 ? nVar.f294107j : true;
        InAppCallStateWithData inAppCallStateWithData2 = (i & 1024) != 0 ? nVar.k : inAppCallStateWithData;
        Call call = nVar.f294108l;
        boolean z3 = z;
        InAppCallStateWithData inAppCallStateWithData3 = inAppCallStateWithData2;
        LastCallRequest lastCallRequest = nVar.f294109m;
        MessageAuthor messageAuthor = nVar.f294110n;
        boolean z4 = nVar.o;
        v30.s pricingPlan = (i & 32768) != 0 ? nVar.f294111p : sVar;
        if ((i & 65536) != 0) {
            instant2 = instant5;
            instant3 = nVar.f294112q;
        } else {
            instant2 = instant5;
            instant3 = instant;
        }
        UUID uuid = nVar.f294113r;
        c0 type = nVar.f294114s;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(type, "type");
        return new n(id10, createdAt, updatedAt, instant4, instant2, bool, ticketType, state, str, z3, inAppCallStateWithData3, call, lastCallRequest, messageAuthor, z4, pricingPlan, instant3, uuid, type);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f294102a, nVar.f294102a) && Intrinsics.f(this.f294103b, nVar.f294103b) && Intrinsics.f(this.f294104c, nVar.f294104c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && this.f294105g == nVar.f294105g && Intrinsics.f(this.f294106h, nVar.f294106h) && Intrinsics.f(this.i, nVar.i) && this.f294107j == nVar.f294107j && Intrinsics.f(this.k, nVar.k) && Intrinsics.f(this.f294108l, nVar.f294108l) && Intrinsics.f(this.f294109m, nVar.f294109m) && Intrinsics.f(this.f294110n, nVar.f294110n) && this.o == nVar.o && this.f294111p == nVar.f294111p && Intrinsics.f(this.f294112q, nVar.f294112q) && Intrinsics.f(this.f294113r, nVar.f294113r) && this.f294114s == nVar.f294114s;
    }

    public final int hashCode() {
        int iG = t61.a.g(this.f294104c, t61.a.g(this.f294103b, this.f294102a.hashCode() * 31, 31), 31);
        Instant instant = this.d;
        int iHashCode = (iG + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.e;
        int iHashCode2 = (iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode3 = (this.f294106h.hashCode() + ((this.f294105g.hashCode() + ((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        String str = this.i;
        int iC = j6.a.c((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f294107j);
        InAppCallStateWithData inAppCallStateWithData = this.k;
        int iHashCode4 = (iC + (inAppCallStateWithData == null ? 0 : inAppCallStateWithData.hashCode())) * 31;
        Call call = this.f294108l;
        int iHashCode5 = (iHashCode4 + (call == null ? 0 : call.hashCode())) * 31;
        LastCallRequest lastCallRequest = this.f294109m;
        int iHashCode6 = (iHashCode5 + (lastCallRequest == null ? 0 : lastCallRequest.hashCode())) * 31;
        MessageAuthor messageAuthor = this.f294110n;
        int iHashCode7 = (this.f294111p.hashCode() + j6.a.c((iHashCode6 + (messageAuthor == null ? 0 : messageAuthor.hashCode())) * 31, 31, this.o)) * 31;
        Instant instant3 = this.f294112q;
        int iHashCode8 = (iHashCode7 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        UUID uuid = this.f294113r;
        return this.f294114s.hashCode() + ((iHashCode8 + (uuid != null ? uuid.hashCode() : 0)) * 31);
    }

    public /* synthetic */ n(UUID uuid, Instant instant, Instant instant2, Instant instant3, Instant instant4, Boolean bool, u0 u0Var, y yVar, String str, Call call, LastCallRequest lastCallRequest, MessageAuthor messageAuthor, boolean z, v30.s sVar, UUID uuid2, c0 c0Var, int i) {
        this(uuid, instant, instant2, instant3, instant4, bool, u0Var, yVar, str, false, null, call, lastCallRequest, messageAuthor, z, (i & 32768) != 0 ? v30.s.NONE : sVar, null, (i & 131072) != 0 ? null : uuid2, c0Var);
    }
}
