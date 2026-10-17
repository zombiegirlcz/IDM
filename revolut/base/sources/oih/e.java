package oih;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f225688a;

    public e(d tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        this.f225688a = tab2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f225688a == ((e) obj2).f225688a;
    }

    public final int hashCode() {
        return this.f225688a.hashCode();
    }
}
