package k5e;

import cli.n;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import java.math.BigDecimal;
import java.util.List;
import k50.a4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(String str, Data data, boolean z, Function1 function1) {
        List list = data != null ? (List) iii.c.f(data, new jb8.a(str, 26), new h(z, str, 0), new g1.a(2, function1)) : null;
        return list == null ? f0.f322471a : list;
    }

    public static float b(BigDecimal bigDecimal) {
        return ((Number) kotlin.ranges.f.k(Float.valueOf(bigDecimal.floatValue()), new vim.c(BitmapDescriptorFactory.HUE_RED, 1.0f))).floatValue();
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f181475a;
        Data data2 = domainState.f181475a;
        Data data3 = domainState.f181476b;
        return new e(d0.E0(a("protection_section", data2, true, new a4(this, 5)), d0.E0(a("loss_probability_section", data2, true, new a4(this, 3)), d0.E0(a("revolut_suggestions_section", domainState.f181477c, false, new a4(this, 2)), a("annual_return_section", (data == null || data3 == null) ? null : t1.t(data, data3), true, new a4(this, 4))))));
    }
}
