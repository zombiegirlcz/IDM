package jyg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f179430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f179431b;

    public d(a labelType, ArrayList analyticTypes) {
        Intrinsics.checkNotNullParameter(labelType, "labelType");
        Intrinsics.checkNotNullParameter(analyticTypes, "analyticTypes");
        this.f179430a = labelType;
        this.f179431b = analyticTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f179430a == dVar.f179430a && this.f179431b.equals(dVar.f179431b);
    }

    public final int hashCode() {
        return this.f179431b.hashCode() + (this.f179430a.hashCode() * 31);
    }
}
