package x0l;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f301652a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f301652a, ((a) obj2).f301652a);
    }

    public final int hashCode() {
        return this.f301652a.hashCode();
    }

    public a(Data config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f301652a = config;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
