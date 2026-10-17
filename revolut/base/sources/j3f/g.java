package j3f;

import androidx.room.RoomRawQuery;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f171183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f171184c;
    public final /* synthetic */ RoomRawQuery d;

    public /* synthetic */ g(h hVar, String str, RoomRawQuery roomRawQuery, int i) {
        this.f171182a = i;
        this.f171183b = hVar;
        this.f171184c = str;
        this.d = roomRawQuery;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f171182a) {
            case 0:
                RoomRawQuery roomRawQuery = this.d;
                h hVar = this.f171183b;
                hVar.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f171184c);
                try {
                    roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(hVar.l(sQLiteStatementPrepare));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            default:
                RoomRawQuery roomRawQuery2 = this.d;
                h hVar2 = this.f171183b;
                hVar2.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f171184c);
                try {
                    roomRawQuery2.getBindingFunction().invoke(sQLiteStatementPrepare);
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(hVar2.l(sQLiteStatementPrepare));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
        }
    }
}
