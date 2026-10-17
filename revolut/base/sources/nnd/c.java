package nnd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f217532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f217533b;

    public c(Data data, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f217532a = data;
        this.f217533b = legalEntityContext;
    }

    public static c a(c cVar, Data data, Data legalEntityContext, int i) {
        if ((i & 1) != 0) {
            data = cVar.f217532a;
        }
        if ((i & 2) != 0) {
            legalEntityContext = cVar.f217533b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new c(data, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f217532a, cVar.f217532a) && Intrinsics.f(this.f217533b, cVar.f217533b);
    }

    public final int hashCode() {
        return this.f217533b.hashCode() + (this.f217532a.hashCode() * 31);
    }
}
