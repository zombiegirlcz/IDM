package awe;

import com.revolut.domain.models.topup.methods.CardMethodState;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import gim.i;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ng0.b f10767a;

    public c(ng0.b googlePayInteractor) {
        Intrinsics.checkNotNullParameter(googlePayInteractor, "googlePayInteractor");
        this.f10767a = googlePayInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.ArrayList r11, com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: awe.c.a(java.util.ArrayList, com.revolut.feature.topup_screen.api.model.TopUpMethodsContext, gim.c):java.lang.Object");
    }

    public final Object b(com.revolut.domain.models.topup.methods.b bVar, TopupMethod topupMethod, TopUpMethodsContext topUpMethodsContext, i iVar) {
        String str = topUpMethodsContext.f90550a;
        Object obj2 = null;
        if (topupMethod instanceof TopupMethod.OtherMethod) {
            Iterator it8 = bVar.f60526b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                TopupMethod.OtherMethod otherMethod = (TopupMethod.OtherMethod) next;
                if (otherMethod.f60440a == ((TopupMethod.OtherMethod) topupMethod).f60440a && otherMethod.e.contains(str)) {
                    obj2 = next;
                    break;
                }
            }
            topupMethod = (TopupMethod) obj2;
        } else if (topupMethod instanceof TopupMethod.StoredMethod) {
            for (Object obj3 : bVar.f60525a) {
                TopupMethod.StoredMethod storedMethod = (TopupMethod.StoredMethod) obj3;
                if (Intrinsics.f(storedMethod.getF60502a(), ((TopupMethod.StoredMethod) topupMethod).getF60502a()) && storedMethod.getF().contains(str) && (!(storedMethod instanceof TopupMethod.StoredMethod.Card) || ((TopupMethod.StoredMethod.Card) storedMethod).k != CardMethodState.AVAILABLE_OTHER_PROFILE)) {
                    obj2 = obj3;
                    break;
                }
            }
            topupMethod = (TopupMethod) obj2;
        } else if (!(topupMethod instanceof TopupMethod.SuggestedMethod.OpenBankingInstitution)) {
            if (!(topupMethod instanceof TopupMethod.SuggestedMethod) && topupMethod != null) {
                throw new NoWhenBranchMatchedException();
            }
            topupMethod = null;
        }
        return topupMethod == null ? c(bVar, topUpMethodsContext, iVar) : topupMethod;
    }

    public final Object c(com.revolut.domain.models.topup.methods.b bVar, TopUpMethodsContext topUpMethodsContext, gim.c cVar) {
        Object next;
        Iterator it8 = bVar.f60525a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            TopupMethod.StoredMethod storedMethod = (TopupMethod.StoredMethod) next;
            if (storedMethod.getF().contains(topUpMethodsContext.f90550a) && (!(storedMethod instanceof TopupMethod.StoredMethod.Card) || ((TopupMethod.StoredMethod.Card) storedMethod).k != CardMethodState.AVAILABLE_OTHER_PROFILE)) {
                break;
            }
        }
        TopupMethod.StoredMethod storedMethod2 = (TopupMethod.StoredMethod) next;
        return storedMethod2 != null ? storedMethod2 : a(bVar.f60526b, topUpMethodsContext, cVar);
    }
}
