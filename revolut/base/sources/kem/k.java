package kem;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f183204a = new k();

    @Override // oem.m
    public final boolean a() {
        return true;
    }

    @Override // oem.m
    public final List b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return null;
    }

    @Override // oem.m
    public final Set entries() {
        return zhm.h0.f322473a;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof f0) && ((f0) obj2).isEmpty();
    }

    @Override // oem.m
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + zhm.h0.f322473a;
    }
}
