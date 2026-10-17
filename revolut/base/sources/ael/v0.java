package ael;

import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class v0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f3672b;

    public /* synthetic */ v0(int i, Function1 function1) {
        this.f3671a = i;
        this.f3672b = function1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3671a) {
            case 0:
                return (efm.h0) this.f3672b.invoke(Boolean.FALSE);
            case 1:
                return (efm.h0) this.f3672b.invoke(Boolean.TRUE);
            default:
                return (efm.h0) this.f3672b.invoke(Boolean.FALSE);
        }
    }
}
