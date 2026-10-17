package gdd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lgdd/c;", "", "", "toString", "()Ljava/lang/String;", "Lgdd/a;", "a", "Lgdd/a;", "c", "()Lgdd/a;", "registeredIdentity", "Lgdd/j;", "b", "Lgdd/j;", "d", "()Lgdd/j;", "token", "Ljava/lang/String;", "nextStep", "channel", "e", "value", "Lgdd/k;", "f", "Lgdd/k;", "()Lgdd/k;", "waitlist", "feature_shared_signin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("registeredIdentity")
    private final a registeredIdentity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    private final j token;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextStep")
    private final String nextStep;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("channel")
    private final String channel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("value")
    private final String value;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("waitlist")
    private final k waitlist;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextStep() {
        return this.nextStep;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getRegisteredIdentity() {
        return this.registeredIdentity;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.registeredIdentity, cVar.registeredIdentity) && Intrinsics.f(this.token, cVar.token) && Intrinsics.f(this.nextStep, cVar.nextStep) && Intrinsics.f(this.channel, cVar.channel) && Intrinsics.f(this.value, cVar.value) && Intrinsics.f(this.waitlist, cVar.waitlist);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getWaitlist() {
        return this.waitlist;
    }

    public final int hashCode() {
        a aVar = this.registeredIdentity;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        j jVar = this.token;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str = this.nextStep;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channel;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        k kVar = this.waitlist;
        return iHashCode5 + (kVar != null ? kVar.hashCode() : 0);
    }
}
