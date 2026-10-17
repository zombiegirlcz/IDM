package kf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183300b;

    public /* synthetic */ m(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(k.f183298a.getDescriptor(), i, 3);
            throw null;
        }
        this.f183299a = str;
        this.f183300b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f183299a, mVar.f183299a) && Intrinsics.f(this.f183300b, mVar.f183300b);
    }

    public final int hashCode() {
        return this.f183300b.hashCode() + (this.f183299a.hashCode() * 31);
    }
}
