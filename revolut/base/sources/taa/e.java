package taa;

import com.revolut.feature.pix.api.model.PixKeys;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixKeys f269295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f269296b;

    public e(PixKeys keys, boolean z) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        this.f269295a = keys;
        this.f269296b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f269295a, eVar.f269295a) && this.f269296b == eVar.f269296b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f269296b) + (this.f269295a.hashCode() * 31);
    }
}
