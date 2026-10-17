package v7e;

import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubaccountType f286590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChosenBackground f286592c;
    public final String d;
    public final Data e;

    public g(SubaccountType subaccountType, String name, ChosenBackground chosenBackground, String str, Data currencyDetails) {
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currencyDetails, "currencyDetails");
        this.f286590a = subaccountType;
        this.f286591b = name;
        this.f286592c = chosenBackground;
        this.d = str;
        this.e = currencyDetails;
    }

    public static g a(g gVar, String str, ChosenBackground chosenBackground, String str2, Data data, int i) {
        String name = str;
        SubaccountType subaccountType = gVar.f286590a;
        if ((i & 2) != 0) {
            name = gVar.f286591b;
        }
        if ((i & 4) != 0) {
            chosenBackground = gVar.f286592c;
        }
        if ((i & 8) != 0) {
            str2 = gVar.d;
        }
        if ((i & 16) != 0) {
            data = gVar.e;
        }
        Data currencyDetails = data;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currencyDetails, "currencyDetails");
        String str3 = str2;
        return new g(subaccountType, name, chosenBackground, str3, currencyDetails);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f286590a, gVar.f286590a) && Intrinsics.f(this.f286591b, gVar.f286591b) && Intrinsics.f(this.f286592c, gVar.f286592c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f286590a.hashCode() * 31, 31, this.f286591b);
        ChosenBackground chosenBackground = this.f286592c;
        int iHashCode = (iC + (chosenBackground == null ? 0 : chosenBackground.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
