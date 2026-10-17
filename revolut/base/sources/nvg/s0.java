package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.ArrayList;
import java.util.List;
import jel.a3;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class s0 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219669a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pvg.t f219671c = new pvg.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219670b = new c(this, 21);

    public s0(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219669a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(s0 s0Var, ArrayList arrayList) {
        super.a(arrayList);
        return Unit.f186387a;
    }

    @Override // nvg.q0
    public final void a(ArrayList arrayList) {
        DBUtil.performBlocking(this.f219669a, false, true, new r0(this, arrayList, 1));
    }

    @Override // nvg.q0
    public final void b(iwg.a aVar, eel.c cVar, iwg.c cVar2, a3 a3Var, String str, String str2) {
        DBUtil.performBlocking(this.f219669a, false, true, new ael.u0(this, aVar, cVar, cVar2, a3Var, str, str2));
    }

    @Override // nvg.q0
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f219669a, false, true, new r0(this, arrayList, 0));
    }

    @Override // nvg.q0
    public final List d(iwg.a aVar, eel.c cVar, iwg.c cVar2, a3 a3Var, String str, String str2) {
        return (List) DBUtil.performBlocking(this.f219669a, true, false, new krl.m(this, aVar, cVar, cVar2, a3Var, str, str2));
    }
}
