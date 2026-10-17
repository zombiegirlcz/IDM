package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154891a;

    public h(String postRequestPath) {
        Intrinsics.checkNotNullParameter(postRequestPath, "postRequestPath");
        this.f154891a = postRequestPath;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f154891a, ((h) obj2).f154891a);
    }

    public final int hashCode() {
        return this.f154891a.hashCode();
    }
}
