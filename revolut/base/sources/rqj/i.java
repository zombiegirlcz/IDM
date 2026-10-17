package rqj;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vv8.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f256564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f256565c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(String str, long j2, long j3) {
        this.f256563a = 0;
        this.d = str;
        this.f256564b = j2;
        this.f256565c = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f256563a) {
            case 0:
                String str = (String) this.d;
                long j2 = this.f256564b;
                long j3 = this.f256565c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n        DELETE FROM budget_history_snapshot\n        WHERE walletId = ?\n            AND effectiveFrom < ?\n            AND (effectiveTo IS NULL OR effectiveTo > ?)\n        ");
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    sQLiteStatementPrepare.bindLong(2, j2);
                    sQLiteStatementPrepare.bindLong(3, j3);
                    sQLiteStatementPrepare.step();
                    Unit unit = Unit.f186387a;
                    sQLiteStatementPrepare.close();
                    return unit;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 1:
                t3i.f fVar = (t3i.f) this.d;
                vv8.b update = (vv8.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return vv8.b.a(update, new vv8.i(fVar, (int) ((this.f256564b * 100) / this.f256565c)), null, 5);
            default:
                t3i.h hVar = (t3i.h) this.d;
                vv8.b update2 = (vv8.b) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return vv8.b.a(update2, null, new vv8.i(hVar, (int) ((this.f256564b * 100) / this.f256565c)), 3);
        }
    }

    public /* synthetic */ i(t3i.i iVar, q qVar, long j2, long j3, int i) {
        this.f256563a = i;
        this.d = iVar;
        this.f256564b = j2;
        this.f256565c = j3;
    }
}
