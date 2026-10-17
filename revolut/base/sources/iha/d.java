package iha;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f161317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f161318b;

    public d(a aVar, f0 features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f161317a = aVar;
        this.f161318b = features;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        if (this.f161317a != dVar.f161317a || !Intrinsics.f(this.f161318b, dVar.f161318b)) {
            return false;
        }
        Object obj3 = Boolean.FALSE;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        a aVar = this.f161317a;
        return (Boolean.FALSE.hashCode() + p.a.d((aVar == null ? 0 : aVar.hashCode()) * 961, 31, this.f161318b)) * 31;
    }
}
