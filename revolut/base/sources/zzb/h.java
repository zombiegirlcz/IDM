package zzb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f326651a;

    public h() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f326651a, ((h) obj2).f326651a);
    }

    public final int hashCode() {
        return this.f326651a.hashCode();
    }

    public h(Data preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f326651a = preferences;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
