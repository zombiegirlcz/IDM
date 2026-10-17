package dtc;

import android.content.Context;
import androidx.collection.SparseArrayCompat;
import com.revolut.feature.transactions.api.R$string;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.d3;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends atc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f117417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArrayCompat f117418b;

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f117417a = context;
        this.f117418b = new SparseArrayCompat(0, 1, null);
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        a3 instance = (a3) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        d3 d3Var = instance.E;
        if ((d3Var != null ? d3Var.f272683b : null) == yvh.f.SPARE_CHANGE) {
            int i = R$string.search_block_transactions_keywords_spare_change;
            SparseArrayCompat sparseArrayCompat = this.f117418b;
            String string = (String) sparseArrayCompat.get(i);
            if (string == null) {
                string = this.f117417a.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                sparseArrayCompat.put(i, string);
            }
            targetCollection.add(string);
        }
    }

    @Override // atc.b
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f117417a, ((j) obj2).f117417a);
    }

    @Override // atc.b
    public final int hashCode() {
        return this.f117417a.hashCode();
    }
}
