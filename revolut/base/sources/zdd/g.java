package zdd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lzdd/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "name", "b", "getCurrency", "currency", "", "c", "J", "getGoalAmount", "()J", "goalAmount", "d", "getProductId", "productId", "e", "Ljava/lang/Long;", "getDeadline", "()Ljava/lang/Long;", "deadline", "", "Lzdd/m;", "f", "Ljava/util/List;", "getInvitedMembers", "()Ljava/util/List;", "invitedMembers", "g", "getOwnerId", "ownerId", "h", "getScope", "scope", "Lzdd/e;", "i", "Lzdd/e;", "getChallenge", "()Lzdd/e;", "challenge", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("goal")
    private final long goalAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("productId")
    private final String productId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("deadline")
    private final Long deadline;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("invitedMembers")
    private final List<m> invitedMembers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("ownerId")
    private final String ownerId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("scope")
    private final String scope;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("challenge")
    private final e challenge;

    public g(String name, String currency, String str, ArrayList arrayList, String str2, String str3, e eVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.name = name;
        this.currency = currency;
        this.goalAmount = 0L;
        this.productId = str;
        this.deadline = null;
        this.invitedMembers = arrayList;
        this.ownerId = str2;
        this.scope = str3;
        this.challenge = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.name, gVar.name) && Intrinsics.f(this.currency, gVar.currency) && this.goalAmount == gVar.goalAmount && Intrinsics.f(this.productId, gVar.productId) && Intrinsics.f(this.deadline, gVar.deadline) && Intrinsics.f(this.invitedMembers, gVar.invitedMembers) && Intrinsics.f(this.ownerId, gVar.ownerId) && Intrinsics.f(this.scope, gVar.scope) && Intrinsics.f(this.challenge, gVar.challenge);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(this.name.hashCode() * 31, 31, this.currency), 31, this.goalAmount);
        String str = this.productId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.deadline;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<m> list = this.invitedMembers;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.ownerId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scope;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        e eVar = this.challenge;
        return iHashCode5 + (eVar != null ? eVar.hashCode() : 0);
    }
}
