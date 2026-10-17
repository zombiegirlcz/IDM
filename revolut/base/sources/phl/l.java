package phl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f236361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f236362b;

    public l(ArrayList supportedTypes, Integer num) {
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        this.f236361a = supportedTypes;
        this.f236362b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f236361a.equals(lVar.f236361a) && this.f236362b.equals(lVar.f236362b);
    }

    public final int hashCode() {
        return this.f236362b.hashCode() + (this.f236361a.hashCode() * 31);
    }
}
