package qd9;

import com.revolut.retail.core.navigation.CompositeCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f244894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeCommand f244895b;

    public d(boolean z, CompositeCommand nextCommand) {
        Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
        this.f244894a = z;
        this.f244895b = nextCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f244894a == dVar.f244894a && this.f244895b.equals(dVar.f244895b);
    }

    public final int hashCode() {
        return this.f244895b.f98629a.hashCode() + (Boolean.hashCode(this.f244894a) * 31);
    }
}
