package jud;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f178650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f178651c;

    public /* synthetic */ c(e eVar, ArrayList arrayList, int i) {
        this.f178649a = i;
        this.f178650b = eVar;
        this.f178651c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f178649a) {
            case 0:
                this.f178650b.f178655b.insert(sQLiteConnection, (Iterable) this.f178651c);
                return null;
            default:
                return e.e(this.f178650b, this.f178651c);
        }
    }
}
