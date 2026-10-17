package uai;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278665a;

    public c(String str) {
        this.f278665a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f278665a, ((c) obj2).f278665a);
    }

    public final int hashCode() {
        String str = this.f278665a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
