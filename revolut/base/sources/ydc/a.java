package ydc;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y5g.l;
import ybh.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C1737a Companion = new C1737a();

    /* JADX INFO: renamed from: ydc.a$a, reason: collision with other inner class name */
    public static final class C1737a {
        private C1737a() {
        }
    }

    public final List a(Data subtotal, Data orderDetailsData) {
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        Intrinsics.checkNotNullParameter(orderDetailsData, "orderDetailsData");
        return (List) iii.c.f(t1.t(orderDetailsData, subtotal), new a0(this), new yd8.a(2), new l(this, 5));
    }
}
