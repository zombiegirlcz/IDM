package c18;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f20413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f20414c;

    public /* synthetic */ b(f fVar, ArrayList arrayList, int i) {
        this.f20412a = i;
        this.f20413b = fVar;
        this.f20414c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f20412a) {
            case 0:
                return f.h(this.f20413b, this.f20414c);
            case 1:
                this.f20413b.e.insert(sQLiteConnection, (Iterable) this.f20414c);
                return null;
            case 2:
                this.f20413b.f20425b.insert(sQLiteConnection, (Iterable) this.f20414c);
                return null;
            default:
                return f.i(this.f20413b, this.f20414c);
        }
    }
}
