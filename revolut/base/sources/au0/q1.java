package au0;

import android.content.Context;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class q1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ HeaderWithBigTileLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AvatarModel.AvatarImage.GridImage f9322w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9323x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(HeaderWithBigTileLayout headerWithBigTileLayout, AvatarModel.AvatarImage.GridImage gridImage, int i, Continuation continuation) {
        super(2, continuation);
        this.v = headerWithBigTileLayout;
        this.f9322w = gridImage;
        this.f9323x = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q1(this.v, this.f9322w, this.f9323x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        HeaderWithBigTileLayout headerWithBigTileLayout = this.v;
        yy0.f fVarQ = or0.u.k(headerWithBigTileLayout).Q();
        Image image = this.f9322w.f57991a;
        Context context = headerWithBigTileLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.u = 1;
        int i2 = this.f9323x;
        Object objJ = ofm.q.J(fVarQ, image, context, i2, i2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
