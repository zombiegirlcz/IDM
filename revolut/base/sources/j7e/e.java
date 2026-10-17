package j7e;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ f u;
    public final /* synthetic */ VaultWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BaseDraggableWidgetDelegate.a f171911w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, VaultWidgetContext vaultWidgetContext, BaseDraggableWidgetDelegate.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = fVar;
        this.v = vaultWidgetContext;
        this.f171911w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, this.v, this.f171911w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HomeFeedWidgetContext homeFeedWidgetContextA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        uc7.a aVar2 = this.u.f171912a;
        VaultWidgetContext.Type type = this.v.f74721b;
        if (type instanceof VaultWidgetContext.Type.JointPockets) {
            HomeFeedWidgetContext.JointPocket.Companion companion = HomeFeedWidgetContext.JointPocket.INSTANCE;
            String str = ((VaultWidgetContext.Type.JointPockets) type).f74722a;
            companion.getClass();
            homeFeedWidgetContextA = HomeFeedWidgetContext.JointPocket.Companion.a(str);
        } else {
            if (!(type instanceof VaultWidgetContext.Type.Pockets)) {
                throw new IllegalStateException(type + " is not supported for LinkedBills");
            }
            HomeFeedWidgetContext.PersonalPocket.Companion companion2 = HomeFeedWidgetContext.PersonalPocket.INSTANCE;
            String str2 = ((VaultWidgetContext.Type.Pockets) type).f74726a;
            companion2.getClass();
            homeFeedWidgetContextA = HomeFeedWidgetContext.PersonalPocket.Companion.a(str2);
        }
        aVar2.b(new fc7.c("BillsList", homeFeedWidgetContextA, this.f171911w));
        return Unit.f186387a;
    }
}
