package vo8;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ LargeActionButtonDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b f290888w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(LargeActionButtonDelegate.Model model, com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = model;
        this.f290888w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j0(this.v, this.f290888w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        eb8.e eVar;
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = this.f290888w;
        Continuation continuation = null;
        if (i == 0) {
            yhm.o.b(obj2);
            LargeActionButtonDelegate.Model model = this.v;
            String str2 = model.f52613a;
            if (Intrinsics.f(str2, "ID_TRANSFER_JUNIOR_BALANCE_CONFIRM")) {
                Object obj3 = model.i;
                eb8.f fVar = obj3 instanceof eb8.f ? (eb8.f) obj3 : null;
                if (fVar != null && (eVar = fVar.f124304c) != null && (str = eVar.f124299a) != null) {
                    vc2.s sVar = new vc2.s(bVar, str, continuation, 23);
                    this.u = 1;
                    if (u0.c0(bVar, "LOADING_TAG_TRANSFER_JUNIOR_BALANCE_CONFIRM", sVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (!Intrinsics.f(str2, "ID_TRANSFER_JUNIOR_BALANCE_CANCEL")) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Could not handle large button click, listId = ", model.f52613a));
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        j60.a.v(bVar.u, false, null, 3);
        return Unit.f186387a;
    }
}
