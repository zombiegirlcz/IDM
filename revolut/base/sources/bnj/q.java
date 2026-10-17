package bnj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.n3;
import dej.o0;
import dej.t1;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tsk.t;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    @NotNull
    public static final o Companion = new o();
    public static final Duration d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cej.b f17240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f17241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f17242c;

    static {
        Duration durationOfHours = Duration.ofHours(6L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        d = durationOfHours;
    }

    public q(cej.b mobilePlansFeatureAvailabilityInteractor, ynj.m esimInstallationStateResolver, xjj.a mobilePlanConnectedToDeviceClauseMapper, t remoteNavBarDescriptionMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationStateResolver, "esimInstallationStateResolver");
        Intrinsics.checkNotNullParameter(mobilePlanConnectedToDeviceClauseMapper, "mobilePlanConnectedToDeviceClauseMapper");
        Intrinsics.checkNotNullParameter(remoteNavBarDescriptionMapper, "remoteNavBarDescriptionMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f17240a = mobilePlansFeatureAvailabilityInteractor;
        this.f17241b = remoteNavBarDescriptionMapper;
        this.f17242c = featureToggleInteractor;
    }

    public static TextLocalisedClause a(t1 t1Var) {
        Instant instant;
        n3 n3Var = t1Var.E;
        if (n3Var != null && (instant = n3Var.f113607g) != null) {
            if (Duration.between(instant, Instant.now()).compareTo(d) <= 0) {
                instant = null;
            }
            if (instant != null) {
                return new TextLocalisedClause(R$string.esim_subscription_details_header_subtitle, u.c(new TimeClause(instant.toEpochMilli(), TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12);
            }
        }
        return null;
    }

    public static EsimProfile b(String str, List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((o0) next).a().f100423a, str)) {
                break;
            }
        }
        o0 o0Var = (o0) next;
        if (o0Var != null) {
            return o0Var.a();
        }
        return null;
    }
}
