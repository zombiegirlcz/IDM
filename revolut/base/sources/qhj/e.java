package qhj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f246616a;

    public e(z80.b phoneToolsProvider, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
                this.f246616a = phoneToolsProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
                this.f246616a = phoneToolsProvider;
                break;
        }
    }

    public String a(String unformattedPhoneNumber) {
        Intrinsics.checkNotNullParameter(unformattedPhoneNumber, "unformattedPhoneNumber");
        return jli.g.g(z80.b.b(this.f246616a, unformattedPhoneNumber, null, null, 6));
    }
}
