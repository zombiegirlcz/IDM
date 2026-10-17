package qal;

import com.google.gson.reflect.TypeToken;
import he0.m;
import kg.l0;
import kg.m0;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import ral.q;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f244051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f244052b;

    public b() {
        m mVar = new m("dialogType", q.class, false, false);
        mVar.c(q.c.class, "QUESTION");
        mVar.c(q.f.class, "WARNING");
        mVar.c(q.a.class, "ACTIONS");
        mVar.c(q.d.class, "FORM_REDIRECTION");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
        this.f244051a = mVar;
        m mVar2 = new m("type", q.class, false, false);
        mVar2.c(q.b.class, "DEEPLINK_REDIRECTION");
        mVar2.c(q.e.C1395e.class, "SIMPLE_WARNING");
        mVar2.c(q.e.b.class, "CIRCLE_WARNING");
        mVar2.c(q.e.d.class, "SIMPLE_CONFIRMATION");
        mVar2.c(q.e.c.class, "RISK_AGREEMENT");
        mVar2.c(q.e.a.class, "CANCEL");
        Intrinsics.checkNotNullExpressionValue(mVar2, "registerSubtype(...)");
        this.f244052b = mVar2;
    }

    @Override // kg.m0
    public final l0 a(o oVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (Intrinsics.f(rawType, q.e.class)) {
            return this.f244052b.a(oVar, typeToken);
        }
        if (Intrinsics.f(rawType, q.class)) {
            return new a(this, oVar, typeToken);
        }
        return null;
    }
}
