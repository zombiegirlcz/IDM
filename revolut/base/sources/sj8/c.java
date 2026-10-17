package sj8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263687a;

    public c(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f263687a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f263687a, ((c) obj2).f263687a);
    }

    public final int hashCode() {
        return this.f263687a.hashCode();
    }
}
