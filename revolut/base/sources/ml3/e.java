package ml3;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.protobuf.f3;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206581a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f206582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f206583c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(int i, long j2, String str) {
        this.f206583c = i;
        this.f206582b = j2;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f206581a) {
            case 0:
                int i = this.f206583c;
                long j2 = this.f206582b;
                String str = (String) this.d;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("UPDATE contact SET transactionsCount = ?, timestamp = ? WHERE point = ? or registeredAs = ? or username = ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, i);
                    sQLiteStatementPrepare.bindLong(2, j2);
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str);
                    }
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindText(4, str);
                    }
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(5);
                    } else {
                        sQLiteStatementPrepare.bindText(5, str);
                    }
                    sQLiteStatementPrepare.step();
                    Unit unit = Unit.f186387a;
                    sQLiteStatementPrepare.close();
                    return unit;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            default:
                Map map = (Map) this.d;
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                com.bumptech.glide.c.w(buildStruct, "duration", Long.valueOf(this.f206582b));
                com.bumptech.glide.c.v(buildStruct, "count", Integer.valueOf(this.f206583c));
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        com.revolut.analytics.tracking.v3.f.c(buildStruct, (String) entry.getKey(), entry.getValue());
                    }
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ e(long j2, int i, Map map, com.revolut.analytics.tracking.v3.f fVar) {
        this.f206582b = j2;
        this.f206583c = i;
        this.d = map;
    }
}
