package a2a;

import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringSplit f713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f714b;

    public a(RecurringSplit recurringSplit, List contacts) {
        Intrinsics.checkNotNullParameter(recurringSplit, "recurringSplit");
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        this.f713a = recurringSplit;
        this.f714b = contacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f713a, aVar.f713a) && Intrinsics.f(this.f714b, aVar.f714b);
    }

    public final int hashCode() {
        return this.f714b.hashCode() + (this.f713a.hashCode() * 31);
    }
}
