package pni;

import com.revolut.data.model.Data;
import com.revolut.otp.input.flow.common.OtpInvalidException;
import com.revolut.otp.input.flow.common.OtpRetryFailedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f237825w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f237825w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f237825w, continuation, 0);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(this.f237825w, continuation, 1);
                wVar2.v = obj2;
                return wVar2;
            default:
                w wVar3 = new w(this.f237825w, continuation, 2);
                wVar3.v = obj2;
                return wVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((w) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x xVar = this.f237825w;
        switch (i) {
            case 0:
                String value = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.checkNotNullParameter(value, "value");
                xVar.C2(new q(value));
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data.getLoading()) {
                    xVar.X1(new lii.c("LOADING_TAG_PRIMARY_BUTTON"));
                } else if (data.getError() instanceof OtpInvalidException) {
                    xVar.t1(new lii.c("LOADING_TAG_PRIMARY_BUTTON"));
                    tz4.d.s(xVar, data);
                } else if (data.getError() != null) {
                    xVar.t1(new lii.c("LOADING_TAG_PRIMARY_BUTTON"));
                    xVar.X().a();
                }
                return Unit.f186387a;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data2.getLoading()) {
                    xVar.X1(new lii.c("LOADING_TAG_PRIMARY_BUTTON"));
                } else if (data2.getError() instanceof OtpRetryFailedException) {
                    xVar.t1(new lii.c("LOADING_TAG_PRIMARY_BUTTON"));
                    tz4.d.t(xVar);
                } else if (data2.getError() != null) {
                    xVar.t1(new lii.c("LOADING_TAG_PRIMARY_BUTTON"));
                    xVar.X().a();
                } else if (data2.getContent() != null) {
                    xVar.t1(new lii.c("LOADING_TAG_PRIMARY_BUTTON"));
                    xVar.I2();
                    Object content = data2.getContent();
                    if (content == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String str = ((mni.c) content).f207512a;
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() > 0) {
                        xVar.H2(xVar.f237829s, new pig.y(str, 7));
                    }
                }
                return Unit.f186387a;
        }
    }
}
