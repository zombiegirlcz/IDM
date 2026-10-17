package zw5;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuote;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f325724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f325725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CollectionQuote f325726c;
    public final List d;
    public final q0i.i e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f325727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f325728h;

    public a(dj0.d insertedAmount, dj0.d pocketBalance, CollectionQuote collectionQuote, List list, q0i.i iVar, String str, Data collection, boolean z) {
        Intrinsics.checkNotNullParameter(insertedAmount, "insertedAmount");
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(collectionQuote, "collectionQuote");
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f325724a = insertedAmount;
        this.f325725b = pocketBalance;
        this.f325726c = collectionQuote;
        this.d = list;
        this.e = iVar;
        this.f = str;
        this.f325727g = collection;
        this.f325728h = z;
    }

    public static a a(a aVar, dj0.d dVar, dj0.d dVar2, CollectionQuote collectionQuote, List list, q0i.i iVar, String str, Data data, boolean z, int i) {
        if ((i & 1) != 0) {
            dVar = aVar.f325724a;
        }
        dj0.d insertedAmount = dVar;
        if ((i & 2) != 0) {
            dVar2 = aVar.f325725b;
        }
        dj0.d pocketBalance = dVar2;
        if ((i & 4) != 0) {
            collectionQuote = aVar.f325726c;
        }
        CollectionQuote collectionQuote2 = collectionQuote;
        if ((i & 8) != 0) {
            list = aVar.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            iVar = aVar.e;
        }
        q0i.i iVar2 = iVar;
        if ((i & 32) != 0) {
            str = aVar.f;
        }
        String str2 = str;
        Data collection = (i & 64) != 0 ? aVar.f325727g : data;
        boolean z3 = (i & 128) != 0 ? aVar.f325728h : z;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(insertedAmount, "insertedAmount");
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
        Intrinsics.checkNotNullParameter(collection, "collection");
        return new a(insertedAmount, pocketBalance, collectionQuote2, list2, iVar2, str2, collection, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f325724a, aVar.f325724a) && Intrinsics.f(this.f325725b, aVar.f325725b) && Intrinsics.f(this.f325726c, aVar.f325726c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f325727g, aVar.f325727g) && this.f325728h == aVar.f325728h;
    }

    public final int hashCode() {
        int iHashCode = (this.f325726c.hashCode() + v7.c(this.f325724a.hashCode() * 31, 31, this.f325725b)) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        q0i.i iVar = this.e;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f;
        return Boolean.hashCode(this.f325728h) + kii.e.c(this.f325727g, (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31);
    }
}
