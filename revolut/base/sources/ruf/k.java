package ruf;

import android.text.format.DateUtils;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transport.api.R$string;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    public static abstract class a {

        /* JADX INFO: renamed from: ruf.k$a$a, reason: collision with other inner class name */
        public static final class C1426a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1426a f257553a = new C1426a();

            private C1426a() {
            }
        }

        private a() {
        }
    }

    public static TextLocalisedClause a(int i, long j2) {
        return new TextLocalisedClause(R$string.transport_ticket_details_time_placeholder, u.c(DateUtils.formatElapsedTime(j2)), new Custom(Integer.valueOf(i), false, null, false, null, 254), 8);
    }

    public static TextLocalisedClause b(int i) {
        return new TextLocalisedClause(R$string.transport_ticket_details_status_expired, null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 10);
    }

    public static a c(LocalDateTime other, LocalDateTime now) {
        Intrinsics.checkNotNullParameter(other, "expirationDate");
        Intrinsics.checkNotNullParameter(now, "now");
        long jF = oi0.d.f(now, other);
        if (jF > 0) {
            return new j(jF);
        }
        Intrinsics.checkNotNullParameter(now, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        long jBetween = ChronoUnit.HOURS.between(now, other);
        if (jBetween > 0) {
            return new l(jBetween);
        }
        Intrinsics.checkNotNullParameter(now, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        long jBetween2 = ChronoUnit.MILLIS.between(now, other);
        return jBetween2 >= 0 ? new i(jBetween2 / ((long) 1000)) : a.C1426a.f257553a;
    }
}
