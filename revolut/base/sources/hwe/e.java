package hwe;

import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StartUpPocket f156137a;

    public e(StartUpPocket targetPocket) {
        Intrinsics.checkNotNullParameter(targetPocket, "targetPocket");
        this.f156137a = targetPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f156137a, ((e) obj2).f156137a);
    }

    public final int hashCode() {
        return this.f156137a.hashCode();
    }
}
