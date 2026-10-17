package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o {

    @NotNull
    public static final gu7.r Companion = new gu7.r();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new gu7.d(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76020c;
    public final k d;

    public /* synthetic */ o(int i, String str, String str2, String str3, k kVar) {
        if (15 != (i & 15)) {
            j1.f(gu7.n.f146798a.getDescriptor(), i, 15);
            throw null;
        }
        this.f76018a = str;
        this.f76019b = str2;
        this.f76020c = str3;
        this.d = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f76018a, oVar.f76018a) && Intrinsics.f(this.f76019b, oVar.f76019b) && Intrinsics.f(this.f76020c, oVar.f76020c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f76018a.hashCode() * 31;
        String str = this.f76019b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f76020c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        k kVar = this.d;
        return iHashCode3 + (kVar != null ? kVar.hashCode() : 0);
    }

    public o(String title, String str, String str2, k kVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f76018a = title;
        this.f76019b = str;
        this.f76020c = str2;
        this.d = kVar;
    }
}
