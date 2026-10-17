package okd;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f225987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f225988c;

    public /* synthetic */ a(b bVar, ArrayList arrayList, int i) {
        this.f225986a = i;
        this.f225987b = bVar;
        this.f225988c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f225986a) {
            case 0:
                this.f225987b.f225990b.insert(sQLiteConnection, (Iterable) this.f225988c);
                break;
            default:
                this.f225987b.d.handleMultiple(sQLiteConnection, this.f225988c);
                break;
        }
        return Unit.f186387a;
    }
}
