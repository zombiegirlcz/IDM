package sk0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f263749a;

    public c(ArrayList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        this.f263749a = keys;
    }

    public final List a() {
        return this.f263749a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f263749a.equals(((c) obj2).f263749a);
    }

    public final int hashCode() {
        return this.f263749a.hashCode();
    }
}
