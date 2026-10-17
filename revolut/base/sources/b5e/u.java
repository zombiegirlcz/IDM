package b5e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4h.b f12512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f12513b;

    public u(d4h.b actionsToActionPanelStateMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(actionsToActionPanelStateMapper, "actionsToActionPanelStateMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f12512a = actionsToActionPanelStateMapper;
        this.f12513b = dateProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r10) {
        /*
            r9 = this;
            b5e.i r10 = (b5e.i) r10
            java.lang.String r0 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = r10.f12493a
            com.revolut.data.model.Data r1 = r10.f12495c
            com.revolut.data.model.Data r2 = r10.d
            r3 = 0
            if (r1 == 0) goto L17
            if (r2 == 0) goto L17
            com.revolut.data.model.Data r4 = com.google.crypto.tink.shaded.protobuf.t1.t(r1, r2)
            goto L18
        L17:
            r4 = r3
        L18:
            if (r4 == 0) goto L36
            b4g.f0 r5 = new b4g.f0
            r6 = 8
            r5.<init>(r6)
            axd.e r6 = new axd.e
            r7 = 26
            r6.<init>(r7)
            b5e.r r7 = new b5e.r
            r8 = 0
            r7.<init>(r9)
            java.lang.Object r4 = iii.c.f(r4, r5, r6, r7)
            b5e.m r4 = (b5e.m) r4
            if (r4 != 0) goto L38
        L36:
            b5e.l r4 = b5e.l.f12500a
        L38:
            com.revolut.data.model.Data r10 = r10.e
            if (r10 == 0) goto L44
            if (r1 == 0) goto L44
            if (r2 == 0) goto L44
            com.revolut.data.model.Data r3 = com.google.crypto.tink.shaded.protobuf.t1.u(r10, r1, r2)
        L44:
            if (r3 == 0) goto L62
            b4g.f0 r10 = new b4g.f0
            r1 = 9
            r10.<init>(r1)
            axd.e r1 = new axd.e
            r2 = 27
            r1.<init>(r2)
            b5e.r r2 = new b5e.r
            r5 = 1
            r2.<init>(r9)
            java.lang.Object r10 = iii.c.f(r3, r10, r1, r2)
            x2h.b r10 = (x2h.b) r10
            if (r10 != 0) goto L64
        L62:
            x2h.b$b r10 = x2h.b.C1676b.f302573a
        L64:
            zhm.f0 r1 = zhm.f0.f322471a
            b5e.n r2 = new b5e.n
            r2.<init>(r0, r4, r10, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b5e.u.c(cli.j):cli.o");
    }
}
