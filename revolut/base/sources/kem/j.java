package kem;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f183203a = new j();

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

    public final String toString() {
        return "Headers " + zhm.h0.f322473a;
    }
}
