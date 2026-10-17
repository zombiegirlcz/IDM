package wok;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298955a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f298956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a f298957c;

    public /* synthetic */ m(Data data, com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a aVar) {
        this.f298956b = data;
        this.f298957c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data invite;
        Data entry;
        switch (this.f298955a) {
            case 0:
                return e.a((e) obj2, this.f298956b, ((e) ((j2) this.f298957c.f103707t.f22677a).getValue()).f298941b, 8);
            default:
                Data data = this.f298956b;
                e eVar = (e) obj2;
                String str = null;
                try {
                    Object content = data.getContent();
                    invite = new Data(content != null ? (gok.f) ((Pair) content).f186386b : null, data.getError(), data.getLoading());
                    break;
                } catch (Throwable th10) {
                    invite = new Data(null, th10, data.getLoading());
                }
                try {
                    Object content2 = data.getContent();
                    entry = new Data(content2 != null ? (PricingPlanWaitlistEntry) ((Pair) content2).f186385a : null, data.getError(), data.getLoading());
                    break;
                } catch (Throwable th11) {
                    entry = new Data(null, th11, data.getLoading());
                }
                String str2 = ((e) ((j2) this.f298957c.f103707t.f22677a).getValue()).d;
                if (str2 == null) {
                    gok.f fVar = (gok.f) invite.getContent();
                    if (fVar != null) {
                        str = fVar.f145191c;
                    }
                } else {
                    str = str2;
                }
                eVar.getClass();
                Intrinsics.checkNotNullParameter(invite, "invite");
                Intrinsics.checkNotNullParameter(entry, "entry");
                return new e(invite, entry, str, false);
        }
    }

    public /* synthetic */ m(com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a aVar, Data data) {
        this.f298957c = aVar;
        this.f298956b = data;
    }
}
