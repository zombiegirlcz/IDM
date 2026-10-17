package mni;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f207509a = ta6.a.a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f207510b = ta6.a.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f207511c = ta6.a.a(0);
    public final z1 d = ta6.a.a(0);

    public final void a(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f207511c.k(code);
    }

    public final void b(Data status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f207509a.k(status);
    }

    public final void c(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.d.k(code);
    }
}
