package jv0;

import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes.dex */
public final class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f178761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oz0.c f178762b;

    public u(int i, oz0.c transparencyMode) {
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        this.f178761a = i;
        this.f178762b = transparencyMode;
    }

    @Override // jv0.x
    public final String a(Context context) throws Throwable {
        Object objA;
        int i = this.f178761a;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = context.getResources().getResourceName(i);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        String str = (String) objA;
        return str == null ? a0.d.n("Unresolved resourceId=", i) : str;
    }

    @Override // jv0.x
    public final oz0.c b() {
        return this.f178762b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f178761a == uVar.f178761a && this.f178762b == uVar.f178762b;
    }

    public final int hashCode() {
        return this.f178762b.hashCode() + (Integer.hashCode(this.f178761a) * 31);
    }
}
