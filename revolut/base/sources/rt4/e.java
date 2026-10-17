package rt4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f257170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f257171b;

    public e(Data content, dj0.d approvedLimit) {
        Intrinsics.checkNotNullParameter(approvedLimit, "approvedLimit");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f257170a = approvedLimit;
        this.f257171b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f257170a, eVar.f257170a) && Intrinsics.f(this.f257171b, eVar.f257171b);
    }

    public final int hashCode() {
        return this.f257171b.hashCode() + (this.f257170a.hashCode() * 31);
    }
}
