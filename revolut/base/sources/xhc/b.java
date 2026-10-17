package xhc;

import com.revolut.feature.rewards.api.model.subscriptions_search.SubscriptionSearchItem;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends atc.b {
    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        SubscriptionSearchItem instance = (SubscriptionSearchItem) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        String str = instance.f84885c;
        if (str != null) {
            targetCollection.add(str);
        }
    }
}
