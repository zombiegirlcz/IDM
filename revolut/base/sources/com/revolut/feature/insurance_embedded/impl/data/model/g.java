package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.q3;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {

    @NotNull
    public static final gu7.c Companion = new gu7.c();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new gr2.j0(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3 f75991c;
    public final LegalNotice d;
    public final List e;

    public g(int i, String str, String str2, q3 q3Var, LegalNotice legalNotice, List list) {
        if (15 != (i & 15)) {
            j1.f(b.f75976a.getDescriptor(), i, 15);
            throw null;
        }
        this.f75989a = str;
        this.f75990b = str2;
        this.f75991c = q3Var;
        this.d = legalNotice;
        if ((i & 16) == 0) {
            this.e = zhm.f0.f322471a;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f75989a, gVar.f75989a) && Intrinsics.f(this.f75990b, gVar.f75990b) && Intrinsics.f(this.f75991c, gVar.f75991c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f75989a.hashCode() * 31;
        String str = this.f75990b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        q3 q3Var = this.f75991c;
        int iHashCode3 = (iHashCode2 + (q3Var == null ? 0 : q3Var.hashCode())) * 31;
        LegalNotice legalNotice = this.d;
        return this.e.hashCode() + ((iHashCode3 + (legalNotice != null ? legalNotice.hashCode() : 0)) * 31);
    }

    public g(String title, String str, q3 q3Var, LegalNotice legalNotice, List coverages) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(coverages, "coverages");
        this.f75989a = title;
        this.f75990b = str;
        this.f75991c = q3Var;
        this.d = legalNotice;
        this.e = coverages;
    }
}
