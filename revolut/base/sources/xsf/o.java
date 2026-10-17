package xsf;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f308475a;

    public o(ArrayList additionalInfo) {
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.f308475a = additionalInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f308475a.equals(((o) obj2).f308475a);
    }

    public final int hashCode() {
        return this.f308475a.hashCode();
    }
}
