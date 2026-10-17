package ryd;

import com.revolut.core.model.account.AccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements zxd.a {

    @NotNull
    public static final a Companion = new a();
    public static final Set d;
    public static final io3.i e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f258327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.b f258328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8b.a f258329c;

    static {
        io3.k[] elements = {io3.k.ACTIVE, io3.k.INACTIVE, io3.k.DELISTED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
        e = io3.i.INTERNAL;
    }

    public b(wsg.n walletInteractor, wsg.b newWalletsInteractor, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f258327a = walletInteractor;
        this.f258328b = newWalletsInteractor;
        this.f258329c = countryInteractor;
    }

    public final efm.r a(List list, boolean z, xi0.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            xi0.a aVar = xi0.b.Companion;
            String str = ((io3.d) obj2).f163147c;
            aVar.getClass();
            xi0.b bVarA = xi0.a.a(str);
            if (cp5.d.A(bVar) ? cp5.d.A(bVarA) : cp5.d.z(bVar) ? cp5.d.z(bVarA) : cp5.d.y(bVar) ? cp5.d.y(bVarA) : bVarA.equals(bVar)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it8.hasNext()) {
                return this.f258327a.O(d0.P0(arrayList2, cim.b.a(new rxb.b(21), new rxb.b(22))), z, bVar);
            }
            Object next = it8.next();
            io3.d dVar = (io3.d) next;
            if (((o8b.c) this.f258329c).g()) {
                String str2 = dVar.f163147c;
                xi0.b.Companion.getClass();
                if (Intrinsics.f(str2, xi0.b.E.f306286a)) {
                    z3 = true;
                }
            }
            if (!z3) {
                arrayList2.add(next);
            }
        }
    }

    public final vkm.d b(AccountId accountId, io3.l pocketType) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        wsg.n nVar = this.f258327a;
        ufm.i iVarX = nVar.x(accountId);
        efm.d0 d0VarFirstOrError = m70.a.g(nVar.S(w4l.h.f294642c, d, pocketType, e, accountId), null, new ru5.m(25), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        sfm.b bVar = new sfm.b(te0.w.H0(iVarX, d0VarFirstOrError), new rxb.f(20, new rrd.l(this, 28)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return rd0.e.b(bVar);
    }
}
