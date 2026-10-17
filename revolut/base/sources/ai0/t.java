package ai0;

import com.google.android.gms.maps.model.Marker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Marker f5158a;

    public t(Marker internal) {
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f5158a = internal;
    }

    public final void a(a iconDescriptor) {
        Intrinsics.checkNotNullParameter(iconDescriptor, "iconDescriptor");
        Intrinsics.checkNotNullParameter(iconDescriptor, "<this>");
        this.f5158a.setIcon(iconDescriptor.f5145a);
    }

    public final boolean equals(Object obj2) {
        t tVar = obj2 instanceof t ? (t) obj2 : null;
        return Intrinsics.f(this.f5158a, tVar != null ? tVar.f5158a : null);
    }

    public final int hashCode() {
        return this.f5158a.hashCode();
    }
}
