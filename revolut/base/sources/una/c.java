package una;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f281378a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f281378a, ((c) obj2).f281378a);
    }

    public final int hashCode() {
        return this.f281378a.hashCode();
    }

    public c(Data consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        this.f281378a = consent;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
