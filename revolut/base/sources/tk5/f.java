package tk5;

import cli.o;
import cli.q;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f271881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271882b;

    public f(String str, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f271881a = tabs;
        this.f271882b = str;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if ((oldState instanceof f ? (f) oldState : null) == null) {
            return null;
        }
        return new e(!Intrinsics.f(r3.f271882b, this.f271882b));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f271881a.equals(fVar.f271881a) && Intrinsics.f(this.f271882b, fVar.f271882b);
    }

    public final int hashCode() {
        int iHashCode = this.f271881a.hashCode() * 31;
        String str = this.f271882b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
