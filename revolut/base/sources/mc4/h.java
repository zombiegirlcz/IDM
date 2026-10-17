package mc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f204277a;

    public h(c90.c uiResources, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(uiResources, "uiResources");
                this.f204277a = uiResources;
                break;
            default:
                Intrinsics.checkNotNullParameter(uiResources, "uiResources");
                this.f204277a = uiResources;
                break;
        }
    }

    public String a(int i) {
        return a0.d.v(new Object[]{Integer.valueOf(kli.a.s(i, this.f204277a.f22265a) & 16777215)}, 1, "%06X", "format(...)");
    }

    public String b(int i) {
        return a0.d.v(new Object[]{Integer.valueOf(kli.a.s(i, this.f204277a.f22265a) & 16777215)}, 1, "#%06X", "format(...)");
    }
}
