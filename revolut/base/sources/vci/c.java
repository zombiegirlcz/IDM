package vci;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yci.a f287757a;

    public c(yci.a selectedFrequency) {
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        this.f287757a = selectedFrequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f287757a == ((c) obj2).f287757a;
    }

    public final int hashCode() {
        return this.f287757a.hashCode();
    }
}
