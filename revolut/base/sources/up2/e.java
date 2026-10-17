package up2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f281817b;

    public e(Data content, String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f281816a = requestId;
        this.f281817b = content;
    }

    public static e a(e eVar, Data content) {
        String requestId = eVar.f281816a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(content, "content");
        return new e(content, requestId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f281816a, eVar.f281816a) && Intrinsics.f(this.f281817b, eVar.f281817b);
    }

    public final int hashCode() {
        return this.f281817b.hashCode() + (this.f281816a.hashCode() * 31);
    }
}
