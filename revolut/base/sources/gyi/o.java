package gyi;

import com.revolut.core.ui_kit.models.ProfileCardModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProfileCardModel f147901b;

    public o(String id10, ProfileCardModel model) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f147900a = id10;
        this.f147901b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f147900a, oVar.f147900a) && Intrinsics.f(this.f147901b, oVar.f147901b);
    }

    public final int hashCode() {
        return this.f147901b.hashCode() + (this.f147900a.hashCode() * 31);
    }
}
