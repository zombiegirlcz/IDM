package kl7;

import java.util.ArrayList;
import java.util.List;
import kkf.z5;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f185308b = {yhm.j.c(yhm.k.PUBLICATION, new z5(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f185309a;

    public /* synthetic */ e0(int i, List list) {
        if (1 == (i & 1)) {
            this.f185309a = list;
        } else {
            qlm.j1.f(c0.f185299a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f185309a, ((e0) obj2).f185309a);
    }

    public final int hashCode() {
        return this.f185309a.hashCode();
    }

    public e0(ArrayList drivers) {
        Intrinsics.checkNotNullParameter(drivers, "drivers");
        this.f185309a = drivers;
    }
}
