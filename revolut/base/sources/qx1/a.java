package qx1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0005R\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u0005R\u001c\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u0016"}, d2 = {"Lqx1/a;", "T", "", "", "toString", "()Ljava/lang/String;", "Lqx1/j;", "a", "Lqx1/j;", "d", "()Lqx1/j;", "contact", "b", "Ljava/lang/String;", "c", "beneficiaryId", "e", "state", "Ljava/lang/Object;", "()Ljava/lang/Object;", "attributeBag", "aliasResolutionId", "feature_apm_core_contacts_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("contact")
    @NotNull
    private final j contact;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("beneficiaryId")
    private final String beneficiaryId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("attributeBag")
    private final T attributeBag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("aliasResolutionId")
    private final String aliasResolutionId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAliasResolutionId() {
        return this.aliasResolutionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getAttributeBag() {
        return this.attributeBag;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBeneficiaryId() {
        return this.beneficiaryId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getContact() {
        return this.contact;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.contact, aVar.contact) && Intrinsics.f(this.beneficiaryId, aVar.beneficiaryId) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.attributeBag, aVar.attributeBag) && Intrinsics.f(this.aliasResolutionId, aVar.aliasResolutionId);
    }

    public final int hashCode() {
        int iHashCode = this.contact.hashCode() * 31;
        String str = this.beneficiaryId;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.state);
        T t2 = this.attributeBag;
        int iHashCode2 = (iC + (t2 == null ? 0 : t2.hashCode())) * 31;
        String str2 = this.aliasResolutionId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
