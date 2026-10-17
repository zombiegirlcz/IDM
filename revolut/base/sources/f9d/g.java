package f9d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f132924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f132925c;

    public g(Data content, String entityId, boolean z) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f132923a = entityId;
        this.f132924b = content;
        this.f132925c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f132923a, gVar.f132923a) && Intrinsics.f(this.f132924b, gVar.f132924b) && this.f132925c == gVar.f132925c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f132925c) + kii.e.c(this.f132924b, this.f132923a.hashCode() * 31, 31);
    }
}
