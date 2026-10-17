package cge;

import c5a.m0;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vge.y2;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.a f23954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f23955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f23956c;
    public final vie.h d;

    public h(r10.a spaceContentOrdering, y2 homeInfoInteractor, phm.a creditInfoInteractorProvider, vie.h tabCreditAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(spaceContentOrdering, "spaceContentOrdering");
        Intrinsics.checkNotNullParameter(homeInfoInteractor, "homeInfoInteractor");
        Intrinsics.checkNotNullParameter(creditInfoInteractorProvider, "creditInfoInteractorProvider");
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        this.f23954a = spaceContentOrdering;
        this.f23955b = homeInfoInteractor;
        this.f23956c = creditInfoInteractorProvider;
        this.d = tabCreditAvailabilityInteractor;
    }

    public static final List a(h hVar, List list, List list2) {
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        Set setI1 = d0.i1(list);
        List list3 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (!setI1.contains((ProductAccountId) obj2)) {
                arrayList.add(obj2);
            }
        }
        return d0.E0(arrayList, list3);
    }

    public final Flow b(MainScreenTab mainScreenTab) {
        Intrinsics.checkNotNullParameter(mainScreenTab, "mainScreenTab");
        if (Intrinsics.f(mainScreenTab, ibb.c.f160140a)) {
            return this.f23955b.f289065c;
        }
        Continuation continuation = null;
        return Intrinsics.f(mainScreenTab, ibb.c.f) ? new v1(new m0(this, new g(1), continuation, continuation, 7)) : new go.g(null, 2);
    }
}
