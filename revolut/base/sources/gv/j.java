package gv;

import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FloatBuffer f147015a;

    public j(FloatBuffer embedding) {
        Intrinsics.checkNotNullParameter(embedding, "embedding");
        this.f147015a = embedding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f147015a, ((j) obj2).f147015a);
    }

    public final int hashCode() {
        return this.f147015a.hashCode();
    }
}
