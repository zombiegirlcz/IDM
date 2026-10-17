package pjl;

import android.database.Cursor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cursor f236838b;

    public /* synthetic */ p(Cursor cursor, int i) {
        this.f236837a = i;
        this.f236838b = cursor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f236837a) {
            case 0:
                Cursor cursor = this.f236838b;
                if (cursor.moveToNext()) {
                    return cursor;
                }
                return null;
            default:
                Cursor cursor2 = this.f236838b;
                if (cursor2.moveToNext()) {
                    return cursor2;
                }
                return null;
        }
    }
}
