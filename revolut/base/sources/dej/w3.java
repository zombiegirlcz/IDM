package dej;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f113684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f113685b;

    public w3(ArrayList subscriptions, ArrayList mobilePlans) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(mobilePlans, "mobilePlans");
        this.f113684a = subscriptions;
        this.f113685b = mobilePlans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj2;
        return this.f113684a.equals(w3Var.f113684a) && this.f113685b.equals(w3Var.f113685b);
    }

    public final int hashCode() {
        return this.f113685b.hashCode() + (this.f113684a.hashCode() * 31);
    }
}
