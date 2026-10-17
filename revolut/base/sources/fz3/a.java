package fz3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139081a;

    public a(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.f139081a = username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f139081a, ((a) obj2).f139081a);
    }

    public final int hashCode() {
        return this.f139081a.hashCode();
    }
}
