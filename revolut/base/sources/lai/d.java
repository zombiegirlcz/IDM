package lai;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.feature.toggles.models.PublicExperimentDefinition;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import gim.i;
import hfg.l;
import java.io.File;
import kl7.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lfg.g0;
import lic.g;
import ll7.e0;
import ll7.k;
import ll7.p;
import ll7.u;
import lyi.m;
import m75.j;
import m8c.q;
import m8d.h0;
import m9d.g1;
import mfl.o;
import oki.h;
import svi.s;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f193403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f193404x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 11;
        this.f193403w = aVar;
        this.f193404x = (i) function1;
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v32, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((com.revolut.feature_retail_user_declarations.credit_consent.flow.a) this.f193403w, (String) this.f193404x, continuation, 0);
            case 1:
                return new d((com.revolut.feature.junior_coparent.impl.ui.invitation.b) this.f193403w, (zm3.a) this.f193404x, continuation, 1);
            case 2:
                return new d((g0) this.f193403w, (l) this.f193404x, continuation, 2);
            case 3:
                return new d((com.revolut.feature.external_accounts.impl.mandate.update_limits.a) this.f193403w, (String) this.f193404x, continuation, 3);
            case 4:
                return new d((g) this.f193403w, (kic.f) this.f193404x, continuation, 4);
            case 5:
                return new d((lie.i) this.f193403w, (AccountContent) this.f193404x, continuation, 5);
            case 6:
                return new d((k) this.f193403w, (n) this.f193404x, continuation, 6);
            case 7:
                return new d((p) this.f193403w, (String) this.f193404x, continuation, 7);
            case 8:
                return new d((u) this.f193403w, (String) this.f193404x, continuation, 8);
            case 9:
                return new d((e0) this.f193403w, (String) this.f193404x, continuation, 9);
            case 10:
                return new d((ll9.f) this.f193403w, (File) this.f193404x, continuation, 10);
            case 11:
                return new d((com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) this.f193403w, (Function1) this.f193404x, continuation);
            case 12:
                return new d((lnf.l) this.f193403w, (String) this.f193404x, continuation, 12);
            case 13:
                return new d((lnk.n) this.f193404x, continuation, 13);
            case 14:
                return new d((loa.l) this.f193403w, (PublicExperimentDefinition) this.f193404x, continuation, 14);
            case 15:
                return new d((com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a) this.f193403w, (krf.c) this.f193404x, continuation, 15);
            case 16:
                return new d((lqk.d) this.f193403w, (Function1) this.f193404x, continuation);
            case 17:
                return new d((lsl.f) this.f193403w, (ChargeBreakdown) this.f193404x, continuation, 17);
            case 18:
                return new d((File) this.f193403w, (com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a) this.f193404x, continuation, 18);
            case 19:
                return new d((lxl.f) this.f193403w, (UrlImage) this.f193404x, continuation, 19);
            case 20:
                return new d((m) this.f193403w, (s) this.f193404x, continuation, 20);
            case 21:
                return new d((com.revolut.feature.joint.impl.ui.withdraw.b) this.f193404x, continuation, 21);
            case 22:
                return new d((j) this.f193403w, (n75.c) this.f193404x, continuation, 22);
            case 23:
                return new d((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.c) this.f193403w, (String) this.f193404x, continuation, 23);
            case 24:
                return new d((q) this.f193403w, (String) this.f193404x, continuation, 24);
            case 25:
                return new d((h0) this.f193403w, (String) this.f193404x, continuation, 25);
            case 26:
                return new d((g1) this.f193403w, this.f193404x, continuation, 26);
            case 27:
                return new d((mf4.c) this.f193403w, (String) this.f193404x, continuation, 27);
            case 28:
                return new d((o) this.f193403w, (wbl.j) this.f193404x, continuation, 28);
            default:
                return new d((mg2.p) this.f193403w, (mg2.k) this.f193404x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:422:0x089e  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v26, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r12v30, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v106, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v121, types: [com.bumptech.glide.j, u8.a] */
    /* JADX WARN: Type inference failed for: r21v1, types: [kl7.y0] */
    /* JADX WARN: Type inference failed for: r3v32, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v38 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lai.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f193403w = obj2;
        this.f193404x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(lqk.d dVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 16;
        this.f193403w = dVar;
        this.f193404x = (i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f193404x = hVar;
    }
}
