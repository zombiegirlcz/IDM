package ig;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f161043a;

    public b(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f161043a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // ig.p
    public final Double a() {
        Bundle bundle = this.f161043a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // ig.p
    public final Object b(Continuation continuation) {
        return Unit.f186387a;
    }

    @Override // ig.p
    public final Boolean c() {
        Bundle bundle = this.f161043a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // ig.p
    public final kotlin.time.b d() {
        Bundle bundle = this.f161043a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new kotlin.time.b(kotlin.time.c.g(bundle.getInt("firebase_sessions_sessions_restart_timeout"), pkm.e.SECONDS));
        }
        return null;
    }
}
