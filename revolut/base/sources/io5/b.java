package io5;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f163193a;

    static RowDelegate.Model a(b bVar, CryptoAddress cryptoAddress) {
        bp5.b bVar2 = (bp5.b) bVar;
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        ko5.a aVarE = CryptoAddress.e(cryptoAddress, 0, 3);
        String str = cryptoAddress.f71059a;
        ContactImage contactImage = new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, aVarE.a(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        TextClause textClause = new TextClause(aVarE.f186223a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = aVarE.f186224b;
        return new RowDelegate.Model(str, contactImage, null, null, textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, false, bVar2.b(cryptoAddress), null, null, null, null, cryptoAddress, null, 0, 0, 0, 0, 1056946028);
    }
}
