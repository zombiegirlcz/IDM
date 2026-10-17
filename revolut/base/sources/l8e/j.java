package l8e;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import do3.n;
import do3.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pcd.v;
import pcd.x;
import pcd.y;
import pcd.z;
import yhm.o;
import ypg.p;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ l u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Continuation continuation) {
        super(2, continuation);
        this.u = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        final l lVar = this.u;
        final int i = 0;
        final int i2 = 1;
        return yji.l.a1(lVar, nim.a.v(u0.m(rd0.e.b(nim.a.w(((p) lVar.f192971q).h(false), new Function1() { // from class: l8e.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                switch (i) {
                    case 0:
                        for (v vVar : (List) obj3) {
                            if (Intrinsics.f(vVar.f234899a, ((d) lVar.t2()).f192960a)) {
                                return vVar;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    default:
                        Pair pair = (Pair) obj3;
                        v vVar2 = (v) pair.f186385a;
                        n nVar = (n) pair.f186386b;
                        for (x xVar : vVar2.e) {
                            if (Intrinsics.f(xVar.f234903a, nVar.f116408a)) {
                                LayeredImage layeredImageC = ((s6e.d) lVar.f192970p).c(SubaccountType.Group.f88960a);
                                ArrayList arrayList = vVar2.e;
                                boolean z = false;
                                if (!arrayList.isEmpty()) {
                                    Iterator it8 = arrayList.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            x xVar2 = (x) it8.next();
                                            if (xVar2.f234905c == z.MEMBER && xVar2.f234906g.contains(y.WITHDRAW)) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                                return new a(vVar2, xVar, layeredImageC, q.y(nVar), z);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        })), rd0.e.b(lVar.f192972r.k(false))), new Function1() { // from class: l8e.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                switch (i2) {
                    case 0:
                        for (v vVar : (List) obj3) {
                            if (Intrinsics.f(vVar.f234899a, ((d) lVar.t2()).f192960a)) {
                                return vVar;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    default:
                        Pair pair = (Pair) obj3;
                        v vVar2 = (v) pair.f186385a;
                        n nVar = (n) pair.f186386b;
                        for (x xVar : vVar2.e) {
                            if (Intrinsics.f(xVar.f234903a, nVar.f116408a)) {
                                LayeredImage layeredImageC = ((s6e.d) lVar.f192970p).c(SubaccountType.Group.f88960a);
                                ArrayList arrayList = vVar2.e;
                                boolean z = false;
                                if (!arrayList.isEmpty()) {
                                    Iterator it8 = arrayList.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            x xVar2 = (x) it8.next();
                                            if (xVar2.f234905c == z.MEMBER && xVar2.f234906g.contains(y.WITHDRAW)) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                                return new a(vVar2, xVar, layeredImageC, q.y(nVar), z);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }), null, null, new l1g.e(lVar, (Continuation) null, 11), 3);
    }
}
