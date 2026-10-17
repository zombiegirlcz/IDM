package s93;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.cards_core.impl.data.db.CardsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import ofg.i;
import s8h.h;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f261106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f261107b = new i(this, 23);

    public e(CardsDatabase cardsDatabase) {
        this.f261106a = cardsDatabase;
    }

    public static /* synthetic */ Unit e(e eVar, ArrayList arrayList) {
        super.b(arrayList);
        return Unit.f186387a;
    }

    @Override // s93.c
    public final void a() {
        DBUtil.performBlocking(this.f261106a, false, true, new h(4));
    }

    @Override // s93.c
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f261106a, false, true, new d(this, arrayList, 0));
    }

    @Override // s93.c
    public final List c() {
        return (List) DBUtil.performBlocking(this.f261106a, true, false, new s78.d(this, 6));
    }

    @Override // s93.c
    public final void d(ArrayList arrayList) {
        DBUtil.performBlocking(this.f261106a, false, true, new d(this, arrayList, 1));
    }
}
