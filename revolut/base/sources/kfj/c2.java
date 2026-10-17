package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\f\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u0012\u0010\u001c¨\u0006\u001e"}, d2 = {"Lkfj/c2;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/c3;", "a", "Lkfj/c3;", "e", "()Lkfj/c3;", "random", "Lkfj/n1;", "b", "Lkfj/n1;", "d", "()Lkfj/n1;", "porting", "Lkfj/w;", "c", "Lkfj/w;", "()Lkfj/w;", "featured", "Lkfj/e2;", "Lkfj/e2;", "()Lkfj/e2;", "fee", "Lkfj/f2;", "Lkfj/f2;", "()Lkfj/f2;", "limits", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("random")
    private final c3 random;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("porting")
    private final n1 porting;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("featured")
    private final w featured;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fee")
    private final e2 fee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("limits")
    private final f2 limits;

    public c2(c3 c3Var, n1 n1Var, w wVar, e2 e2Var, f2 f2Var) {
        this.random = c3Var;
        this.porting = n1Var;
        this.featured = wVar;
        this.fee = e2Var;
        this.limits = f2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w getFeatured() {
        return this.featured;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e2 getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f2 getLimits() {
        return this.limits;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final n1 getPorting() {
        return this.porting;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c3 getRandom() {
        return this.random;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.random, c2Var.random) && Intrinsics.f(this.porting, c2Var.porting) && Intrinsics.f(this.featured, c2Var.featured) && Intrinsics.f(this.fee, c2Var.fee) && Intrinsics.f(this.limits, c2Var.limits);
    }

    public final int hashCode() {
        c3 c3Var = this.random;
        int iHashCode = (c3Var == null ? 0 : c3Var.hashCode()) * 31;
        n1 n1Var = this.porting;
        int iHashCode2 = (iHashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
        w wVar = this.featured;
        int iHashCode3 = (iHashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        e2 e2Var = this.fee;
        int iHashCode4 = (iHashCode3 + (e2Var == null ? 0 : e2Var.hashCode())) * 31;
        f2 f2Var = this.limits;
        return iHashCode4 + (f2Var != null ? f2Var.hashCode() : 0);
    }
}
