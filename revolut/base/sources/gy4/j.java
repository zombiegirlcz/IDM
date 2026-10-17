package gy4;

import com.revolut.core.ui_kit.models.Clause;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f147827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Number f147828b;

    public j(Clause text, Number parcel) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f147827a = text;
        this.f147828b = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f147827a.equals(jVar.f147827a) && this.f147828b.equals(jVar.f147828b);
    }

    public final int hashCode() {
        return this.f147828b.hashCode() + (this.f147827a.hashCode() * 31);
    }
}
