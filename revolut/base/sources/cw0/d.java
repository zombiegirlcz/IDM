package cw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f109514a;

    public d(i attachment) {
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.f109514a = attachment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f109514a, ((d) obj2).f109514a);
    }

    public final int hashCode() {
        return this.f109514a.hashCode();
    }
}
