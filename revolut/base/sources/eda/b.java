package eda;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f124960a;

    public b(LinkedHashMap pocketTypes) {
        Intrinsics.checkNotNullParameter(pocketTypes, "pocketTypes");
        this.f124960a = pocketTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f124960a.equals(((b) obj2).f124960a);
    }

    public final int hashCode() {
        return this.f124960a.hashCode();
    }
}
