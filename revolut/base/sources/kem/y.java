package kem;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f183240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f183241c;
    public static final y d;
    public static final y e;
    public static final y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f183242g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183243a;

    static {
        y yVar = new y("GET");
        f183240b = yVar;
        y yVar2 = new y("POST");
        f183241c = yVar2;
        y yVar3 = new y("PUT");
        d = yVar3;
        y yVar4 = new y("PATCH");
        y yVar5 = new y("DELETE");
        y yVar6 = new y("HEAD");
        e = yVar6;
        y yVar7 = new y("OPTIONS");
        f = yVar7;
        f183242g = zhm.v.k(yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7);
    }

    public y(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f183243a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f183243a, ((y) obj2).f183243a);
    }

    public final int hashCode() {
        return this.f183243a.hashCode();
    }

    public final String toString() {
        return this.f183243a;
    }
}
