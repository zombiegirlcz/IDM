package zt1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u001a"}, d2 = {"Lzt1/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "code", "", "c", "J", "()J", "createdAt", "d", "expiresAt", "g", "refreshAt", "", "f", "Z", "()Z", "canCopy", "origin", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("externalRef")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("t6Code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiresAt")
    private final long expiresAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("refreshAt")
    private final long refreshAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("canCopy")
    private final boolean canCopy;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("origin")
    @NotNull
    private final String origin;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanCopy() {
        return this.canCopy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.code, aVar.code) && this.createdAt == aVar.createdAt && this.expiresAt == aVar.expiresAt && this.refreshAt == aVar.refreshAt && this.canCopy == aVar.canCopy && Intrinsics.f(this.origin, aVar.origin);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getRefreshAt() {
        return this.refreshAt;
    }

    public final int hashCode() {
        return this.origin.hashCode() + j6.a.c(a0.d.c(a0.d.c(a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.code), 31, this.createdAt), 31, this.expiresAt), 31, this.refreshAt), 31, this.canCopy);
    }
}
