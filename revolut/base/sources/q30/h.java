package q30;

import androidx.work.WorkManager;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import h30.m;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import q2e.i0;
import skm.e0;
import skm.p0;
import v30.c0;
import v30.n;
import v30.o;
import v30.p;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements a, i, od0.e {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f241757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ryc.a f241758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.c f241759c;
    public final phm.a d;
    public final phm.a e;
    public final phm.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final phm.a f241760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final phm.a f241761h;
    public final ConcurrentHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f241762j;
    public final AtomicBoolean k;

    public h(CoroutineScope scope, ryc.a repository, j30.c chatFeatureToggles, nf3.a chatAssistantResourcesConfig, m remoteConfig, m languageProvider, m workManager, m connectivityRepository, phm.a videoPreloader) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(chatAssistantResourcesConfig, "chatAssistantResourcesConfig");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(videoPreloader, "videoPreloader");
        this.f241757a = scope;
        this.f241758b = repository;
        this.f241759c = chatFeatureToggles;
        this.d = remoteConfig;
        this.e = languageProvider;
        this.f = workManager;
        this.f241760g = connectivityRepository;
        this.f241761h = videoPreloader;
        this.i = new ConcurrentHashMap();
        this.f241762j = new AtomicBoolean();
        this.k = new AtomicBoolean();
    }

    public static final String a(h hVar, String str, String str2, String str3) {
        return v0.a.i(v0.a.m("https://assets.revolut.com/mobile/cx/chat/assistant_intro/", str, "/", str2, "/assistant_intro_"), str3, ".mp4");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ba, code lost:
    
        if (r0 == r3) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(q30.h r21, java.lang.String r22, java.lang.String r23, gim.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q30.h.b(q30.h, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final boolean c() {
        try {
            j30.a aVarA = ((rf3.d) this.f241759c).a();
            if (aVarA == null) {
                return false;
            }
            ryc.a aVar = this.f241758b;
            c0 c0Var = c0.ASSISTANT;
            Map mapC = aVar.c(c0Var);
            String str = (String) mapC.get("shown");
            if (str != null ? Boolean.parseBoolean(str) : false) {
                h(c0Var, v30.m.f285806a);
                return false;
            }
            int i = c.f241749b[aVarA.ordinal()];
            n nVar = n.f285808a;
            if (i == 1 || i == 2) {
                h(c0Var, nVar);
                return false;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = (String) mapC.get("lightUrl");
            String str3 = (String) mapC.get("darkUrl");
            if (str2 == null || str3 == null) {
                h(c0Var, nVar);
                return true;
            }
            h(c0Var, new o(new UrlVideo(str2, str3, false, oz0.b.CENTER_CROP, false, (oz0.c) null, 112)));
            return true;
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            return true;
        }
    }

    @Override // od0.e
    public final void clear() {
        this.i.clear();
        ((WorkManager) this.f.get()).cancelAllWorkByTag("chat_into");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(v30.c0 r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q30.e
            if (r0 == 0) goto L13
            r0 = r7
            q30.e r0 = (q30.e) r0
            int r1 = r0.f241752x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241752x = r1
            goto L18
        L13:
            q30.e r0 = new q30.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241752x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            v30.c0 r6 = r0.u
            yhm.o.b(r7)
            goto L67
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            int[] r7 = q30.c.f241748a
            int r2 = r6.ordinal()
            r7 = r7[r2]
            r2 = 0
            if (r7 == r3) goto L4d
            r6 = 2
            if (r7 == r6) goto L4c
            r6 = 3
            if (r7 != r6) goto L46
            goto L4c
        L46:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L4c:
            return r2
        L4d:
            r0.u = r6
            r0.f241752x = r3
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            q30.d r3 = new q30.d
            r4 = 0
            r3.<init>(r5, r2, r4)
            java.lang.Object r7 = skm.e0.J(r7, r3, r0)
            if (r7 != r1) goto L62
            goto L64
        L62:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L64:
            if (r7 != r1) goto L67
            return r1
        L67:
            java.util.concurrent.ConcurrentHashMap r7 = r5.i
            java.lang.Object r6 = r7.get(r6)
            v30.p r6 = (v30.p) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q30.h.d(v30.c0, gim.c):java.lang.Object");
    }

    public final Object e(c0 c0Var, gim.i iVar) throws Throwable {
        h(c0Var, v30.m.f285806a);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new i0(this, c0Var, null, 2), iVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof q30.f
            if (r0 == 0) goto L13
            r0 = r8
            q30.f r0 = (q30.f) r0
            int r1 = r0.f241753w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241753w = r1
            goto L18
        L13:
            q30.f r0 = new q30.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241753w
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L31
            if (r2 != r5) goto L29
            yhm.o.b(r8)
            goto L77
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            yhm.o.b(r8)
            java.util.concurrent.ConcurrentHashMap r8 = r7.i
            v30.c0 r2 = v30.c0.ASSISTANT
            java.lang.Object r8 = r8.get(r2)
            v30.p r8 = (v30.p) r8
            boolean r2 = r8 instanceof v30.m
            if (r2 == 0) goto L45
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L45:
            j30.c r2 = r7.f241759c
            rf3.d r2 = (rf3.d) r2
            boolean r6 = r2.d()
            if (r6 == 0) goto L98
            j30.a r2 = r2.a()
            if (r2 != 0) goto L56
            goto L98
        L56:
            if (r8 != 0) goto L82
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f241762j
            boolean r8 = r8.compareAndSet(r3, r5)
            if (r8 != 0) goto L63
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L63:
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            pnb.b r2 = new pnb.b
            r6 = 28
            r2.<init>(r7, r4, r6)
            r0.f241753w = r5
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L82
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L82:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.k
            boolean r8 = r8.compareAndSet(r3, r5)
            if (r8 == 0) goto L95
            q30.d r8 = new q30.d
            r8.<init>(r7, r4, r5)
            r0 = 3
            kotlinx.coroutines.CoroutineScope r1 = r7.f241757a
            skm.e0.C(r1, r4, r4, r8, r0)
        L95:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L98:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q30.h.g(gim.c):java.lang.Object");
    }

    public final void h(c0 c0Var, p pVar) {
        boolean zEquals = pVar.equals(n.f285808a);
        ConcurrentHashMap concurrentHashMap = this.i;
        if (zEquals) {
            concurrentHashMap.putIfAbsent(c0Var, pVar);
            return;
        }
        v30.m mVar = v30.m.f285806a;
        if (pVar.equals(mVar)) {
            concurrentHashMap.put(c0Var, pVar);
            return;
        }
        if (!(pVar instanceof o)) {
            throw new NoWhenBranchMatchedException();
        }
        p pVar2 = (p) concurrentHashMap.get(c0Var);
        if (pVar2 == null) {
            concurrentHashMap.putIfAbsent(c0Var, pVar);
        } else {
            if (pVar2.equals(mVar)) {
                return;
            }
            concurrentHashMap.replace(c0Var, pVar2, pVar);
        }
    }
}
