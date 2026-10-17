package r37;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f251194a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f251194a, ((e) obj2).f251194a);
    }

    public final int hashCode() {
        return this.f251194a.hashCode();
    }

    public e(Data taxTypeInfo) {
        Intrinsics.checkNotNullParameter(taxTypeInfo, "taxTypeInfo");
        this.f251194a = taxTypeInfo;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
