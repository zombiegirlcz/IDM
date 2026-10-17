package t50;

import cli.y;
import com.revolut.chat.domain.model.rate.ChatRateException;
import com.revolut.chat.domain.model.rate.RateChatExperienceData;
import com.revolut.chat.ui.flow.RatingSupportType;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import t50.i;
import vkm.j2;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends oki.h implements l {
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s30.b f268029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s50.e f268030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f268031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f268032s;

    public u(h inputData, cli.n stateMapper, s30.b rateInteractor, s50.e chatRatingShotDelegate) {
        z30.e eVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(rateInteractor, "rateInteractor");
        Intrinsics.checkNotNullParameter(chatRatingShotDelegate, "chatRatingShotDelegate");
        this.o = inputData;
        this.f268029p = rateInteractor;
        this.f268030q = chatRatingShotDelegate;
        this.f268031r = new AtomicBoolean(false);
        z30.j jVar = inputData.f268017b;
        boolean z = inputData.f268018c;
        Integer num = inputData.d;
        if (num != null) {
            eVar = (z30.e) d0.e0(num.intValue(), jVar.a());
        } else {
            eVar = null;
        }
        this.f268032s = mra.d.b(this, new k50.y(eVar, jVar, h0.f322473a, "", RatingSupportType.CHAT, z, false), stateMapper, null, false, 12);
    }

    public static final void I2(u uVar, Throwable th10) {
        uVar.getClass();
        yji.l.a1(uVar, uVar.X1(new y0("errorDialog", new z(new TextLocalisedClause(th10 instanceof ChatRateException.UnableToCloseInitiatedByAgentTicket ? R$string.chat_rate_error : R$string.common_error, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, new p(uVar, null), 3);
    }

    public final RateChatExperienceData J2(z30.e eVar) {
        String strA = eVar.a();
        y yVar = this.f268032s;
        String str = ((k50.y) ((j2) yVar.f22677a).getValue()).d;
        if (kotlin.text.d0.W(str)) {
            str = null;
        }
        Set set = ((k50.y) ((j2) yVar.f22677a).getValue()).f181292c;
        if (set.isEmpty()) {
            set = null;
        }
        return new RateChatExperienceData(strA, str, set != null ? d0.d1(set) : null, eVar.f319112a);
    }

    public final void K2(Object obj2, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f268031r.set(true);
        if (Intrinsics.f(itemId, "LIST_ID_SKIP_RATING")) {
            n2(new sqd.h0(this, null, 14), new su0.c(1, this, u.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 11));
        }
    }

    @Override // yji.l
    public final void P1() {
        aii.r jVar;
        if (this.f268031r.get()) {
            return;
        }
        z30.e eVar = ((k50.y) ((j2) this.f268032s.f22677a).getValue()).f181290a;
        h hVar = this.o;
        boolean z = hVar.f268017b instanceof z30.g;
        if (eVar == null || !(eVar.b() == z30.l.MANDATORY || z)) {
            jVar = i.b.f268020a;
        } else {
            UUID uuid = hVar.f268016a;
            this.f268030q.b(hVar.f268017b.a().indexOf(eVar), uuid);
            jVar = new j(J2(eVar));
        }
        C2(jVar);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f268032s;
    }
}
