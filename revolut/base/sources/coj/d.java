package coj;

import aii.u;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig;
import dej.m;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25560a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f25561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f25562c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ d(g gVar, m mVar, String str, boolean z) {
        this.f25561b = gVar;
        this.f25562c = mVar;
        this.d = str;
        this.e = z;
    }

    @Override // kfm.a
    public final void run() {
        u subscriptionDestination;
        switch (this.f25560a) {
            case 0:
                this.f25561b.d.a(new EsimFeatureConfig.GetPlanDestination(this.d, this.f25562c, null, this.e ? com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE) : null, 4));
                return;
            default:
                ash.d dVar = this.f25561b.d;
                int i = e.f25563a[this.f25562c.ordinal()];
                String str = this.d;
                if (i == 1) {
                    subscriptionDestination = new EsimFeatureConfig.SubscriptionDestination(str, this.e ? com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE) : null);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    subscriptionDestination = new EsimFeatureConfig.MobilePlanSubscriptionDestination(str);
                }
                dVar.a(subscriptionDestination);
                return;
        }
    }

    public /* synthetic */ d(g gVar, String str, m mVar, boolean z) {
        this.f25561b = gVar;
        this.d = str;
        this.f25562c = mVar;
        this.e = z;
    }
}
