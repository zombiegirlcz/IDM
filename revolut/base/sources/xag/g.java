package xag;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.b f303883a;

    public g() {
        ihm.b bVarE = ihm.b.e(new c(0));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f303883a = bVarE;
    }

    public final c a() {
        Object objF = this.f303883a.f();
        if (objF != null) {
            return (c) objF;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void b(Function1 func) {
        Intrinsics.checkNotNullParameter(func, "func");
        this.f303883a.onNext(func.invoke(a()));
    }
}
