package oph;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.ScreenerAllCollectionsRedesignContract$CollectionsPagerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerAllCollectionsRedesignContract$CollectionsPagerItem f227658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f227659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227660c;
    public final Data d;
    public final Data e;

    public a(ScreenerAllCollectionsRedesignContract$CollectionsPagerItem pagerItem, Data screenerCollections, boolean z, Data data, Data collectionAvatarRefs) {
        Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
        Intrinsics.checkNotNullParameter(screenerCollections, "screenerCollections");
        Intrinsics.checkNotNullParameter(collectionAvatarRefs, "collectionAvatarRefs");
        this.f227658a = pagerItem;
        this.f227659b = screenerCollections;
        this.f227660c = z;
        this.d = data;
        this.e = collectionAvatarRefs;
    }

    public static a a(a aVar, Data data, boolean z, Data data2, Data data3, int i) {
        Data screenerCollections = data;
        ScreenerAllCollectionsRedesignContract$CollectionsPagerItem pagerItem = aVar.f227658a;
        if ((i & 2) != 0) {
            screenerCollections = aVar.f227659b;
        }
        if ((i & 4) != 0) {
            z = aVar.f227660c;
        }
        if ((i & 8) != 0) {
            data2 = aVar.d;
        }
        if ((i & 16) != 0) {
            data3 = aVar.e;
        }
        Data collectionAvatarRefs = data3;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
        Intrinsics.checkNotNullParameter(screenerCollections, "screenerCollections");
        Intrinsics.checkNotNullParameter(collectionAvatarRefs, "collectionAvatarRefs");
        Data data4 = data2;
        return new a(pagerItem, screenerCollections, z, data4, collectionAvatarRefs);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f227658a, aVar.f227658a) && Intrinsics.f(this.f227659b, aVar.f227659b) && this.f227660c == aVar.f227660c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f227659b, this.f227658a.hashCode() * 31, 31), 31, this.f227660c);
        Data data = this.d;
        return this.e.hashCode() + ((iC + (data == null ? 0 : data.hashCode())) * 31);
    }
}
