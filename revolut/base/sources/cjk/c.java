package cjk;

import cjk.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends b.AbstractC0155b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24701a;

    public c(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f24701a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f24701a, ((c) obj2).f24701a);
    }

    public final int hashCode() {
        return this.f24701a.hashCode();
    }
}
