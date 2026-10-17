package klf;

import com.revolut.feature.recurring_payments.api.RecurringPaymentApi$Toggles$PredictedSubscriptions;
import kkf.m5;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class z2 {

    @NotNull
    public static final t2 Companion = new t2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k71.i f185622c;
    public final xua.a d;
    public final gte.a e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f185623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f185624h;
    public final Lazy i;

    public z2(CoroutineScope coroutineScope, h0 commonDataSource, k71.i transactionDescriptor, xua.a recurringPaymentInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f185620a = coroutineScope;
        this.f185621b = commonDataSource;
        this.f185622c = transactionDescriptor;
        this.d = recurringPaymentInteractor;
        this.e = featureToggleInteractor;
        final int i = 0;
        this.f = yhm.j.b(new Function0(this) { // from class: klf.s2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z2 f185575b;

            {
                this.f185575b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        z2 z2Var = this.f185575b;
                        return edl.a.r(new x2(rd0.e.n(zi0.c.w(rd0.e.b(xua.a.a(z2Var.d, null, 2))), zhm.h0.f322473a), z2Var, 0), z2Var.f185620a);
                    case 1:
                        z2 z2Var2 = this.f185575b;
                        if (!((jte.d) z2Var2.e).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c)) {
                            return new go.g(null, 2);
                        }
                        yua.q qVar = (yua.q) z2Var2.d;
                        sfm.b bVar = new sfm.b(qVar.m(), new yta.c(16, new yua.g(qVar, 0)), 2);
                        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                        return edl.a.r(new x2(rd0.e.n(zi0.c.w(rd0.e.b(bVar)), zhm.h0.f322473a), z2Var2, 1), z2Var2.f185620a);
                    case 2:
                        z2 z2Var3 = this.f185575b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new w1(2, 1, continuation), vkm.q.Q(z2Var3.f185621b.h(new kkk.u(22)), new m5(continuation, z2Var3, 29))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), z2Var3.f185620a);
                    default:
                        z2 z2Var4 = this.f185575b;
                        Flow flowQ2 = vkm.q.q(vkm.q.Q(z2Var4.f185621b.h(new kkk.u(22)), new m5(null, z2Var4, 29)));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ2, oji.e.f225788b), z2Var4.f185620a);
                }
            }
        });
        final int i2 = 1;
        this.f185623g = yhm.j.b(new Function0(this) { // from class: klf.s2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z2 f185575b;

            {
                this.f185575b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        z2 z2Var = this.f185575b;
                        return edl.a.r(new x2(rd0.e.n(zi0.c.w(rd0.e.b(xua.a.a(z2Var.d, null, 2))), zhm.h0.f322473a), z2Var, 0), z2Var.f185620a);
                    case 1:
                        z2 z2Var2 = this.f185575b;
                        if (!((jte.d) z2Var2.e).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c)) {
                            return new go.g(null, 2);
                        }
                        yua.q qVar = (yua.q) z2Var2.d;
                        sfm.b bVar = new sfm.b(qVar.m(), new yta.c(16, new yua.g(qVar, 0)), 2);
                        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                        return edl.a.r(new x2(rd0.e.n(zi0.c.w(rd0.e.b(bVar)), zhm.h0.f322473a), z2Var2, 1), z2Var2.f185620a);
                    case 2:
                        z2 z2Var3 = this.f185575b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new w1(2, 1, continuation), vkm.q.Q(z2Var3.f185621b.h(new kkk.u(22)), new m5(continuation, z2Var3, 29))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), z2Var3.f185620a);
                    default:
                        z2 z2Var4 = this.f185575b;
                        Flow flowQ2 = vkm.q.q(vkm.q.Q(z2Var4.f185621b.h(new kkk.u(22)), new m5(null, z2Var4, 29)));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ2, oji.e.f225788b), z2Var4.f185620a);
                }
            }
        });
        final int i3 = 2;
        this.f185624h = yhm.j.b(new Function0(this) { // from class: klf.s2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z2 f185575b;

            {
                this.f185575b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        z2 z2Var = this.f185575b;
                        return edl.a.r(new x2(rd0.e.n(zi0.c.w(rd0.e.b(xua.a.a(z2Var.d, null, 2))), zhm.h0.f322473a), z2Var, 0), z2Var.f185620a);
                    case 1:
                        z2 z2Var2 = this.f185575b;
                        if (!((jte.d) z2Var2.e).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c)) {
                            return new go.g(null, 2);
                        }
                        yua.q qVar = (yua.q) z2Var2.d;
                        sfm.b bVar = new sfm.b(qVar.m(), new yta.c(16, new yua.g(qVar, 0)), 2);
                        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                        return edl.a.r(new x2(rd0.e.n(zi0.c.w(rd0.e.b(bVar)), zhm.h0.f322473a), z2Var2, 1), z2Var2.f185620a);
                    case 2:
                        z2 z2Var3 = this.f185575b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new w1(2, 1, continuation), vkm.q.Q(z2Var3.f185621b.h(new kkk.u(22)), new m5(continuation, z2Var3, 29))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), z2Var3.f185620a);
                    default:
                        z2 z2Var4 = this.f185575b;
                        Flow flowQ2 = vkm.q.q(vkm.q.Q(z2Var4.f185621b.h(new kkk.u(22)), new m5(null, z2Var4, 29)));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ2, oji.e.f225788b), z2Var4.f185620a);
                }
            }
        });
        final int i5 = 3;
        this.i = yhm.j.b(new Function0(this) { // from class: klf.s2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z2 f185575b;

            {
                this.f185575b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        z2 z2Var = this.f185575b;
                        return edl.a.r(new x2(rd0.e.n(zi0.c.w(rd0.e.b(xua.a.a(z2Var.d, null, 2))), zhm.h0.f322473a), z2Var, 0), z2Var.f185620a);
                    case 1:
                        z2 z2Var2 = this.f185575b;
                        if (!((jte.d) z2Var2.e).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c)) {
                            return new go.g(null, 2);
                        }
                        yua.q qVar = (yua.q) z2Var2.d;
                        sfm.b bVar = new sfm.b(qVar.m(), new yta.c(16, new yua.g(qVar, 0)), 2);
                        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                        return edl.a.r(new x2(rd0.e.n(zi0.c.w(rd0.e.b(bVar)), zhm.h0.f322473a), z2Var2, 1), z2Var2.f185620a);
                    case 2:
                        z2 z2Var3 = this.f185575b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new w1(2, 1, continuation), vkm.q.Q(z2Var3.f185621b.h(new kkk.u(22)), new m5(continuation, z2Var3, 29))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), z2Var3.f185620a);
                    default:
                        z2 z2Var4 = this.f185575b;
                        Flow flowQ2 = vkm.q.q(vkm.q.Q(z2Var4.f185621b.h(new kkk.u(22)), new m5(null, z2Var4, 29)));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ2, oji.e.f225788b), z2Var4.f185620a);
                }
            }
        });
    }

    public final SharedFlow a() {
        return (SharedFlow) this.f.getValue();
    }
}
