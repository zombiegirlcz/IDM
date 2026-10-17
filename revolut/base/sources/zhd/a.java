package zhd;

import androidx.sqlite.SQLiteConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f322396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aid.a f322397c;

    public /* synthetic */ a(b bVar, aid.a aVar, int i) {
        this.f322395a = i;
        this.f322396b = bVar;
        this.f322397c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f322395a) {
            case 0:
                this.f322396b.f322400c.handle(sQLiteConnection, this.f322397c);
                break;
            default:
                this.f322396b.f322399b.insert(sQLiteConnection, this.f322397c);
                break;
        }
        return Unit.f186387a;
    }
}
