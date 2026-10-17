package vm;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import ufm.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements um.b {
    @Override // um.b
    public final d0 a(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        f fVar = new f(d(errorData), new vif.c(new a(this, errorData), 26), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return fVar;
    }

    public abstract d0 d(um.a aVar);
}
