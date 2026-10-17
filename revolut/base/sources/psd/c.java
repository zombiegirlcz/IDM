package psd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amd.f f239471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f239472b;

    public c(amd.f fVar, dj0.d totalBalance) {
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        this.f239471a = fVar;
        this.f239472b = totalBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f239471a, cVar.f239471a) && Intrinsics.f(this.f239472b, cVar.f239472b);
    }

    public final int hashCode() {
        amd.f fVar = this.f239471a;
        return this.f239472b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31);
    }
}
