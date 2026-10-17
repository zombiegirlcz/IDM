package pgc;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f235871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f235872c;

    public /* synthetic */ h(j jVar, ArrayList arrayList, int i) {
        this.f235870a = i;
        this.f235871b = jVar;
        this.f235872c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f235870a) {
            case 0:
                this.f235871b.f235876b.insert(sQLiteConnection, (Iterable) this.f235872c);
                return null;
            case 1:
                return j.k(this.f235871b, this.f235872c);
            default:
                return j.j(this.f235871b, this.f235872c);
        }
    }
}
