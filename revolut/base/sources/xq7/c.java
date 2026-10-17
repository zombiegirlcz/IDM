package xq7;

import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f308118a;

    public c(Data telematicsDeviceUnplugged) {
        Intrinsics.checkNotNullParameter(telematicsDeviceUnplugged, "telematicsDeviceUnplugged");
        this.f308118a = telematicsDeviceUnplugged;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f308118a, ((c) obj2).f308118a);
    }

    public final int hashCode() {
        return this.f308118a.hashCode();
    }
}
