package bhl;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f15327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15328c;

    public /* synthetic */ h(i iVar, ArrayList arrayList, int i) {
        this.f15326a = i;
        this.f15327b = iVar;
        this.f15328c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f15326a) {
            case 0:
                return i.e(this.f15327b, this.f15328c);
            default:
                this.f15327b.f15330b.insert(sQLiteConnection, (Iterable) this.f15328c);
                return null;
        }
    }
}
