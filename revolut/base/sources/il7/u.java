package il7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final no3.b f162126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162127b;

    public /* synthetic */ u(int i, String str, no3.b bVar) {
        if (3 != (i & 3)) {
            j1.f(s.f162125a.getDescriptor(), i, 3);
            throw null;
        }
        this.f162126a = bVar;
        this.f162127b = str;
    }

    public u(no3.b shippingAddress, String expectedDeliveryDate) {
        Intrinsics.checkNotNullParameter(shippingAddress, "shippingAddress");
        Intrinsics.checkNotNullParameter(expectedDeliveryDate, "expectedDeliveryDate");
        this.f162126a = shippingAddress;
        this.f162127b = expectedDeliveryDate;
    }
}
