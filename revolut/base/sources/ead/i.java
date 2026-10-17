package ead;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124199a;

    public i(String tabId) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        this.f124199a = tabId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f124199a, ((i) obj2).f124199a);
    }

    public final int hashCode() {
        return this.f124199a.hashCode();
    }
}
