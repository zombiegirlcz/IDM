package rr4;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f256686a;

    public h(LinkedHashMap documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f256686a = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f256686a.equals(((h) obj2).f256686a);
    }

    public final int hashCode() {
        return this.f256686a.hashCode();
    }
}
