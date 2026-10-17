package zq;

import androidx.sqlite.SQLiteConnection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f324341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ar.b f324342c;

    public /* synthetic */ d(e eVar, ar.b bVar, int i) {
        this.f324340a = i;
        this.f324341b = eVar;
        this.f324342c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f324340a) {
            case 0:
                e eVar = this.f324341b;
                eVar.getClass();
                return c.d(eVar, this.f324342c, (Continuation) obj2);
            default:
                this.f324341b.f324344b.insert((SQLiteConnection) obj2, this.f324342c);
                return Unit.f186387a;
        }
    }
}
