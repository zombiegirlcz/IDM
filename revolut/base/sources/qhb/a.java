package qhb;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f246592b;

    public a(Data draft, String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(draft, "draft");
        this.f246591a = requestId;
        this.f246592b = draft;
    }

    public static a a(a aVar, Data draft) {
        String requestId = aVar.f246591a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(draft, "draft");
        return new a(draft, requestId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f246591a, aVar.f246591a) && Intrinsics.f(this.f246592b, aVar.f246592b);
    }

    public final int hashCode() {
        return this.f246592b.hashCode() + (this.f246591a.hashCode() * 31);
    }
}
