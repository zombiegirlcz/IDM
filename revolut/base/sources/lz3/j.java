package lz3;

import aii.u;
import com.revolut.feature.credit.models.CreditAccountType;
import ft3.j1;
import hs3.v;
import hs3.y;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wie.a f200926a;

    public j(wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.f200926a = creditAccountDestinationResolver;
    }

    @Override // lz3.a
    public final Object a(it3.d dVar, Continuation continuation) {
        Object obj2;
        Object next;
        String str;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof y)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof y) {
                        break;
                    }
                }
                obj2 = (v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.ExitMetadata");
            }
            obj2 = (y) obj3;
        }
        y yVar = (y) obj2;
        if (yVar == null || (str = yVar.f154971a) == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "ForbearanceExitDelegate", "facilityId is null after finishing the application", null, null, 16);
            return null;
        }
        j1 j1Var = yVar.f154972b;
        int i = j1Var == null ? -1 : i.f200925a[j1Var.ordinal()];
        wie.a aVar = this.f200926a;
        if (i == 1) {
            rie.a aVar2 = rie.b.Companion;
            Object objC = aVar.c(new CreditAccountType.Loan(str), null, (gim.c) continuation);
            return objC == fim.a.COROUTINE_SUSPENDED ? objC : (u) objC;
        }
        if (i == 2) {
            rie.a aVar3 = rie.b.Companion;
            Object objC2 = aVar.c(new CreditAccountType.CreditCard(str), null, (gim.c) continuation);
            return objC2 == fim.a.COROUTINE_SUSPENDED ? objC2 : (u) objC2;
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "ForbearanceExitDelegate", "this type " + j1Var + " is not supported", null, null, 16);
        return null;
    }
}
