package fa;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f133016b;

    public k(String str, ArrayList cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.f133015a = str;
        this.f133016b = cells;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f133015a, kVar.f133015a) && this.f133016b.equals(kVar.f133016b);
    }

    public final int hashCode() {
        String str = this.f133015a;
        return this.f133016b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Section(title=" + this.f133015a + ", cells=" + this.f133016b + ")";
    }
}
