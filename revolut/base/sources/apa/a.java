package apa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0017"}, d2 = {"Lapa/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "", "b", "Z", "c", "()Z", "email", "f", "push", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "aiCalls", "e", "inApp", "aiProactiveInsights", "feature_profile_notificationsettings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("email")
    private final boolean email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("push")
    private final boolean push;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("aiCalls")
    private final Boolean aiCalls;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("inApp")
    private final Boolean inApp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("aiProactiveInsights")
    private final Boolean aiProactiveInsights;

    public a(String id10, boolean z, boolean z3, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.email = z;
        this.push = z3;
        this.aiCalls = bool;
        this.inApp = bool2;
        this.aiProactiveInsights = bool3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getAiCalls() {
        return this.aiCalls;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAiProactiveInsights() {
        return this.aiProactiveInsights;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getInApp() {
        return this.inApp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && this.email == aVar.email && this.push == aVar.push && Intrinsics.f(this.aiCalls, aVar.aiCalls) && Intrinsics.f(this.inApp, aVar.inApp) && Intrinsics.f(this.aiProactiveInsights, aVar.aiProactiveInsights);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getPush() {
        return this.push;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.id.hashCode() * 31, 31, this.email), 31, this.push);
        Boolean bool = this.aiCalls;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.inApp;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.aiProactiveInsights;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }
}
