package yi2;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import smd.s;
import yhm.j;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f314224a;

    public a(Context context) {
        this.f314224a = context;
    }

    public final s a() {
        Context context = this.f314224a;
        Intrinsics.checkNotNullParameter(context, "context");
        s sVar = new s();
        sVar.f264432a = context;
        sVar.f264433b = j.b(new vt3.a(sVar, 21));
        return sVar;
    }
}
