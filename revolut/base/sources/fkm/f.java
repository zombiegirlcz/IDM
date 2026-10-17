package fkm;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f135871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f135872b;

    public f(Object obj2, Function0 function0) {
        this.f135871a = obj2;
        this.f135872b = function0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return obj2 != null && f.class == obj2.getClass() && this.f135871a.equals(((f) obj2).f135871a);
    }

    public final int hashCode() {
        return this.f135871a.hashCode();
    }
}
