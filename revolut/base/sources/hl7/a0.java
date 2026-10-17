package hl7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f153014c = {yhm.j.c(yhm.k.PUBLICATION, new hf7.d(28)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153016b;

    public /* synthetic */ a0(int i, List list, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(y.f153370a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153015a = list;
        this.f153016b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f153015a, a0Var.f153015a) && Intrinsics.f(this.f153016b, a0Var.f153016b);
    }

    public final int hashCode() {
        return this.f153016b.hashCode() + (this.f153015a.hashCode() * 31);
    }

    public a0(String quoteId, ArrayList reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(quoteId, "quoteId");
        this.f153015a = reason;
        this.f153016b = quoteId;
    }
}
