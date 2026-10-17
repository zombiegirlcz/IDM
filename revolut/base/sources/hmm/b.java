package hmm;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import emm.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.l0;
import mmm.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f153999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f154000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f154001c;
    public m d;
    public IOException e;
    public final String f;

    public b() {
        Intrinsics.checkNotNullParameter("PublicSuffixDatabase.list", "path");
        this.f153999a = new AtomicBoolean(false);
        this.f154000b = new CountDownLatch(1);
        this.f = "PublicSuffixDatabase.list";
    }

    public final mmm.e a() throws IOException {
        h.Companion.getClass();
        Object obj2 = h.f127697a;
        emm.f fVar = obj2 != null ? (emm.f) obj2 : null;
        Context contextA = fVar != null ? fVar.a() : null;
        AssetManager assets = contextA != null ? contextA.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream inputStreamOpen = assets.open(this.f);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        return u1.r(inputStreamOpen);
    }

    public final void b() {
        try {
            l0 l0VarC = u1.c(a());
            try {
                m mVarC = l0VarC.c(l0VarC.readInt());
                m mVarC2 = l0VarC.c(l0VarC.readInt());
                Unit unit = Unit.f186387a;
                l0VarC.close();
                synchronized (this) {
                    Intrinsics.h(mVarC);
                    Intrinsics.checkNotNullParameter(mVarC, "<set-?>");
                    this.f154001c = mVarC;
                    Intrinsics.h(mVarC2);
                    Intrinsics.checkNotNullParameter(mVarC2, "<set-?>");
                    this.d = mVarC2;
                }
            } finally {
            }
        } finally {
            this.f154000b.countDown();
        }
    }
}
