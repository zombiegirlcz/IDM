package cu1;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f108716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f108717c;
    public final a31.a d;

    public a(ecm.q qVar, c63.b bVar, a31.a aVar) {
        this.f108716b = qVar;
        this.f108717c = bVar;
        this.d = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f108716b.f124861b).invoke();
        j jVar = (j) this.f108717c.get();
        uw1.b bVar = (uw1.b) ((phm.a) this.d.f955b).get();
        context.getClass();
        jVar.getClass();
        bVar.getClass();
        return new i(jVar, bVar);
    }
}
