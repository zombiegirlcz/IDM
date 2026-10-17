package y7a;

import com.revolut.feature.picker.legacy.PickerScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PickerScreen f311438w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PickerScreen pickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311438w = pickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f311438w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f311438w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f311438w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f311438w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        int i = this.u;
        PickerScreen pickerScreen = this.f311438w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0VarT2 = pickerScreen.T2();
                Intrinsics.h(id10);
                f0VarT2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("PICKER_RESET_ITEM_ID")) {
                    f0VarT2.x2(new y66.p(9));
                } else if (id10.equals("PICKER_SELECT_ALL_ITEM_ID")) {
                    List list = (List) ((r) f0VarT2.t2()).f311447a.getContent();
                    if (list != null) {
                        List list2 = list;
                        arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((qv0.i) it8.next()).getF53563a());
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        f0VarT2.x2(new ua2.r(14, arrayList));
                    }
                } else {
                    f0VarT2.v2(new v(new t(id10)));
                }
                break;
            case 1:
                String query = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0VarT22 = pickerScreen.T2();
                Intrinsics.h(query);
                f0VarT22.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                f0VarT22.x2(new xf0.h(query, 24));
                break;
            case 2:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0VarT23 = pickerScreen.T2();
                String id11 = aVar3.f275445a;
                f0VarT23.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                f0VarT23.v2(new v(new q(id11)));
                break;
            default:
                ty0.a aVar5 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0VarT24 = pickerScreen.T2();
                String id12 = aVar5.f275445a;
                f0VarT24.getClass();
                Intrinsics.checkNotNullParameter(id12, "id");
                f0VarT24.v2(new v(new q(id12)));
                break;
        }
        return Unit.f186387a;
    }
}
