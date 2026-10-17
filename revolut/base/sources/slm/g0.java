package slm;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qlm.b2;
import qlm.e2;
import qlm.h2;
import qlm.y1;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f264262a;

    static {
        Intrinsics.checkNotNullParameter(yhm.u.INSTANCE, "<this>");
        Intrinsics.checkNotNullParameter(yhm.w.INSTANCE, "<this>");
        Intrinsics.checkNotNullParameter(yhm.s.INSTANCE, "<this>");
        Intrinsics.checkNotNullParameter(yhm.z.INSTANCE, "<this>");
        SerialDescriptor[] elements = {b2.f247620b, e2.f247638b, y1.f247730b, h2.f247655b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f264262a = kotlin.collections.d.y0(elements);
    }

    public static final boolean a(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && f264262a.contains(serialDescriptor);
    }
}
