package s44;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259756c;
    public final Data d;
    public final List e;

    public g(String title, String str, String buttonTitle, Data currentAddress, List previousAddresses) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(currentAddress, "currentAddress");
        Intrinsics.checkNotNullParameter(previousAddresses, "previousAddresses");
        this.f259754a = title;
        this.f259755b = str;
        this.f259756c = buttonTitle;
        this.d = currentAddress;
        this.e = previousAddresses;
    }

    public static g a(g gVar, Data data, ArrayList arrayList, int i) {
        String title = gVar.f259754a;
        String str = gVar.f259755b;
        String buttonTitle = gVar.f259756c;
        if ((i & 8) != 0) {
            data = gVar.d;
        }
        Data currentAddress = data;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = gVar.e;
        }
        List previousAddresses = list;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(currentAddress, "currentAddress");
        Intrinsics.checkNotNullParameter(previousAddresses, "previousAddresses");
        return new g(title, str, buttonTitle, currentAddress, previousAddresses);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f259754a, gVar.f259754a) && Intrinsics.f(this.f259755b, gVar.f259755b) && Intrinsics.f(this.f259756c, gVar.f259756c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f259754a.hashCode() * 31;
        String str = this.f259755b;
        return this.e.hashCode() + kii.e.c(this.d, p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f259756c), 31);
    }
}
