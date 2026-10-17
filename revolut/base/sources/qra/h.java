package qra;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.feature.push_to_card.impl.storage.database.PushToCardDatabase;
import efm.r;
import java.util.ArrayList;
import kotlin.Unit;
import qc0.w;
import qpb.i;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f248679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f248680b = new g(0);

    public h(PushToCardDatabase pushToCardDatabase) {
        this.f248679a = pushToCardDatabase;
    }

    public static /* synthetic */ Unit f(h hVar, String str, long j2) {
        super.e(j2, str);
        return Unit.f186387a;
    }

    @Override // qra.f
    public final void a(ArrayList arrayList) {
        DBUtil.performBlocking(this.f248679a, false, true, new a54.c(12, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE FROM card_owners_stats WHERE id not in ("), ")"), arrayList));
    }

    @Override // qra.f
    public final r b() {
        i iVar = new i(22);
        return RxRoom.createObservable(this.f248679a, false, new String[]{"card_owners_stats"}, iVar);
    }

    @Override // qra.f
    public final sra.c c(String str) {
        return (sra.c) DBUtil.performBlocking(this.f248679a, true, false, new w(str, 19));
    }

    @Override // qra.f
    public final void d(sra.c cVar) {
        DBUtil.performBlocking(this.f248679a, false, true, new qpb.a(this, cVar, 5));
    }

    @Override // qra.f
    public final void e(long j2, String str) {
        DBUtil.performBlocking(this.f248679a, false, true, new csl.a(this, str, j2, 16));
    }
}
