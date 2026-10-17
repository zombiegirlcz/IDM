package wo2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f298868b;

    public g(Data content, String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f298867a = requestId;
        this.f298868b = content;
    }

    public static g a(g gVar, Data content) {
        String requestId = gVar.f298867a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(content, "content");
        return new g(content, requestId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f298867a, gVar.f298867a) && Intrinsics.f(this.f298868b, gVar.f298868b);
    }

    public final int hashCode() {
        return this.f298868b.hashCode() + (this.f298867a.hashCode() * 31);
    }
}
