package m05;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201056b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f201052a.getDescriptor(), i, 3);
            throw null;
        }
        this.f201055a = str;
        this.f201056b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f201055a, cVar.f201055a) && Intrinsics.f(this.f201056b, cVar.f201056b);
    }

    public final int hashCode() {
        return this.f201056b.hashCode() + (this.f201055a.hashCode() * 31);
    }

    public c(String productType, String applicationId) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f201055a = productType;
        this.f201056b = applicationId;
    }
}
