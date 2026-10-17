package y4d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f310876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f310877b;

    public e(j content, Data data) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f310876a = content;
        this.f310877b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f310876a, eVar.f310876a) && Intrinsics.f(this.f310877b, eVar.f310877b);
    }

    public final int hashCode() {
        return this.f310877b.hashCode() + (this.f310876a.hashCode() * 31);
    }
}
