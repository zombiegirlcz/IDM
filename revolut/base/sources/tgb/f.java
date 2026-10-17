package tgb;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f271136b;

    public f(String text, ArrayList actions) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f271135a = text;
        this.f271136b = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f271135a, fVar.f271135a) && this.f271136b.equals(fVar.f271136b);
    }

    public final int hashCode() {
        return this.f271136b.hashCode() + (this.f271135a.hashCode() * 31);
    }
}
