package kih;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f184237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f184238b;

    public f(m header, ArrayList items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f184237a = header;
        this.f184238b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f184238b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f184237a, fVar.f184237a) && this.f184238b.equals(fVar.f184238b);
    }

    public final int hashCode() {
        return this.f184238b.hashCode() + (this.f184237a.hashCode() * 31);
    }
}
