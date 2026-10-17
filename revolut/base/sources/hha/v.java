package hha;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f152367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f152368b;

    public v(w name, ArrayList features) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(features, "features");
        this.f152367a = name;
        this.f152368b = features;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f152367a == vVar.f152367a && this.f152368b.equals(vVar.f152368b);
    }

    public final int hashCode() {
        return this.f152368b.hashCode() + (this.f152367a.hashCode() * 31);
    }
}
