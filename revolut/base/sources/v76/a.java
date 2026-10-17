package v76;

import kotlinx.coroutines.CoroutineScope;
import rg0.e;
import t31.b;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f286560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f286561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ux8.b f286562c = new ux8.b(this, 8);

    public a(e eVar, b bVar) {
        this.f286560a = eVar;
        this.f286561b = bVar;
    }

    public final w76.b a() {
        CoroutineScope coroutineScopeA = this.f286560a.a();
        s.j(coroutineScopeA);
        return new w76.b(coroutineScopeA, this.f286562c);
    }
}
