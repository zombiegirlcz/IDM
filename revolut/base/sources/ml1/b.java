package ml1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qx1.e;
import qx1.j;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Lml1/b;", "", "", "toString", "()Ljava/lang/String;", "Lqx1/j;", "a", "Lqx1/j;", "c", "()Lqx1/j;", "contact", "b", "Ljava/lang/String;", "beneficiaryId", "getState", "state", "Lqx1/e;", "d", "Lqx1/e;", "()Lqx1/e;", "attributeBag", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("contact")
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
    private final e attributeBag;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getAttributeBag() {
        return this.attributeBag;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBeneficiaryId() {
        return this.beneficiaryId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j getContact() {
        return this.contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.contact, bVar.contact) && Intrinsics.f(this.beneficiaryId, bVar.beneficiaryId) && Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.attributeBag, bVar.attributeBag);
    }

    public final int hashCode() {
        j jVar = this.contact;
        int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        String str = this.beneficiaryId;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.state);
        e eVar = this.attributeBag;
        return iC + (eVar != null ? eVar.hashCode() : 0);
    }
}
