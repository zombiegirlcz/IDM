package ijj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f161807a;

    public f(Data cancellationQuote) {
        Intrinsics.checkNotNullParameter(cancellationQuote, "cancellationQuote");
        this.f161807a = cancellationQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f161807a, ((f) obj2).f161807a);
    }

    public final int hashCode() {
        return this.f161807a.hashCode();
    }
}
