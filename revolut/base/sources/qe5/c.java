package qe5;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f245074a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f245074a, ((c) obj2).f245074a);
    }

    public final int hashCode() {
        return this.f245074a.hashCode();
    }

    public c(Data profileType) {
        Intrinsics.checkNotNullParameter(profileType, "profileType");
        this.f245074a = profileType;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, false, 7, null));
    }
}
