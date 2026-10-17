package owf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f230443a;

    public h(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f230443a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f230443a, ((h) obj2).f230443a);
    }

    public final int hashCode() {
        return this.f230443a.hashCode();
    }
}
