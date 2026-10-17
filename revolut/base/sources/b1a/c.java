package b1a;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import b0a.j;
import com.revolut.feature.payments.splitbill.impl.data.recurringsplit.database.RecurringSplitDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f11758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f11759b = new ark.c(this, 2);

    public c(RecurringSplitDatabase recurringSplitDatabase) {
        this.f11758a = recurringSplitDatabase;
    }

    public static /* synthetic */ Unit e(c cVar, ArrayList arrayList) {
        super.d(arrayList);
        return Unit.f186387a;
    }

    @Override // b1a.a
    public final void a(ArrayList arrayList) {
        DBUtil.performBlocking(this.f11758a, false, true, new b(this, arrayList, 0));
    }

    @Override // b1a.a
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f11758a, false, true, new a54.c(2, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE FROM recurring_split WHERE id in ("), ")"), arrayList));
    }

    @Override // b1a.a
    public final List c() {
        return (List) DBUtil.performBlocking(this.f11758a, true, false, new j(this, 4));
    }

    @Override // b1a.a
    public final void d(ArrayList arrayList) {
        DBUtil.performBlocking(this.f11758a, false, true, new b(this, arrayList, 1));
    }
}
