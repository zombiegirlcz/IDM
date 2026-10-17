package azi;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import do3.q;
import h93.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.k1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f11467w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f11468x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f11467w = jVar;
        this.f11468x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f11467w, this.f11468x, continuation, 0);
            default:
                return new g(this.f11467w, this.f11468x, continuation, 1);
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
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                j jVar = this.f11467w;
                if (i == 0) {
                    o.b(obj2);
                    f fVar = new f(jVar, this.f11468x, null, 1);
                    this.v = 1;
                    obj2 = q.t(jVar, fVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                czi.e eVar = jVar.f11471p;
                String text = ((g0) obj2).f150129b;
                TextLocalisedClause message = new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14);
                eVar.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(message, "message");
                eVar.f110262a.a(null, text, true);
                if (!c70.a.g()) {
                    ((k1) eVar.f110263b).d(ShotDialogDisplayer$Configuration.Companion.e(ShotDialogDisplayer$Configuration.INSTANCE, "COPIED_TO_CLIPBOARD_ITEM", message, null, null, null, 60));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar2 = this.f11467w;
                f fVar2 = new f(jVar2, this.f11468x, null, 2);
                this.v = 1;
                Object objP2 = jVar2.p2(this, fVar2);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
