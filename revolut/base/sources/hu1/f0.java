package hu1;

import aw0.o9;
import aw0.r2;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.core.models.blik.BlikCode;
import ip0.rl;
import ip0.sl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155520a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f155521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f155522c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(dj0.d dVar, boolean z, boolean z3, boolean z4) {
        this.e = dVar;
        this.f155521b = z;
        this.f155522c = z3;
        this.d = z4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        my0.l lVar;
        switch (this.f155520a) {
            case 0:
                BlikCode blikCode = (BlikCode) this.e;
                my0.c create = (my0.c) obj2;
                Intrinsics.checkNotNullParameter(create, "$this$create");
                boolean z3 = this.f155521b;
                boolean z4 = this.f155522c;
                if (z3 || z4) {
                    z = z3;
                    lVar = new my0.l(new r2(new TextClause("••• •••", (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null), sl.f166364a, new TextLocalisedClause(R$string.blik_home_section_code_subtitle_expired, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
                } else {
                    r2 r2Var = new r2(new TextClause(zhm.d0.k0(kotlin.text.f0.M0(3, blikCode.f61926b), " ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
                    long j2 = blikCode.d;
                    z = z3;
                    lVar = new my0.l(r2Var, new rl(j2 - blikCode.f61927c, j2, Long.valueOf(blikCode.e)), new TextLocalisedClause(R$string.blik_home_section_code_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
                }
                create.f210283c = lVar;
                my0.f[] elements = {(z || z4) ? null : new my0.f("COPY_BLIK_CODE_LIST_ID", new TextLocalisedClause(R$string.blik_home_section_code_action_copy, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), blikCode.f, 40), (this.d || z4) ? new my0.f("REFRESH_BLIK_CODE_LIST_ID", new TextLocalisedClause(R$string.blik_home_section_code_action_refresh, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_retry, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, SyslogConstants.LOG_CLOCK) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                create.f210281a = new my0.i(kotlin.collections.d.L(elements));
                return Unit.f186387a;
            default:
                dj0.d dVar = (dj0.d) this.e;
                pwc.g update = (pwc.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return pwc.g.a(update, dVar, this.f155521b, false, null, null, null, this.f155522c, null, null, this.d, 1785);
        }
    }

    public /* synthetic */ f0(boolean z, boolean z3, j0 j0Var, BlikCode blikCode, boolean z4) {
        this.f155521b = z;
        this.f155522c = z3;
        this.e = blikCode;
        this.d = z4;
    }
}
