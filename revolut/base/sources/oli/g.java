package oli;

import ami.n;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.contract.ActivityResultContracts$StartIntentSenderForResult;
import java.time.Instant;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oid.y;
import org.jetbrains.annotations.NotNull;
import prk.o;
import vkm.q;
import vkm.t1;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements l {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentActivity f226424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityResultRegistry f226425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f226426c;
    public final d4m.a d;
    public final t80.g e;
    public final nli.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u96.b f226427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nli.e f226428h;
    public final z1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t1 f226429j;
    public final t80.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f226430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ActivityResultLauncher f226431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f226432n;
    public String o;

    public g(ComponentActivity activity, ActivityResultRegistry activityResultRegistry, n documentScanner, d4m.a coroutineScopeLazy, t80.g fileFactory, nli.a directoryResolver, i90.b uuidUtils, u96.b documentScannerSupportInteractor, nli.e filesProcessor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activityResultRegistry, "activityResultRegistry");
        Intrinsics.checkNotNullParameter(documentScanner, "documentScanner");
        Intrinsics.checkNotNullParameter(coroutineScopeLazy, "coroutineScopeLazy");
        Intrinsics.checkNotNullParameter(fileFactory, "fileFactory");
        Intrinsics.checkNotNullParameter(directoryResolver, "directoryResolver");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(documentScannerSupportInteractor, "documentScannerSupportInteractor");
        Intrinsics.checkNotNullParameter(filesProcessor, "filesProcessor");
        this.f226424a = activity;
        this.f226425b = activityResultRegistry;
        this.f226426c = documentScanner;
        this.d = coroutineScopeLazy;
        this.e = fileFactory;
        this.f = directoryResolver;
        this.f226427g = documentScannerSupportInteractor;
        this.f226428h = filesProcessor;
        z1 z1VarA = ta6.a.a(0);
        this.i = z1VarA;
        this.f226429j = q.g(z1VarA);
        this.k = t80.i.DOCUMENT_SCANNER;
        this.f226430l = jo0.g.B;
        m70.a.c(t0.f186434a);
        this.f226432n = "";
    }

    @Override // oli.l
    public final void e(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("DocumentScannerCameraHandlerKey");
        if (string == null) {
            m70.a.c(t0.f186434a);
            string = "";
        }
        this.f226432n = string;
        this.o = bundle.getString("DocumentScannerCameraHandlerSubdirectory");
    }

    @Override // oli.l
    public final void g(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putString("DocumentScannerCameraHandlerKey", this.f226432n);
        bundle.putString("DocumentScannerCameraHandlerSubdirectory", this.o);
    }

    @Override // oli.l
    public final t80.i i() {
        return this.k;
    }

    @Override // oli.l
    public final t1 j() {
        return this.f226429j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oli.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof oli.e
            if (r0 == 0) goto L13
            r0 = r10
            oli.e r0 = (oli.e) r0
            int r1 = r0.f226422x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226422x = r1
            goto L1a
        L13:
            oli.e r0 = new oli.e
            gim.c r10 = (gim.c) r10
            r0.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226422x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            androidx.activity.result.ActivityResultLauncher r9 = r0.u
            yhm.o.b(r10)
            yhm.m r10 = (yhm.m) r10
            java.lang.Object r10 = r10.f314193a
            goto L94
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            yhm.o.b(r10)
            java.lang.Object r10 = r8.f226430l
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L4c
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L4c:
            u96.b r10 = r8.f226427g
            boolean r10 = r10.a()
            if (r10 != 0) goto L57
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L57:
            androidx.activity.result.ActivityResultLauncher r10 = r8.f226431m
            if (r10 != 0) goto L6e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Scanner launcher was not created"
            r9.<init>(r10)
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r3, r9, r10)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L6e:
            r8.o = r9
            s96.b r9 = s96.b.JPEG
            java.util.Set r9 = zhm.y0.b(r9)
            s96.c r2 = s96.c.SCANNER_MODE_BASE
            s96.d r5 = new s96.d
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            r5.<init>(r2, r6, r9)
            r0.u = r10
            r0.f226422x = r4
            ami.n r9 = r8.f226426c
            androidx.activity.ComponentActivity r2 = r8.f226424a
            java.lang.Object r9 = r9.a(r2, r5, r0)
            if (r9 != r1) goto L91
            return r1
        L91:
            r7 = r10
            r10 = r9
            r9 = r7
        L94:
            java.lang.Throwable r0 = yhm.m.a(r10)
            if (r0 != 0) goto Lab
            android.content.IntentSender r10 = (android.content.IntentSender) r10
            androidx.activity.result.IntentSenderRequest$Builder r0 = new androidx.activity.result.IntentSenderRequest$Builder
            r0.<init>(r10)
            androidx.activity.result.IntentSenderRequest r10 = r0.build()
            r9.launch(r10)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        Lab:
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r10 = rd0.d.f253311a
            rd0.c r10 = rd0.c.ERROR
            java.lang.String r1 = "Cannot launch document scanner"
            rd0.d.a(r10, r3, r1, r0, r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oli.g.k(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oli.l
    public final void onCreate() {
        if (((Boolean) this.f226430l.getValue()).booleanValue()) {
            if (this.f226432n.length() == 0) {
                UUID uuidA = od0.j.a(Instant.now());
                Intrinsics.checkNotNullExpressionValue(uuidA, "generate(...)");
                this.f226432n = o.r(uuidA, "DocumentScannerCameraHandler_");
            }
            this.f226431m = this.f226425b.register(this.f226432n, new ActivityResultContracts$StartIntentSenderForResult(), new y(this, 7));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oli.l
    public final void onDestroy() {
        if (((Boolean) this.f226430l.getValue()).booleanValue()) {
            ActivityResultLauncher activityResultLauncher = this.f226431m;
            if (activityResultLauncher != null) {
                activityResultLauncher.unregister();
            }
            this.f226431m = null;
        }
    }
}
