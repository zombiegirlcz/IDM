package vx1;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f292790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f292791c;

    public /* synthetic */ c(f fVar, ArrayList arrayList, int i) {
        this.f292789a = i;
        this.f292790b = fVar;
        this.f292791c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f292789a) {
            case 0:
                return f.i(this.f292790b, this.f292791c);
            case 1:
                this.f292790b.f292797b.insert(sQLiteConnection, (Iterable) this.f292791c);
                return null;
            default:
                this.f292790b.f292797b.insert(sQLiteConnection, (Iterable) this.f292791c);
                return Unit.f186387a;
        }
    }
}
