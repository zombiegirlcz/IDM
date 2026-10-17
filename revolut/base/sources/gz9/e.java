package gz9;

import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwnerWithStats f147977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f147978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147979c;

    public e(CardOwnerWithStats cardOwner, c recipientOrigin, String displayName) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        Intrinsics.checkNotNullParameter(recipientOrigin, "recipientOrigin");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f147977a = cardOwner;
        this.f147978b = recipientOrigin;
        this.f147979c = displayName;
    }

    @Override // gz9.g
    public final String a() {
        return this.f147979c;
    }

    @Override // gz9.g
    public final c b() {
        return this.f147978b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f147977a, eVar.f147977a) && Intrinsics.f(this.f147978b, eVar.f147978b) && Intrinsics.f(this.f147979c, eVar.f147979c);
    }

    public final int hashCode() {
        return this.f147979c.hashCode() + ((this.f147978b.hashCode() + (this.f147977a.hashCode() * 31)) * 31);
    }
}
