package zb1;

import jki.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zaj.f;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b extends bji.b {

    @NotNull
    public static final a Companion = new a();
    public static final f v = new f(1);
    public final ihm.b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        ihm.b bVarE = ihm.b.e(v);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.u = bVarE;
    }

    public final void B2() {
        this.u.onNext(v);
    }

    public final void C2(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.u.onNext(action);
    }
}
