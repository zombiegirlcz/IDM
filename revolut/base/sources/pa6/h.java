package pa6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.impl.ui.kompot.screen.collection.details.CharitiesCollectionDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharitiesCollectionDetailsScreenContract$InputData f234370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234372c;

    public h(m mVar, n nVar, CharitiesCollectionDetailsScreenContract$InputData charitiesCollectionDetailsScreenContract$InputData) {
        this.f234370a = charitiesCollectionDetailsScreenContract$InputData;
        int i = 1;
        this.f234371b = e4m.b.b(new f(mVar, this, 1, i));
        this.f234372c = e4m.b.b(new f(mVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
