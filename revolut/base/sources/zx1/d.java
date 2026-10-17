package zx1;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f326023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f326024c;

    public /* synthetic */ d(h hVar, ArrayList arrayList, int i) {
        this.f326022a = i;
        this.f326023b = hVar;
        this.f326024c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f326022a) {
            case 0:
                return h.i(this.f326023b, this.f326024c);
            case 1:
                this.f326023b.f326032b.insert(sQLiteConnection, (Iterable) this.f326024c);
                return null;
            default:
                this.f326023b.f326032b.insert(sQLiteConnection, (Iterable) this.f326024c);
                return Unit.f186387a;
        }
    }
}
