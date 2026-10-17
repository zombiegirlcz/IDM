package mif;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f205820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f205821c;

    public /* synthetic */ p(s sVar, ArrayList arrayList, int i) {
        this.f205819a = i;
        this.f205820b = sVar;
        this.f205821c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f205819a) {
            case 0:
                this.f205820b.f205830j.insert(sQLiteConnection, (Iterable) this.f205821c);
                break;
            case 1:
                this.f205820b.k.insert(sQLiteConnection, (Iterable) this.f205821c);
                break;
            case 2:
                this.f205820b.f205828g.insert(sQLiteConnection, (Iterable) this.f205821c);
                break;
            case 3:
                this.f205820b.i.insert(sQLiteConnection, (Iterable) this.f205821c);
                break;
            case 4:
                this.f205820b.f205832m.insert(sQLiteConnection, (Iterable) this.f205821c);
                break;
            case 5:
                this.f205820b.d.insert(sQLiteConnection, (Iterable) this.f205821c);
                break;
            case 6:
                this.f205820b.f205831l.insert(sQLiteConnection, (Iterable) this.f205821c);
                break;
            case 7:
                this.f205820b.f205833n.insert(sQLiteConnection, (Iterable) this.f205821c);
                break;
            default:
                this.f205820b.f205829h.insert(sQLiteConnection, (Iterable) this.f205821c);
                break;
        }
        return null;
    }
}
