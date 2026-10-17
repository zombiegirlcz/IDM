package oo1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.bpay.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yqi.c;
import yqi.d;
import yqi.f;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: oo1.a$a, reason: collision with other inner class name */
    public static final class C1259a implements yqi.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1259a f226992a = new C1259a();

        private C1259a() {
        }

        @Override // yqi.b
        public final Clause a() {
            return new TextLocalisedClause(R$string.pay_bills_taxes_country_au_input_biller_code_footer_error, v.k(3, 10), null, 12);
        }
    }

    public static final class b {
        private b() {
        }
    }

    @Override // yqi.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d validate(String validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.length() < 3 || validationData.length() > 10) {
            return new d(validationData, C1259a.f226992a);
        }
        d.Companion.getClass();
        return c.a(validationData);
    }
}
