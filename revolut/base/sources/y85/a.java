package y85;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311629a;

    public a(String statementLink) {
        Intrinsics.checkNotNullParameter(statementLink, "statementLink");
        this.f311629a = statementLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f311629a, ((a) obj2).f311629a);
    }

    public final int hashCode() {
        return this.f311629a.hashCode();
    }
}
