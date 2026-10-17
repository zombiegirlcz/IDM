package eah;

import aii.u;
import amh.w;
import com.revolut.feature.instruments.trend.collections.api.InstrumentsTrendCollectionDestination;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.wealth.api.declaration.InstrumentsCollectionDestination;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x8h.g;
import x8h.p;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends b1h.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f124252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f124253m;

    public b(g collectionsInteractor, p sortOptionsInteractor) {
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(sortOptionsInteractor, "sortOptionsInteractor");
        this.f124252l = collectionsInteractor;
        this.f124253m = sortOptionsInteractor;
    }

    @Override // b1h.a
    public final w Z2() {
        InstrumentsCollectionType.RecommendedBuy collectionType = InstrumentsCollectionType.RecommendedBuy.f95285a;
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        InstrumentsCollectionSortOption sortOption = this.f124253m.a(collectionType);
        f0 filters = f0.f322471a;
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new w(this.f124252l.d(collectionType, sortOption, filters, true), 6);
    }

    @Override // b1h.a
    public final void b3(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        A2(new AssetDetailsDestination(ref2, null, false, null, null, null, 62));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // b1h.a
    public final void c3() {
        u instrumentsCollectionDestination;
        InstrumentsCollectionType.RecommendedBuy type = InstrumentsCollectionType.RecommendedBuy.f95285a;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.equals(InstrumentsCollectionType.Bonds.f95283a) || type.equals(InstrumentsCollectionType.Etfs.f95284a)) {
            instrumentsCollectionDestination = new InstrumentsCollectionDestination(type);
        } else {
            if (!type.equals(type)) {
                throw new NoWhenBranchMatchedException();
            }
            instrumentsCollectionDestination = new InstrumentsTrendCollectionDestination(InstrumentsTrendCollectionId.RecommendedBuy.f74905a, null, ph7.c.RECOMMENDED_BUY);
        }
        A2(instrumentsCollectionDestination);
    }
}
