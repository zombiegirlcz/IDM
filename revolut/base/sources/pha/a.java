package pha;

import do3.u;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f236250a;

    public a(u uVar) {
        this.f236250a = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f236250a, ((a) obj2).f236250a);
    }

    public final int hashCode() {
        u uVar = this.f236250a;
        if (uVar == null) {
            return 0;
        }
        return uVar.hashCode();
    }
}
