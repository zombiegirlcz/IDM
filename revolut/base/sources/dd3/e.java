package dd3;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cashback.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements b, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f113090b;

    public e(String str, AnalyticsContext analyticsContext) {
        this.f113089a = str;
        this.f113090b = analyticsContext;
    }

    @Override // dd3.b
    public final TextLocalisedClause c() {
        String str = this.f113089a;
        return str != null ? new TextLocalisedClause(R$string.cashback_source_credit_subtitle, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.cashback_source_credit_subtitle_fallback, null, null, 14);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f113089a, eVar.f113089a) && this.f113090b.equals(eVar.f113090b);
    }

    @Override // dd3.a
    public final Parcelable getAnalyticsContext() {
        return this.f113090b;
    }

    public final int hashCode() {
        String str = this.f113089a;
        return AnalyticsContext.a(this.f113090b.f50296a) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
