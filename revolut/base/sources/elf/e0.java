package elf;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transactions.impl.ui.kompot.details.block_provider.fee.InvalidFeesChargesException;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f127317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tkf.b f127318m;

    public e0(j60.a bottomDialogExtension, tkf.b feeItemProvider) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(feeItemProvider, "feeItemProvider");
        this.f127317l = bottomDialogExtension;
        this.f127318m = feeItemProvider;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (obj2 instanceof tkf.c) {
            tkf.c parcel = (tkf.c) obj2;
            this.f127318m.getClass();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            tof.r0 r0Var = parcel.f271953b;
            String str2 = parcel.f271952a;
            String str3 = r0Var.f273017b;
            if (str3 == null) {
                throw new InvalidFeesChargesException(str2, "Missing title for fees breakdown dialog.");
            }
            String str4 = r0Var.d;
            if (str4 == null) {
                throw new InvalidFeesChargesException(str2, "Missing description for fees breakdown dialog.");
            }
            this.f127317l.x(new rp0.y(zhm.u.c(new PlainTextDelegate.Model("ID_FEES_CHARGES_BREAKDOWN_DESCRIPTION_DIALOG_DESCRIPTION", (Clause) null, (Clause) new TextClause(str4, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 61422)), new rp0.t(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
