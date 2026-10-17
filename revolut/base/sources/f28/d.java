package f28;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f131456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f131457b;

    public d(y contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f131456a = contentType;
        this.f131457b = new Data(null, null, false, 7, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f131456a, ((d) obj2).f131456a);
    }

    @Override // f28.g
    public final Data getData() {
        return this.f131457b;
    }

    public final int hashCode() {
        return this.f131456a.hashCode();
    }
}
