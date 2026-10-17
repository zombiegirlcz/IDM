package pp4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f238260a;

    public i(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f238260a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f238260a, ((i) obj2).f238260a);
    }

    public final int hashCode() {
        return this.f238260a.hashCode();
    }
}
