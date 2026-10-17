package i9e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subscriptions.impl.edit_subscription_end_date.EditSubscriptionEndDateControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditSubscriptionEndDateControllerContract$InputData f159696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f159697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f159698c;

    public m(o oVar, EditSubscriptionEndDateControllerContract$InputData editSubscriptionEndDateControllerContract$InputData) {
        this.f159696a = editSubscriptionEndDateControllerContract$InputData;
        int i = 0;
        this.f159697b = e4m.b.b(new l(oVar, this, 1, i));
        this.f159698c = e4m.b.b(new l(oVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
