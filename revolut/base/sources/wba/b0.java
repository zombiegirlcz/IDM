package wba;

import com.revolut.feature.pix.api.model.PixQrCodeScheduleData;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f296064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LocalDate f296065x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(e0 e0Var, LocalDate localDate, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f296064w = e0Var;
        this.f296065x = localDate;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0(this.f296064w, this.f296065x, continuation, 0);
            case 1:
                return new b0(this.f296064w, this.f296065x, continuation, 1);
            default:
                return new b0(this.f296064w, this.f296065x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                e0 e0Var = this.f296064w;
                i iVar = e0Var.o;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    s8a.l lVar = e0Var.f296068p;
                    dj0.d dVar = iVar.f296077b;
                    String strL = m70.a.l(((h) ((j2) e0Var.f296072t.f22677a).getValue()).f296074b);
                    String str = iVar.f296076a;
                    String str2 = this.f296065x.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    PixQrCodeScheduleData pixQrCodeScheduleData = new PixQrCodeScheduleData(dVar, strL, str, str2);
                    this.v = 1;
                    if (lVar.b(pixQrCodeScheduleData, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    e0 e0Var2 = this.f296064w;
                    b0 b0Var = new b0(e0Var2, this.f296065x, null, 0);
                    this.v = 1;
                    if (do3.q.t(e0Var2, b0Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    e0 e0Var3 = this.f296064w;
                    b0 b0Var2 = new b0(e0Var3, this.f296065x, null, 1);
                    this.v = 1;
                    if (u0.b0(e0Var3.X(), "SUBMIT_BUTTON_TAG", b0Var2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
