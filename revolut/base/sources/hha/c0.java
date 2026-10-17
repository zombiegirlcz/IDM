package hha;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f152285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f152286b;

    public c0(ArrayList benefits, ArrayList plans) {
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f152285a = benefits;
        this.f152286b = plans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f152285a.equals(c0Var.f152285a) && this.f152286b.equals(c0Var.f152286b);
    }

    public final int hashCode() {
        return this.f152286b.hashCode() + (this.f152285a.hashCode() * 31);
    }
}
