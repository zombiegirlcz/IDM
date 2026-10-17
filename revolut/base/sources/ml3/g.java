package ml3;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f206588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f206589c;

    public /* synthetic */ g(h hVar, ArrayList arrayList, int i) {
        this.f206587a = i;
        this.f206588b = hVar;
        this.f206589c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f206587a) {
            case 0:
                this.f206588b.d.handleMultiple(sQLiteConnection, this.f206589c);
                return null;
            case 1:
                return h.s(this.f206588b, this.f206589c);
            default:
                return this.f206588b.f206591b.insertAndReturnIdsList(sQLiteConnection, this.f206589c);
        }
    }
}
