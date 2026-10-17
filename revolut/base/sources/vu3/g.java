package vu3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f292218c;

    public g(String id10, String initialSelectedTabId, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(initialSelectedTabId, "initialSelectedTabId");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f292216a = id10;
        this.f292217b = initialSelectedTabId;
        this.f292218c = tabs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f292216a, gVar.f292216a) && Intrinsics.f(this.f292217b, gVar.f292217b) && this.f292218c.equals(gVar.f292218c);
    }

    public final int hashCode() {
        return this.f292218c.hashCode() + p.a.c(this.f292216a.hashCode() * 31, 31, this.f292217b);
    }
}
