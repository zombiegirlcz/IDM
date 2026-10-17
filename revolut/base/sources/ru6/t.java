package ru6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f257457a;

    public t(ArrayList fees) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f257457a = fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f257457a.equals(((t) obj2).f257457a);
    }

    public final int hashCode() {
        return this.f257457a.hashCode();
    }
}
