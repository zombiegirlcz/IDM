package cw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f109515a;

    public e(i attachment) {
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.f109515a = attachment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f109515a, ((e) obj2).f109515a);
    }

    public final int hashCode() {
        return this.f109515a.hashCode();
    }
}
