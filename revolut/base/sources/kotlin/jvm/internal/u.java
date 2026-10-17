package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class u implements o, Serializable {
    private final int arity;

    public u(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.o
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String strM = o0.f186429a.m(this);
        Intrinsics.checkNotNullExpressionValue(strM, "renderLambdaToString(...)");
        return strM;
    }
}
