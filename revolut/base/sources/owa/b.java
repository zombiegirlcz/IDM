package owa;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f230433a;

    public b(ArrayList benefits) {
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.f230433a = benefits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f230433a.equals(((b) obj2).f230433a);
    }

    public final int hashCode() {
        return this.f230433a.hashCode();
    }
}
