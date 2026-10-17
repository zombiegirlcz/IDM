package aeg;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f3577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3578b;

    public c() {
        this(false, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f3577a, cVar.f3577a) && this.f3578b == cVar.f3578b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3578b) + (this.f3577a.hashCode() * 31);
    }

    public c(Data selectedBed, boolean z) {
        Intrinsics.checkNotNullParameter(selectedBed, "selectedBed");
        this.f3577a = selectedBed;
        this.f3578b = z;
    }

    public /* synthetic */ c(boolean z, int i) {
        this(new Data(null, null, true, 3, null), (i & 2) != 0 ? false : z);
    }
}
