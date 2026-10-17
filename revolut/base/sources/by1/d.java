package by1;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f19721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19722c;

    public /* synthetic */ d(g gVar, ArrayList arrayList, int i) {
        this.f19720a = i;
        this.f19721b = gVar;
        this.f19722c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f19720a) {
            case 0:
                this.f19721b.f19728b.insert(sQLiteConnection, (Iterable) this.f19722c);
                return null;
            case 1:
                return g.i(this.f19721b, this.f19722c);
            default:
                this.f19721b.f19728b.insert(sQLiteConnection, (Iterable) this.f19722c);
                return Unit.f186387a;
        }
    }
}
