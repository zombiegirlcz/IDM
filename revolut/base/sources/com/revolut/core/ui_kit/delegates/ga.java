package com.revolut.core.ui_kit.delegates;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ga implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha f54210b;

    public ga(String listId, ha haVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f54209a = listId;
        this.f54210b = haVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PdfDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53492a() {
        return this.f54209a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj2;
        return this.f54209a.equals(gaVar.f54209a) && this.f54210b.equals(gaVar.f54210b);
    }

    public final int hashCode() {
        return this.f54210b.f54238a.hashCode() + (this.f54209a.hashCode() * 31);
    }
}
