package tde;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f269991b;

    public k(String title, ArrayList messages) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.f269990a = title;
        this.f269991b = messages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f269990a, kVar.f269990a) && this.f269991b.equals(kVar.f269991b);
    }

    public final int hashCode() {
        return this.f269991b.hashCode() + (this.f269990a.hashCode() * 31);
    }
}
