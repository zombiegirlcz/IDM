package dba;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f112695a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f112695a, ((e) obj2).f112695a);
    }

    public final int hashCode() {
        return this.f112695a.hashCode();
    }

    public e(Data trustedListInfo) {
        Intrinsics.checkNotNullParameter(trustedListInfo, "trustedListInfo");
        this.f112695a = trustedListInfo;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
