package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {

    @NotNull
    public static final gu7.g Companion = new gu7.g();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new gu7.d(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75987c;
    public final c d;

    public /* synthetic */ f(int i, String str, String str2, String str3, c cVar) {
        if (15 != (i & 15)) {
            j1.f(gu7.e.f146733a.getDescriptor(), i, 15);
            throw null;
        }
        this.f75985a = str;
        this.f75986b = str2;
        this.f75987c = str3;
        this.d = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f75985a, fVar.f75985a) && Intrinsics.f(this.f75986b, fVar.f75986b) && Intrinsics.f(this.f75987c, fVar.f75987c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        String str = this.f75985a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f75986b);
        String str2 = this.f75987c;
        return this.d.hashCode() + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public f(String str, String title, String str2, e action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f75985a = str;
        this.f75986b = title;
        this.f75987c = str2;
        this.d = action;
    }
}
