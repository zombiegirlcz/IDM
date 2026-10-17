package ktc;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f189521b;

    public /* synthetic */ c(int i, String str, Boolean bool) {
        if (3 != (i & 3)) {
            j1.f(a.f189519a.getDescriptor(), i, 3);
            throw null;
        }
        this.f189520a = str;
        this.f189521b = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f189520a, cVar.f189520a) && Intrinsics.f(this.f189521b, cVar.f189521b);
    }

    public final int hashCode() {
        int iHashCode = this.f189520a.hashCode() * 31;
        Boolean bool = this.f189521b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public c(String deviceId, Boolean bool) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.f189520a = deviceId;
        this.f189521b = bool;
    }
}
