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
public final class b implements f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX INFO: renamed from: oo1.b$b, reason: collision with other inner class name */
    public static final class C1260b implements yqi.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1260b f226993a = new C1260b();

        private C1260b() {
        }

        @Override // yqi.b
        public final Clause a() {
            return new TextLocalisedClause(R$string.pay_bills_taxes_country_au_input_reference_number_footer_error, v.k(2, 20), null, 12);
        }
    }

    @Override // yqi.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d validate(String validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.length() < 2 || validationData.length() > 20) {
            return new d(validationData, C1260b.f226993a);
        }
        d.Companion.getClass();
        return c.a(validationData);
    }
}
