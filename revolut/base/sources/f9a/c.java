package f9a;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f132877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f132878b;

    public c() {
        this(0);
    }

    public static c a(c cVar, boolean z, Data hasDocumentKeyRegistered, int i) {
        if ((i & 1) != 0) {
            z = cVar.f132877a;
        }
        if ((i & 2) != 0) {
            hasDocumentKeyRegistered = cVar.f132878b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(hasDocumentKeyRegistered, "hasDocumentKeyRegistered");
        return new c(hasDocumentKeyRegistered, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f132877a == cVar.f132877a && Intrinsics.f(this.f132878b, cVar.f132878b);
    }

    public final int hashCode() {
        return this.f132878b.hashCode() + (Boolean.hashCode(this.f132877a) * 31);
    }

    public c(Data hasDocumentKeyRegistered, boolean z) {
        Intrinsics.checkNotNullParameter(hasDocumentKeyRegistered, "hasDocumentKeyRegistered");
        this.f132877a = z;
        this.f132878b = hasDocumentKeyRegistered;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, true, 3, null), true);
    }
}
