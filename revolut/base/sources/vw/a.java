package vw;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import xv.u;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f292570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f292571b;

    public a(ByteBuffer byteBuffer, u uVar) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        this.f292570a = byteBuffer;
        this.f292571b = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f292570a, aVar.f292570a) && Intrinsics.f(this.f292571b, aVar.f292571b);
    }

    public final int hashCode() {
        int iB = j6.a.b(0, this.f292570a.hashCode() * 31, 31);
        u uVar = this.f292571b;
        return iB + (uVar != null ? uVar.hashCode() : 0);
    }
}
