package com.revolut.feature.payments.splitbill.models.recurringsplit;

import a2a.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@g
public final class b {

    @NotNull
    public static final f Companion = new f();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringSplitSource f79933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f79935c;
    public final String d;

    static {
        k kVar = k.PUBLICATION;
        e = new Lazy[]{null, j.c(kVar, new a08.b(15)), j.c(kVar, new a08.b(16)), null};
    }

    public /* synthetic */ b(int i, RecurringSplitSource recurringSplitSource, List list, List list2, String str) {
        if (15 != (i & 15)) {
            j1.f(a.f79932a.getDescriptor(), i, 15);
            throw null;
        }
        this.f79933a = recurringSplitSource;
        this.f79934b = list;
        this.f79935c = list2;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f79933a, bVar.f79933a) && Intrinsics.f(this.f79934b, bVar.f79934b) && Intrinsics.f(this.f79935c, bVar.f79935c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f79933a.hashCode() * 31, 31, this.f79934b), 31, this.f79935c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public b(RecurringSplitSource source, ArrayList participantsSplits, List transactionIds) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(participantsSplits, "participantsSplits");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.f79933a = source;
        this.f79934b = participantsSplits;
        this.f79935c = transactionIds;
        this.d = null;
    }
}
