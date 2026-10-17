package db;

import com.feature.user.details.impl.ui.details.UserDetailsController;
import com.revolut.kompot.common.ExternalDestination;
import e60.l;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UserDetailsController f112605w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(UserDetailsController userDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112605w = userDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f112605w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f112605w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f112605w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        UserDetailsController userDetailsController = this.f112605w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = userDetailsController.R2();
                String url2 = aVar.f275445a;
                i0 i0Var = (i0) kVarE3;
                i0Var.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                i0Var.C1(new ExternalDestination.Browser(url2, null));
                break;
            case 1:
                e60.l lVar = (e60.l) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (lVar instanceof e60.m) {
                    k kVarE32 = userDetailsController.R2();
                    String imagePath = ((e60.m) lVar).b().getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(imagePath, "getAbsolutePath(...)");
                    i0 i0Var2 = (i0) kVarE32;
                    i0Var2.getClass();
                    Intrinsics.checkNotNullParameter(imagePath, "imagePath");
                    i0Var2.l2(new d3i.g(i0Var2, imagePath, continuation, 10), new yi5.b(26));
                } else if (lVar instanceof l.a) {
                    i0 i0Var3 = (i0) userDetailsController.R2();
                    i0Var3.getClass();
                    i0Var3.n2(new e0(i0Var3, continuation, 0), new whi.b(6));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Unsupported result: ".concat(lVar.getClass().getSimpleName()));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            default:
                String id10 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE33 = userDetailsController.R2();
                Intrinsics.h(id10);
                i0 i0Var4 = (i0) kVarE33;
                i0Var4.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                i0Var4.H2(i0Var4.B, new d7a.p(id10, 4));
                break;
        }
        return Unit.f186387a;
    }
}
