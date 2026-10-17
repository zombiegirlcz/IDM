package qra;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f248669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f248670c;

    public /* synthetic */ b(d dVar, ArrayList arrayList, int i) {
        this.f248668a = i;
        this.f248669b = dVar;
        this.f248670c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f248668a) {
            case 0:
                this.f248669b.f248675b.insert(sQLiteConnection, (Iterable) this.f248670c);
                return null;
            default:
                return d.i(this.f248669b, this.f248670c);
        }
    }
}
