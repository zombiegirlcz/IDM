package com.fourthline.orca.internal;

import com.fourthline.orca.internal.sq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class pm implements om {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(sq.a o110, sq.a o210) {
        Intrinsics.checkNotNullParameter(o110, "o1");
        Intrinsics.checkNotNullParameter(o210, "o2");
        if (o110.e() && o210.e()) {
            if (o110.d().ordinal() < o210.d().ordinal()) {
                return -1;
            }
            return o110.d().ordinal() > o210.d().ordinal() ? 1 : 0;
        }
        if (o110.e()) {
            return -1;
        }
        return o210.e() ? 1 : 0;
    }
}
