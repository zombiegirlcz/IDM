package tx1;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f275304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f275305c;

    public /* synthetic */ e(i iVar, ArrayList arrayList, int i) {
        this.f275303a = i;
        this.f275304b = iVar;
        this.f275305c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f275303a) {
            case 0:
                break;
            case 1:
                this.f275304b.f275313b.insert(sQLiteConnection, (Iterable) this.f275305c);
                break;
            case 2:
                this.f275304b.f275314c.handleMultiple(sQLiteConnection, this.f275305c);
                break;
            default:
                this.f275304b.f275313b.insert(sQLiteConnection, (Iterable) this.f275305c);
                break;
        }
        return Unit.f186387a;
    }
}
