package koi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public interface j {
    default k T1() {
        return null;
    }

    String b();

    default Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return null;
    }
}
