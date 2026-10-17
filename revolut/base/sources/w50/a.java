package w50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.d f294650a;

    public a(vim.d dVar) {
        this.f294650a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f294650a, ((a) obj2).f294650a);
    }

    public final int hashCode() {
        vim.d dVar = this.f294650a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
