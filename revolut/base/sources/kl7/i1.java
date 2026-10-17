package kl7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185341c;
    public final ArrayList d;

    public i1(String planId, String name, String description, ArrayList benefits) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.f185339a = planId;
        this.f185340b = name;
        this.f185341c = description;
        this.d = benefits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f185339a, i1Var.f185339a) && Intrinsics.f(this.f185340b, i1Var.f185340b) && Intrinsics.f(this.f185341c, i1Var.f185341c) && this.d.equals(i1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f185339a.hashCode() * 31, 31, this.f185340b), 31, this.f185341c);
    }
}
