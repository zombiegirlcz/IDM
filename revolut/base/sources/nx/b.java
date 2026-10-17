package nx;

import eki.e;
import kl.b0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineScope;
import n8a.r;
import osk.m;
import vkm.q;
import vkm.t1;
import vkm.z1;
import xv.h;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220038a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f220039b;

    public b(b0 imageProvider, f0 coroutineScopeProvider) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        this.f220039b = q.b(0, 7, null);
        q.G(q.H(new r(this, null, 26), imageProvider.i()), (CoroutineScope) coroutineScopeProvider.invoke());
    }

    @Override // xv.h
    public final t1 a() {
        switch (this.f220038a) {
        }
        return q.g(this.f220039b);
    }

    public b(b0 imageProvider, e coroutineScopeProvider) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        this.f220039b = q.b(0, 7, null);
        q.G(q.H(new m(this, null, 7), imageProvider.i()), (CoroutineScope) coroutineScopeProvider.invoke());
    }
}
