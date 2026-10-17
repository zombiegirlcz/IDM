package com.revolut.feature.insurance_home.impl.data.model;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import lw7.i;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class d {

    @NotNull
    public static final i Companion = new i();
    public static final Lazy[] f = {null, null, null, j.c(k.PUBLICATION, new lv4.b(17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76209c;
    public final List d;
    public final Action e;

    public /* synthetic */ d(int i, String str, String str2, String str3, List list, Action action) {
        if (31 != (i & 31)) {
            j1.f(c.f76206a.getDescriptor(), i, 31);
            throw null;
        }
        this.f76207a = str;
        this.f76208b = str2;
        this.f76209c = str3;
        this.d = list;
        this.e = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f76207a, dVar.f76207a) && Intrinsics.f(this.f76208b, dVar.f76208b) && Intrinsics.f(this.f76209c, dVar.f76209c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        String str = this.f76207a;
        return this.e.hashCode() + p.a.d(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f76208b), 31, this.f76209c), 31, this.d);
    }
}
