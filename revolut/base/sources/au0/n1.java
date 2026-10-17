package au0;

import android.content.Context;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class n1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HeaderWithBigTileLayout f9280w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Image f9281x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f9282y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(HeaderWithBigTileLayout headerWithBigTileLayout, Image image, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.u = i2;
        this.f9280w = headerWithBigTileLayout;
        this.f9281x = image;
        this.f9282y = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n1(this.f9280w, this.f9281x, this.f9282y, continuation, 0);
            default:
                return new n1(this.f9280w, this.f9281x, this.f9282y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                HeaderWithBigTileLayout headerWithBigTileLayout = this.f9280w;
                yy0.f fVarQ = or0.u.k(headerWithBigTileLayout).Q();
                Context context = headerWithBigTileLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.v = 1;
                Image image = this.f9281x;
                int i2 = this.f9282y;
                Object objJ = ofm.q.J(fVarQ, image, context, i2, i2, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                HeaderWithBigTileLayout headerWithBigTileLayout2 = this.f9280w;
                yy0.f fVarQ2 = or0.u.k(headerWithBigTileLayout2).Q();
                Context context2 = headerWithBigTileLayout2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this.v = 1;
                Image image2 = this.f9281x;
                int i5 = this.f9282y;
                Object objJ2 = ofm.q.J(fVarQ2, image2, context2, i5, i5, this);
                return objJ2 == aVar2 ? aVar2 : objJ2;
        }
    }
}
