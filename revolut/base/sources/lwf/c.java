package lwf;

import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f200448b;

    public c(Data data, String ticketTypeKey) {
        Intrinsics.checkNotNullParameter(ticketTypeKey, "ticketTypeKey");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f200447a = ticketTypeKey;
        this.f200448b = data;
    }

    public static c a(c cVar, Data data) {
        String ticketTypeKey = cVar.f200447a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(ticketTypeKey, "ticketTypeKey");
        Intrinsics.checkNotNullParameter(data, "data");
        return new c(data, ticketTypeKey);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f200447a, cVar.f200447a) && Intrinsics.f(this.f200448b, cVar.f200448b);
    }

    public final int hashCode() {
        return this.f200448b.hashCode() + (this.f200447a.hashCode() * 31);
    }
}
