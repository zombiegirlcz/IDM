package jgd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f173980b;

    public /* synthetic */ p(x xVar, int i) {
        this.f173979a = i;
        this.f173980b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        j updateState = (j) obj2;
        switch (this.f173979a) {
            case 0:
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return j.a((j) this.f173980b.t2(), null, false, 7);
            case 1:
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return j.a((j) this.f173980b.t2(), null, false, 13);
            default:
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return j.a((j) this.f173980b.t2(), null, true, 13);
        }
    }
}
