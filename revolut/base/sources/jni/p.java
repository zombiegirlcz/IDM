package jni;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.otp.input.flow.common.OtpInvalidException;
import com.revolut.otp.input.flow.common.OtpRetryFailedException;
import grl.jb;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f176800w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f176800w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f176800w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f176800w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            default:
                p pVar3 = new p(this.f176800w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 11;
        s sVar = this.f176800w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.v, new jb8.a(str, 8));
                return Unit.f186387a;
            case 1:
                y yVar = sVar.v;
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object objComponent1 = data.component1();
                Throwable error = data.getError();
                if (data.getLoading()) {
                    sVar.H2(yVar, new jn2.a(13));
                } else if (error instanceof OtpInvalidException) {
                    sVar.H2(yVar, new jn2.a(14));
                    s.I2(sVar, jb.Failure);
                } else if (error != null) {
                    sVar.H2(yVar, new jn2.a(i2));
                    sVar.X().a();
                } else if (objComponent1 != null) {
                    s.I2(sVar, jb.Success);
                }
                return Unit.f186387a;
            default:
                y yVar2 = sVar.v;
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data2.getLoading()) {
                    sVar.H2(yVar2, new jn2.a(15));
                } else if (data2.getError() instanceof OtpRetryFailedException) {
                    sVar.H2(yVar2, new jn2.a(16));
                    tz4.d.t(sVar);
                } else if (data2.getError() != null) {
                    sVar.H2(yVar2, new jn2.a(i2));
                    sVar.X().a();
                } else if (data2.getContent() != null) {
                    sVar.H2(yVar2, new jn2.a(17));
                    sVar.s1();
                    sVar.J2();
                    Object content = data2.getContent();
                    if (content == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    mni.c cVar = (mni.c) content;
                    int i3 = o.f176798b[cVar.f207514c.ordinal()];
                    lni.b bVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? ((e) ((j2) yVar2.f22677a).getValue()).f : lni.b.WHATSAPP : lni.b.TELEPHONE : lni.b.SMS;
                    String str2 = cVar.f207512a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sVar.H2(yVar2, new je2.d(str2, bVar, 26));
                }
                return Unit.f186387a;
        }
    }
}
