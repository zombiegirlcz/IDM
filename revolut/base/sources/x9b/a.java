package x9b;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f303649a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f303649a, ((a) obj2).f303649a);
    }

    public final int hashCode() {
        return this.f303649a.hashCode();
    }

    public a(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f303649a = data;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
