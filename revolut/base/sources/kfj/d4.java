package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkfj/d4;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/c4;", "a", "Lkfj/c4;", "()Lkfj/c4;", "pac", "Lkfj/i4;", "b", "Lkfj/i4;", "c", "()Lkfj/i4;", "stac", "Lkfj/e4;", "Lkfj/e4;", "()Lkfj/e4;", "portOutOptIn", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pac")
    private final c4 pac;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("stac")
    private final i4 stac;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("portOutOptIn")
    private final e4 portOutOptIn;

    public d4(c4 c4Var, i4 i4Var, e4 e4Var) {
        this.pac = c4Var;
        this.stac = i4Var;
        this.portOutOptIn = e4Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c4 getPac() {
        return this.pac;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e4 getPortOutOptIn() {
        return this.portOutOptIn;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i4 getStac() {
        return this.stac;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj2;
        return Intrinsics.f(this.pac, d4Var.pac) && Intrinsics.f(this.stac, d4Var.stac) && Intrinsics.f(this.portOutOptIn, d4Var.portOutOptIn);
    }

    public final int hashCode() {
        c4 c4Var = this.pac;
        int iHashCode = (c4Var == null ? 0 : c4Var.hashCode()) * 31;
        i4 i4Var = this.stac;
        int iHashCode2 = (iHashCode + (i4Var == null ? 0 : i4Var.hashCode())) * 31;
        e4 e4Var = this.portOutOptIn;
        return iHashCode2 + (e4Var != null ? e4Var.hashCode() : 0);
    }
}
