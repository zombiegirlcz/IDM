package ajh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f5575a;

    public f() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f5575a, ((f) obj2).f5575a);
    }

    public final int hashCode() {
        Data data = this.f5575a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public f(Data data) {
        this.f5575a = data;
    }
}
