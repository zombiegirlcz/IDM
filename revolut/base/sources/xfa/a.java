package xfa;

import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f305202a;

    public a(LinkedHashMap metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f305202a = metadata;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f305202a, ((a) obj2).f305202a);
    }

    public final int hashCode() {
        return this.f305202a.hashCode();
    }
}
