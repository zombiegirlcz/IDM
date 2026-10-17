package jel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f173573b;

    public u2(String template, ArrayList args) {
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(args, "args");
        this.f173572a = template;
        this.f173573b = args;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj2;
        return Intrinsics.f(this.f173572a, u2Var.f173572a) && this.f173573b.equals(u2Var.f173573b);
    }

    public final int hashCode() {
        return this.f173573b.hashCode() + (this.f173572a.hashCode() * 31);
    }
}
