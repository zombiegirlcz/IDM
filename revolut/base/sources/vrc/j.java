package vrc;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f291576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291577b;

    public j(boolean z, String buttonTag) {
        Intrinsics.checkNotNullParameter(buttonTag, "buttonTag");
        this.f291576a = z;
        this.f291577b = buttonTag;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f291576a == jVar.f291576a && Intrinsics.f(this.f291577b, jVar.f291577b);
    }

    public final int hashCode() {
        return this.f291577b.hashCode() + (Boolean.hashCode(this.f291576a) * 31);
    }
}
