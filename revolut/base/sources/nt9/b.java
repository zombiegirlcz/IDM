package nt9;

import aw0.n6;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.payments.groups.impl.ui_new.group_creation.GroupCreationScreen;
import e60.s;
import ip0.u00;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.m;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GroupCreationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GroupCreationScreen groupCreationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = groupCreationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        Object objA2;
        int i = this.u;
        GroupCreationScreen groupCreationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                groupCreationScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s) ((com.revolut.feature.payments.groups.impl.ui_new.group_creation.b) groupCreationScreen.R2()).f79482p).T(new e60.i(null, null, null, false, 0, 0, v.k(t80.f.JPEG, t80.f.PNG), null, false, u00.BACK, null, 15807));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar = (com.revolut.feature.payments.groups.impl.ui_new.group_creation.b) groupCreationScreen.R2();
                g gVar = (g) ((j2) bVar.f79487w.f22677a).getValue();
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = gVar.f218999a;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (objA == null) {
                    throw new IllegalStateException("Image is not available");
                }
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                if (objA instanceof yhm.n) {
                    objA = null;
                }
                Image image = (Image) objA;
                if (image != null) {
                    try {
                        objA2 = gVar.e;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Throwable th11) {
                        m.Companion companion3 = yhm.m.INSTANCE;
                        objA2 = yhm.o.a(th11);
                    }
                    if (objA2 == null) {
                        throw new IllegalStateException("Currency is not available");
                    }
                    Throwable thA2 = yhm.m.a(objA2);
                    if (thA2 != null) {
                        hx7.e.n(thA2);
                    }
                    xi0.b bVar2 = (xi0.b) (objA2 instanceof yhm.n ? null : objA2);
                    if (bVar2 != null) {
                        bVar.l2(new mtj.i(19, bVar, gVar, image, bVar2, (Continuation) null), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
        }
    }
}
