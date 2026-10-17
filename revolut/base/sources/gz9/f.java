package gz9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f147980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f147981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147982c;

    public f(zm3.a contact, c recipientOrigin, String displayName) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(recipientOrigin, "recipientOrigin");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f147980a = contact;
        this.f147981b = recipientOrigin;
        this.f147982c = displayName;
    }

    @Override // gz9.g
    public final String a() {
        return this.f147982c;
    }

    @Override // gz9.g
    public final c b() {
        return this.f147981b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f147980a, fVar.f147980a) && Intrinsics.f(this.f147981b, fVar.f147981b) && Intrinsics.f(this.f147982c, fVar.f147982c);
    }

    public final int hashCode() {
        return this.f147982c.hashCode() + ((this.f147981b.hashCode() + (this.f147980a.hashCode() * 31)) * 31);
    }
}
