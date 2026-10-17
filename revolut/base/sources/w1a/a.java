package w1a;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f293812a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f293812a, ((a) obj2).f293812a);
    }

    public final int hashCode() {
        return this.f293812a.hashCode();
    }

    public a(Data statusData) {
        Intrinsics.checkNotNullParameter(statusData, "statusData");
        this.f293812a = statusData;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
