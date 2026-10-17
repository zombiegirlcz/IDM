package akf;

import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StartUpPocket f5922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartUpPocket f5923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5924c;

    public y0(StartUpPocket sourcePocket, StartUpPocket targetPocket, long j2) {
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        Intrinsics.checkNotNullParameter(targetPocket, "targetPocket");
        this.f5922a = sourcePocket;
        this.f5923b = targetPocket;
        this.f5924c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f5922a, y0Var.f5922a) && Intrinsics.f(this.f5923b, y0Var.f5923b) && this.f5924c == y0Var.f5924c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5924c) + ((this.f5923b.hashCode() + (this.f5922a.hashCode() * 31)) * 31);
    }
}
