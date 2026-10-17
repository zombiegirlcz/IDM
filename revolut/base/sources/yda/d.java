package yda;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import xda.u;

/* JADX INFO: loaded from: classes5.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f312671c;

    public /* synthetic */ d(int i, String str, String str2, u uVar) {
        if (7 != (i & 7)) {
            j1.f(b.f312668a.getDescriptor(), i, 7);
            throw null;
        }
        this.f312669a = str;
        this.f312670b = str2;
        this.f312671c = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f312669a, dVar.f312669a) && Intrinsics.f(this.f312670b, dVar.f312670b) && Intrinsics.f(this.f312671c, dVar.f312671c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f312669a.hashCode() * 31, 31, this.f312670b);
        u uVar = this.f312671c;
        return iC + (uVar == null ? 0 : uVar.hashCode());
    }
}
