package ho8;

import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreen;
import hg0.n;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoparentsSettingsScreen f154240w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CoparentsSettingsScreen coparentsSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f154240w = coparentsSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f154240w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f154240w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        CoparentsSettingsScreen coparentsSettingsScreen = this.f154240w;
        switch (i) {
            case 0:
                um0 item = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar = (f) coparentsSettingsScreen.Y.getValue();
                Intrinsics.h(item);
                j jVar = (j) fVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                if (Intrinsics.f(item.f166695a, "DIALOG_BUTTON_ID")) {
                    j60.a.v(jVar.f154253w, false, null, 3);
                    jVar.n2(new n(jVar, item, continuation, 14), new whi.b(6));
                }
                break;
            default:
                um0 item2 = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar2 = (f) coparentsSettingsScreen.Y.getValue();
                Intrinsics.h(item2);
                j jVar2 = (j) fVar2;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(item2, "item");
                if (Intrinsics.f(item2.f166695a, "DIALOG_BUTTON_ID")) {
                    j60.a.v(jVar2.f154253w, false, null, 3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
