package oli;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.revolut.media.picker.MediaPickerException;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t80.t;
import te0.w;
import vkm.q;
import vkm.t1;
import vkm.z1;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements l {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t80.g f226415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f226416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nli.a f226417c;
    public final g60.a d;
    public final nli.e e;
    public final z1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t1 f226418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t80.i f226419h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f226420j;

    public c(t80.g fileFactory, zk0.b fileSystemRepository, nli.a directoryResolver, g60.a intentLauncher, nli.e filesProcessor) {
        Intrinsics.checkNotNullParameter(fileFactory, "fileFactory");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(directoryResolver, "directoryResolver");
        Intrinsics.checkNotNullParameter(intentLauncher, "intentLauncher");
        Intrinsics.checkNotNullParameter(filesProcessor, "filesProcessor");
        this.f226415a = fileFactory;
        this.f226416b = fileSystemRepository;
        this.f226417c = directoryResolver;
        this.d = intentLauncher;
        this.e = filesProcessor;
        z1 z1VarB = q.b(0, 7, null);
        this.f = z1VarB;
        this.f226418g = q.g(z1VarB);
        this.f226419h = t80.i.DEFAULT;
        this.f226420j = -1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        if (r2.emit(r6, r0) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        if (r3.emit(r2, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r11) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r11 instanceof oli.b
            if (r0 == 0) goto L13
            r0 = r11
            oli.b r0 = (oli.b) r0
            int r1 = r0.f226414x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226414x = r1
            goto L18
        L13:
            oli.b r0 = new oli.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226414x
            vkm.z1 r3 = r10.f
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L4c
            if (r2 == r7) goto L48
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            yhm.o.b(r11)
            goto La9
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            yhm.o.b(r11)     // Catch: java.lang.Exception -> L40
            goto La9
        L40:
            r11 = move-exception
            goto L95
        L42:
            vkm.z1 r2 = r0.u
            yhm.o.b(r11)     // Catch: java.lang.Exception -> L40
            goto L83
        L48:
            yhm.o.b(r11)     // Catch: java.lang.Exception -> L40
            goto L63
        L4c:
            yhm.o.b(r11)
            skm.p0 r11 = skm.p0.f264001a     // Catch: java.lang.Exception -> L40
            elm.f r11 = elm.f.f127540b     // Catch: java.lang.Exception -> L40
            ocb.d r2 = new ocb.d     // Catch: java.lang.Exception -> L40
            r9 = 14
            r2.<init>(r10, r8, r9)     // Catch: java.lang.Exception -> L40
            r0.f226414x = r7     // Catch: java.lang.Exception -> L40
            java.lang.Object r11 = skm.e0.J(r11, r2, r0)     // Catch: java.lang.Exception -> L40
            if (r11 != r1) goto L63
            goto La8
        L63:
            java.io.File r11 = (java.io.File) r11     // Catch: java.lang.Exception -> L40
            nli.e r2 = r10.e     // Catch: java.lang.Exception -> L40
            java.util.List r11 = zhm.u.c(r11)     // Catch: java.lang.Exception -> L40
            t80.f r7 = t80.f.PNG     // Catch: java.lang.Exception -> L40
            t80.f r9 = t80.f.JPEG     // Catch: java.lang.Exception -> L40
            t80.f[] r7 = new t80.f[]{r7, r9}     // Catch: java.lang.Exception -> L40
            java.util.List r7 = zhm.v.k(r7)     // Catch: java.lang.Exception -> L40
            r0.u = r3     // Catch: java.lang.Exception -> L40
            r0.f226414x = r6     // Catch: java.lang.Exception -> L40
            java.lang.Object r11 = r2.a(r11, r7, r0)     // Catch: java.lang.Exception -> L40
            if (r11 != r1) goto L82
            goto La8
        L82:
            r2 = r3
        L83:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L40
            oli.j r6 = new oli.j     // Catch: java.lang.Exception -> L40
            r6.<init>(r11)     // Catch: java.lang.Exception -> L40
            r0.u = r8     // Catch: java.lang.Exception -> L40
            r0.f226414x = r5     // Catch: java.lang.Exception -> L40
            java.lang.Object r11 = r2.emit(r6, r0)     // Catch: java.lang.Exception -> L40
            if (r11 != r1) goto La9
            goto La8
        L95:
            boolean r2 = r11 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto Lac
            oli.i r2 = new oli.i
            r2.<init>(r11)
            r0.u = r8
            r0.f226414x = r4
            java.lang.Object r11 = r3.emit(r2, r0)
            if (r11 != r1) goto La9
        La8:
            return r1
        La9:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        Lac:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: oli.c.a(gim.c):java.lang.Object");
    }

    @Override // oli.l
    public final void e(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.i = bundle.getString("default_camera_handler_photo_file");
        this.f226420j = bundle.getInt("default_camera_handler_pending_request_code", -1000);
    }

    @Override // oli.l
    public final void g(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putString("default_camera_handler_photo_file", this.i);
        bundle.putInt("default_camera_handler_pending_request_code", this.f226420j);
    }

    @Override // oli.l
    public final Object h(int i, int i2, t tVar) throws Exception {
        Object objEmit;
        if (this.f226420j != -1000 && i == 9068) {
            this.f226420j = -1000;
            if (i2 == -1) {
                objEmit = a(tVar);
                if (objEmit != fim.a.COROUTINE_SUSPENDED) {
                    objEmit = Unit.f186387a;
                }
            } else {
                try {
                    String str = this.i;
                    if (str != null) {
                        zk0.b bVar = this.f226416b;
                        List files = u.c(str);
                        Intrinsics.checkNotNullParameter(files, "files");
                        pfm.h hVar = new pfm.h(new a08.l((a80.h) bVar, files, 3), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                        w.g0(hVar);
                    }
                } catch (Exception e) {
                    Intrinsics.checkNotNullParameter("Failed to remove temporary camera file", "message");
                    MediaPickerException mediaPickerException = new MediaPickerException("Failed to remove temporary camera file", e);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, mediaPickerException, h0Var);
                }
                objEmit = this.f.emit(h.f226433a, tVar);
                if (objEmit != fim.a.COROUTINE_SUSPENDED) {
                    objEmit = Unit.f186387a;
                }
            }
            return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
        }
        return Unit.f186387a;
    }

    @Override // oli.l
    public final t80.i i() {
        return this.f226419h;
    }

    @Override // oli.l
    public final t1 j() {
        return this.f226418g;
    }

    @Override // oli.l
    public final Object k(String str, Continuation continuation) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        try {
            File fileB = this.f226415a.b(this.f226417c.a(str));
            Uri uriI = ((a80.h) this.f226416b).i(fileB);
            this.i = fileB.getAbsolutePath();
            Intrinsics.h(intent.putExtra("output", uriI));
        } catch (Exception e) {
            Intrinsics.checkNotNullParameter("Failed to create camera intent", "message");
            MediaPickerException mediaPickerException = new MediaPickerException("Failed to create camera intent", e);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, mediaPickerException, h0Var);
        }
        try {
            this.f226420j = 9068;
            this.d.a(intent, 9068);
            return Boolean.TRUE;
        } catch (ActivityNotFoundException e2) {
            Intrinsics.checkNotNullParameter("Failed to launch camera intent", "message");
            MediaPickerException mediaPickerException2 = new MediaPickerException("Failed to launch camera intent", e2);
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, mediaPickerException2, h0Var2);
            this.f226420j = -1000;
            return Boolean.FALSE;
        }
    }
}
