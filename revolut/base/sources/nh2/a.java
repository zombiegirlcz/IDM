package nh2;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f215268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f215269c;
    public final a31.a d;
    public final phm.a e;

    public a(ecm.q qVar, a31.a aVar, a31.a aVar2, mil.a aVar3) {
        this.f215268b = qVar;
        this.f215269c = aVar;
        this.d = aVar2;
        this.e = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f215268b.f124861b).invoke();
        uw1.b bVar = (uw1.b) ((phm.a) this.f215269c.f955b).get();
        p12.l lVar = (p12.l) ((phm.a) this.d.f955b).get();
        m mVar = (m) this.e.get();
        context.getClass();
        bVar.getClass();
        lVar.getClass();
        mVar.getClass();
        return new l(bVar, lVar, mVar, context);
    }
}
