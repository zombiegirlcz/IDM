package dv5;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.fc;
import tof.i7;
import yhm.r;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i7 f118040b;

    public /* synthetic */ g(i7 i7Var, int i) {
        this.f118039a = i;
        this.f118040b = i7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f118039a) {
            case 0:
                i7 it8 = (i7) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return fc.a(it8, this.f118040b);
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new r(this.f118040b, (List) pair.f186385a, (k71.q) pair.f186386b);
            default:
                od0.i optionalFilter = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalFilter, "optionalFilter");
                return fc.c(this.f118040b, (i7) optionalFilter.g());
        }
    }
}
