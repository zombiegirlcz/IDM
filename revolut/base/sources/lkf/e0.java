package lkf;

import com.revolut.feature.pay_bills_taxes.api.navigation.FormDetailsDestination;
import com.revolut.feature.pay_bills_taxes.api.navigation.FormDetailsInputData;
import elf.s0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 extends yji.n implements s0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f196373l;

    public e0(klf.h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f196373l = commonDataSource;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (Intrinsics.f(str, "ID_BILL_F24")) {
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null) {
                A2(new FormDetailsDestination(new FormDetailsInputData(str2)));
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
