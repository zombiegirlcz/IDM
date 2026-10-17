package bld;

import be7.s;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.slot_manager.impl.R$string;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.FeedbackBundle;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.RateUsBundle;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.f1;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q;
import vkm.z1;
import wli.x;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp6.a f16545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final twg.c f16546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f16547c;
    public final CoroutineScope d;
    public final j2 e;
    public final z1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f16548g;

    public m(dp6.a feedbackRepository, twg.c eventHandler, x deeplinkHandler, CoroutineScope appScope) {
        Intrinsics.checkNotNullParameter(feedbackRepository, "feedbackRepository");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        this.f16545a = feedbackRepository;
        this.f16546b = eventHandler;
        this.f16547c = deeplinkHandler;
        this.d = appScope;
        this.e = q.c(r0.g());
        this.f = q.b(0, 2, ukm.f.DROP_OLDEST);
        this.f16548g = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(bld.m r17, fkd.f r18, int r19, com.revolut.feature.slot_manager.api.model.SlotContext r20, gim.c r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bld.m.a(bld.m, fkd.f, int, com.revolut.feature.slot_manager.api.model.SlotContext, gim.c):java.lang.Object");
    }

    public static f b(FeedbackBundle feedbackBundle) {
        return new f(feedbackBundle, new TextLocalisedClause(R$string.cx_feedback_feedback_banner_submitted, null, null, 14), new TextLocalisedClause(R$string.cx_feedback_feedback_banner_more_info, null, null, 14), f1.ABOVE_ANCHOR_VIEW);
    }

    public static g c() {
        return new g(new TextLocalisedClause(R$string.cx_feedback_feedback_success_nps, null, null, 14), f1.ABOVE_ANCHOR_VIEW);
    }

    public final void d(RateUsBundle rateUsBundle) {
        Intrinsics.checkNotNullParameter(rateUsBundle, "rateUsBundle");
        String str = rateUsBundle.f87355a;
        Continuation continuation = null;
        if (!this.f16547c.y1(str)) {
            this.f.k(new h(new ExternalDestination.Browser(str, null)));
        } else {
            p0 p0Var = p0.f264001a;
            e0.C(this.d, zkm.o.f323119a, null, new s(this, str, continuation, 10), 2);
        }
    }
}
