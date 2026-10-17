package hk5;

import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import java.util.Set;
import k71.k;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.p3;
import tof.v6;
import wk5.f;
import wk5.g;
import yk5.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements sj5.a {

    @NotNull
    public static final C0878a Companion = new C0878a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f152849a;

    /* JADX INFO: renamed from: hk5.a$a, reason: collision with other inner class name */
    public static final class C0878a {
        private C0878a() {
        }
    }

    static {
        g[] elements = {g.PRE_CHECK, g.PENDING_VALIDATION};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f152849a = d.y0(elements);
    }

    public final boolean a(a3 transaction, CryptoAddressCounterparty cryptoAddressCounterparty) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (b(transaction, cryptoAddressCounterparty)) {
            return true;
        }
        if (transaction.f != v6.REVERTED) {
            return false;
        }
        p3 p3Var = k.y0(transaction) ? transaction.W : null;
        return (p3Var != null ? p3Var.e : null) == e.AVAILABLE_FOR_RETURN;
    }

    public final boolean b(a3 transaction, CryptoAddressCounterparty cryptoAddressCounterparty) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return e(transaction, cryptoAddressCounterparty) || d(transaction, cryptoAddressCounterparty) || c(transaction, cryptoAddressCounterparty);
    }

    public final boolean c(a3 transaction, CryptoAddressCounterparty cryptoAddressCounterparty) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (cryptoAddressCounterparty != null && transaction.f == v6.PENDING) {
            p3 p3Var = k.y0(transaction) ? transaction.W : null;
            if (p3Var != null && p3Var.e == e.VERIFICATION && cryptoAddressCounterparty.f70979c == g.PENDING_VALIDATION && cryptoAddressCounterparty.f70981h == f.PENDING && cryptoAddressCounterparty.i == wk5.e.ADDITIONAL_DETAILS) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(a3 transaction, CryptoAddressCounterparty cryptoAddressCounterparty) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (cryptoAddressCounterparty != null && transaction.f == v6.PENDING) {
            p3 p3Var = k.y0(transaction) ? transaction.W : null;
            if (p3Var != null && p3Var.e == e.VERIFICATION && cryptoAddressCounterparty.f70979c == g.PENDING_VALIDATION && cryptoAddressCounterparty.f70981h == f.PENDING && cryptoAddressCounterparty.i == wk5.e.MESH) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(a3 transaction, CryptoAddressCounterparty cryptoAddressCounterparty) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (cryptoAddressCounterparty != null && transaction.f == v6.PENDING) {
            p3 p3Var = k.y0(transaction) ? transaction.W : null;
            if (p3Var != null && p3Var.e == e.VERIFICATION && cryptoAddressCounterparty.f70979c == g.CREATED) {
                return true;
            }
        }
        return false;
    }
}
