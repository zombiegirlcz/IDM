package whh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f297665a;

    public j() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f297665a, ((j) obj2).f297665a);
    }

    public final int hashCode() {
        return this.f297665a.hashCode();
    }

    public j(Data accountsClosures) {
        Intrinsics.checkNotNullParameter(accountsClosures, "accountsClosures");
        this.f297665a = accountsClosures;
    }

    public /* synthetic */ j(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
