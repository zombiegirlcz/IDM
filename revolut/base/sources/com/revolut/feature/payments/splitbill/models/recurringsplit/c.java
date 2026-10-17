package com.revolut.feature.payments.splitbill.models.recurringsplit;

import a2a.h;
import a2a.i;
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
public final class c {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f79936c = {j.c(k.PUBLICATION, new a08.b(18)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f79937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79938b;

    public /* synthetic */ c(int i, List list, String str) {
        if (3 != (i & 3)) {
            j1.f(h.f717a.getDescriptor(), i, 3);
            throw null;
        }
        this.f79937a = list;
        this.f79938b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f79937a, cVar.f79937a) && Intrinsics.f(this.f79938b, cVar.f79938b);
    }

    public final int hashCode() {
        int iHashCode = this.f79937a.hashCode() * 31;
        String str = this.f79938b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public c(String str, ArrayList participantsSplits) {
        Intrinsics.checkNotNullParameter(participantsSplits, "participantsSplits");
        this.f79937a = participantsSplits;
        this.f79938b = str;
    }
}
