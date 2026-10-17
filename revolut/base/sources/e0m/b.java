package e0m;

import akl.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f121743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f121744b;

    public b(Function0 initMethod) {
        Intrinsics.checkNotNullParameter(initMethod, "initMethod");
        this.f121743a = initMethod;
        this.f121744b = new c(new s(this, 11));
    }

    @Override // e0m.d
    public final void init() {
        this.f121744b.a(Unit.f186387a);
    }
}
