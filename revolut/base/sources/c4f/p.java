package c4f;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ecm.q f21239c;

    public /* synthetic */ p(ecm.q qVar, int i) {
        this.f21238b = i;
        this.f21239c = qVar;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f21238b) {
            case 0:
                Context context = (Context) ((Function0) this.f21239c.f124861b).invoke();
                context.getClass();
                return new i(context);
            case 1:
                Context context2 = (Context) ((Function0) this.f21239c.f124861b).invoke();
                context2.getClass();
                return new cf0.f(context2);
            case 2:
                Context context3 = (Context) ((Function0) this.f21239c.f124861b).invoke();
                context3.getClass();
                return new co0.a(context3);
            case 3:
                Context context4 = (Context) ((Function0) this.f21239c.f124861b).invoke();
                context4.getClass();
                return new epa.a(context4);
            case 4:
                ((Context) ((Function0) this.f21239c.f124861b).invoke()).getClass();
                return new ezj.e();
            case 5:
                Context context5 = (Context) ((Function0) this.f21239c.f124861b).invoke();
                context5.getClass();
                return new hcb.a(context5);
            case 6:
                Context context6 = (Context) ((Function0) this.f21239c.f124861b).invoke();
                context6.getClass();
                return new i5l.a(context6);
            case 7:
                Context context7 = (Context) ((Function0) this.f21239c.f124861b).invoke();
                context7.getClass();
                return new nn0.c(context7);
            case 8:
                ((Context) ((Function0) this.f21239c.f124861b).invoke()).getClass();
                on5.a aVar = new on5.a();
                int i = 7;
                aVar.f226911a = e4m.b.b(new a2d.b(aVar, 0, i));
                aVar.f226912b = e4m.b.b(new a2d.b(aVar, 1, i));
                return aVar;
            default:
                ((Context) ((Function0) this.f21239c.f124861b).invoke()).getClass();
                ubf.g gVar = new ubf.g();
                gVar.f278888a = e4m.b.b(new pbb.a(15));
                return gVar;
        }
    }
}
