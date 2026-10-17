package ysj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yna.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new j1(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f316484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f316485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316486c;

    public /* synthetic */ j(int i, c cVar, List list, String str) {
        if (7 != (i & 7)) {
            qlm.j1.f(h.f316483a.getDescriptor(), i, 7);
            throw null;
        }
        this.f316484a = cVar;
        this.f316485b = list;
        this.f316486c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f316484a, jVar.f316484a) && Intrinsics.f(this.f316485b, jVar.f316485b) && Intrinsics.f(this.f316486c, jVar.f316486c);
    }

    public final int hashCode() {
        return this.f316486c.hashCode() + p.a.d(this.f316484a.hashCode() * 31, 31, this.f316485b);
    }

    public j(c destination, ArrayList transactions, String state) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f316484a = destination;
        this.f316485b = transactions;
        this.f316486c = state;
    }
}
