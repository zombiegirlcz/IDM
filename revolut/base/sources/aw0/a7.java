package aw0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10233a;

    public a7(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f10233a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a7) && this.f10233a.equals(((a7) obj2).f10233a);
    }

    public final int hashCode() {
        return this.f10233a.hashCode();
    }
}
