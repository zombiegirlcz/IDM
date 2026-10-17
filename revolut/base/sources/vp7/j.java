package vp7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f291117a;

    public j(ArrayList details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f291117a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f291117a.equals(((j) obj2).f291117a);
    }

    public final int hashCode() {
        return this.f291117a.hashCode();
    }
}
