package ygc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yfe.b2;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f313609c = {null, yhm.j.c(yhm.k.PUBLICATION, new b2(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f313611b;

    public /* synthetic */ h0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(c0.f313600a.getDescriptor(), i, 3);
            throw null;
        }
        this.f313610a = str;
        this.f313611b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f313610a, h0Var.f313610a) && Intrinsics.f(this.f313611b, h0Var.f313611b);
    }

    public final int hashCode() {
        return this.f313611b.hashCode() + (this.f313610a.hashCode() * 31);
    }

    public h0(String icon, ArrayList texts) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(texts, "texts");
        this.f313610a = icon;
        this.f313611b = texts;
    }
}
