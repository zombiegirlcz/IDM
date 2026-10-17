package qal;

import com.google.gson.reflect.TypeToken;
import he0.m;
import java.io.StringReader;
import kg.l0;
import kg.o;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import qg.c;
import ral.q;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f244048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f244049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TypeToken f244050c;

    public a(b bVar, o oVar, TypeToken typeToken) {
        this.f244048a = bVar;
        this.f244049b = oVar;
        this.f244050c = typeToken;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) {
        u uVarQ = m70.a.q(aVar);
        boolean zContainsKey = uVarQ.c().f183891a.containsKey("type");
        b bVar = this.f244048a;
        return (zContainsKey ? bVar.f244052b : bVar.f244051a).a(this.f244049b, this.f244050c).c(new qg.a(new StringReader(uVarQ.c().toString())));
    }

    @Override // kg.l0
    public final void d(c cVar, Object obj2) {
        b bVar = this.f244048a;
        m mVar = bVar.f244052b;
        Intrinsics.h(obj2);
        Class<?> cls = obj2.getClass();
        if (!q.b.class.isAssignableFrom(cls) && !q.e.class.isAssignableFrom(cls)) {
            mVar = bVar.f244051a;
        }
        mVar.a(this.f244049b, this.f244050c).d(cVar, obj2);
    }
}
