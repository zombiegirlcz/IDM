package dtc;

import android.content.Context;
import androidx.collection.SparseArrayCompat;
import com.revolut.feature.transactions.api.R$string;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends atc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f117408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArrayCompat f117409b;

    public g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f117408a = context;
        this.f117409b = new SparseArrayCompat(0, 1, null);
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        a3 instance = (a3) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        long j2 = instance.k.f115082a;
        if (j2 < 0) {
            targetCollection.add(b(R$string.search_block_transactions_keywords_outbound));
            targetCollection.add(b(R$string.search_block_transactions_keywords_debit));
            targetCollection.add(b(R$string.search_block_transactions_keywords_paid));
        } else if (j2 > 0) {
            targetCollection.add(b(R$string.search_block_transactions_keywords_inbound));
            targetCollection.add(b(R$string.search_block_transactions_keywords_credit));
            targetCollection.add(b(R$string.search_block_transactions_keywords_received));
        }
    }

    public final String b(int i) {
        SparseArrayCompat sparseArrayCompat = this.f117409b;
        String str = (String) sparseArrayCompat.get(i);
        if (str != null) {
            return str;
        }
        String string = this.f117408a.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        sparseArrayCompat.put(i, string);
        return string;
    }

    @Override // atc.b
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f117408a, ((g) obj2).f117408a);
    }

    @Override // atc.b
    public final int hashCode() {
        return this.f117408a.hashCode();
    }
}
