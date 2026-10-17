package com.revolut.core.ui_kit.delegates;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f54089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54090b;

    public e8(List steps) {
        boolean z;
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f54089a = steps;
        if (steps.isEmpty()) {
            z = false;
            break;
        }
        List list = steps;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (((h8) it8.next()).f54235a != 100) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.f54090b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e8) && Intrinsics.f(this.f54089a, ((e8) obj2).f54089a);
    }

    public final int hashCode() {
        return this.f54089a.hashCode();
    }
}
