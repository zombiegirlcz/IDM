package gqf;

import java.util.ArrayList;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f145712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145714c;
    public final krf.c d;

    public c(ArrayList predefinedReasons, boolean z, String hint, krf.c cVar) {
        Intrinsics.checkNotNullParameter(predefinedReasons, "predefinedReasons");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f145712a = predefinedReasons;
        this.f145713b = z;
        this.f145714c = hint;
        this.d = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f145712a.equals(cVar.f145712a) && this.f145713b == cVar.f145713b && Intrinsics.f(this.f145714c, cVar.f145714c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(this.f145712a.hashCode() * 31, 31, this.f145713b), 31, this.f145714c);
        krf.c cVar = this.d;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }
}
