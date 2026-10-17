package pjh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236776a;

    public c(String widgetKey) {
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        this.f236776a = widgetKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f236776a, ((c) obj2).f236776a);
    }

    public final int hashCode() {
        return this.f236776a.hashCode();
    }
}
