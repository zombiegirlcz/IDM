package qpj;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.revolut.feature.wealth.analytics.insights.repository.database.PortfolioInsightsDatabase;
import com.revolut.retail.feature.impl.AnalyticsDatabase;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z70.a f248431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ de0.a f248432c;
    public final /* synthetic */ yk0.a d;
    public final /* synthetic */ Set e;

    public /* synthetic */ a(z70.a aVar, de0.a aVar2, yk0.a aVar3, Set set, int i) {
        this.f248430a = i;
        this.f248431b = aVar;
        this.f248432c = aVar2;
        this.d = aVar3;
        this.e = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f248430a;
        Set set = this.e;
        yk0.a aVar = this.d;
        de0.a aVar2 = this.f248432c;
        z70.a aVar3 = this.f248431b;
        switch (i) {
            case 0:
                RoomDatabase.Builder builderAddMigrations = Room.databaseBuilder(aVar3.getContext(), AnalyticsDatabase.class, "analytics_db").addMigrations(atj.a.f9084c);
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    builderAddMigrations.addTypeConverter(it8.next());
                }
                return builderAddMigrations.fallbackToDestructiveMigration().openHelperFactory(new ce0.d(((bl0.g) aVar2).a("analytics_db", aVar.getToken())));
            default:
                RoomDatabase.Builder builderFallbackToDestructiveMigration = Room.databaseBuilder(aVar3.getContext(), PortfolioInsightsDatabase.class, "portfolio_insights_db").fallbackToDestructiveMigration(true);
                Iterator it9 = set.iterator();
                while (it9.hasNext()) {
                    builderFallbackToDestructiveMigration.addTypeConverter(it9.next());
                }
                return builderFallbackToDestructiveMigration.openHelperFactory(new ce0.d(((bl0.g) aVar2).a("portfolio_insights_db", aVar.getToken())));
        }
    }
}
