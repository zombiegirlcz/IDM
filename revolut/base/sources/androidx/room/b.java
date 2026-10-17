package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f7688b;

    public /* synthetic */ b(RoomDatabase roomDatabase, int i) {
        this.f7687a = i;
        this.f7688b = roomDatabase;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7687a) {
            case 0:
                return RoomDatabase.endTransaction$lambda$9(this.f7688b, (SupportSQLiteDatabase) obj2);
            default:
                return RoomDatabase.beginTransaction$lambda$8(this.f7688b, (SupportSQLiteDatabase) obj2);
        }
    }
}
