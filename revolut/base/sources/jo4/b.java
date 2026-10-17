package jo4;

import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction;
import com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink;
import hx7.e;
import io4.h;
import io4.i;
import io4.j;
import io4.k;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import rd0.c;
import rd0.d;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {
    public static final CreditCardModelAction a(k kVar) throws Throwable {
        Object objA;
        tl4.b bVar;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        CreditCardDeeplink creditCardDeeplink = null;
        if (kVar instanceof i) {
            try {
                CreditCardDeeplink.Companion companion = CreditCardDeeplink.INSTANCE;
                String value = ((i) kVar).getValue();
                Map mapG = r0.g();
                companion.getClass();
                CreditCardDeeplink creditCardDeeplinkA = CreditCardDeeplink.Companion.a(value, mapG);
                if (creditCardDeeplinkA == null) {
                    throw new IllegalStateException(("Unsupported credit card deeplink: " + ((i) kVar).getValue()).toString());
                }
                creditCardDeeplink = creditCardDeeplinkA;
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, e, h0Var);
            }
            return new CreditCardModelAction.Deeplink(creditCardDeeplink, ((i) kVar).getValue());
        }
        if (!(kVar instanceof h)) {
            if (kVar instanceof j) {
                return new CreditCardModelAction.Dialogue(hx7.b.A(((j) kVar).getValue()));
            }
            throw new NoWhenBranchMatchedException();
        }
        String value2 = ((h) kVar).getValue();
        Enum r06 = tl4.b.UNKNOWN;
        try {
            m.Companion companion2 = m.INSTANCE;
            tl4.b[] bVarArrValues = tl4.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                tl4.b bVar2 = bVarArrValues[i];
                if (a0.z(bVar2.name(), value2, true)) {
                    bVar = bVar2;
                    break;
                }
                i++;
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (bVar == null) {
            throw new IllegalStateException("Unsupported enum value: " + value2 + " for " + o0.f186429a.b(tl4.b.class).m());
        }
        objA = bVar;
        Throwable thA = m.a(objA);
        if (thA != null) {
            e.n(thA);
        }
        Enum r2 = (Enum) (objA instanceof n ? null : objA);
        if (r2 != null) {
            r06 = r2;
        }
        return new CreditCardModelAction.Contextual((tl4.b) r06);
    }

    public static final k b(CreditCardModelAction creditCardModelAction) {
        Intrinsics.checkNotNullParameter(creditCardModelAction, "<this>");
        if (creditCardModelAction instanceof CreditCardModelAction.Deeplink) {
            return new i(((CreditCardModelAction.Deeplink) creditCardModelAction).f68849b);
        }
        if (creditCardModelAction instanceof CreditCardModelAction.Contextual) {
            return new h(((CreditCardModelAction.Contextual) creditCardModelAction).f68847a.name());
        }
        if (creditCardModelAction instanceof CreditCardModelAction.Dialogue) {
            return new j(hx7.b.D(((CreditCardModelAction.Dialogue) creditCardModelAction).f68850a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
