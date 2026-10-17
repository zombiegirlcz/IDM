package zqc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f324452a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f324452a, ((f) obj2).f324452a);
    }

    public final int hashCode() {
        return this.f324452a.hashCode();
    }

    public f(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f324452a = data;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
