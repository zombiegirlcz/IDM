package mf6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\t¨\u0006\u0012"}, d2 = {"Lmf6/d;", "", "", "toString", "()Ljava/lang/String;", "", "Lmf6/c;", "a", "Ljava/util/List;", "()Ljava/util/List;", "groupedConsents", "", "b", "Z", "c", "()Z", "userHasPixAutomatico", "inboundGroupedConsents", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("groupedConsents")
    @NotNull
    private final List<c> groupedConsents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("userHasPixAutomatico")
    private final boolean userHasPixAutomatico;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("inboundGroupedConsents")
    private final List<c> inboundGroupedConsents;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getGroupedConsents() {
        return this.groupedConsents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getInboundGroupedConsents() {
        return this.inboundGroupedConsents;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getUserHasPixAutomatico() {
        return this.userHasPixAutomatico;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.groupedConsents, dVar.groupedConsents) && this.userHasPixAutomatico == dVar.userHasPixAutomatico && Intrinsics.f(this.inboundGroupedConsents, dVar.inboundGroupedConsents);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.groupedConsents.hashCode() * 31, 31, this.userHasPixAutomatico);
        List<c> list = this.inboundGroupedConsents;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
