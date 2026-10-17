package hs4;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f154986a;

    public d(LinkedHashMap instalmentModels) {
        Intrinsics.checkNotNullParameter(instalmentModels, "instalmentModels");
        this.f154986a = instalmentModels;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f154986a.equals(((d) obj2).f154986a);
    }

    public final int hashCode() {
        return this.f154986a.hashCode();
    }
}
