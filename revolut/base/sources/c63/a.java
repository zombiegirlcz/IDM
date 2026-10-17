package c63;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f21594c;
    public final q d;

    public /* synthetic */ a(q qVar, q qVar2, int i) {
        this.f21593b = i;
        this.f21594c = qVar;
        this.d = qVar2;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f21593b) {
            case 0:
                Context context = (Context) ((Function0) this.f21594c.f124861b).invoke();
                th0.a aVar = (th0.a) ((Function0) this.d.f124861b).invoke();
                context.getClass();
                aVar.getClass();
                return new c(aVar, context);
            case 1:
                Context context2 = (Context) ((Function0) this.f21594c.f124861b).invoke();
                gl0.a aVar2 = (gl0.a) ((Function0) this.d.f124861b).invoke();
                context2.getClass();
                aVar2.getClass();
                return new el0.a(aVar2, context2);
            default:
                ui0.b bVar = (ui0.b) ((Function0) this.f21594c.f124861b).invoke();
                th0.a aVar3 = (th0.a) ((Function0) this.d.f124861b).invoke();
                bVar.getClass();
                aVar3.getClass();
                return new xp.a(aVar3, bVar);
        }
    }
}
