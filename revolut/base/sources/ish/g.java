package ish;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f168261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dsh.t f168262x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, dsh.t tVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f168261w = str;
        this.f168262x = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, this.f168261w, this.f168262x, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((BaseDraggableWidgetDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        op0.r rVar;
        BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        int i = c.f168255a[this.f168262x.ordinal()];
        if (i == 1) {
            rVar = op0.r.SEEN;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rVar = op0.r.UNSEEN;
        }
        model.D(rVar);
        return Unit.f186387a;
    }
}
