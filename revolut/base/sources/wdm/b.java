package wdm;

import kem.q0;
import kem.r;
import kem.y;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b implements fem.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296594a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fem.b f296595b;

    public b(a call, fem.b origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f296595b = origin;
    }

    @Override // fem.b
    public final oem.e getAttributes() {
        switch (this.f296594a) {
        }
        return this.f296595b.getAttributes();
    }

    @Override // fem.b, kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        switch (this.f296594a) {
        }
        return this.f296595b.getCoroutineContext();
    }

    @Override // kem.v
    public final r getHeaders() {
        switch (this.f296594a) {
        }
        return this.f296595b.getHeaders();
    }

    @Override // fem.b
    public final y getMethod() {
        switch (this.f296594a) {
        }
        return this.f296595b.getMethod();
    }

    @Override // fem.b
    public final q0 getUrl() {
        switch (this.f296594a) {
        }
        return this.f296595b.getUrl();
    }

    public b(i call, fem.b origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f296595b = origin;
    }
}
