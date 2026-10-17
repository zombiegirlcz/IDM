package nhe;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import g48.r0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends pfe.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Set f215421q;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wsg.b f215422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r0 f215423n;
    public final ang.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f215424p;

    static {
        fo3.e[] elements = {fo3.e.ACTIVE, fo3.e.LOCKED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f215421q = kotlin.collections.d.y0(elements);
    }

    public f(wsg.b walletsInteractor, r0 jointAccountsInteractor, ang.f userInteractor, g pickerMapper) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pickerMapper, "pickerMapper");
        this.f215422m = walletsInteractor;
        this.f215423n = jointAccountsInteractor;
        this.o = userInteractor;
        this.f215424p = pickerMapper;
    }

    public static final h c3(f fVar, List list, i iVar, io3.l lVar, AccountId accountId) {
        io3.d dVar;
        Object next;
        fVar.getClass();
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                dVar = null;
                break;
            }
            Pair pair = (Pair) it8.next();
            fo3.c cVar = (fo3.c) pair.f186385a;
            Iterator it9 = ((List) pair.f186386b).iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                io3.d dVar2 = (io3.d) next;
                if (z92.f.l(dVar2).equals(cVar.d) && dVar2.f == io3.k.ACTIVE && dVar2.e == lVar) {
                    break;
                }
            }
            dVar = (io3.d) next;
            if (dVar != null) {
                break;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new h(iVar, accountId, dVar);
    }

    public final void d3(h hVar) {
        A2(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(hVar.f215427c, hVar.f215426b, true, true, (wi0.b) null, false, true, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 4016)));
    }
}
