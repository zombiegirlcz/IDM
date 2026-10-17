package lim;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f195562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f195563c;
    public int d;
    public boolean e;
    public final /* synthetic */ h f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    @Override // lim.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File a() {
        /*
            r11 = this;
            lim.h r0 = r11.f
            lim.j r0 = r0.d
            boolean r1 = r11.e
            r2 = 0
            r3 = 1
            java.io.File r4 = r11.f195569a
            if (r1 != 0) goto L3e
            java.io.File[] r1 = r11.f195563c
            if (r1 != 0) goto L3e
            kotlin.jvm.functions.Function1 r1 = r0.f195572c
            if (r1 == 0) goto L21
            java.lang.Object r1 = r1.invoke(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L21
            goto L61
        L21:
            java.io.File[] r1 = r4.listFiles()
            r11.f195563c = r1
            if (r1 != 0) goto L3e
            kotlin.jvm.functions.Function2 r1 = r0.e
            if (r1 == 0) goto L3c
            kotlin.io.AccessDeniedException r5 = new kotlin.io.AccessDeniedException
            r9 = 2
            r10 = 0
            java.io.File r6 = r11.f195569a
            r7 = 0
            java.lang.String r8 = "Cannot list files in a directory"
            r5.<init>(r6, r7, r8, r9, r10)
            r1.invoke(r4, r5)
        L3c:
            r11.e = r3
        L3e:
            java.io.File[] r1 = r11.f195563c
            if (r1 == 0) goto L53
            int r5 = r11.d
            int r6 = r1.length
            if (r5 >= r6) goto L53
            kotlin.jvm.internal.Intrinsics.h(r1)
            int r0 = r11.d
            int r2 = r0 + 1
            r11.d = r2
            r0 = r1[r0]
            return r0
        L53:
            boolean r1 = r11.f195562b
            if (r1 != 0) goto L5a
            r11.f195562b = r3
            return r4
        L5a:
            kotlin.jvm.functions.Function1 r0 = r0.d
            if (r0 == 0) goto L61
            r0.invoke(r4)
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lim.d.a():java.io.File");
    }
}
