package cm9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f25169a;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f25169a, ((g) obj2).f25169a);
    }

    public final int hashCode() {
        return this.f25169a.hashCode();
    }

    public g(Data settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f25169a = settings;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
