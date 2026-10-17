package ypd;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f315834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f315835b;

    public d(ArrayList items, c toolbarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f315834a = items;
        this.f315835b = toolbarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f315834a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f315834a.equals(dVar.f315834a) && this.f315835b.equals(dVar.f315835b);
    }

    public final int hashCode() {
        return this.f315835b.hashCode() + (this.f315834a.hashCode() * 31);
    }
}
