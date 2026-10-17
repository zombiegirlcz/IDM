package jyl;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.io.File;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxd.m;
import yhm.j;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f179532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fl1.c f179533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f179534c;
    public final hlm.c d;
    public final Lazy e;
    public final Lazy f;

    public g(File file, fl1.c bitmapCacheManager, m rendererError) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(bitmapCacheManager, "bitmapCacheManager");
        Intrinsics.checkNotNullParameter(rendererError, "rendererError");
        this.f179532a = file;
        this.f179533b = bitmapCacheManager;
        this.f179534c = rendererError;
        this.d = hlm.d.a();
        final int i = 0;
        this.e = j.b(new Function0(this) { // from class: jyl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f179523b;

            {
                this.f179523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objA;
                int i2 = i;
                g gVar = this.f179523b;
                switch (i2) {
                    case 0:
                        return new pyl.b(new PdfRenderer(ParcelFileDescriptor.open(gVar.f179532a, 268435456)));
                    default:
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            objA = Integer.valueOf(((pyl.b) gVar.e.getValue()).f240857a.getPageCount());
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = o.a(th10);
                        }
                        if (objA instanceof n) {
                            objA = 0;
                        }
                        return Integer.valueOf(((Number) objA).intValue());
                }
            }
        });
        final int i2 = 1;
        this.f = j.b(new Function0(this) { // from class: jyl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f179523b;

            {
                this.f179523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objA;
                int i22 = i2;
                g gVar = this.f179523b;
                switch (i22) {
                    case 0:
                        return new pyl.b(new PdfRenderer(ParcelFileDescriptor.open(gVar.f179532a, 268435456)));
                    default:
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            objA = Integer.valueOf(((pyl.b) gVar.e.getValue()).f240857a.getPageCount());
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = o.a(th10);
                        }
                        if (objA instanceof n) {
                            objA = 0;
                        }
                        return Integer.valueOf(((Number) objA).intValue());
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof jyl.d
            if (r0 == 0) goto L13
            r0 = r6
            jyl.d r0 = (jyl.d) r0
            int r1 = r0.f179525x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179525x = r1
            goto L18
        L13:
            jyl.d r0 = new jyl.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179525x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            hlm.c r0 = r0.u
            yhm.o.b(r6)
            goto L43
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            hlm.c r6 = r5.d
            r0.u = r6
            r0.f179525x = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r6
        L43:
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L53
            kotlin.Lazy r6 = r5.e     // Catch: java.lang.Throwable -> L53
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L53
            pyl.b r6 = (pyl.b) r6     // Catch: java.lang.Throwable -> L53
            ip0.v7.D(r6)     // Catch: java.lang.Throwable -> L53
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L53
            goto L5a
        L53:
            r6 = move-exception
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L6d
            yhm.n r6 = yhm.o.a(r6)     // Catch: java.lang.Throwable -> L6d
        L5a:
            java.lang.Throwable r6 = yhm.m.a(r6)     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L6f
            oxd.m r1 = r5.f179534c     // Catch: java.lang.Throwable -> L6d
            com.revolut.ui_kit_pdf.viewer.PdfRendererException r2 = new com.revolut.ui_kit_pdf.viewer.PdfRendererException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = "Renderer close error."
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L6d
            r1.invoke(r2)     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r6 = move-exception
            goto L75
        L6f:
            r0.unlock(r4)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L75:
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jyl.g.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r10, gim.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jyl.g.b(int, gim.c):java.lang.Object");
    }
}
