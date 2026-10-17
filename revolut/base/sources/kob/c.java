package kob;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends atc.b {
    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        SavingsAccountDetails instance = (SavingsAccountDetails) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        targetCollection.add(instance.f86460a.f234885h.f234859a);
    }
}
