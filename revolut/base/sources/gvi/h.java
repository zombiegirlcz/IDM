package gvi;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f147180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147182c;

    public h(Data currentTravellerDetailsData, List additionalTravellersDetails, boolean z) {
        Intrinsics.checkNotNullParameter(currentTravellerDetailsData, "currentTravellerDetailsData");
        Intrinsics.checkNotNullParameter(additionalTravellersDetails, "additionalTravellersDetails");
        this.f147180a = currentTravellerDetailsData;
        this.f147181b = additionalTravellersDetails;
        this.f147182c = z;
    }

    public static h a(h hVar, Data currentTravellerDetailsData, ArrayList arrayList, boolean z, int i) {
        if ((i & 1) != 0) {
            currentTravellerDetailsData = hVar.f147180a;
        }
        List additionalTravellersDetails = arrayList;
        if ((i & 2) != 0) {
            additionalTravellersDetails = hVar.f147181b;
        }
        if ((i & 4) != 0) {
            z = hVar.f147182c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(currentTravellerDetailsData, "currentTravellerDetailsData");
        Intrinsics.checkNotNullParameter(additionalTravellersDetails, "additionalTravellersDetails");
        return new h(currentTravellerDetailsData, additionalTravellersDetails, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f147180a, hVar.f147180a) && Intrinsics.f(this.f147181b, hVar.f147181b) && this.f147182c == hVar.f147182c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147182c) + p.a.d(this.f147180a.hashCode() * 31, 31, this.f147181b);
    }
}
