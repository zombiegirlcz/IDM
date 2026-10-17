package fii;

import cli.o;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f135426a;

    public c(m0 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f135426a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f135426a, ((c) obj2).f135426a);
    }

    public final int hashCode() {
        return this.f135426a.hashCode();
    }
}
