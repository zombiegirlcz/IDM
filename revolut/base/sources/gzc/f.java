package gzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f147997b;

    public f(String id10, o document) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f147996a = id10;
        this.f147997b = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f147996a, fVar.f147996a) && Intrinsics.f(this.f147997b, fVar.f147997b);
    }

    public final int hashCode() {
        return this.f147997b.hashCode() + (this.f147996a.hashCode() * 31);
    }
}
