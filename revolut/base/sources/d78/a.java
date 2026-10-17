package d78;

import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountCanNotBeRemovedException;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProductAccountId f111831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f111832c;

    public /* synthetic */ a(ProductAccountId productAccountId, String str, int i) {
        this.f111830a = i;
        this.f111831b = productAccountId;
        this.f111832c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        ProductAccountId productAccountId;
        Object next3;
        ProductAccountId productAccountId2;
        Object next4;
        ProductAccountId productAccountId3;
        Object next5;
        switch (this.f111830a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Iterator it8 = ((List) pair.f186386b).iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((io3.d) next).f163145a, this.f111832c)) {
                        }
                    } else {
                        next = null;
                    }
                }
                io3.d dVar = (io3.d) next;
                if (dVar != null) {
                    return dVar;
                }
                throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", this.f111831b.f89729a, " cannot be found in the Currency available pocket!"));
            case 1:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                fo3.c cVar = (fo3.c) pair2.f186385a;
                Iterator it9 = ((List) pair2.f186386b).iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((io3.d) next2).f163145a, this.f111832c)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                io3.d dVar2 = (io3.d) next2;
                ProductAccountId productAccountId4 = this.f111831b;
                if (dVar2 == null) {
                    throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId4.f89729a, " cannot be found in the Currency available pocket!"));
                }
                if (Intrinsics.f(dVar2.f163147c, cVar.d.f306286a)) {
                    throw new ProductAccountCanNotBeRemovedException(p.a.p("ProductAccount with id:", productAccountId4.f89729a, " cannot be deleted because it is base currency"));
                }
                return dVar2;
            case 2:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Iterator it10 = pockets.iterator();
                while (true) {
                    boolean zHasNext = it10.hasNext();
                    productAccountId = this.f111831b;
                    if (zHasNext) {
                        next3 = it10.next();
                        if (Intrinsics.f(((io3.d) next3).f163145a, productAccountId.f89729a)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                io3.d dVar3 = (io3.d) next3;
                if (dVar3 == null) {
                    throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId.f89729a, " cannot be found in the Currency available pocket!"));
                }
                if (Intrinsics.f(dVar3.f163147c, this.f111832c)) {
                    throw new ProductAccountCanNotBeRemovedException(p.a.p("ProductAccount with id:", productAccountId.f89729a, " cannot be deleted because it is base currency"));
                }
                return dVar3;
            case 3:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                Iterator it11 = pockets2.iterator();
                while (true) {
                    boolean zHasNext2 = it11.hasNext();
                    productAccountId2 = this.f111831b;
                    if (zHasNext2) {
                        next4 = it11.next();
                        if (Intrinsics.f(((io3.d) next4).f163145a, productAccountId2.f89729a)) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                io3.d dVar4 = (io3.d) next4;
                if (dVar4 == null) {
                    throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId2.f89729a, " cannot be found in the Currency available pocket!"));
                }
                if (Intrinsics.f(dVar4.f163147c, this.f111832c)) {
                    throw new ProductAccountCanNotBeRemovedException(p.a.p("ProductAccount with id:", productAccountId2.f89729a, " cannot be deleted because it is base currency"));
                }
                return dVar4;
            default:
                List pockets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets3, "pockets");
                Iterator it12 = pockets3.iterator();
                while (true) {
                    boolean zHasNext3 = it12.hasNext();
                    productAccountId3 = this.f111831b;
                    if (zHasNext3) {
                        next5 = it12.next();
                        if (Intrinsics.f(((io3.d) next5).f163145a, productAccountId3.f89729a)) {
                        }
                    } else {
                        next5 = null;
                    }
                }
                io3.d dVar5 = (io3.d) next5;
                if (dVar5 == null) {
                    throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId3.f89729a, " cannot be found in the Currency available pocket!"));
                }
                if (Intrinsics.f(dVar5.f163147c, this.f111832c)) {
                    throw new ProductAccountCanNotBeRemovedException(p.a.p("ProductAccount with id:", productAccountId3.f89729a, " cannot be deleted because it is base currency"));
                }
                return dVar5;
        }
    }
}
