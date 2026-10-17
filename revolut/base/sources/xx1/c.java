package xx1;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f309380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f309381c;

    public /* synthetic */ c(f fVar, ArrayList arrayList, int i) {
        this.f309379a = i;
        this.f309380b = fVar;
        this.f309381c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f309379a) {
            case 0:
                return f.i(this.f309380b, this.f309381c);
            case 1:
                this.f309380b.f309388b.insert(sQLiteConnection, (Iterable) this.f309381c);
                return null;
            default:
                this.f309380b.f309388b.insert(sQLiteConnection, (Iterable) this.f309381c);
                return Unit.f186387a;
        }
    }
}
