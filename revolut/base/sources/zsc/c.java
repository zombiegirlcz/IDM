package zsc;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f324867a;

    public c(Function1 function1) {
        this.f324867a = function1;
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        return ((Boolean) this.f324867a.invoke(obj2)).booleanValue();
    }
}
