package cie;

import com.revolut.data.model.Data;
import com.revolut.feature.card_order_new.impl.brazil.CardSubtypePickerControllerContract$InputData;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class k1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f24497x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f24497x = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                k1 k1Var = new k1((com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f24497x, (Continuation) obj4, 0);
                k1Var.f24496w = (Pair) obj2;
                k1Var.v = zBooleanValue;
                return k1Var.invokeSuspend(Unit.f186387a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                k1 k1Var2 = new k1((k2a.d) this.f24497x, (Continuation) obj4, 1);
                k1Var2.v = zBooleanValue2;
                k1Var2.f24496w = (List) obj3;
                return k1Var2.invokeSuspend(Unit.f186387a);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                k1 k1Var3 = new k1((l13.l) this.f24497x, (Continuation) obj4, 2);
                k1Var3.f24496w = (Data) obj2;
                k1Var3.v = zBooleanValue3;
                return k1Var3.invokeSuspend(Unit.f186387a);
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                k1 k1Var4 = new k1((mgl.f) this.f24497x, (Continuation) obj4, 3);
                k1Var4.f24496w = (String) obj2;
                k1Var4.v = zBooleanValue4;
                return k1Var4.invokeSuspend(Unit.f186387a);
            default:
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                k1 k1Var5 = new k1((xr3.w) this.f24497x, (Continuation) obj4, 4);
                k1Var5.f24496w = (ft3.d1) obj2;
                k1Var5.v = zBooleanValue5;
                return k1Var5.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l13.g gVar;
        ArrayList arrayList;
        int i = this.u;
        Class cls = Boolean.TYPE;
        Object obj3 = this.f24497x;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.f24496w;
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new v1(new j1((List) pair.f186386b, z, (com.revolut.feature.tab.accounts.impl.ui.tab.d) obj3, (ProductAccountDescriptor$Value) pair.f186385a, null));
            case 1:
                boolean z3 = this.v;
                List list = (List) this.f24496w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((k2a.d) obj3).f180449b;
                String str = "PERSONALISATIONS_KEY_" + z3;
                Intrinsics.checkNotNullParameter(list, "<this>");
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(i2a.a.c((P2pPersonalisation) it8.next()));
                }
                cVar.G(arrayList2, str, kii.e.o(j2a.h.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 2:
                Data data = (Data) this.f24496w;
                boolean z4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list3 = (List) data.getContent();
                if (list3 != null) {
                    CardSubtypePickerControllerContract$InputData cardSubtypePickerControllerContract$InputData = ((l13.l) obj3).o;
                    int i2 = l13.k.f191437a[cardSubtypePickerControllerContract$InputData.f65023a.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            arrayList = new ArrayList();
                            for (Object obj4 : list3) {
                                if (!ce9.m.s((e93.f) obj4)) {
                                    arrayList.add(obj4);
                                }
                            }
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            arrayList = new ArrayList();
                            for (Object obj5 : list3) {
                                if (ce9.m.s((e93.f) obj5)) {
                                    arrayList.add(obj5);
                                }
                            }
                        }
                        list3 = arrayList;
                    }
                    ArrayList arrayListH = hx7.i.h(list3);
                    ArrayList arrayListF = hx7.i.f(list3);
                    Pair pair2 = cardSubtypePickerControllerContract$InputData.f65023a == e13.a.DISPOSABLE ? new Pair(Boolean.valueOf(hx7.i.e(arrayListH)), Boolean.valueOf(hx7.i.e(arrayListF))) : new Pair(Boolean.valueOf(hx7.i.y(arrayListH)), Boolean.valueOf(hx7.i.y(arrayListF)));
                    gVar = new l13.g(((Boolean) pair2.f186385a).booleanValue(), ((Boolean) pair2.f186386b).booleanValue(), z4);
                } else {
                    gVar = null;
                }
                return new Data(gVar, data.getError(), data.getLoading());
            case 3:
                String str2 = (String) this.f24496w;
                boolean z6 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.data.database.models.openbanking.d.D(cls, ((mgl.f) obj3).f205305c, j6.a.q("ORDER_BOOK_AVAILABILITY_CACHE_KEY", str2), Boolean.valueOf(z6));
                return Unit.f186387a;
            default:
                ft3.d1 d1Var = (ft3.d1) this.f24496w;
                boolean z11 = this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xr3.w) obj3).f308245c.G(Boolean.valueOf(z11), xr3.w.a(d1Var), wim.z.d(kotlin.jvm.internal.o0.b(cls)));
                return Unit.f186387a;
        }
    }
}
