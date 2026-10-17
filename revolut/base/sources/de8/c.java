package de8;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lde8/c;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "invitationId", "b", "c", "ownerFirstName", "d", "ownerLastName", "juniorFirstName", "feature_junior_coparent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("invitationId")
    @NotNull
    private final String invitationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ownerFirstName")
    @NotNull
    private final String ownerFirstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ownerLastName")
    @NotNull
    private final String ownerLastName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("juniorFirstName")
    @NotNull
    private final String juniorFirstName;

    public c(String invitationId, String ownerFirstName, String ownerLastName, String juniorFirstName) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        Intrinsics.checkNotNullParameter(ownerFirstName, "ownerFirstName");
        Intrinsics.checkNotNullParameter(ownerLastName, "ownerLastName");
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        this.invitationId = invitationId;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.juniorFirstName = juniorFirstName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInvitationId() {
        return this.invitationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getJuniorFirstName() {
        return this.juniorFirstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOwnerLastName() {
        return this.ownerLastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.invitationId, cVar.invitationId) && Intrinsics.f(this.ownerFirstName, cVar.ownerFirstName) && Intrinsics.f(this.ownerLastName, cVar.ownerLastName) && Intrinsics.f(this.juniorFirstName, cVar.juniorFirstName);
    }

    public final int hashCode() {
        return this.juniorFirstName.hashCode() + p.a.c(p.a.c(this.invitationId.hashCode() * 31, 31, this.ownerFirstName), 31, this.ownerLastName);
    }
}
