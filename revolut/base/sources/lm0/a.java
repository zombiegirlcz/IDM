package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196836a;

    public a(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196836a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196836a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f196836a, ((a) obj2).f196836a);
    }

    public final int hashCode() {
        return this.f196836a.hashCode();
    }
}
