package jk7;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f175116a;

    public h(List supportingDocuments) {
        Intrinsics.checkNotNullParameter(supportingDocuments, "supportingDocuments");
        this.f175116a = supportingDocuments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f175116a, ((h) obj2).f175116a);
    }

    public final int hashCode() {
        return this.f175116a.hashCode();
    }
}
