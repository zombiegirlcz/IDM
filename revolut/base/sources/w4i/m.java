package w4i;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f294580a;

    public m(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f294580a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f294580a, ((m) obj2).f294580a);
    }

    public final int hashCode() {
        return this.f294580a.hashCode();
    }
}
