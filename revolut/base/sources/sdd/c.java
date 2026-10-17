package sdd;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;
import vdd.i;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f261857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f261858c;

    public /* synthetic */ c(e eVar, i iVar, int i) {
        this.f261856a = i;
        this.f261857b = eVar;
        this.f261858c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f261856a) {
            case 0:
                this.f261857b.f261863b.insert(sQLiteConnection, this.f261858c);
                return null;
            default:
                return e.o(this.f261857b, this.f261858c);
        }
    }
}
