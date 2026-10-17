package n7k;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f213172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f213173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f213174c;

    public /* synthetic */ c(int i, String str, jo3.a aVar, jo3.a aVar2) {
        if (7 != (i & 7)) {
            j1.f(a.f213171a.getDescriptor(), i, 7);
            throw null;
        }
        this.f213172a = aVar;
        this.f213173b = aVar2;
        this.f213174c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f213172a, cVar.f213172a) && Intrinsics.f(this.f213173b, cVar.f213173b) && Intrinsics.f(this.f213174c, cVar.f213174c);
    }

    public final int hashCode() {
        return this.f213174c.hashCode() + v7.j(this.f213173b, this.f213172a.hashCode() * 31, 31);
    }
}
