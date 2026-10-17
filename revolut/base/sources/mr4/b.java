package mr4;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f208050a;

    public b(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f208050a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f208050a, ((b) obj2).f208050a);
    }

    public final int hashCode() {
        return this.f208050a.hashCode();
    }
}
