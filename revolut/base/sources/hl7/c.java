package hl7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new hf7.d(17)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f153042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f153043c;
    public final String d;
    public final String e;

    public /* synthetic */ c(int i, String str, f fVar, List list, String str2, String str3) {
        if (31 != (i & 31)) {
            qlm.j1.f(a.f153013a.getDescriptor(), i, 31);
            throw null;
        }
        this.f153041a = str;
        this.f153042b = fVar;
        this.f153043c = list;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f153041a, cVar.f153041a) && Intrinsics.f(this.f153042b, cVar.f153042b) && Intrinsics.f(this.f153043c, cVar.f153043c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f153042b.hashCode() + (this.f153041a.hashCode() * 31)) * 31, 31, this.f153043c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public c(String requestId, f additionalDriver, ArrayList eligibilityChecks, String str, String str2) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(additionalDriver, "additionalDriver");
        Intrinsics.checkNotNullParameter(eligibilityChecks, "eligibilityChecks");
        this.f153041a = requestId;
        this.f153042b = additionalDriver;
        this.f153043c = eligibilityChecks;
        this.d = str;
        this.e = str2;
    }
}
