package xec;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f304580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304582c;
    public final ShippingContactsScreenDescriptor$InputData.ModeConfiguration d;
    public final i e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f304583g;

    public e(Data wrappedShippingContacts, String str, String str2, ShippingContactsScreenDescriptor$InputData.ModeConfiguration modeConfiguration, i onBackAction, Set invalidShippingContactIds, Data userAddress) {
        Intrinsics.checkNotNullParameter(wrappedShippingContacts, "wrappedShippingContacts");
        Intrinsics.checkNotNullParameter(modeConfiguration, "modeConfiguration");
        Intrinsics.checkNotNullParameter(onBackAction, "onBackAction");
        Intrinsics.checkNotNullParameter(invalidShippingContactIds, "invalidShippingContactIds");
        Intrinsics.checkNotNullParameter(userAddress, "userAddress");
        this.f304580a = wrappedShippingContacts;
        this.f304581b = str;
        this.f304582c = str2;
        this.d = modeConfiguration;
        this.e = onBackAction;
        this.f = invalidShippingContactIds;
        this.f304583g = userAddress;
    }

    public static e a(e eVar, Data data, String str, String str2, i iVar, Data data2, int i) {
        if ((i & 1) != 0) {
            data = eVar.f304580a;
        }
        Data wrappedShippingContacts = data;
        if ((i & 2) != 0) {
            str = eVar.f304581b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = eVar.f304582c;
        }
        String str4 = str2;
        ShippingContactsScreenDescriptor$InputData.ModeConfiguration modeConfiguration = eVar.d;
        if ((i & 16) != 0) {
            iVar = eVar.e;
        }
        i onBackAction = iVar;
        Set invalidShippingContactIds = eVar.f;
        if ((i & 64) != 0) {
            data2 = eVar.f304583g;
        }
        Data userAddress = data2;
        eVar.getClass();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(wrappedShippingContacts, "wrappedShippingContacts");
        Intrinsics.checkNotNullParameter(modeConfiguration, "modeConfiguration");
        Intrinsics.checkNotNullParameter(onBackAction, "onBackAction");
        Intrinsics.checkNotNullParameter(invalidShippingContactIds, "invalidShippingContactIds");
        Intrinsics.checkNotNullParameter(userAddress, "userAddress");
        return new e(wrappedShippingContacts, str3, str4, modeConfiguration, onBackAction, invalidShippingContactIds, userAddress);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f304580a, eVar.f304580a) && Intrinsics.f(this.f304581b, eVar.f304581b) && Intrinsics.f(this.f304582c, eVar.f304582c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f304583g, eVar.f304583g);
    }

    public final int hashCode() {
        int iHashCode = this.f304580a.hashCode() * 31;
        String str = this.f304581b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f304582c;
        return Boolean.hashCode(true) + kii.e.c(this.f304583g, p.a.f((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f), 31);
    }
}
