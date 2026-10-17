package xjh;

import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import gim.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f306529a;

    public b(LinkedHashSet handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f306529a = handlers;
    }

    public final Object a(WealthAction wealthAction, i iVar) {
        Object next;
        Object objB3;
        if (!wealthAction.getF95896a()) {
            return Unit.f186387a;
        }
        Iterator it8 = this.f306529a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((hih.d) next).Z2(wealthAction)) {
                break;
            }
        }
        hih.d dVar = (hih.d) next;
        return (dVar == null || (objB3 = dVar.b3(wealthAction, iVar)) != fim.a.COROUTINE_SUSPENDED) ? Unit.f186387a : objB3;
    }
}
