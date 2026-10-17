package g3c;

import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final IppProductType a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Intrinsics.f(str, "ANDROID_TERMINAL") ? IppProductType.AndroidTerminal.f84195a : Intrinsics.f(str, "CARD_READER") ? IppProductType.CardReader.f84196a : new IppProductType.Unknown(str);
    }
}
