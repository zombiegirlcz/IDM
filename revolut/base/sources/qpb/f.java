package qpb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public uc7.a u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f248334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f248335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ VaultWidgetContext f248336y;
    public final /* synthetic */ BaseDraggableWidgetDelegate.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, VaultWidgetContext vaultWidgetContext, BaseDraggableWidgetDelegate.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f248335x = hVar;
        this.f248336y = vaultWidgetContext;
        this.z = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.f248335x, this.f248336y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        uc7.a aVar;
        String str;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f248334w;
        if (i == 0) {
            o.b(obj2);
            h hVar = this.f248335x;
            aVar = hVar.f248340c;
            this.u = aVar;
            this.v = "VaultAutomationsList";
            this.f248334w = 1;
            obj2 = h.b(hVar, this.f248336y, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
            str = "VaultAutomationsList";
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.v;
            aVar = this.u;
            o.b(obj2);
        }
        aVar.b(new fc7.c(str, (HomeFeedWidgetContext) obj2, this.z));
        return Unit.f186387a;
    }
}
