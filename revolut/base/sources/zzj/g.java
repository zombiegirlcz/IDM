package zzj;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f326772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f326773c;

    public /* synthetic */ g(j jVar, ArrayList arrayList, int i) {
        this.f326771a = i;
        this.f326772b = jVar;
        this.f326773c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f326771a) {
            case 0:
                this.f326772b.f326782b.insert(sQLiteConnection, (Iterable) this.f326773c);
                return null;
            default:
                return j.j(this.f326772b, this.f326773c);
        }
    }
}
