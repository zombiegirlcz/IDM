package wba;

import com.revolut.feature.pix.api.model.PixQrCodeTransferResult;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.l1;
import nii.m0;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f296066w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(e0 e0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f296066w = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0(this.f296066w, continuation, 0);
            default:
                return new c0(this.f296066w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j jVar = j.f296081a;
        int i2 = 2;
        Continuation continuation = null;
        final e0 e0Var = this.f296066w;
        final int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    LocalDate localDateI = oc.c.I(((h) ((j2) e0Var.f296072t.f22677a).getValue()).d.f104285a);
                    final int i6 = 0;
                    nii.b bVar = new nii.b() { // from class: wba.a0
                        @Override // nii.p1
                        public final m0 a(Object obj3) {
                            Throwable th10 = (Throwable) obj3;
                            switch (i6) {
                            }
                            return e0Var.f296071s.b(th10);
                        }
                    };
                    a3b.i iVar = new a3b.i(e0Var, localDateI, 24);
                    b0 b0Var = new b0(e0Var, localDateI, continuation, i2);
                    this.v = 1;
                    obj2 = n14.k.P(e0Var.X(), null, bVar, iVar, b0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.e eVar = (nii.e) obj2;
                if (eVar instanceof nii.d) {
                    e0Var.C2(p.f296087a);
                    Unit unit = Unit.f186387a;
                } else {
                    if (!(eVar instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((nii.c) eVar).f216124b instanceof l1) {
                        e0Var.C2(jVar);
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    nii.b bVar2 = new nii.b() { // from class: wba.a0
                        @Override // nii.p1
                        public final m0 a(Object obj3) {
                            Throwable th10 = (Throwable) obj3;
                            switch (i3) {
                            }
                            return e0Var.f296071s.b(th10);
                        }
                    };
                    vkj.l lVar = new vkj.l(e0Var, i3);
                    d0 d0Var = new d0(e0Var, continuation, i2);
                    this.v = 1;
                    obj2 = n14.k.P(e0Var.X(), null, bVar2, lVar, d0Var, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.e eVar2 = (nii.e) obj2;
                if (eVar2 instanceof nii.d) {
                    e0Var.C2(new q(((PixQrCodeTransferResult) ((nii.d) eVar2).f216133a).f80478a));
                    Unit unit2 = Unit.f186387a;
                } else {
                    if (!(eVar2 instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((nii.c) eVar2).f216124b instanceof l1) {
                        e0Var.C2(jVar);
                    }
                }
                return Unit.f186387a;
        }
    }
}
