package gv9;

import iv9.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iv9.a f147089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f147090b;

    public a(iv9.a chatMessageEntity, n nVar) {
        Intrinsics.checkNotNullParameter(chatMessageEntity, "chatMessageEntity");
        this.f147089a = chatMessageEntity;
        this.f147090b = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f147089a, aVar.f147089a) && Intrinsics.f(this.f147090b, aVar.f147090b);
    }

    public final int hashCode() {
        int iHashCode = this.f147089a.hashCode() * 31;
        n nVar = this.f147090b;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
