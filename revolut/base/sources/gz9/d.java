package gz9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f147974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f147975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147976c;

    public d(f5j.a beneficiary, c recipientOrigin, String displayName) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(recipientOrigin, "recipientOrigin");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f147974a = beneficiary;
        this.f147975b = recipientOrigin;
        this.f147976c = displayName;
    }

    @Override // gz9.g
    public final String a() {
        return this.f147976c;
    }

    @Override // gz9.g
    public final c b() {
        return this.f147975b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f147974a, dVar.f147974a) && Intrinsics.f(this.f147975b, dVar.f147975b) && Intrinsics.f(this.f147976c, dVar.f147976c);
    }

    public final int hashCode() {
        return this.f147976c.hashCode() + ((this.f147975b.hashCode() + (this.f147974a.hashCode() * 31)) * 31);
    }
}
