package js1;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Ljs1/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "Ljy1/a;", "b", "Ljy1/a;", "()Ljy1/a;", "bizumContact", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "amount", "d", "comment", "e", "edt", "fee", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bizumContact")
    @NotNull
    private final jy1.a bizumContact;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("comment")
    private final String comment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("edt")
    @NotNull
    private final String edt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final jo3.a fee;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jy1.a getBizumContact() {
        return this.bizumContact;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEdt() {
        return this.edt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getFee() {
        return this.fee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.id, lVar.id) && Intrinsics.f(this.bizumContact, lVar.bizumContact) && Intrinsics.f(this.amount, lVar.amount) && Intrinsics.f(this.comment, lVar.comment) && Intrinsics.f(this.edt, lVar.edt) && Intrinsics.f(this.fee, lVar.fee);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, (this.bizumContact.hashCode() + (this.id.hashCode() * 31)) * 31, 31);
        String str = this.comment;
        return this.fee.hashCode() + p.a.c((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.edt);
    }
}
