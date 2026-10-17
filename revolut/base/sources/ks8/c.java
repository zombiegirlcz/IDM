package ks8;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final c f = new c(false, new TextLocalisedClause(R$string.verify_identity_prompt_subtitle, null, null, 14), null, null, 28);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f189303g = new c(false, new TextLocalisedClause(R$string.verify_identity_prompt_subtitle, null, null, 14), new TextLocalisedClause(R$string.common_action_not_now, null, null, 14), new FinishCommand(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7), 16);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f189304h = new c(true, new TextLocalisedClause(R$string.verify_identity_prompt_topup_subtitle, null, null, 14), null, null, 28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f189305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f189306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f189307c;
    public final NaviCommand d;
    public final AnalyticsProduct.Retail e;

    public c(boolean z, TextLocalisedClause subtitle, TextLocalisedClause textLocalisedClause, FinishCommand finishCommand, int i) {
        textLocalisedClause = (i & 4) != 0 ? null : textLocalisedClause;
        finishCommand = (i & 8) != 0 ? null : finishCommand;
        k9 value = k9.KYC;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        AnalyticsProduct.Retail automaticEventProduct = new AnalyticsProduct.Retail(value);
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f189305a = z;
        this.f189306b = subtitle;
        this.f189307c = textLocalisedClause;
        this.d = finishCommand;
        this.e = automaticEventProduct;
    }

    public final boolean a() {
        return this.f189305a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f189305a == cVar.f189305a && Intrinsics.f(this.f189306b, cVar.f189306b) && Intrinsics.f(this.f189307c, cVar.f189307c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(Boolean.hashCode(this.f189305a) * 31, 31, this.f189306b);
        Clause clause = this.f189307c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        NaviCommand naviCommand = this.d;
        return this.e.f50300a.hashCode() + ((iHashCode + (naviCommand != null ? naviCommand.hashCode() : 0)) * 31);
    }
}
