package wxe;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f300928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f300929c;

    public x(dj0.d limitPerTransfer, dj0.d limitPerMonth, String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(limitPerTransfer, "limitPerTransfer");
        Intrinsics.checkNotNullParameter(limitPerMonth, "limitPerMonth");
        this.f300927a = institutionId;
        this.f300928b = limitPerTransfer;
        this.f300929c = limitPerMonth;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f300927a, xVar.f300927a) && Intrinsics.f(this.f300928b, xVar.f300928b) && Intrinsics.f(this.f300929c, xVar.f300929c);
    }

    public final int hashCode() {
        return this.f300929c.hashCode() + v7.c(this.f300927a.hashCode() * 31, 31, this.f300928b);
    }
}
