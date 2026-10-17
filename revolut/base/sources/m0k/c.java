package m0k;

import c1g.f0;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import kotlin.jvm.internal.Intrinsics;
import lu5.o;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.b f201158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f201159b;

    public c(e wealthNewsInteractor, yk0.d schedulerProvider, DateTime articlesDay, WealthNewsCategory category, boolean z) {
        Intrinsics.checkNotNullParameter(wealthNewsInteractor, "wealthNewsInteractor");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(articlesDay, "articlesDay");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f201158a = j6.a.h("create(...)");
        lp2.c cVar = new lp2.c(wealthNewsInteractor, 20);
        DateTime dateTimePlusDays = articlesDay.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(dateTimePlusDays, "plusDays(...)");
        this.f201159b = new f0(cVar, new ljd.e(this, 22), new o(this, 27), new b(category, z, dateTimePlusDays, articlesDay), new l1.e(category, z, articlesDay, 7), new lyd.b(28), yk0.d.a());
    }
}
