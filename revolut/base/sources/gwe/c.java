package gwe;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopUpConfig f147319a;

    public c(TopUpConfig topUpConfig) {
        Intrinsics.checkNotNullParameter(topUpConfig, "topUpConfig");
        this.f147319a = topUpConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f147319a, ((c) obj2).f147319a);
    }

    public final int hashCode() {
        return this.f147319a.hashCode();
    }
}
