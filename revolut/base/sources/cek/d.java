package cek;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f23492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23493c;

    public /* synthetic */ d(e eVar, ArrayList arrayList, int i) {
        this.f23491a = i;
        this.f23492b = eVar;
        this.f23493c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f23491a) {
            case 0:
                return e.f(this.f23492b, this.f23493c);
            default:
                this.f23492b.f23495b.insert(sQLiteConnection, (Iterable) this.f23493c);
                return null;
        }
    }
}
