package l97;

import com.revolut.feature.globalsearch.impl.ui.screen.GlobalSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GlobalSearchScreen f193054w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(GlobalSearchScreen globalSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f193054w = globalSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f193054w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f193054w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GlobalSearchScreen globalSearchScreen = this.f193054w;
        switch (i) {
            case 0:
                zn.f viewableRecordSnapshot = (zn.f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = (n) globalSearchScreen.g3();
                nVar.getClass();
                Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
                nVar.f193086q.f(viewableRecordSnapshot);
                break;
            default:
                r rVar = (r) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!Intrinsics.f(rVar, globalSearchScreen.f74630v0)) {
                    r rVar2 = globalSearchScreen.f74630v0;
                    if (rVar2 != null) {
                        globalSearchScreen.i3(rVar2);
                    }
                    globalSearchScreen.f74630v0 = rVar;
                }
                break;
        }
        return Unit.f186387a;
    }
}
