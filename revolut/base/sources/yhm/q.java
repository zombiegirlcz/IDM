package yhm;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lyhm/q;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class q<T> implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f314198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f314199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f314200c;

    public q(Function0 initializer, Object obj2) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f314198a = initializer;
        this.f314199b = y.f314210a;
        this.f314200c = obj2 == null ? this : obj2;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object objInvoke;
        Object obj2 = this.f314199b;
        y yVar = y.f314210a;
        if (obj2 != yVar) {
            return obj2;
        }
        synchronized (this.f314200c) {
            objInvoke = this.f314199b;
            if (objInvoke == yVar) {
                Function0 function0 = this.f314198a;
                Intrinsics.h(function0);
                objInvoke = function0.invoke();
                this.f314199b = objInvoke;
                this.f314198a = null;
            }
        }
        return objInvoke;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f314199b != y.f314210a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ q(Function0 function0, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? null : obj2);
    }
}
