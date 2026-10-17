package wf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296871b;

    public c(String userInput, String scope) {
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f296870a = userInput;
        this.f296871b = scope;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f296870a, cVar.f296870a) && Intrinsics.f(this.f296871b, cVar.f296871b);
    }

    public final int hashCode() {
        return this.f296871b.hashCode() + (this.f296870a.hashCode() * 31);
    }
}
