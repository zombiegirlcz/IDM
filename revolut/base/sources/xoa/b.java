package xoa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Lxoa/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "getEmail", "()Z", "email", "b", "getPush", "push", "c", "Ljava/lang/Boolean;", "getAiCalls", "()Ljava/lang/Boolean;", "aiCalls", "d", "getInApp", "inApp", "e", "getAiProactiveInsights", "aiProactiveInsights", "feature_profile_notificationsettings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("email")
    private final boolean email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("push")
    private final boolean push;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("aiCalls")
    private final Boolean aiCalls;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("inApp")
    private final Boolean inApp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("aiProactiveInsights")
    private final Boolean aiProactiveInsights;

    public b(boolean z, boolean z3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.email = z;
        this.push = z3;
        this.aiCalls = bool;
        this.inApp = bool2;
        this.aiProactiveInsights = bool3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.email == bVar.email && this.push == bVar.push && Intrinsics.f(this.aiCalls, bVar.aiCalls) && Intrinsics.f(this.inApp, bVar.inApp) && Intrinsics.f(this.aiProactiveInsights, bVar.aiProactiveInsights);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.email) * 31, 31, this.push);
        Boolean bool = this.aiCalls;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.inApp;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.aiProactiveInsights;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }
}
