package l1k;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.WealthNewsArticleReaderScreenContract$InputData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ku1.y;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f191568b;

    public /* synthetic */ l(n nVar, int i) {
        this.f191567a = i;
        this.f191568b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f191567a) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                n nVar = this.f191568b;
                m0k.e eVar = nVar.v;
                WealthNewsArticleReaderScreenContract$InputData wealthNewsArticleReaderScreenContract$InputData = nVar.u;
                String articleId = wealthNewsArticleReaderScreenContract$InputData.f101878a.f101797a;
                boolean z = wealthNewsArticleReaderScreenContract$InputData.f101879b;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(articleId, "articleId");
                i0k.h hVar = eVar.f201163a;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(articleId, "articleId");
                return hVar.f157425a.f(new o0k.a(articleId, z), false).map(new kxj.e(new l(nVar, 1), 18));
            case 1:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.getError() != null ? Data.copy$default(it8, this.f191568b.u.f101878a, null, false, 6, null) : it8;
            case 2:
                this.f191568b.x2(new y((Data) obj2, 14));
                return Unit.f186387a;
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                this.f191568b.x2(new kzc.a((hel.b) pair.f186385a, (n0h.b) pair.f186386b, 5));
                return Unit.f186387a;
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                this.f191568b.x2(new l0g.a(20));
                return Boolean.TRUE;
            default:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                this.f191568b.x2(new y(it9, 13));
                return Unit.f186387a;
        }
    }
}
