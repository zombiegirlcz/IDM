package ym9;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f314885a;

    public c(d flowType) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f314885a = flowType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f314885a == ((c) obj2).f314885a;
    }

    public final int hashCode() {
        return this.f314885a.hashCode();
    }
}
