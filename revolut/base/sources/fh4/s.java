package fh4;

import a31.w;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreenContract$InputData;
import dx4.c3;
import dx4.j3;
import dx4.k3;
import dx4.n4;
import dx4.p4;
import ft3.h1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c f135145w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f135145w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f135145w, continuation, 0);
            default:
                return new s(this.f135145w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        String str;
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c cVar = this.f135145w;
        switch (i) {
            case 0:
                RefinancingAccountDetailsInputScreenContract$InputData refinancingAccountDetailsInputScreenContract$InputData = cVar.f68279p;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    ay3.a aVar2 = cVar.o;
                    h1 productPayload = w0.F(refinancingAccountDetailsInputScreenContract$InputData.d);
                    String str2 = refinancingAccountDetailsInputScreenContract$InputData.f68267a;
                    n nVar = o.Companion;
                    p4 p4Var = refinancingAccountDetailsInputScreenContract$InputData.f68268b;
                    nVar.getClass();
                    switch (r.f135144a[n.a(p4Var).ordinal()]) {
                        case 1:
                            String strJ2 = cVar.J2();
                            str = strJ2 != null ? strJ2 : "";
                            e44.b bVar = aVar2.f11057a;
                            bVar.getClass();
                            dp4.p pVar = new dp4.p(bVar, productPayload, new y14.e(str2, str), (Continuation) null, 13);
                            p0 p0Var = p0.f264001a;
                            obj2 = e0.J(elm.f.f127540b, pVar, this);
                            break;
                        case 2:
                            String strJ22 = cVar.J2();
                            str = strJ22 != null ? strJ22 : "";
                            e44.b bVar2 = aVar2.f11057a;
                            bVar2.getClass();
                            dp4.p pVar2 = new dp4.p(bVar2, productPayload, new y14.c(str2, str), (Continuation) null, 12);
                            p0 p0Var2 = p0.f264001a;
                            obj2 = e0.J(elm.f.f127540b, pVar2, this);
                            break;
                        case 3:
                            k3 k3VarI2 = cVar.I2();
                            j3 j3Var = k3VarI2 != null ? k3VarI2.d : null;
                            c3 c3Var = j3Var instanceof c3 ? (c3) j3Var : null;
                            String strJ23 = cVar.J2();
                            LocalDate localDate = LocalDate.parse(strJ23 != null ? strJ23 : "", DateTimeFormatter.ofPattern(c3Var != null ? c3Var.f120566b : null));
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            e44.b bVar3 = aVar2.f11057a;
                            String str3 = localDate.format(bVar3.f);
                            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                            dp4.p pVar3 = new dp4.p(bVar3, productPayload, new y14.b(str2, str3), (Continuation) null, 11);
                            p0 p0Var3 = p0.f264001a;
                            obj2 = e0.J(elm.f.f127540b, pVar3, this);
                            break;
                        case 4:
                            String strJ24 = cVar.J2();
                            e44.b bVar4 = aVar2.f11057a;
                            bVar4.getClass();
                            w wVar = new w(str2, strJ24, bVar4, productPayload, (Continuation) null);
                            p0 p0Var4 = p0.f264001a;
                            obj2 = e0.J(elm.f.f127540b, wVar, this);
                            break;
                        case 5:
                            e44.b bVar5 = aVar2.f11057a;
                            bVar5.getClass();
                            Intrinsics.checkNotNullParameter(productPayload, "productPayload");
                            w4l.h loadingStrategy = w4l.h.f294642c;
                            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                            obj2 = vkm.q.x(mo3.a.e(zi0.c.w(bVar5.e.b(new e44.a(productPayload), loadingStrategy)), new av8.n(productPayload, 6), new axd.e(2)), this);
                            break;
                        case 6:
                            throw new IllegalStateException("Screen id not supported");
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                for (n4 n4Var : ((lv3.a) obj2).e) {
                    if (Intrinsics.f(n4Var.f120689a, refinancingAccountDetailsInputScreenContract$InputData.f68267a)) {
                        cVar.C2(new l(n4Var.f120690b));
                        return Unit.f186387a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    s sVar = new s(cVar, null, 0);
                    this.v = 1;
                    if (cVar.p2(this, sVar) == aVar3) {
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
