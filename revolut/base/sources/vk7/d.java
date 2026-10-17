package vk7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f289875a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f289875a, ((d) obj2).f289875a);
    }

    public final int hashCode() {
        return this.f289875a.hashCode();
    }

    public d(Data claims) {
        Intrinsics.checkNotNullParameter(claims, "claims");
        this.f289875a = claims;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
