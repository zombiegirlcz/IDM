package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f188475b;

    public /* synthetic */ d(int i, String str, a aVar) {
        if (1 != (i & 1)) {
            qlm.j1.f(b.f188459a.getDescriptor(), i, 1);
            throw null;
        }
        this.f188474a = str;
        if ((i & 2) == 0) {
            this.f188475b = new a(null, null, null);
        } else {
            this.f188475b = aVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f188474a, dVar.f188474a) && Intrinsics.f(this.f188475b, dVar.f188475b);
    }

    public final int hashCode() {
        return this.f188475b.hashCode() + (this.f188474a.hashCode() * 31);
    }

    public d(String scanType, a extraMetadata) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(extraMetadata, "extraMetadata");
        this.f188474a = scanType;
        this.f188475b = extraMetadata;
    }
}
