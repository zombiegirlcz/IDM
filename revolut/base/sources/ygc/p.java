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
public final class p {

    @NotNull
    public static final o Companion = new o();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new b2(17)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f313627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f313628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f313629c;

    public /* synthetic */ p(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(n.f313626a.getDescriptor(), i, 7);
            throw null;
        }
        this.f313627a = list;
        this.f313628b = str;
        this.f313629c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f313627a, pVar.f313627a) && Intrinsics.f(this.f313628b, pVar.f313628b) && Intrinsics.f(this.f313629c, pVar.f313629c);
    }

    public final int hashCode() {
        int iHashCode = this.f313627a.hashCode() * 31;
        String str = this.f313628b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f313629c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public p(String str, String str2, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f313627a = items;
        this.f313628b = str;
        this.f313629c = str2;
    }
}
