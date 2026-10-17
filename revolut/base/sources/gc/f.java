package gc;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f142284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zb.j f142285b;

    public /* synthetic */ f(long j2, zb.j jVar) {
        this.f142284a = j2;
        this.f142285b = jVar;
    }

    @Override // gc.h, kfm.o, androidx.arch.core.util.Function
    public final Object apply(Object obj2) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f142284a));
        zb.j jVar = this.f142285b;
        String str = jVar.f320780a;
        wb.e eVar = jVar.f320782c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(jc.a.a(eVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(jc.a.a(eVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
