package jrk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f178050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f178051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f178052c;
    public final jo3.a d;

    public /* synthetic */ f(int i, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, jo3.a aVar4) {
        if (15 != (i & 15)) {
            j1.f(d.f178045a.getDescriptor(), i, 15);
            throw null;
        }
        this.f178050a = aVar;
        this.f178051b = aVar2;
        this.f178052c = aVar3;
        this.d = aVar4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f178050a, fVar.f178050a) && Intrinsics.f(this.f178051b, fVar.f178051b) && Intrinsics.f(this.f178052c, fVar.f178052c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        jo3.a aVar = this.f178050a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        jo3.a aVar2 = this.f178051b;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.f178052c;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.d;
        return iHashCode3 + (aVar4 != null ? aVar4.hashCode() : 0);
    }
}
