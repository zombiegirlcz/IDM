package hl7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n9 {

    @NotNull
    public static final m9 Companion = new m9();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153233c;
    public final boolean d;
    public final List e;

    public /* synthetic */ n9(int i, String str, String str2, String str3, List list, boolean z) {
        if (31 != (i & 31)) {
            qlm.j1.f(l9.f153196a.getDescriptor(), i, 31);
            throw null;
        }
        this.f153231a = str;
        this.f153232b = str2;
        this.f153233c = str3;
        this.d = z;
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj2;
        return Intrinsics.f(this.f153231a, n9Var.f153231a) && Intrinsics.f(this.f153232b, n9Var.f153232b) && Intrinsics.f(this.f153233c, n9Var.f153233c) && this.d == n9Var.d && Intrinsics.f(this.e, n9Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(p.a.c(p.a.c(this.f153231a.hashCode() * 31, 31, this.f153232b), 31, this.f153233c), 31, this.d);
    }

    public n9(String applicationFormId, String planId, String paymentFrequency, ArrayList optionIds, boolean z) {
        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
        Intrinsics.checkNotNullParameter(optionIds, "optionIds");
        this.f153231a = applicationFormId;
        this.f153232b = planId;
        this.f153233c = paymentFrequency;
        this.d = z;
        this.e = optionIds;
    }
}
