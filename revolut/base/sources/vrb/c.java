package vrb;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f291547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f291548b;

    public c() {
        this(0);
    }

    public static c a(c cVar, Data data, Set selectedHoldings, int i) {
        if ((i & 1) != 0) {
            data = cVar.f291547a;
        }
        if ((i & 2) != 0) {
            selectedHoldings = cVar.f291548b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(selectedHoldings, "selectedHoldings");
        return new c(data, selectedHoldings);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f291547a, cVar.f291547a) && Intrinsics.f(this.f291548b, cVar.f291548b);
    }

    public final int hashCode() {
        Data data = this.f291547a;
        return this.f291548b.hashCode() + ((data == null ? 0 : data.hashCode()) * 31);
    }

    public c(Data data, Set selectedHoldings) {
        Intrinsics.checkNotNullParameter(selectedHoldings, "selectedHoldings");
        this.f291547a = data;
        this.f291548b = selectedHoldings;
    }

    public c(int i) {
        this(null, h0.f322473a);
    }
}
