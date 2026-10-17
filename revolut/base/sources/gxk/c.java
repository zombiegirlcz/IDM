package gxk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4l.b f147763a;

    public c(o4l.b tradingSessionsForExchange) {
        Intrinsics.checkNotNullParameter(tradingSessionsForExchange, "tradingSessionsForExchange");
        this.f147763a = tradingSessionsForExchange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f147763a, ((c) obj2).f147763a);
    }

    public final int hashCode() {
        return this.f147763a.hashCode();
    }
}
