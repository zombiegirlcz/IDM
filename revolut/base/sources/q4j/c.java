package q4j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.common.mapper.backend_fields.input.LocaleExtraData;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static boolean a(LocaleExtraData localeExtraData) {
        Intrinsics.checkNotNullParameter(localeExtraData, "localeExtraData");
        wi0.b bVar = localeExtraData.f99700a;
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.N) && Intrinsics.f(localeExtraData.f99701b.f306286a, "CNY");
    }

    public static boolean b(LocaleExtraData localeExtraData) {
        Intrinsics.checkNotNullParameter(localeExtraData, "localeExtraData");
        wi0.b bVar = localeExtraData.f99700a;
        wi0.b.Companion.getClass();
        wi0.b bVar2 = wi0.b.X0;
        if (!Intrinsics.f(bVar, bVar2)) {
            return false;
        }
        xi0.b bVar3 = localeExtraData.f99701b;
        xi0.b.Companion.getClass();
        return Intrinsics.f(bVar3, xi0.b.f306274j) && w.S(localeExtraData.f99702c, bVar2);
    }
}
