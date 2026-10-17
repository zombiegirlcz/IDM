package svi;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f265897b;

    public e(int i, ArrayList rewards) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.f265896a = i;
        this.f265897b = rewards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f265896a == eVar.f265896a && this.f265897b.equals(eVar.f265897b);
    }

    public final int hashCode() {
        return this.f265897b.hashCode() + (Integer.hashCode(this.f265896a) * 31);
    }
}
