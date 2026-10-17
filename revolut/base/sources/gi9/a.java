package gi9;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f144095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f144096c;

    public /* synthetic */ a(c cVar, ArrayList arrayList, int i) {
        this.f144094a = i;
        this.f144095b = cVar;
        this.f144096c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f144094a) {
            case 0:
                this.f144095b.f144101b.insert(sQLiteConnection, (Iterable) this.f144096c);
                break;
            case 1:
                this.f144095b.d.insert(sQLiteConnection, (Iterable) this.f144096c);
                break;
            case 2:
                this.f144095b.f.insert(sQLiteConnection, (Iterable) this.f144096c);
                break;
            case 3:
                this.f144095b.f144104h.handleMultiple(sQLiteConnection, this.f144096c);
                break;
            default:
                this.f144095b.f144102c.insert(sQLiteConnection, (Iterable) this.f144096c);
                break;
        }
        return null;
    }
}
