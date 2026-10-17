package cw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f109513a;

    public c(i attachment) {
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.f109513a = attachment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f109513a, ((c) obj2).f109513a);
    }

    public final int hashCode() {
        return this.f109513a.hashCode();
    }
}
