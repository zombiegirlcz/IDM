package o23;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.address.common.api.R$plurals;
import com.revolut.feature.address.common.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh1.b f221444a;

    public c0(rh1.b addressFlowInteractor, t fieldsLocalisationProvider) {
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        Intrinsics.checkNotNullParameter(fieldsLocalisationProvider, "fieldsLocalisationProvider");
        this.f221444a = addressFlowInteractor;
    }

    public static boolean b(sh1.f fVar) {
        return !Intrinsics.f(fVar, sh1.e.f263343a);
    }

    public final Clause a(sh1.g gVar, boolean z) {
        if (b(gVar.f263345b)) {
            sh1.f addressFieldError = gVar.f263345b;
            Intrinsics.checkNotNullParameter(addressFieldError, "addressFieldError");
            if (addressFieldError instanceof sh1.b) {
                return new TextLocalisedClause(R$string.validation_error_required, null, null, 14);
            }
            if (addressFieldError instanceof sh1.d) {
                return new TextLocalisedQuantityClause(R$plurals.validation_error_min_length, Integer.valueOf(((sh1.d) addressFieldError).f263342a), (List) null, (Style) null, 28);
            }
            if (addressFieldError instanceof sh1.c) {
                return new TextLocalisedQuantityClause(R$plurals.validation_error_max_length, Integer.valueOf(((sh1.c) addressFieldError).f263341a), (List) null, (Style) null, 28);
            }
            if (addressFieldError instanceof sh1.a) {
                return ((sh1.a) addressFieldError).f263339a;
            }
            if (!(addressFieldError instanceof sh1.e)) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (z) {
            return new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_delivery_address_form_optional_caption, null, null, 14);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0bea  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0c0c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0c50  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0c72  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0c94  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0cb6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0cd8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0cfb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0d18  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0d1c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0214  */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r121) {
        /*
            Method dump skipped, instruction units count: 3414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o23.c0.c(cli.j):cli.o");
    }
}
