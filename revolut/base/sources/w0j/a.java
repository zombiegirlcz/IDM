package w0j;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import smd.s;
import v60.g;
import vf0.q;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f293765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yi2.a f293766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ui2.a f293767c;
    public final List d;

    public a(yi2.a aVar, ui2.a aVar2, Context context, List list) {
        this.f293765a = context;
        this.f293766b = aVar;
        this.f293767c = aVar2;
        this.d = list;
    }

    public final g a() {
        s sVarA = this.f293766b.a();
        c.Companion.getClass();
        ui2.a appInitializerConfiguration = this.f293767c;
        Intrinsics.checkNotNullParameter(appInitializerConfiguration, "appInitializerConfiguration");
        return new g(this.f293765a, sVarA, appInitializerConfiguration, this.d, new q(appInitializerConfiguration, 11));
    }
}
