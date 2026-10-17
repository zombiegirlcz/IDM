package c36;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f20910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f20911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20912c;

    public /* synthetic */ q(int i, c cVar, c cVar2, String str) {
        if (7 != (i & 7)) {
            j1.f(o.f20909a.getDescriptor(), i, 7);
            throw null;
        }
        this.f20910a = cVar;
        this.f20911b = cVar2;
        this.f20912c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f20910a, qVar.f20910a) && Intrinsics.f(this.f20911b, qVar.f20911b) && Intrinsics.f(this.f20912c, qVar.f20912c);
    }

    public final int hashCode() {
        return this.f20912c.hashCode() + ((this.f20911b.hashCode() + (this.f20910a.hashCode() * 31)) * 31);
    }
}
