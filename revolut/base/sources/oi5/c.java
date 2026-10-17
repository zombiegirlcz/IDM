package oi5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225452a;

    public c(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f225452a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f225452a, ((c) obj2).f225452a);
    }

    public final int hashCode() {
        return this.f225452a.hashCode();
    }
}
