package k7e;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ h u;
    public final /* synthetic */ VaultWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BaseDraggableWidgetDelegate.a f182050w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, VaultWidgetContext vaultWidgetContext, BaseDraggableWidgetDelegate.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = hVar;
        this.v = vaultWidgetContext;
        this.f182050w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, this.v, this.f182050w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HomeFeedWidgetContext proPocket;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        uc7.a aVar2 = this.u.f182051a;
        VaultWidgetContext.Type type = this.v.f74721b;
        if (type instanceof VaultWidgetContext.Type.JointPockets) {
            HomeFeedWidgetContext.JointPocket.Companion companion = HomeFeedWidgetContext.JointPocket.INSTANCE;
            String str = ((VaultWidgetContext.Type.JointPockets) type).f74722a;
            companion.getClass();
            proPocket = HomeFeedWidgetContext.JointPocket.Companion.a(str);
        } else if (type instanceof VaultWidgetContext.Type.Pockets) {
            HomeFeedWidgetContext.PersonalPocket.Companion companion2 = HomeFeedWidgetContext.PersonalPocket.INSTANCE;
            String str2 = ((VaultWidgetContext.Type.Pockets) type).f74726a;
            companion2.getClass();
            proPocket = HomeFeedWidgetContext.PersonalPocket.Companion.a(str2);
        } else {
            if (!(type instanceof VaultWidgetContext.Type.ProRegularPockets)) {
                throw new IllegalStateException(type + " is not supported for LinkCard");
            }
            HomeFeedWidgetContext.ProPocket.Companion companion3 = HomeFeedWidgetContext.ProPocket.INSTANCE;
            String subaccountId = ((VaultWidgetContext.Type.ProRegularPockets) type).f74727a;
            companion3.getClass();
            Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
            proPocket = new HomeFeedWidgetContext.ProPocket(null, subaccountId, 1, null);
        }
        aVar2.b(new fc7.c("LinkedCard", proPocket, this.f182050w));
        return Unit.f186387a;
    }
}
