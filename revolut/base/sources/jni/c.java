package jni;

import cli.y;
import com.revolut.otp.input.flow.code.OtpCodeInputScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OtpCodeInputScreen f176784w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(OtpCodeInputScreen otpCodeInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f176784w = otpCodeInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f176784w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f176784w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((qx0.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aii.r hVar;
        int i = this.u;
        OtpCodeInputScreen otpCodeInputScreen = this.f176784w;
        switch (i) {
            case 0:
                String text = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar = (l) otpCodeInputScreen.Q.getValue();
                Intrinsics.h(text);
                s sVar = (s) lVar;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                sVar.n2(new jec.p(sVar, text, null, 19), new whi.b(6));
                return Unit.f186387a;
            default:
                qx0.c cVar = (qx0.c) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String code = cVar.f249975a;
                boolean z = cVar.f249976b;
                s sVar2 = (s) ((l) otpCodeInputScreen.Q.getValue());
                sVar2.getClass();
                Intrinsics.checkNotNullParameter(code, "code");
                y yVar = sVar2.v;
                sVar2.H2(yVar, new a31.i(code, z, 6));
                int i2 = o.f176797a[((e) ((j2) yVar.f22677a).getValue()).f.ordinal()];
                if (i2 == 1) {
                    hVar = new h(code, z);
                } else if (i2 == 2) {
                    hVar = new i(code);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar = new j(code);
                }
                sVar2.C2(hVar);
                return Unit.f186387a;
        }
    }
}
