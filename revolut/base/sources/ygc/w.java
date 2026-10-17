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
public final class w {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f313634c = {yhm.j.c(yhm.k.PUBLICATION, new b2(18)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f313635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f313636b;

    public /* synthetic */ w(int i, List list, String str) {
        if (3 != (i & 3)) {
            j1.f(r.f313630a.getDescriptor(), i, 3);
            throw null;
        }
        this.f313635a = list;
        this.f313636b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f313635a, wVar.f313635a) && Intrinsics.f(this.f313636b, wVar.f313636b);
    }

    public final int hashCode() {
        return this.f313636b.hashCode() + (this.f313635a.hashCode() * 31);
    }

    public w(String note, ArrayList texts) {
        Intrinsics.checkNotNullParameter(texts, "texts");
        Intrinsics.checkNotNullParameter(note, "note");
        this.f313635a = texts;
        this.f313636b = note;
    }
}
