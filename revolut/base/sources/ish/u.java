package ish;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WidgetContext f168287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dsh.p f168288x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, WidgetContext widgetContext, dsh.p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
        this.f168287w = widgetContext;
        this.f168288x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, this.f168287w, this.f168288x, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        dsh.p pVar = this.f168288x;
        String str = pVar.f117336a;
        Object obj3 = (BaseDraggableWidgetDelegate.Model) data.getContent();
        if (obj3 == null) {
            obj3 = Unit.f186387a;
        }
        this.v.i(this.f168287w, str, new m(pVar, obj3));
        return Unit.f186387a;
    }
}
