package ggk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f143701b;

    public a0(String str, ArrayList cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.f143700a = str;
        this.f143701b = cells;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f143700a, a0Var.f143700a) && this.f143701b.equals(a0Var.f143701b);
    }

    public final int hashCode() {
        String str = this.f143700a;
        return this.f143701b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
