package com.revolut.core.ui_kit.delegates;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f54049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f54050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cf f54051c;

    public df(List avatars, Integer num, cf style) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54049a = avatars;
        this.f54050b = num;
        this.f54051c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof df)) {
            return false;
        }
        df dfVar = (df) obj2;
        return Intrinsics.f(this.f54049a, dfVar.f54049a) && Intrinsics.f(this.f54050b, dfVar.f54050b) && this.f54051c == dfVar.f54051c;
    }

    public final int hashCode() {
        int iHashCode = this.f54049a.hashCode() * 31;
        Integer num = this.f54050b;
        return this.f54051c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public /* synthetic */ df(ArrayList arrayList, Integer num, int i) {
        this(arrayList, (i & 2) != 0 ? null : num, cf.DEFAULT);
    }
}
