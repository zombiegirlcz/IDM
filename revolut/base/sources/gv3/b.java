package gv3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();
    public static final b f = new b("", "", "", "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147047c;
    public final String d;
    public final String e;

    public b(String addressId, String postcode, String street, String city, String buildingName) {
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(buildingName, "buildingName");
        this.f147045a = addressId;
        this.f147046b = postcode;
        this.f147047c = street;
        this.d = city;
        this.e = buildingName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f147045a, bVar.f147045a) && Intrinsics.f(this.f147046b, bVar.f147046b) && Intrinsics.f(this.f147047c, bVar.f147047c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f147045a.hashCode() * 31, 31, this.f147046b), 31, this.f147047c), 31, this.d);
    }
}
