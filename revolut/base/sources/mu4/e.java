package mu4;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f208955a;

    public e(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f208955a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f208955a, ((e) obj2).f208955a);
    }

    public final int hashCode() {
        return this.f208955a.hashCode();
    }
}
