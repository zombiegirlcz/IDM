package vp7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.claims_details.ClaimsDetailsScreen;
import ip0.y;
import java.util.ArrayList;
import kl7.n1;
import kl7.p1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ClaimsDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ClaimsDetailsScreen claimsDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = claimsDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVar = (k) this.v.Y.getValue();
        Object obj3 = yVar.f167227c;
        Object obj4 = yVar.f167226b.f58324n;
        r rVar = (r) kVar;
        rVar.getClass();
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.data.model.PositionalQuestion");
        n1 n1Var = (n1) obj3;
        final int i = n1Var.f185362a;
        p1 p1Var = n1Var.f185363b;
        Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.Boolean");
        final boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        int i2 = q.f291132a[p1Var.ordinal()];
        final int i3 = 1;
        if (i2 == 1) {
            final int i5 = 0;
            rVar.x2(new Function1() { // from class: vp7.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    i updateState = (i) obj5;
                    switch (i5) {
                        case 0:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            ArrayList arrayList = updateState.f291116a;
                            ArrayList details = new ArrayList(w.t(arrayList, 10));
                            int i6 = 0;
                            for (Object objA : arrayList) {
                                int i21 = i6 + 1;
                                if (i6 < 0) {
                                    v.s();
                                    throw null;
                                }
                                if (i6 == i) {
                                    objA = b.a((b) objA, null, null, Boolean.valueOf(!zBooleanValue), null, 11);
                                }
                                details.add(objA);
                                i6 = i21;
                            }
                            Intrinsics.checkNotNullParameter(details, "details");
                            return new i(details);
                        default:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            ArrayList arrayList2 = updateState.f291116a;
                            ArrayList details2 = new ArrayList(w.t(arrayList2, 10));
                            int i22 = 0;
                            for (Object objA2 : arrayList2) {
                                int i32 = i22 + 1;
                                if (i22 < 0) {
                                    v.s();
                                    throw null;
                                }
                                if (i22 == i) {
                                    objA2 = b.a((b) objA2, null, null, null, Boolean.valueOf(zBooleanValue), 7);
                                }
                                details2.add(objA2);
                                i22 = i32;
                            }
                            Intrinsics.checkNotNullParameter(details2, "details");
                            return new i(details2);
                    }
                }
            });
        } else {
            if (i2 != 2) {
                throw new IllegalStateException(("unexpected question " + p1Var).toString());
            }
            rVar.x2(new Function1() { // from class: vp7.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    i updateState = (i) obj5;
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            ArrayList arrayList = updateState.f291116a;
                            ArrayList details = new ArrayList(w.t(arrayList, 10));
                            int i6 = 0;
                            for (Object objA : arrayList) {
                                int i21 = i6 + 1;
                                if (i6 < 0) {
                                    v.s();
                                    throw null;
                                }
                                if (i6 == i) {
                                    objA = b.a((b) objA, null, null, Boolean.valueOf(!zBooleanValue), null, 11);
                                }
                                details.add(objA);
                                i6 = i21;
                            }
                            Intrinsics.checkNotNullParameter(details, "details");
                            return new i(details);
                        default:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            ArrayList arrayList2 = updateState.f291116a;
                            ArrayList details2 = new ArrayList(w.t(arrayList2, 10));
                            int i22 = 0;
                            for (Object objA2 : arrayList2) {
                                int i32 = i22 + 1;
                                if (i22 < 0) {
                                    v.s();
                                    throw null;
                                }
                                if (i22 == i) {
                                    objA2 = b.a((b) objA2, null, null, null, Boolean.valueOf(zBooleanValue), 7);
                                }
                                details2.add(objA2);
                                i22 = i32;
                            }
                            Intrinsics.checkNotNullParameter(details2, "details");
                            return new i(details2);
                    }
                }
            });
        }
        return Unit.f186387a;
    }
}
