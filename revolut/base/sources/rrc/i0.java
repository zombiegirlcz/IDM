package rrc;

import ael.u0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.salary_switch.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 implements cli.n {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wda.b f256778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wpc.f f256779b;

    public i0(wda.b accountDetailsCommonMapper, wpc.f inputData) {
        Intrinsics.checkNotNullParameter(accountDetailsCommonMapper, "accountDetailsCommonMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f256778a = accountDetailsCommonMapper;
        this.f256779b = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        int i;
        v domainState = (v) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.d;
        List list = domainState.f256802c;
        boolean z = domainState.f256801b;
        wpc.f fVar = this.f256779b;
        boolean z3 = fVar instanceof wpc.d;
        if (z3) {
            textLocalisedClause = new TextLocalisedClause(R$string.salary_switch_share_details_header_single_title, null, null, 14);
        } else {
            if (!(fVar instanceof wpc.c)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = ((wpc.c) fVar).f299217b;
        }
        TextLocalisedClause textLocalisedClause5 = textLocalisedClause;
        if (z3) {
            textLocalisedClause2 = null;
        } else {
            if (!(fVar instanceof wpc.c)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = ((wpc.c) fVar).f299218c;
        }
        if (z3) {
            textLocalisedClause3 = z ? new TextLocalisedClause(R$string.salary_switch_share_details_action_share, null, null, 14) : new TextLocalisedClause(R$string.salary_switch_share_details_action_send_email, null, null, 14);
        } else {
            if (!(fVar instanceof wpc.c)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause3 = ((wpc.c) fVar).d;
        }
        TextLocalisedClause textLocalisedClause6 = textLocalisedClause3;
        if (z3) {
            textLocalisedClause4 = z ? new TextLocalisedClause(R$string.salary_switch_share_details_action_download_account_confirmation, null, null, 14) : new TextLocalisedClause(R$string.salary_switch_share_details_action_share_details, null, null, 14);
        } else {
            if (!(fVar instanceof wpc.c)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause4 = ((wpc.c) fVar).e;
        }
        TextLocalisedClause textLocalisedClause7 = textLocalisedClause4;
        int i2 = h0.f256776a[fVar.M().ordinal()];
        if (i2 == 1) {
            i = R$drawable.uikit_icn_24_back_button_arrow;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_cross;
        }
        ResourceImage resourceImage = new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        TextLocalisedClause textLocalisedClause8 = textLocalisedClause2;
        return (w) iii.c.f(data, new u0(this, textLocalisedClause5, textLocalisedClause8, textLocalisedClause6, textLocalisedClause7, resourceImage, 14), new bmk.c(textLocalisedClause5, textLocalisedClause8, textLocalisedClause6, textLocalisedClause7, resourceImage, this, 3), new kxg.c(this, textLocalisedClause5, textLocalisedClause8, textLocalisedClause6, textLocalisedClause7, resourceImage, list, 1));
    }
}
