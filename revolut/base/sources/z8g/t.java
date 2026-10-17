package z8g;

import a9g.x1;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z55.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f320129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f320130c;

    public /* synthetic */ t(u uVar, x1 x1Var, int i) {
        this.f320128a = i;
        this.f320129b = uVar;
        this.f320130c = x1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f320128a) {
            case 0:
                u uVar = this.f320129b;
                uVar.getClass();
                x1 entity = this.f320130c;
                Intrinsics.checkNotNullParameter(entity, "entity");
                RoomDatabase roomDatabase = uVar.f320131a;
                DBUtil.performBlocking(roomDatabase, false, true, new t(uVar, entity, 1));
                DBUtil.performBlocking(roomDatabase, false, true, new w(29));
                return Unit.f186387a;
            default:
                this.f320129b.f320132b.insert(sQLiteConnection, this.f320130c);
                return null;
        }
    }
}
