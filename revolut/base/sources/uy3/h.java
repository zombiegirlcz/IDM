package uy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f284066b;

    public h(String text, g action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f284065a = text;
        this.f284066b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f284065a, hVar.f284065a) && this.f284066b == hVar.f284066b;
    }

    public final int hashCode() {
        return this.f284066b.hashCode() + (this.f284065a.hashCode() * 31);
    }
}
