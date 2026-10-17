package com.revolut.feature.business.referrals.ui.screens.referral_invitee_details;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.youTransactor.uCube.rpc.Constants;
import dj0.d;
import fs2.k;
import ft2.e;
import ft2.h;
import ft2.j;
import iii.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ws2.g;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ws2.a f64365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f64366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vu.g f64367c;

    public b(ws2.a inviteeStateMapper, g stepsStateMapper, vu.g resourceProvider) {
        Intrinsics.checkNotNullParameter(inviteeStateMapper, "inviteeStateMapper");
        Intrinsics.checkNotNullParameter(stepsStateMapper, "stepsStateMapper");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f64365a = inviteeStateMapper;
        this.f64366b = stepsStateMapper;
        this.f64367c = resourceProvider;
    }

    public static t4 a(d dVar) {
        return new t4(dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, 8) : new TextClause("😔", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) c.f(domainState.f137784a, new k(this, 4), new fq7.j(12), new fnk.o(this, 4));
    }
}
