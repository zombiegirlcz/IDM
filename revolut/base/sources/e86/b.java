package e86;

import android.content.Context;
import da3.j;
import ecm.q;
import kotlin.jvm.functions.Function0;
import l70.e;
import ljl.q1;
import ljl.z1;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f123603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f123604c;
    public final a31.a d;
    public final q e;

    public /* synthetic */ b(q qVar, a31.a aVar, q qVar2, int i) {
        this.f123603b = i;
        this.f123604c = qVar;
        this.d = aVar;
        this.e = qVar2;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f123603b) {
            case 0:
                Context context = (Context) ((Function0) this.f123604c.f124861b).invoke();
                a86.a aVar = (a86.a) ((Function0) this.e.f124861b).invoke();
                ee0.a aVar2 = (ee0.a) ((phm.a) this.d.f955b).get();
                context.getClass();
                aVar.getClass();
                aVar2.getClass();
                return new a(aVar2, context, aVar);
            case 1:
                Context context2 = (Context) ((Function0) this.f123604c.f124861b).invoke();
                nn0.c cVar = (nn0.c) ((phm.a) this.d.f955b).get();
                th0.a aVar3 = (th0.a) ((Function0) this.e.f124861b).invoke();
                context2.getClass();
                cVar.getClass();
                aVar3.getClass();
                return new jjl.a(new z1(), cVar, aVar3, context2);
            case 2:
                Context context3 = (Context) ((Function0) this.f123604c.f124861b).invoke();
                yil.b bVar = (yil.b) ((Function0) this.e.f124861b).invoke();
                q1 q1Var = (q1) ((phm.a) this.d.f955b).get();
                context3.getClass();
                bVar.getClass();
                q1Var.getClass();
                return new njl.a(q1Var);
            case 3:
                Context context4 = (Context) ((Function0) this.f123604c.f124861b).invoke();
                Retrofit retrofit = (Retrofit) ((Function0) this.e.f124861b).invoke();
                j jVar = (j) ((phm.a) this.d.f955b).get();
                context4.getClass();
                retrofit.getClass();
                jVar.getClass();
                return new ou2.d(jVar, context4);
            default:
                Context context5 = (Context) ((Function0) this.f123604c.f124861b).invoke();
                e eVar = (e) ((phm.a) this.d.f955b).get();
                th0.a aVar4 = (th0.a) ((Function0) this.e.f124861b).invoke();
                context5.getClass();
                eVar.getClass();
                aVar4.getClass();
                return new xi3.b(eVar, aVar4, context5);
        }
    }

    public /* synthetic */ b(q qVar, q qVar2, a31.a aVar, int i) {
        this.f123603b = i;
        this.f123604c = qVar;
        this.e = qVar2;
        this.d = aVar;
    }
}
