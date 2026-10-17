package gim;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h extends g implements o {
    private final int arity;

    public h(int i, Continuation continuation) {
        super(continuation);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.o
    public int getArity() {
        return this.arity;
    }

    @Override // gim.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strL = o0.f186429a.l(this);
        Intrinsics.checkNotNullExpressionValue(strL, "renderLambdaToString(...)");
        return strL;
    }
}
