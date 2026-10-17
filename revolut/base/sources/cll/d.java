package cll;

import androidx.core.util.Consumer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Consumer, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f25053a;

    public d(ce9.a function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f25053a = function;
    }

    @Override // androidx.core.util.Consumer
    public final /* synthetic */ void accept(Object obj2) {
        this.f25053a.invoke(obj2);
    }

    public final boolean equals(Object obj2) {
        if ((obj2 instanceof Consumer) && (obj2 instanceof n)) {
            return Intrinsics.f(getFunctionDelegate(), ((n) obj2).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        return this.f25053a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
