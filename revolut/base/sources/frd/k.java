package frd;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import wkm.l;

/* JADX INFO: loaded from: classes7.dex */
public interface k {
    static l a(k kVar, Flow availabilityFlow, Function0 groupFlow) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(availabilityFlow, "availabilityFlow");
        Intrinsics.checkNotNullParameter(groupFlow, "groupFlow");
        return q.Q(availabilityFlow, new j(0, null, groupFlow));
    }

    Flow b();
}
