package z8d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f320070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f320071b;

    public c(Data items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f320070a = items;
        this.f320071b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f320070a, cVar.f320070a) && this.f320071b == cVar.f320071b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f320071b) + (this.f320070a.hashCode() * 31);
    }
}
