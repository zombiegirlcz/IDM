package ggk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f143766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f143767b;

    public o1(j1 header, ArrayList options) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f143766a = header;
        this.f143767b = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return this.f143766a.equals(o1Var.f143766a) && this.f143767b.equals(o1Var.f143767b);
    }

    public final int hashCode() {
        return this.f143767b.hashCode() + (this.f143766a.hashCode() * 31);
    }
}
