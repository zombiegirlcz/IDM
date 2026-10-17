package knd;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f186158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f186159c;

    public /* synthetic */ z0(h1 h1Var, Ref$ObjectRef ref$ObjectRef, int i) {
        this.f186157a = i;
        this.f186158b = h1Var;
        this.f186159c = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f186157a) {
            case 0:
                h1 h1Var = this.f186158b;
                ukm.j0 j0Var = h1Var.e;
                if (j0Var != null) {
                    Object obj2 = this.f186159c.f186409a;
                    if (obj2 == null) {
                        Intrinsics.r("currentModifyActor");
                        throw null;
                    }
                    if (Intrinsics.f(j0Var, (ukm.j0) obj2)) {
                        h1Var.e = null;
                    }
                }
                return Unit.f186387a;
            default:
                h1 h1Var2 = this.f186158b;
                ukm.j0 j0Var2 = h1Var2.d;
                if (j0Var2 != null) {
                    Object obj3 = this.f186159c.f186409a;
                    if (obj3 == null) {
                        Intrinsics.r("currentLoadIntervalActor");
                        throw null;
                    }
                    if (Intrinsics.f(j0Var2, (ukm.j0) obj3)) {
                        h1Var2.d = null;
                    }
                }
                return Unit.f186387a;
        }
    }
}
