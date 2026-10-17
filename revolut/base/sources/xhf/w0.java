package xhf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0015"}, d2 = {"Lxhf/w0;", "Lxhf/g;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "e", "lastFour", "d", "label", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "disposable", "f", "pro", "credit", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w0 extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastFour")
    @NotNull
    private final String lastFour;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("disposable")
    private final Boolean disposable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pro")
    private final Boolean pro;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("credit")
    private final Boolean credit;

    @Override // xhf.g
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getCredit() {
        return this.credit;
    }

    @Override // xhf.g
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getDisposable() {
        return this.disposable;
    }

    @Override // xhf.g
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Override // xhf.g
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Override // xhf.g
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.id, w0Var.id) && Intrinsics.f(this.lastFour, w0Var.lastFour) && Intrinsics.f(this.label, w0Var.label) && Intrinsics.f(this.disposable, w0Var.disposable) && Intrinsics.f(this.pro, w0Var.pro) && Intrinsics.f(this.credit, w0Var.credit);
    }

    @Override // xhf.g
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getPro() {
        return this.pro;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.lastFour);
        String str = this.label;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disposable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.pro;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.credit;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }
}
