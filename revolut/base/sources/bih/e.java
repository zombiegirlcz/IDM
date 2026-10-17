package bih;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final del.d f15493b;

    public e(String widgetKey, del.d sortOption) {
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        this.f15492a = widgetKey;
        this.f15493b = sortOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f15492a, eVar.f15492a) && this.f15493b == eVar.f15493b;
    }

    public final int hashCode() {
        return this.f15493b.hashCode() + (this.f15492a.hashCode() * 31);
    }
}
