package dr7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f117092a;

    public e(Data documentsBatch) {
        Intrinsics.checkNotNullParameter(documentsBatch, "documentsBatch");
        this.f117092a = documentsBatch;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f117092a, ((e) obj2).f117092a);
    }

    public final int hashCode() {
        return this.f117092a.hashCode();
    }
}
