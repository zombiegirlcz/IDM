package pt0;

import aw0.j4;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(Intrinsics.f(((j4) obj2).a(), "SMALL_SEGMENTS_GROUP_ID")), Boolean.valueOf(Intrinsics.f(((j4) obj3).a(), "SMALL_SEGMENTS_GROUP_ID")));
    }
}
