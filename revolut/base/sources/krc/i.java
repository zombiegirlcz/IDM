package krc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.salary_switch.impl.R$string;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b f188853b;

    public /* synthetic */ i(com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b bVar, int i) {
        this.f188852a = i;
        this.f188853b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        switch (this.f188852a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f188853b.I2(it8, new TextLocalisedClause(R$string.salary_switch_mx_details_submit_error_title, null, null, 14), new TextLocalisedClause(R$string.salary_switch_mx_details_submit_error_subtitle, null, null, 14));
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f188853b.I2(it8, new TextLocalisedClause(R$string.salary_switch_mx_details_terms_error_title, null, null, 14), new TextLocalisedClause(R$string.salary_switch_mx_details_terms_error_subtitle, null, null, 14));
                break;
        }
        return Boolean.TRUE;
    }
}
