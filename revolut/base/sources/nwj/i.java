package nwj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lnwj/i;", "", "", "toString", "()Ljava/lang/String;", "Lnwj/h;", "a", "Lnwj/h;", "e", "()Lnwj/h;", "user", "Lnwj/g;", "b", "Lnwj/g;", "c", "()Lnwj/g;", "registeredIdentity", "Lnwj/q;", "Lnwj/q;", "d", "()Lnwj/q;", "token", "Ljava/lang/String;", "nextStep", "channel", "f", "value", "Lnwj/g1;", "g", "Lnwj/g1;", "()Lnwj/g1;", "waitlist", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("user")
    private final h user;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("registeredIdentity")
    private final g registeredIdentity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    private final q token;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("nextStep")
    private final String nextStep;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("channel")
    private final String channel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("value")
    private final String value;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("waitlist")
    private final g1 waitlist;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextStep() {
        return this.nextStep;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getRegisteredIdentity() {
        return this.registeredIdentity;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final q getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getUser() {
        return this.user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.user, iVar.user) && Intrinsics.f(this.registeredIdentity, iVar.registeredIdentity) && Intrinsics.f(this.token, iVar.token) && Intrinsics.f(this.nextStep, iVar.nextStep) && Intrinsics.f(this.channel, iVar.channel) && Intrinsics.f(this.value, iVar.value) && Intrinsics.f(this.waitlist, iVar.waitlist);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g1 getWaitlist() {
        return this.waitlist;
    }

    public final int hashCode() {
        h hVar = this.user;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        g gVar = this.registeredIdentity;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        q qVar = this.token;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str = this.nextStep;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channel;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g1 g1Var = this.waitlist;
        return iHashCode6 + (g1Var != null ? g1Var.hashCode() : 0);
    }
}
