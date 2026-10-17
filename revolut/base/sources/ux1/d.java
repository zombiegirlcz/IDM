package ux1;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f283850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f283851c;

    public /* synthetic */ d(g gVar, ArrayList arrayList, int i) {
        this.f283849a = i;
        this.f283850b = gVar;
        this.f283851c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f283849a) {
            case 0:
                this.f283850b.f283857b.insert(sQLiteConnection, (Iterable) this.f283851c);
                return null;
            case 1:
                return g.i(this.f283850b, this.f283851c);
            default:
                this.f283850b.f283857b.insert(sQLiteConnection, (Iterable) this.f283851c);
                return Unit.f186387a;
        }
    }
}
