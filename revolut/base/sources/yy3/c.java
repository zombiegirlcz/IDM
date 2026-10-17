package yy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht3.g f317766a;

    public c(ht3.g creditPromptContent) {
        Intrinsics.checkNotNullParameter(creditPromptContent, "creditPromptContent");
        this.f317766a = creditPromptContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f317766a.equals(((c) obj2).f317766a);
    }

    public final int hashCode() {
        return this.f317766a.hashCode();
    }
}
