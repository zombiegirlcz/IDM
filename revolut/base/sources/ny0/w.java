package ny0;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements ComponentCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f220618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f220619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f220620c;

    public w(Ref$ObjectRef ref$ObjectRef, c cVar, Function1 function1) {
        this.f220618a = ref$ObjectRef;
        this.f220619b = cVar;
        this.f220620c = function1;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        Ref$ObjectRef ref$ObjectRef = this.f220618a;
        Configuration configuration = (Configuration) ref$ObjectRef.f186409a;
        ref$ObjectRef.f186409a = new Configuration(newConfig);
        if (configuration == null || !this.f220619b.a(configuration, newConfig)) {
            return;
        }
        this.f220620c.invoke(newConfig);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
