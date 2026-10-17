package c64;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f21649w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(b0 b0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21649w = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f21649w, continuation, 0);
                vVar.v = obj2;
                return vVar;
            default:
                v vVar2 = new v(this.f21649w, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        final int i2 = 1;
        final int i3 = 0;
        final b0 b0Var = this.f21649w;
        switch (i) {
            case 0:
                final Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f21614x, new Function1() { // from class: c64.s
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        p5l.c cVar;
                        switch (i3) {
                            case 0:
                                k update = (k) obj3;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                Data data2 = data;
                                if (data2.getLoading()) {
                                    return k.a(update, null, new Data(update.c(), data2.getError(), true), update.f21632c, false, 9);
                                }
                                b0 b0Var2 = b0Var;
                                b0Var2.l2(new bv4.h(b0Var2, 0 == true ? 1 : 0, 9), new yi5.b(26));
                                eu3.f fVar = (eu3.f) data2.getContent();
                                Data data3 = new Data(fVar != null ? fVar.f129494a : null, data2.getError(), false);
                                eu3.f fVar2 = (eu3.f) data2.getContent();
                                return k.a(update, null, data3, fVar2 != null ? fVar2.f129496c : null, false, 9);
                            default:
                                ax4.b updateConstructorState = (ax4.b) obj3;
                                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                                Data data4 = data;
                                eu3.f fVar3 = (eu3.f) data4.getContent();
                                b0 b0Var3 = b0Var;
                                if (fVar3 == null || (cVar = fVar3.f129495b) == null) {
                                    cVar = b0Var3.J2().f21630a.f10856a;
                                }
                                return ax4.b.a(updateConstructorState, cVar, null, null, null, null, null, null, null, null, data4.getLoading() ? b0Var3.J2().f21630a.f10861j : r0.g(), null, null, null, 7678);
                        }
                    }
                });
                b0Var.U1(new Function1() { // from class: c64.s
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        p5l.c cVar;
                        switch (i2) {
                            case 0:
                                k update = (k) obj3;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                Data data2 = data;
                                if (data2.getLoading()) {
                                    return k.a(update, null, new Data(update.c(), data2.getError(), true), update.f21632c, false, 9);
                                }
                                b0 b0Var2 = b0Var;
                                b0Var2.l2(new bv4.h(b0Var2, 0 == true ? 1 : 0, 9), new yi5.b(26));
                                eu3.f fVar = (eu3.f) data2.getContent();
                                Data data3 = new Data(fVar != null ? fVar.f129494a : null, data2.getError(), false);
                                eu3.f fVar2 = (eu3.f) data2.getContent();
                                return k.a(update, null, data3, fVar2 != null ? fVar2.f129496c : null, false, 9);
                            default:
                                ax4.b updateConstructorState = (ax4.b) obj3;
                                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                                Data data4 = data;
                                eu3.f fVar3 = (eu3.f) data4.getContent();
                                b0 b0Var3 = b0Var;
                                if (fVar3 == null || (cVar = fVar3.f129495b) == null) {
                                    cVar = b0Var3.J2().f21630a.f10856a;
                                }
                                return ax4.b.a(updateConstructorState, cVar, null, null, null, null, null, null, null, null, data4.getLoading() ? b0Var3.J2().f21630a.f10861j : r0.g(), null, null, null, 7678);
                        }
                    }
                });
                break;
            default:
                final Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f21614x, new Function1() { // from class: c64.s
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        p5l.c cVar;
                        switch (i3) {
                            case 0:
                                k update = (k) obj3;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                Data data22 = data2;
                                if (data22.getLoading()) {
                                    return k.a(update, null, new Data(update.c(), data22.getError(), true), update.f21632c, false, 9);
                                }
                                b0 b0Var2 = b0Var;
                                b0Var2.l2(new bv4.h(b0Var2, 0 == true ? 1 : 0, 9), new yi5.b(26));
                                eu3.f fVar = (eu3.f) data22.getContent();
                                Data data3 = new Data(fVar != null ? fVar.f129494a : null, data22.getError(), false);
                                eu3.f fVar2 = (eu3.f) data22.getContent();
                                return k.a(update, null, data3, fVar2 != null ? fVar2.f129496c : null, false, 9);
                            default:
                                ax4.b updateConstructorState = (ax4.b) obj3;
                                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                                Data data4 = data2;
                                eu3.f fVar3 = (eu3.f) data4.getContent();
                                b0 b0Var3 = b0Var;
                                if (fVar3 == null || (cVar = fVar3.f129495b) == null) {
                                    cVar = b0Var3.J2().f21630a.f10856a;
                                }
                                return ax4.b.a(updateConstructorState, cVar, null, null, null, null, null, null, null, null, data4.getLoading() ? b0Var3.J2().f21630a.f10861j : r0.g(), null, null, null, 7678);
                        }
                    }
                });
                b0Var.U1(new Function1() { // from class: c64.s
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        p5l.c cVar;
                        switch (i2) {
                            case 0:
                                k update = (k) obj3;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                Data data22 = data2;
                                if (data22.getLoading()) {
                                    return k.a(update, null, new Data(update.c(), data22.getError(), true), update.f21632c, false, 9);
                                }
                                b0 b0Var2 = b0Var;
                                b0Var2.l2(new bv4.h(b0Var2, 0 == true ? 1 : 0, 9), new yi5.b(26));
                                eu3.f fVar = (eu3.f) data22.getContent();
                                Data data3 = new Data(fVar != null ? fVar.f129494a : null, data22.getError(), false);
                                eu3.f fVar2 = (eu3.f) data22.getContent();
                                return k.a(update, null, data3, fVar2 != null ? fVar2.f129496c : null, false, 9);
                            default:
                                ax4.b updateConstructorState = (ax4.b) obj3;
                                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                                Data data4 = data2;
                                eu3.f fVar3 = (eu3.f) data4.getContent();
                                b0 b0Var3 = b0Var;
                                if (fVar3 == null || (cVar = fVar3.f129495b) == null) {
                                    cVar = b0Var3.J2().f21630a.f10856a;
                                }
                                return ax4.b.a(updateConstructorState, cVar, null, null, null, null, null, null, null, null, data4.getLoading() ? b0Var3.J2().f21630a.f10861j : r0.g(), null, null, null, 7678);
                        }
                    }
                });
                break;
        }
        return Unit.f186387a;
    }
}
