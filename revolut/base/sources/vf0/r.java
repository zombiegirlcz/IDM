package vf0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f288468b;

    public /* synthetic */ r(int i, Function1 function1) {
        this.f288467a = i;
        this.f288468b = function1;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public final Object apply(Object p0) {
        switch (this.f288467a) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) this.f288468b.invoke(p0);
            case 1:
                Throwable p03 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(p03, "p0");
                return this.f288468b.invoke(p03);
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return this.f288468b.invoke(p0);
        }
    }
}
