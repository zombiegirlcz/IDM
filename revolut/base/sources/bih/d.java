package bih;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15491a;

    public d(String widgetKey) {
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        this.f15491a = widgetKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f15491a, ((d) obj2).f15491a);
    }

    public final int hashCode() {
        return this.f15491a.hashCode();
    }
}
