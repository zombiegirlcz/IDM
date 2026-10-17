package gw0;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f147237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f147238c;
    public final Object d;

    public g(String listId, d state, c size, File file) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f147236a = listId;
        this.f147237b = state;
        this.f147238c = size;
        this.d = file;
    }

    @Override // gw0.h
    public final Object a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f147236a, gVar.f147236a) && this.f147237b.equals(gVar.f147237b) && this.f147238c == gVar.f147238c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f147238c.hashCode() + ((this.f147237b.hashCode() + (this.f147236a.hashCode() * 31)) * 31)) * 31;
        Object obj2 = this.d;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
