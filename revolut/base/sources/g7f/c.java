package g7f;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f141198a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f141198a, ((c) obj2).f141198a);
    }

    public final int hashCode() {
        return this.f141198a.hashCode();
    }

    public c(Data info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f141198a = info;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, false, 7, null));
    }
}
