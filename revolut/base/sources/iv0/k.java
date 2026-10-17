package iv0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f168683a;

    public k(Function1 function1) {
        this.f168683a = function1;
    }

    @Override // iv0.l
    public final void a(float f) {
        this.f168683a.invoke(Float.valueOf(f));
    }
}
