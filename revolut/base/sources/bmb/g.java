package bmb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f16790a;

    public g(Data screenContent) {
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        this.f16790a = screenContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f16790a, ((g) obj2).f16790a);
    }

    public final int hashCode() {
        return this.f16790a.hashCode();
    }
}
