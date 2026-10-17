package wba;

import com.revolut.feature.pix.api.model.PixQrCodeAmount;
import com.revolut.feature.pix.api.model.PixQrCodeChange;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeResult;
import com.revolut.feature.pix.api.model.PixQrCodeTransferData;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f296067w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f296067w = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0(this.f296067w, continuation, 0);
            case 1:
                return new d0(this.f296067w, continuation, 1);
            case 2:
                return new d0(this.f296067w, continuation, 2);
            case 3:
                return new d0(this.f296067w, continuation, 3);
            default:
                return new d0(this.f296067w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        PixQrCodeAmount pixQrCodeAmount;
        switch (this.u) {
            case 0:
                e0 e0Var = this.f296067w;
                cli.y yVar = e0Var.f296072t;
                i iVar = e0Var.o;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                s8a.l lVar = e0Var.f296068p;
                dj0.d dVar = iVar.f296077b;
                PixQrCodeChange pixQrCodeChange = ((h) ((j2) yVar.f22677a).getValue()).f296075c.f80448g;
                PixQrCodeTransferData pixQrCodeTransferData = new PixQrCodeTransferData(dVar, (pixQrCodeChange == null || (pixQrCodeAmount = pixQrCodeChange.f80431a) == null) ? null : pixQrCodeAmount.f80424a, m70.a.l(((h) ((j2) yVar.f22677a).getValue()).f296074b), iVar.f296076a, null, true);
                this.v = 1;
                Object objC = lVar.c(pixQrCodeTransferData, this);
                return objC == aVar ? aVar : objC;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e0 e0Var2 = this.f296067w;
                d0 d0Var = new d0(e0Var2, null, 0);
                this.v = 1;
                Object objT = do3.q.t(e0Var2, d0Var, this);
                return objT == aVar2 ? aVar2 : objT;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e0 e0Var3 = this.f296067w;
                d0 d0Var2 = new d0(e0Var3, null, 1);
                this.v = 1;
                Object objB0 = u0.b0(e0Var3.X(), "SUBMIT_BUTTON_TAG", d0Var2, this);
                return objB0 == aVar3 ? aVar3 : objB0;
            case 3:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    e0 e0Var4 = this.f296067w;
                    s8a.l lVar2 = e0Var4.f296068p;
                    String transactionId = e0Var4.o.f296076a;
                    this.v = 1;
                    lVar2.getClass();
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    obj2 = vkm.q.x(new v1(new s8a.i(lVar2, transactionId, null)), this);
                    if (obj2 != obj3) {
                    }
                    return obj3;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                obj3 = ((PixQrCodeDecodeResult) obj2).f;
                if (obj3 == null) {
                    throw new NoSuchElementException();
                }
                return obj3;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e0 e0Var5 = this.f296067w;
                d0 d0Var3 = new d0(e0Var5, null, 3);
                this.v = 1;
                Object objB02 = u0.b0(e0Var5.X(), "SUBMIT_BUTTON_TAG", d0Var3, this);
                return objB02 == aVar4 ? aVar4 : objB02;
        }
    }
}
