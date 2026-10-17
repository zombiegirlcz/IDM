package qqf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.core.R$string;
import java.util.List;
import jki.p;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements p {

    @NotNull
    public static final C1358a Companion = new C1358a();

    /* JADX INFO: renamed from: qqf.a$a, reason: collision with other inner class name */
    public static final class C1358a {
        private C1358a() {
        }
    }

    public static InputTextDelegate.Model b(krf.e eVar) {
        String str;
        InputTextDelegate.Model model = new InputTextDelegate.Model("TRANSFER_REASON_ID", (eVar == null || (str = eVar.f188862b) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_core_reason_for_transfer_reason_regular_field_title, null, null, 14), null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, 524288, 0, null, false, false, null, false, null, false, false, false, null, null, 0, -35655688, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i = R$attr.uikit_dp24;
        yp0.b.l(model, i, i, 0, 0, null, false, 60);
        return model;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05f8  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r87) {
        /*
            Method dump skipped, instruction units count: 1539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qqf.a.a(jki.i):jki.m");
    }
}
