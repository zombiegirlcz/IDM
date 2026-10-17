package rz1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lrz1/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "moneyRequestId", "b", "contactId", "Ljy1/a;", "Ljy1/a;", "()Ljy1/a;", "bizumContact", "Lrz1/g;", "d", "Lrz1/g;", "()Lrz1/g;", "wero", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("moneyRequestId")
    @NotNull
    private final String moneyRequestId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactId")
    @NotNull
    private final String contactId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("bizumContact")
    private final jy1.a bizumContact;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("WERO")
    private final g wero;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jy1.a getBizumContact() {
        return this.bizumContact;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContactId() {
        return this.contactId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMoneyRequestId() {
        return this.moneyRequestId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getWero() {
        return this.wero;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.moneyRequestId, fVar.moneyRequestId) && Intrinsics.f(this.contactId, fVar.contactId) && Intrinsics.f(this.bizumContact, fVar.bizumContact) && Intrinsics.f(this.wero, fVar.wero);
    }

    public final int hashCode() {
        int iC = p.a.c(this.moneyRequestId.hashCode() * 31, 31, this.contactId);
        jy1.a aVar = this.bizumContact;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        g gVar = this.wero;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }
}
