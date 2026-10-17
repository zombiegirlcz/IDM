package vp7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f291116a;

    public i(ArrayList details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f291116a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f291116a.equals(((i) obj2).f291116a);
    }

    public final int hashCode() {
        return this.f291116a.hashCode();
    }
}
