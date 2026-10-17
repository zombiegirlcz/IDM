package nec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f214428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ShippingContact f214430c;

    public c(List shippingContacts, String str) {
        Object next;
        Intrinsics.checkNotNullParameter(shippingContacts, "shippingContacts");
        this.f214428a = shippingContacts;
        this.f214429b = str;
        Iterator it8 = shippingContacts.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((ShippingContact) next).f84740a, this.f214429b)) {
                    break;
                }
            }
        }
        this.f214430c = (ShippingContact) next;
    }

    public static c a(c cVar, ArrayList arrayList, String str, int i) {
        List shippingContacts = arrayList;
        if ((i & 1) != 0) {
            shippingContacts = cVar.f214428a;
        }
        if ((i & 2) != 0) {
            str = cVar.f214429b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(shippingContacts, "shippingContacts");
        return new c(shippingContacts, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f214428a, cVar.f214428a) && Intrinsics.f(this.f214429b, cVar.f214429b);
    }

    public final int hashCode() {
        int iHashCode = this.f214428a.hashCode() * 31;
        String str = this.f214429b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
