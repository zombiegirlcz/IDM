package ld1;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f193922b;

    public a0(ecm.q qVar) {
        this.f193922b = qVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f193922b.f124861b).invoke();
        context.getClass();
        return new a(context);
    }
}
