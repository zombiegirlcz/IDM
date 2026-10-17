package com.revolut.feature.defi.common.models.dto;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class b {

    @NotNull
    public static final c36.d Companion = new c36.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c36.c f71710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TokenAmountDto f71711b;

    public /* synthetic */ b(int i, c36.c cVar, TokenAmountDto tokenAmountDto) {
        if (3 != (i & 3)) {
            j1.f(a.f71709a.getDescriptor(), i, 3);
            throw null;
        }
        this.f71710a = cVar;
        this.f71711b = tokenAmountDto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f71710a, bVar.f71710a) && Intrinsics.f(this.f71711b, bVar.f71711b);
    }

    public final int hashCode() {
        return this.f71711b.hashCode() + (this.f71710a.hashCode() * 31);
    }
}
