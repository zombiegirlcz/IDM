package vg6;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f288766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f288767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f288768y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f288766w = kVar;
        this.f288767x = str;
        this.f288768y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f288766w, this.f288767x, this.f288768y, continuation, 0);
            default:
                return new g(this.f288766w, this.f288767x, this.f288768y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objV;
        Object objV2;
        switch (this.u) {
            case 0:
                k kVar = this.f288766w;
                yki.a aVar = kVar.u;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    up4.h hVar = new up4.h(1);
                    f fVar = new f(kVar, this.f288767x, this.f288768y, null, 0);
                    this.v = 1;
                    objV = n14.k.V(kVar, null, null, hVar, fVar, this, 3);
                    if (objV == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objV = obj2;
                }
                if (!(((nii.h) objV) instanceof nii.g)) {
                    oki.h.D2(aVar);
                    return Unit.f186387a;
                }
                oki.h.D2(aVar);
                kVar.f288771r.getClass();
                return kVar.C1(u0.c(new MainScreenFeatureConfig.JustShow(s49.a.AS_TOP)));
            default:
                k kVar2 = this.f288766w;
                yki.a aVar3 = kVar2.u;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    up4.h hVar2 = new up4.h(2);
                    f fVar2 = new f(kVar2, this.f288767x, this.f288768y, null, 1);
                    this.v = 1;
                    objV2 = n14.k.V(kVar2, null, null, hVar2, fVar2, this, 3);
                    if (objV2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objV2 = obj2;
                }
                if (!(((nii.h) objV2) instanceof nii.g)) {
                    oki.h.D2(aVar3);
                    return Unit.f186387a;
                }
                oki.h.D2(aVar3);
                kVar2.f288771r.getClass();
                return kVar2.C1(u0.c(new MainScreenFeatureConfig.JustShow(s49.a.AS_TOP)));
        }
    }
}
