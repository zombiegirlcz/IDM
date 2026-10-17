package gm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144773a;

    public e(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f144773a = institutionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f144773a, ((e) obj2).f144773a);
    }

    public final int hashCode() {
        return this.f144773a.hashCode();
    }
}
