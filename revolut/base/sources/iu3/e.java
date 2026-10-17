package iu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168468b;

    public e(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f168467a = title;
        this.f168468b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f168467a, eVar.f168467a) && Intrinsics.f(this.f168468b, eVar.f168468b);
    }

    public final int hashCode() {
        return this.f168468b.hashCode() + (this.f168467a.hashCode() * 31);
    }
}
