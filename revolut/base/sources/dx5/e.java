package dx5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuote;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f120871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollectionQuote f120872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f120873c;
    public final List d;
    public final sh5.c e;
    public final Clause f;

    public e(dj0.d insertedAmount, CollectionQuote collectionQuote, Data collection, List list, sh5.c cVar, Clause clause) {
        Intrinsics.checkNotNullParameter(insertedAmount, "insertedAmount");
        Intrinsics.checkNotNullParameter(collectionQuote, "collectionQuote");
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f120871a = insertedAmount;
        this.f120872b = collectionQuote;
        this.f120873c = collection;
        this.d = list;
        this.e = cVar;
        this.f = clause;
    }

    public static e a(e eVar, Data data, sh5.c cVar, Clause clause, int i) {
        dj0.d insertedAmount = eVar.f120871a;
        CollectionQuote collectionQuote = eVar.f120872b;
        if ((i & 4) != 0) {
            data = eVar.f120873c;
        }
        Data collection = data;
        List list = eVar.d;
        if ((i & 16) != 0) {
            cVar = eVar.e;
        }
        sh5.c cVar2 = cVar;
        if ((i & 32) != 0) {
            clause = eVar.f;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(insertedAmount, "insertedAmount");
        Intrinsics.checkNotNullParameter(collectionQuote, "collectionQuote");
        Intrinsics.checkNotNullParameter(collection, "collection");
        return new e(insertedAmount, collectionQuote, collection, list, cVar2, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f120871a, eVar.f120871a) && Intrinsics.f(this.f120872b, eVar.f120872b) && Intrinsics.f(this.f120873c, eVar.f120873c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f120873c, (this.f120872b.hashCode() + (this.f120871a.hashCode() * 31)) * 31, 31);
        List list = this.d;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        sh5.c cVar = this.e;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Clause clause = this.f;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
