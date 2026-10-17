package sil;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263663a;

    public i(String value) {
        Intrinsics.checkNotNullParameter("TRUSTDOCK", "origin");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f263663a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f263663a.equals(((i) obj2).f263663a);
    }

    public final int hashCode() {
        return this.f263663a.hashCode() - 576190219;
    }
}
