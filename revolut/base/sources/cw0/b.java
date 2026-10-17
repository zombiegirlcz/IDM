package cw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f109512a;

    public b(i attachment) {
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.f109512a = attachment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f109512a, ((b) obj2).f109512a);
    }

    public final int hashCode() {
        return this.f109512a.hashCode();
    }
}
