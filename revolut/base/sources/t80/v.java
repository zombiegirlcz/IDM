package t80;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import sbb.c0;
import skm.e0;
import zhm.a0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements DefaultLifecycleObserver {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g60.a f268781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f268782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f268783c;
    public final LifecycleOwner d;
    public final d4m.a e;
    public final nli.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oli.c f268784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final oli.g f268785h;
    public final nli.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f268786j;
    public List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f268787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f268788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f268789n;

    public v(g60.a intentLauncher, Activity activity, g fileFactory, LifecycleOwner lifecycleOwner, d4m.a coroutineScopeLazy, nli.a directoryResolver, oli.c defaultCameraHandler, oli.g documentScannerCameraHandler, nli.e filesProcessor) {
        Intrinsics.checkNotNullParameter(intentLauncher, "intentLauncher");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fileFactory, "fileFactory");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(coroutineScopeLazy, "coroutineScopeLazy");
        Intrinsics.checkNotNullParameter(directoryResolver, "directoryResolver");
        Intrinsics.checkNotNullParameter(defaultCameraHandler, "defaultCameraHandler");
        Intrinsics.checkNotNullParameter(documentScannerCameraHandler, "documentScannerCameraHandler");
        Intrinsics.checkNotNullParameter(filesProcessor, "filesProcessor");
        this.f268781a = intentLauncher;
        this.f268782b = activity;
        this.f268783c = fileFactory;
        this.d = lifecycleOwner;
        this.e = coroutineScopeLazy;
        this.f = directoryResolver;
        this.f268784g = defaultCameraHandler;
        this.f268785h = documentScannerCameraHandler;
        this.i = filesProcessor;
        this.k = f0.f322471a;
        this.f268787l = -1;
        this.f268789n = zhm.v.k(defaultCameraHandler, documentScannerCameraHandler);
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public static void d(v vVar, String str, oli.m mVar, int i) {
        Continuation continuation = null;
        String str2 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            mVar = oli.m.DEFAULT;
        }
        oli.m cameraHandlerType = mVar;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(cameraHandlerType, "cameraHandlerType");
        e0.C(vVar.a(), null, null, new sma.f(13, vVar, cameraHandlerType, str2, continuation), 3);
    }

    public final CoroutineScope a() {
        Object obj2 = this.e.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (CoroutineScope) obj2;
    }

    public final void b(int i, int i2, Intent intent) {
        e0.C(a(), null, null, new t(this, i, i2, intent, null), 3);
        if (this.f268787l != -1 && i == 2924) {
            this.f268787l = -1;
            e0.C(a(), null, null, new c0(this, i, i2, intent, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
    
        if (r0 == r7) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r12, android.content.Context r13, t80.q r14, gim.c r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t80.v.c(java.util.List, android.content.Context, t80.q, gim.c):java.lang.Object");
    }

    public final void e(String str, List documentTypes, boolean z) {
        String str2;
        Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        List list = documentTypes;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a0.x(kotlin.collections.d.D(((f) it8.next()).a()), arrayList);
        }
        if (arrayList.size() == 1) {
            str2 = (String) d0.b0(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                arrayList2.add(kotlin.text.d0.A0('/', (String) it9.next()));
            }
            List listU = d0.U(arrayList2);
            if (listU.size() == 1) {
                str2 = d0.b0(listU) + "/*";
            } else {
                str2 = "*/*";
            }
        }
        intent.setType(str2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            a0.x(kotlin.collections.d.D(((f) it10.next()).a()), arrayList3);
        }
        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList3.toArray(new String[0]));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        this.f268786j = str;
        this.k = documentTypes;
        this.f268787l = 2924;
        this.f268781a.a(intent, 2924);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public final void f(Bundle bundle) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f268786j = bundle.getString("external_subdir");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("documents");
        if (stringArrayList != null) {
            arrayList = new ArrayList(zhm.w.t(stringArrayList, 10));
            for (String str : stringArrayList) {
                Intrinsics.h(str);
                arrayList.add(f.valueOf(str));
            }
        } else {
            arrayList = f0.f322471a;
        }
        this.k = arrayList;
        this.f268787l = bundle.getInt("pending_request_code", -1);
        Iterator it8 = this.f268789n.iterator();
        while (it8.hasNext()) {
            ((oli.l) it8.next()).e(bundle);
        }
    }

    public final void g(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putString("external_subdir", this.f268786j);
        List list = this.k;
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((f) it8.next()).name());
        }
        bundle.putStringArrayList("documents", arrayList);
        bundle.putInt("pending_request_code", this.f268787l);
        Iterator it9 = this.f268789n.iterator();
        while (it9.hasNext()) {
            ((oli.l) it9.next()).g(bundle);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        List<oli.l> list = this.f268789n;
        for (oli.l lVar : list) {
            e0.C(a(), null, null, new sma.f(lVar, this, new j(lVar.i()), (Continuation) null, 12), 3);
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ((oli.l) it8.next()).onCreate();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.d.getLifecycle().removeObserver(this);
        Iterator it8 = this.f268789n.iterator();
        while (it8.hasNext()) {
            ((oli.l) it8.next()).onDestroy();
        }
    }
}
