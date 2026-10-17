package rqj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f256556g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new rm0.k(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f256558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f256559c;
    public final String d;
    public final String e;
    public final List f;

    public /* synthetic */ f(int i, long j2, String str, String str2, String str3, String str4, List list) {
        if (63 != (i & 63)) {
            j1.f(d.f256555a.getDescriptor(), i, 63);
            throw null;
        }
        this.f256557a = str;
        this.f256558b = j2;
        this.f256559c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f256557a, fVar.f256557a) && this.f256558b == fVar.f256558b && Intrinsics.f(this.f256559c, fVar.f256559c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(a0.d.c(this.f256557a.hashCode() * 31, 31, this.f256558b), 31, this.f256559c), 31, this.d), 31, this.e);
    }

    public f(String walletId, long j2, String currency, String startDate, String endDate, ArrayList categories) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f256557a = walletId;
        this.f256558b = j2;
        this.f256559c = currency;
        this.d = startDate;
        this.e = endDate;
        this.f = categories;
    }
}
