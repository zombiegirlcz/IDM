package ux4;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f283863b = new b(f0.f322471a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f283864a;

    public b(List documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f283864a = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f283864a, ((b) obj2).f283864a);
    }

    public final int hashCode() {
        return this.f283864a.hashCode();
    }
}
