package hkk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f152956a = new o();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e state = (e) obj2;
        Intrinsics.checkNotNullParameter(state, "state");
        ggk.a aVar = (ggk.a) state.f152941a.getContent();
        if (aVar != null) {
            return aVar.f143697a;
        }
        return null;
    }
}
