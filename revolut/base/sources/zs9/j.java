package zs9;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreen;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupCustomizationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(GroupCustomizationScreen groupCustomizationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupCustomizationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarI3 = this.v.T2();
        String name = textData.f52598b.toString();
        z zVar = (z) rVarI3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator it8 = ((p) zVar.t2()).d.iterator();
        while (true) {
            obj3 = null;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(zVar.v.b(new TextLocalisedClause(((vq9.i) next).f291361b, null, null, 14)).toString(), name)) {
                obj3 = next;
                break;
            }
        }
        zVar.x2(new zp5.f(name, (vq9.i) obj3, 4));
        return Unit.f186387a;
    }
}
