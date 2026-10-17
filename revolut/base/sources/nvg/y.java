package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f219691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f219692c;

    public /* synthetic */ y(z zVar, ArrayList arrayList, int i) {
        this.f219690a = i;
        this.f219691b = zVar;
        this.f219692c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219690a) {
            case 0:
                this.f219691b.f219694b.insert(sQLiteConnection, (Iterable) this.f219692c);
                return null;
            default:
                return z.e(this.f219691b, this.f219692c);
        }
    }
}
