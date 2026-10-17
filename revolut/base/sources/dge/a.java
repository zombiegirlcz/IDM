package dge;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f114646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f114647c;

    public /* synthetic */ a(b bVar, ArrayList arrayList, int i) {
        this.f114645a = i;
        this.f114646b = bVar;
        this.f114647c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f114645a) {
            case 0:
                this.f114646b.f114649b.insert(sQLiteConnection, (Iterable) this.f114647c);
                break;
            default:
                this.f114646b.f114650c.handleMultiple(sQLiteConnection, this.f114647c);
                break;
        }
        return null;
    }
}
