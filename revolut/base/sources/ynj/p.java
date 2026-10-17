package ynj;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPorting;
import dej.x2;
import dej.y2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p {
    public static boolean a(EsimSubscriptionPhoneNumber phoneNumber) {
        EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return (c(phoneNumber) || b(phoneNumber)) && (esimSubscriptionPhoneNumberPorting = phoneNumber.i) != null && esimSubscriptionPhoneNumberPorting.f100490c;
    }

    public static boolean b(EsimSubscriptionPhoneNumber phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = phoneNumber.i;
        if ((esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f100489b : null) == x2.IN) {
            return (esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f100491g : null) == y2.ELIGIBLE;
        }
        return false;
    }

    public static boolean c(EsimSubscriptionPhoneNumber phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = phoneNumber.i;
        if ((esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f100489b : null) == x2.IN) {
            return (esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f100491g : null) == y2.PENDING;
        }
        return false;
    }

    public static boolean d(EsimSubscriptionPhoneNumber phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = phoneNumber.i;
        if ((esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f100489b : null) == x2.OUT) {
            return (esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f100491g : null) == y2.PENDING && esimSubscriptionPhoneNumberPorting != null && esimSubscriptionPhoneNumberPorting.f100490c;
        }
        return false;
    }

    public static boolean e(List phoneNumbers) {
        Intrinsics.checkNotNullParameter(phoneNumbers, "phoneNumbers");
        List list = phoneNumbers;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (b((EsimSubscriptionPhoneNumber) it8.next())) {
                return true;
            }
        }
        return false;
    }
}
