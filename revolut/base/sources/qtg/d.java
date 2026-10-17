package qtg;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f249112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ stg.b f249113c;

    public /* synthetic */ d(e eVar, stg.b bVar, int i) {
        this.f249111a = i;
        this.f249112b = eVar;
        this.f249113c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f249111a) {
            case 0:
                return e.e(this.f249112b, this.f249113c);
            default:
                this.f249112b.f249115b.insert(sQLiteConnection, this.f249113c);
                return null;
        }
    }
}
