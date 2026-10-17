package ce8;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lce8/e;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "invitationId", "Lce8/f;", "Lce8/f;", "c", "()Lce8/f;", "junior", "Lce8/d;", "Lce8/d;", "()Lce8/d;", "guardian", "feature_junior_coparent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("invitationId")
    @NotNull
    private final String invitationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("youth")
    @NotNull
    private final f junior;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("guardian")
    @NotNull
    private final d guardian;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getGuardian() {
        return this.guardian;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInvitationId() {
        return this.invitationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getJunior() {
        return this.junior;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.invitationId, eVar.invitationId) && Intrinsics.f(this.junior, eVar.junior) && Intrinsics.f(this.guardian, eVar.guardian);
    }

    public final int hashCode() {
        return this.guardian.hashCode() + ((this.junior.hashCode() + (this.invitationId.hashCode() * 31)) * 31);
    }
}
