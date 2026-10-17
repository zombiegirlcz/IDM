package rs0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import ms0.v;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f256925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f256926b;

    public i(ArrayList labels, v style) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f256925a = labels;
        this.f256926b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f256925a.equals(iVar.f256925a) && this.f256926b == iVar.f256926b;
    }

    public final int hashCode() {
        return this.f256926b.hashCode() + (this.f256925a.hashCode() * 31);
    }
}
