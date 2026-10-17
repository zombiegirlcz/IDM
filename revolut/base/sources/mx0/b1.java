package mx0;

import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class b1 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f209593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f209594x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(List list, a1 a1Var, Continuation continuation) {
        super(2, continuation);
        this.f209593w = list;
        this.f209594x = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b1 b1Var = new b1(this.f209593w, this.f209594x, continuation);
        b1Var.v = obj2;
        return b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xv0.i iVar;
        CoroutineScope coroutineScope = (CoroutineScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        a1 a1Var = this.f209594x;
        if (i == 0) {
            yhm.o.b(obj2);
            List list = this.f209593w;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            int i2 = 0;
            while (true) {
                Continuation continuation = null;
                if (it8.hasNext()) {
                    Object next = it8.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    arrayList.add(skm.e0.g(coroutineScope, null, null, new mll.c0(a1Var, (Image) next, (ImageView) a1Var.f209569c.get(i2), continuation, 11), 3));
                    i2 = i3;
                } else {
                    this.v = null;
                    this.u = 1;
                    obj2 = skm.e0.h(arrayList, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List list2 = (List) obj2;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            iVar = xv0.h.f309151a;
        } else {
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                if (!((Boolean) it9.next()).booleanValue()) {
                    iVar = xv0.e.f309148a;
                    break;
                }
            }
            iVar = xv0.h.f309151a;
        }
        a1Var.setItemRenderState(iVar);
        return Unit.f186387a;
    }
}
