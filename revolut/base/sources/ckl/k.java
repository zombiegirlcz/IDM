package ckl;

import chc.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new c0(21)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24884c;

    public /* synthetic */ k(int i, long j2, String str, List list) {
        if (7 != (i & 7)) {
            j1.f(i.f24881a.getDescriptor(), i, 7);
            throw null;
        }
        this.f24882a = str;
        this.f24883b = list;
        this.f24884c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f24882a, kVar.f24882a) && Intrinsics.f(this.f24883b, kVar.f24883b) && this.f24884c == kVar.f24884c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24884c) + p.a.d(this.f24882a.hashCode() * 31, 31, this.f24883b);
    }

    public k(long j2, String accountId, ArrayList scopes) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f24882a = accountId;
        this.f24883b = scopes;
        this.f24884c = j2;
    }
}
