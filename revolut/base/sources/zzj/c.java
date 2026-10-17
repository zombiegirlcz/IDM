package zzj;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f326758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rzj.c f326759c;

    public /* synthetic */ c(d dVar, rzj.c cVar, int i) {
        this.f326757a = i;
        this.f326758b = dVar;
        this.f326759c = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f326757a) {
            case 0:
                rzj.c symbolScope = this.f326759c;
                yzj.a aVar = this.f326758b.f326762c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM `scoped_symbols` WHERE `scope` = ?");
                try {
                    aVar.getClass();
                    ?? r4 = aVar.f318115b;
                    Intrinsics.checkNotNullParameter(symbolScope, "symbolScope");
                    sQLiteStatementPrepare.bindText(1, u1.g(symbolScope, r4));
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "scope");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbolType");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "baseCurrency");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String symbolScopeValue = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        Intrinsics.checkNotNullParameter(symbolScopeValue, "symbolScopeValue");
                        rzj.c cVar = (rzj.c) u1.u(symbolScopeValue, r4);
                        String symbolTypeValue = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        Intrinsics.checkNotNullParameter(symbolTypeValue, "symbolTypeValue");
                        arrayList.add(new a(cVar, (rzj.d) u1.u(symbolTypeValue, aVar.f318114a), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            default:
                d dVar = this.f326758b;
                rzj.c symbolScope2 = this.f326759c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM `scoped_symbols` WHERE `scope` = ?");
                try {
                    yzj.a aVar2 = dVar.f326762c;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(symbolScope2, "symbolScope");
                    sQLiteStatementPrepare.bindText(1, u1.g(symbolScope2, aVar2.f318115b));
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
        }
    }
}
