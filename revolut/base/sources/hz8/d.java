package hz8;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f157062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f157063c;

    public /* synthetic */ d(h hVar, ArrayList arrayList, int i) {
        this.f157061a = i;
        this.f157062b = hVar;
        this.f157063c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f157061a) {
            case 0:
                this.f157062b.f.insert(sQLiteConnection, (Iterable) this.f157063c);
                break;
            case 1:
                this.f157062b.d.insert(sQLiteConnection, (Iterable) this.f157063c);
                break;
            default:
                this.f157062b.e.insert(sQLiteConnection, (Iterable) this.f157063c);
                break;
        }
        return null;
    }
}
