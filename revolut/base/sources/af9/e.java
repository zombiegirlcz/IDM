package af9;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.password.ui.create_password.CreatePasswordScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreatePasswordScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CreatePasswordScreen createPasswordScreen, Continuation continuation) {
        super(2, continuation);
        this.v = createPasswordScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        final j jVar = (j) this.v.O.getValue();
        String listId = model.f52580a;
        y yVar = jVar.f3973p;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_ENTER_PASSWORD")) {
            final int i = 0;
            jVar.H2(yVar, new Function1() { // from class: af9.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    switch (i) {
                        case 0:
                            f update = (f) obj3;
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return f.a(update, null, null, !((f) ((j2) jVar.f3973p.f22677a).getValue()).f3966c, null, false, false, false, 123);
                        default:
                            f update2 = (f) obj3;
                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                            return f.a(update2, null, null, false, null, !((f) ((j2) jVar.f3973p.f22677a).getValue()).e, false, false, LDSFile.EF_DG15_TAG);
                    }
                }
            });
        } else {
            if (!Intrinsics.f(listId, "LIST_ID_CONFIRM_PASSWORD")) {
                throw new IllegalStateException((listId + " list id is not expected here").toString());
            }
            final int i2 = 1;
            jVar.H2(yVar, new Function1() { // from class: af9.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    switch (i2) {
                        case 0:
                            f update = (f) obj3;
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return f.a(update, null, null, !((f) ((j2) jVar.f3973p.f22677a).getValue()).f3966c, null, false, false, false, 123);
                        default:
                            f update2 = (f) obj3;
                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                            return f.a(update2, null, null, false, null, !((f) ((j2) jVar.f3973p.f22677a).getValue()).e, false, false, LDSFile.EF_DG15_TAG);
                    }
                }
            });
        }
        return Unit.f186387a;
    }
}
