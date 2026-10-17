package ev;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f129665a;

    public a(ArrayList reasons) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        this.f129665a = reasons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f129665a.equals(((a) obj2).f129665a);
    }

    public final int hashCode() {
        return this.f129665a.hashCode();
    }
}
