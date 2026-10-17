package fyk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139050c;

    public /* synthetic */ q(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(o.f139047a.getDescriptor(), i, 7);
            throw null;
        }
        this.f139048a = str;
        this.f139049b = str2;
        this.f139050c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f139048a, qVar.f139048a) && Intrinsics.f(this.f139049b, qVar.f139049b) && Intrinsics.f(this.f139050c, qVar.f139050c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f139048a.hashCode() * 31, 31, this.f139049b);
        String str = this.f139050c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public q(String countryCode, String documentKey, String str) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(documentKey, "documentKey");
        this.f139048a = countryCode;
        this.f139049b = documentKey;
        this.f139050c = str;
    }
}
