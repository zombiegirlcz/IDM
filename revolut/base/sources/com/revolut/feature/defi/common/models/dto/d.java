package com.revolut.feature.defi.common.models.dto;

import c36.e;
import c36.n;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c36.c f71713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TokenAmountDto f71714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f71715c;

    public /* synthetic */ d(int i, c36.c cVar, TokenAmountDto tokenAmountDto, n nVar) {
        if (7 != (i & 7)) {
            j1.f(c.f71712a.getDescriptor(), i, 7);
            throw null;
        }
        this.f71713a = cVar;
        this.f71714b = tokenAmountDto;
        this.f71715c = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f71713a, dVar.f71713a) && Intrinsics.f(this.f71714b, dVar.f71714b) && Intrinsics.f(this.f71715c, dVar.f71715c);
    }

    public final int hashCode() {
        return this.f71715c.hashCode() + ((this.f71714b.hashCode() + (this.f71713a.hashCode() * 31)) * 31);
    }
}
