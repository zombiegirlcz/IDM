package com.revolut.feature.freelancer.impl.network.models;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/z;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "saleCurrent", "b", "saleTarget", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "volumeCurrent", "d", "volumeTarget", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("saleCurrent")
    private final int saleCurrent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("saleTarget")
    private final int saleTarget;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("volumeCurrent")
    @NotNull
    private final jo3.a volumeCurrent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("volumeTarget")
    @NotNull
    private final jo3.a volumeTarget;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getSaleCurrent() {
        return this.saleCurrent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSaleTarget() {
        return this.saleTarget;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getVolumeCurrent() {
        return this.volumeCurrent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getVolumeTarget() {
        return this.volumeTarget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.saleCurrent == zVar.saleCurrent && this.saleTarget == zVar.saleTarget && Intrinsics.f(this.volumeCurrent, zVar.volumeCurrent) && Intrinsics.f(this.volumeTarget, zVar.volumeTarget);
    }

    public final int hashCode() {
        return this.volumeTarget.hashCode() + v7.j(this.volumeCurrent, j6.a.b(this.saleTarget, Integer.hashCode(this.saleCurrent) * 31, 31), 31);
    }
}
