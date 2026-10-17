package uyj;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.learn.shared.models.domain.LearnShareReward;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public i u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f284431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f284432x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ LearnShareReward f284433y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, LearnShareReward learnShareReward, Continuation continuation) {
        super(2, continuation);
        this.f284432x = iVar;
        this.f284433y = learnShareReward;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.f284432x, this.f284433y, continuation);
        hVar.f284431w = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        Object objB;
        i iVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        final int i2 = 1;
        i iVar2 = this.f284432x;
        try {
            if (i == 0) {
                o.b(obj2);
                ez8.a aVar2 = iVar2.f284436r.f130919a;
                final byte[] bArr = aVar2 != null ? aVar2.f130917a : null;
                if (bArr != null) {
                    final int i3 = 0;
                    iVar2.x2(new Function1() { // from class: uyj.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            d dVar = (d) obj3;
                            switch (i3) {
                                case 0:
                                    dVar.getClass();
                                    break;
                                default:
                                    dVar.getClass();
                                    break;
                            }
                            return new d(bArr);
                        }
                    });
                    return Unit.f186387a;
                }
                IllegalStateException illegalStateException = new IllegalStateException("No cached image to share reward. It's better to generate and cache share image before screen opening, so it's available immediately");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                LearnShareReward learnShareReward = this.f284433y;
                m.Companion companion = m.INSTANCE;
                ufm.i iVarA = ((jyj.g) iVar2.f284435q).a(new UrlImage(learnShareReward.e, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), learnShareReward.f78031a, learnShareReward.f, learnShareReward.d);
                this.f284431w = null;
                this.u = iVar2;
                this.v = 1;
                objB = nim.a.b(iVarA, this);
                if (objB == aVar) {
                    return aVar;
                }
                iVar = iVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = this.u;
                o.b(obj2);
                objB = obj2;
            }
            final byte[] imageBytes = (byte[]) objB;
            ez8.b bVar = iVar.f284436r;
            Intrinsics.h(imageBytes);
            BridgeDestination backCommandDestination = new BridgeDestination(DummyCommand.f98635a);
            bVar.getClass();
            Intrinsics.checkNotNullParameter(imageBytes, "imageBytes");
            Intrinsics.checkNotNullParameter(backCommandDestination, "backCommandDestination");
            bVar.f130919a = new ez8.a(imageBytes, backCommandDestination);
            iVar.x2(new Function1() { // from class: uyj.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    d dVar = (d) obj3;
                    switch (i2) {
                        case 0:
                            dVar.getClass();
                            break;
                        default:
                            dVar.getClass();
                            break;
                    }
                    return new d(imageBytes);
                }
            });
            objA = Unit.f186387a;
            m.Companion companion2 = m.INSTANCE;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, "Unable to prepare share reward image", thA, h0Var2);
            iVar2.u2();
        }
        return new m(objA);
    }
}
