package oc3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr0.g f224073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f224074b;

    public o(cr0.g header, ArrayList items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f224073a = header;
        this.f224074b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f224073a.equals(oVar.f224073a) && this.f224074b.equals(oVar.f224074b);
    }

    public final int hashCode() {
        return this.f224074b.hashCode() + (this.f224073a.hashCode() * 31);
    }
}
