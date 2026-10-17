package jkg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f175162a;

    public a(e params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f175162a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f175162a, ((a) obj2).f175162a);
    }

    public final int hashCode() {
        return this.f175162a.hashCode();
    }
}
