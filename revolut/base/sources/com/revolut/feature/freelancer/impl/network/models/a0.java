package com.revolut.feature.freelancer.impl.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/a0;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/freelancer/impl/network/models/z;", "a", "Lcom/revolut/feature/freelancer/impl/network/models/z;", "b", "()Lcom/revolut/feature/freelancer/impl/network/models/z;", "online", "inPerson", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("online")
    @NotNull
    private final z online;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("inPerson")
    private final z inPerson;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z getInPerson() {
        return this.inPerson;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final z getOnline() {
        return this.online;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.online, a0Var.online) && Intrinsics.f(this.inPerson, a0Var.inPerson);
    }

    public final int hashCode() {
        int iHashCode = this.online.hashCode() * 31;
        z zVar = this.inPerson;
        return iHashCode + (zVar == null ? 0 : zVar.hashCode());
    }
}
