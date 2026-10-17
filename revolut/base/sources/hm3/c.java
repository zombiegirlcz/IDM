package hm3;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zm3.n;
import zm3.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xua.a f153526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mq9.f f153527b;

    public c(xua.a recurringPaymentInteractor, mq9.f paymentsGroupsInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(paymentsGroupsInteractor, "paymentsGroupsInteractor");
        this.f153526a = recurringPaymentInteractor;
        this.f153527b = paymentsGroupsInteractor;
    }

    public final String a(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (contact instanceof zm3.e) {
            return ((zm3.e) contact).f323340a;
        }
        if (contact instanceof zm3.f) {
            return ((zm3.f) contact).f323345a;
        }
        if (contact instanceof zm3.l) {
            return ((zm3.l) contact).getCode();
        }
        if (contact instanceof n) {
            return ((n) contact).f323373a;
        }
        if (contact instanceof o) {
            return ((o) contact).f323376a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
