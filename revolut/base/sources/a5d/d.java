package a5d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f1350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f1351b;

    public d(j content, Data data) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f1350a = content;
        this.f1351b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f1350a, dVar.f1350a) && Intrinsics.f(this.f1351b, dVar.f1351b);
    }

    public final int hashCode() {
        return this.f1351b.hashCode() + (this.f1350a.f1359a.hashCode() * 31);
    }
}
