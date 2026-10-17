package ywa;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f317391c = {null, j.c(k.PUBLICATION, new yui.d(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f317393b;

    public /* synthetic */ c(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(a.f317390a.getDescriptor(), i, 3);
            throw null;
        }
        this.f317392a = str;
        this.f317393b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f317392a, cVar.f317392a) && Intrinsics.f(this.f317393b, cVar.f317393b);
    }

    public final int hashCode() {
        return this.f317393b.hashCode() + (this.f317392a.hashCode() * 31);
    }

    public c(String referralCode, List inviteeCodes) {
        Intrinsics.checkNotNullParameter(referralCode, "referralCode");
        Intrinsics.checkNotNullParameter(inviteeCodes, "inviteeCodes");
        this.f317392a = referralCode;
        this.f317393b = inviteeCodes;
    }
}
