package af9;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.password.ui.create_password.CreatePasswordScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreatePasswordScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CreatePasswordScreen createPasswordScreen, Continuation continuation) {
        super(2, continuation);
        this.v = createPasswordScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.O.getValue();
        String listId = textData.f52597a;
        String value = textData.f52598b.toString();
        y yVar = jVar.f3973p;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.f(listId, "LIST_ID_ENTER_PASSWORD")) {
            if (value.length() == 0) {
                jVar.H2(yVar, new a31.g(value, jVar, 19));
            }
            ye9.c cVarB = jVar.o.b(value);
            if (cVarB instanceof ye9.a) {
                ye9.a aVar2 = (ye9.a) cVarB;
                if (aVar2.f312821a.isEmpty()) {
                    throw new IllegalArgumentException("validation errors cannot be empty");
                }
                jVar.H2(yVar, new acb.f(value, aVar2, jVar));
            } else {
                if (!(cVarB instanceof ye9.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar.H2(yVar, new a31.g(value, jVar, 20));
            }
        } else {
            if (!Intrinsics.f(listId, "LIST_ID_CONFIRM_PASSWORD")) {
                throw new IllegalStateException((listId + " list id is not expected here").toString());
            }
            jVar.H2(yVar, new a31.g(value, jVar, 21));
        }
        return Unit.f186387a;
    }
}
