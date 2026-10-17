package qaj;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f244043a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f244043a, ((d) obj2).f244043a);
    }

    public final int hashCode() {
        return this.f244043a.hashCode();
    }

    public d(Data newlyAddedCrypto) {
        Intrinsics.checkNotNullParameter(newlyAddedCrypto, "newlyAddedCrypto");
        this.f244043a = newlyAddedCrypto;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
