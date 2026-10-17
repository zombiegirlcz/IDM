package btl;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f18650a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f18650a, ((c) obj2).f18650a);
    }

    public final int hashCode() {
        return this.f18650a.hashCode();
    }

    public c(Data instrumentActions) {
        Intrinsics.checkNotNullParameter(instrumentActions, "instrumentActions");
        this.f18650a = instrumentActions;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
