package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f186404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext.Element f186405b;

    public c(CoroutineContext.Element element, CoroutineContext left) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f186404a = left;
        this.f186405b = element;
    }

    public final boolean equals(Object obj2) {
        boolean zF;
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof c) {
            c cVar = (c) obj2;
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.f186404a;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.f186404a;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                c cVar4 = this;
                while (true) {
                    CoroutineContext.Element element = cVar4.f186405b;
                    if (!Intrinsics.f(cVar.get(element.getKey()), element)) {
                        zF = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = cVar4.f186404a;
                    if (!(coroutineContext3 instanceof c)) {
                        Intrinsics.i(coroutineContext3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        zF = Intrinsics.f(cVar.get(element2.getKey()), element2);
                        break;
                    }
                    cVar4 = (c) coroutineContext3;
                }
                if (zF) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj2, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f186404a.fold(obj2, operation), this.f186405b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element element = cVar.f186405b.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = cVar.f186404a;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.get(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.f186405b.hashCode() + this.f186404a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.f186405b;
        CoroutineContext.Element element2 = element.get(key);
        CoroutineContext coroutineContext = this.f186404a;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(key);
        return coroutineContextMinusKey == coroutineContext ? this : coroutineContextMinusKey == g.f186406a ? element : new c(element, coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.f186406a ? this : (CoroutineContext) context.fold(this, new akg.d(18));
    }

    public final String toString() {
        return j6.a.u(new StringBuilder("["), (String) fold("", new eed.a(23)), ']');
    }
}
