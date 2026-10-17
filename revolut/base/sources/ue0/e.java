package ue0;

import aii.o;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import c8.n;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.Registry;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Contextual;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$InternalColorStyle;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.ActionBreadcrumb;
import efm.d0;
import efm.k;
import efm.r;
import i8.c0;
import i8.g0;
import i8.j;
import i8.v;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import k7c.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import l8.b0;
import l8.p;
import lr.l;
import mic.a0;
import mki.g;
import pfm.h;
import pfm.z;
import rfm.f;
import rfm.m;
import s7a.m0;
import skm.a2;
import skm.e0;
import ufm.i;
import v3e.s;
import vf0.u;
import vkm.q;
import vkm.q0;
import vkm.t;
import vkm.y;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static pfm.a A(efm.b bVar, Function1 resumeFunction) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        Intrinsics.checkNotNullParameter(resumeFunction, "resumeFunction");
        pfm.a aVar = new pfm.a(r(bVar, customKeys), new a0(21, resumeFunction), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        return aVar;
    }

    public static m B(k kVar, Function1 resumeFunction) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        Intrinsics.checkNotNullParameter(resumeFunction, "resumeFunction");
        m mVar = new m(s(kVar, customKeys), new a0(20, resumeFunction), 2);
        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
        return mVar;
    }

    public static i C(d0 d0Var, d0 single) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(single, "single");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        i iVar = new i(t(d0Var, customKeys), new mfm.d(single), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        return iVar;
    }

    public static i D(d0 d0Var, Function1 resumeFunction) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        Intrinsics.checkNotNullParameter(resumeFunction, "resumeFunction");
        i iVar = new i(t(d0Var, customKeys), new a0(19, resumeFunction), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        return iVar;
    }

    public static r E(r rVar, Object obj2) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        r rVarOnErrorReturnItem = q(rVar, customKeys).onErrorReturnItem(obj2);
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturnItem, "onErrorReturnItem(...)");
        return rVarOnErrorReturnItem;
    }

    public static z F(d0 d0Var, Object obj2) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        z zVarO = t(d0Var, customKeys).o(obj2);
        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
        return zVarO;
    }

    public static f G(k kVar, Object obj2) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        f fVar = new f(s(kVar, customKeys), new mfm.d(obj2), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "onErrorReturnItem(...)");
        return fVar;
    }

    public static final r H(r rVar, Set customKeys, Function1 supplier) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        r rVarOnErrorReturn = q(rVar, customKeys).onErrorReturn(new vf0.r(2, supplier));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturn, "onErrorReturn(...)");
        return rVarOnErrorReturn;
    }

    public static final z I(d0 d0Var, Set customKeys, Function1 supplier) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        z zVar = new z(t(d0Var, customKeys), 1, new vf0.r(1, supplier), null);
        Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
        return zVar;
    }

    public static final ArrayList J(Object obj2, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayListF1 = zhm.d0.f1(list);
        arrayListF1.add(0, obj2);
        return arrayListF1;
    }

    public static h K(efm.b bVar) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        h hVar = new h(r(bVar, customKeys).B().l(Long.MAX_VALUE, mfm.f.f205044g), 3);
        Intrinsics.checkNotNullExpressionValue(hVar, "retry(...)");
        return hVar;
    }

    public static h L(efm.b bVar, long j2) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        h hVar = new h(r(bVar, customKeys).B().l(j2, mfm.f.f205044g), 3);
        Intrinsics.checkNotNullExpressionValue(hVar, "retry(...)");
        return hVar;
    }

    public static final Collection M(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (collection.isEmpty()) {
            return null;
        }
        return collection;
    }

    public static final a2 N(o eventsDispatcher, CoroutineScope createdScope, Function1 handleError, aii.a actionContext, ActionBreadcrumb actionBreadcrumb, Function2 block) {
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(createdScope, "createdScope");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(actionContext, "actionContext");
        Intrinsics.checkNotNullParameter(actionBreadcrumb, "actionBreadcrumb");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter("tillFinish", "methodName");
        Intrinsics.checkNotNullParameter("tillHide", "shownScopeAlternative");
        return e0.C(createdScope, new mki.f(eventsDispatcher, handleError, actionContext, actionBreadcrumb), null, new mki.e(block, null, 1), 2);
    }

    public static final a2 O(o eventsDispatcher, CoroutineScope shownScope, Function1 handleError, aii.a actionContext, ActionBreadcrumb actionBreadcrumb, Function2 block) {
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(shownScope, "shownScope");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(actionContext, "actionContext");
        Intrinsics.checkNotNullParameter(actionBreadcrumb, "actionBreadcrumb");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter("tillHide", "methodName");
        Intrinsics.checkNotNullParameter("tillFinish", "createdScopeAlternative");
        return e0.C(shownScope, new g(eventsDispatcher, handleError, actionContext, actionBreadcrumb), null, new afe.a(block, null, 10), 2);
    }

    public static final ArrayList P(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<tkd.e> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (tkd.e eVar : list2) {
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            ukd.a aVar = new ukd.a(eVar.d(), eVar.b(), eVar.c(), vkd.a.b(eVar.e()), vkd.a.a(eVar.a()));
            String strE = aVar.e();
            String strF = aVar.f();
            String strB = aVar.b();
            String strA = aVar.a();
            StringBuilder sbT = p.a.t(strE, "-", strF, "-", strB);
            sbT.append("-");
            sbT.append(strA);
            aVar.g(sbT.toString());
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static final ArrayList Q(Object obj2, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayListF1 = zhm.d0.f1(list);
        if (arrayListF1.contains(obj2)) {
            arrayListF1.remove(obj2);
            return arrayListF1;
        }
        arrayListF1.add(obj2);
        return arrayListF1;
    }

    public static final tnb.k R(c cVar, String key, Type type) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        return new tnb.k(cVar.C0(key, type), 4);
    }

    public static final zkm.d a(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return e0.c(new oji.d(kotlin.coroutines.e.d(e0.e(), context)));
    }

    public static final rlm.o b(Json json, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(json, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Intrinsics.checkNotNullParameter(json, "json");
        rlm.f fVar = new rlm.f();
        rlm.h hVar = json.f187948a;
        fVar.f255099a = hVar.f255104a;
        fVar.f255100b = hVar.d;
        fVar.f255101c = hVar.f255105b;
        fVar.d = hVar.f255106c;
        String str = hVar.e;
        fVar.e = hVar.f;
        fVar.f = hVar.f255107g;
        rlm.a aVar = hVar.f255109j;
        boolean z = hVar.f255108h;
        fVar.f255102g = hVar.i;
        fVar.f255103h = json.f187949b;
        builderAction.invoke(fVar);
        if (!Intrinsics.f(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        rlm.h configuration = new rlm.h(fVar.f255099a, fVar.f255101c, fVar.d, fVar.f255100b, str, fVar.e, fVar.f, z, fVar.f255102g, aVar);
        tlm.e module = fVar.f255103h;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        rlm.o oVar = new rlm.o(configuration, module);
        if (Intrinsics.f(module, tlm.h.f272133a)) {
            return oVar;
        }
        module.a(new dki.h(configuration));
        return oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0012 A[PHI: r1
      0x0012: PHI (r1v4 kotlin.coroutines.CoroutineContext) = 
      (r1v1 kotlin.coroutines.CoroutineContext)
      (r1v2 kotlin.coroutines.CoroutineContext)
      (r1v3 kotlin.coroutines.CoroutineContext)
     binds: [B:3:0x0010, B:6:0x001a, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.coroutines.CoroutineContext c(kotlin.coroutines.CoroutineContext r3) {
        /*
            eim.a r0 = kotlin.coroutines.d.q1
            kotlin.coroutines.CoroutineContext$Element r0 = r3.get(r0)
            kotlin.coroutines.d r0 = (kotlin.coroutines.d) r0
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r2 == 0) goto L14
        L12:
            r0 = r1
            goto L2b
        L14:
            elm.g r1 = skm.p0.f264002b
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r2 == 0) goto L1d
            goto L12
        L1d:
            kotlinx.coroutines.d r1 = skm.p0.f264003c
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r2 == 0) goto L26
            goto L12
        L26:
            if (r0 == 0) goto L29
            goto L2b
        L29:
            kotlin.coroutines.g r0 = kotlin.coroutines.g.f186406a
        L2b:
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.e.c(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext");
    }

    public static final a2 d(Flow flow, CoroutineScope attachedScope, Function2 onError, Function1 onSuccessCompletion, Function2 onEach) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(attachedScope, "attachedScope");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        Continuation continuation = null;
        return q.G(new y(new t(new q0(flow, new mki.e(onEach, continuation, 0), 1), new x(onSuccessCompletion, null)), new x(onError, continuation, 24)), attachedScope);
    }

    public static final a2 e(Flow flow, o eventsDispatcher, CoroutineScope createdScope, Function2 handleError, aii.a actionContext, ActionBreadcrumb actionBreadcrumb, Function1 onSuccessCompletion, Function2 onEach) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(createdScope, "createdScope");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(actionContext, "actionContext");
        Intrinsics.checkNotNullParameter(actionBreadcrumb, "actionBreadcrumb");
        Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        Intrinsics.checkNotNullParameter("collectTillFinish", "methodName");
        Intrinsics.checkNotNullParameter("collectTillHide", "shownScopeAlternative");
        return o(flow, eventsDispatcher, createdScope, handleError, actionContext, actionBreadcrumb, onSuccessCompletion, onEach);
    }

    public static final a2 f(Flow flow, o eventsDispatcher, CoroutineScope shownScope, Function2 handleError, aii.a actionContext, ActionBreadcrumb actionBreadcrumb, Function1 onSuccessCompletion, Function2 onEach) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(shownScope, "shownScope");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(actionContext, "actionContext");
        Intrinsics.checkNotNullParameter(actionBreadcrumb, "actionBreadcrumb");
        Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        Intrinsics.checkNotNullParameter("collectTillHide", "methodName");
        Intrinsics.checkNotNullParameter("collectTillFinish", "createdScopeAlternative");
        return o(flow, eventsDispatcher, shownScope, handleError, actionContext, actionBreadcrumb, onSuccessCompletion, onEach);
    }

    public static Registry g(com.bumptech.glide.b bVar, List list, s8.a aVar) {
        c8.m eVar;
        c8.m aVar2;
        String str;
        Class cls;
        f8.a aVar3 = bVar.f26073b;
        f8.f fVar = bVar.e;
        com.bumptech.glide.f fVar2 = bVar.d;
        Context applicationContext = fVar2.getApplicationContext();
        com.bumptech.glide.g gVar = fVar2.f26092h;
        Registry registry = new Registry();
        l8.k kVar = new l8.k();
        e4m.f fVar3 = registry.f26068g;
        synchronized (fVar3) {
            fVar3.f122679b.add(kVar);
        }
        int i = Build.VERSION.SDK_INT;
        l8.t tVar = new l8.t();
        e4m.f fVar4 = registry.f26068g;
        synchronized (fVar4) {
            fVar4.f122679b.add(tVar);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = registry.e();
        p8.a aVar4 = new p8.a(applicationContext, arrayListE, aVar3, fVar);
        c8.m e0Var = new l8.e0(aVar3, new af.f(8));
        p pVar = new p(registry.e(), resources.getDisplayMetrics(), aVar3, fVar);
        if (gVar.f26094a.containsKey(com.bumptech.glide.c.class)) {
            aVar2 = new l8.f(1);
            eVar = new l8.f(0);
        } else {
            eVar = new l8.e(pVar, 0);
            aVar2 = new l8.a(pVar, fVar, 2);
        }
        registry.d("Animation", InputStream.class, Drawable.class, new n8.a(new cpi.g(arrayListE, fVar, 19), 1));
        registry.d("Animation", ByteBuffer.class, Drawable.class, new n8.a(new cpi.g(arrayListE, fVar, 19), 0));
        c8.m dVar = new n8.d(applicationContext);
        n bVar2 = new l8.b(fVar);
        q8.a mVar = new icm.m(2);
        q8.a cVar = new q8.c(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        registry.a(ByteBuffer.class, new i8.d(0));
        registry.a(InputStream.class, new ecm.q(fVar, 14));
        registry.d("Bitmap", ByteBuffer.class, Bitmap.class, eVar);
        registry.d("Bitmap", InputStream.class, Bitmap.class, aVar2);
        String str2 = Build.FINGERPRINT;
        if ("robolectric".equals(str2)) {
            str = str2;
            cls = ParcelFileDescriptor.class;
        } else {
            str = str2;
            c8.m eVar2 = new l8.e(pVar, 1);
            cls = ParcelFileDescriptor.class;
            registry.d("Bitmap", cls, Bitmap.class, eVar2);
        }
        registry.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new l8.e0(aVar3, new ch.b(7)));
        registry.d("Bitmap", cls, Bitmap.class, e0Var);
        v vVar = i8.e0.f159358b;
        registry.c(Bitmap.class, Bitmap.class, vVar);
        registry.d("Bitmap", Bitmap.class, Bitmap.class, new b0(0));
        registry.b(Bitmap.class, bVar2);
        registry.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new l8.a(resources, eVar));
        registry.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new l8.a(resources, aVar2));
        registry.d("BitmapDrawable", cls, BitmapDrawable.class, new l8.a(resources, e0Var));
        registry.b(BitmapDrawable.class, new ao.h(17, (Object) aVar3, false, (Object) bVar2));
        registry.d("Animation", InputStream.class, GifDrawable.class, new p8.i(arrayListE, aVar4, fVar));
        registry.d("Animation", ByteBuffer.class, GifDrawable.class, aVar4);
        registry.b(GifDrawable.class, new ah.a(11));
        registry.c(a8.a.class, a8.a.class, vVar);
        registry.d("Bitmap", a8.a.class, Bitmap.class, new l8.e(aVar3, 2));
        registry.d("legacy_append", Uri.class, Drawable.class, dVar);
        registry.d("legacy_append", Uri.class, Bitmap.class, new l8.a(dVar, aVar3, 1));
        registry.i(new com.bumptech.glide.load.data.h(2));
        registry.c(File.class, ByteBuffer.class, new i8.e0(3));
        registry.c(File.class, InputStream.class, new j(new i8.d(3)));
        registry.d("legacy_append", File.class, File.class, new b0(2));
        registry.c(File.class, cls, new j(new i8.d(2)));
        registry.c(File.class, File.class, vVar);
        registry.i(new com.bumptech.glide.load.data.n(fVar));
        if (!"robolectric".equals(str)) {
            registry.i(new com.bumptech.glide.load.data.h(1));
        }
        v gVar2 = new i8.g(applicationContext, 2);
        v gVar3 = new i8.g(applicationContext, 0);
        v gVar4 = new i8.g(applicationContext, 1);
        Class cls2 = Integer.TYPE;
        registry.c(cls2, InputStream.class, gVar2);
        registry.c(Integer.class, InputStream.class, gVar2);
        registry.c(cls2, AssetFileDescriptor.class, gVar3);
        registry.c(Integer.class, AssetFileDescriptor.class, gVar3);
        registry.c(cls2, Drawable.class, gVar4);
        registry.c(Integer.class, Drawable.class, gVar4);
        registry.c(Uri.class, InputStream.class, new i8.g(applicationContext, 5));
        registry.c(Uri.class, AssetFileDescriptor.class, new i8.g(applicationContext, 4));
        v c0Var = new c0(resources, 2);
        v c0Var2 = new c0(resources, 0);
        v c0Var3 = new c0(resources, 1);
        registry.c(Integer.class, Uri.class, c0Var);
        registry.c(cls2, Uri.class, c0Var);
        registry.c(Integer.class, AssetFileDescriptor.class, c0Var2);
        registry.c(cls2, AssetFileDescriptor.class, c0Var2);
        registry.c(Integer.class, InputStream.class, c0Var3);
        registry.c(cls2, InputStream.class, c0Var3);
        registry.c(String.class, InputStream.class, new i8.f(0));
        registry.c(Uri.class, InputStream.class, new i8.f(0));
        registry.c(String.class, InputStream.class, new i8.e0(6));
        registry.c(String.class, cls, new i8.e0(5));
        registry.c(String.class, AssetFileDescriptor.class, new i8.e0(4));
        registry.c(Uri.class, InputStream.class, new i8.a(applicationContext.getAssets(), 1));
        registry.c(Uri.class, AssetFileDescriptor.class, new i8.a(applicationContext.getAssets(), 0));
        registry.c(Uri.class, InputStream.class, new i8.g(applicationContext, 6));
        registry.c(Uri.class, InputStream.class, new i8.g(applicationContext, 7));
        if (i >= 29) {
            registry.c(Uri.class, InputStream.class, new j8.b(applicationContext, InputStream.class));
            registry.c(Uri.class, cls, new j8.b(applicationContext, cls));
        }
        registry.c(Uri.class, InputStream.class, new g0(contentResolver, 2));
        registry.c(Uri.class, cls, new g0(contentResolver, 1));
        registry.c(Uri.class, AssetFileDescriptor.class, new g0(contentResolver, 0));
        registry.c(Uri.class, InputStream.class, new i8.e0(7));
        registry.c(URL.class, InputStream.class, new j8.e());
        registry.c(Uri.class, File.class, new i8.g(applicationContext, 3));
        registry.c(i8.k.class, InputStream.class, new i8.f(1));
        registry.c(byte[].class, ByteBuffer.class, new i8.e0(1));
        registry.c(byte[].class, InputStream.class, new i8.e0(2));
        registry.c(Uri.class, Uri.class, vVar);
        registry.c(Drawable.class, Drawable.class, vVar);
        registry.d("legacy_append", Drawable.class, Drawable.class, new b0(1));
        registry.j(Bitmap.class, BitmapDrawable.class, new mp.r(resources, 28));
        registry.j(Bitmap.class, byte[].class, mVar);
        registry.j(Drawable.class, byte[].class, new gpk.c(aVar3, mVar, cVar));
        registry.j(GifDrawable.class, byte[].class, cVar);
        c8.m e0Var2 = new l8.e0(aVar3, new dfm.c(7));
        registry.d("legacy_append", ByteBuffer.class, Bitmap.class, e0Var2);
        registry.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new l8.a(resources, e0Var2));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it8.next();
            try {
                okHttpGlideModule.a(applicationContext, bVar, registry);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(okHttpGlideModule.getClass().getName()), e);
            }
        }
        if (aVar != null) {
            aVar.y(applicationContext, bVar, registry);
        }
        return registry;
    }

    public static final Object h(hf0.a aVar, Class clazz) {
        Object objB;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        phm.a aVar2 = (phm.a) aVar.a().get(clazz);
        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
        if (aVar3 == null || (objB = aVar3.b()) == null) {
            throw new IllegalStateException(a0.d.q("Api ", clazz, " is not found"));
        }
        return objB;
    }

    public static final Object i(hf0.a aVar, Class clazz) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        phm.a aVar2 = (phm.a) aVar.a().get(clazz);
        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
        if (aVar3 != null) {
            return aVar3.b();
        }
        return null;
    }

    public static final hf0.a j(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object applicationContext = context.getApplicationContext();
        if (applicationContext instanceof hf0.c) {
            ((voi.i) ((hf0.c) applicationContext)).getClass();
            return hf0.b.d.g();
        }
        hf0.b bVar = hf0.b.d;
        if (bVar.f125044b != null) {
            return (hf0.a) bVar.c();
        }
        throw new IllegalStateException(j6.a.s("Application must implement interface ", hf0.c.class.getCanonicalName(), " or ", hf0.b.class.getCanonicalName(), " must be initialized"));
    }

    public static final int k(yy0.p pVar, Context context, String seed) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(seed, "seed");
        boolean zBooleanValue = ((Boolean) jo0.g.n().getValue()).booleanValue();
        StylableContactImage$ContactStyle f59893j = pVar != null ? pVar.getE() : null;
        if (f59893j instanceof StylableContactImage$Contextual) {
            return 0;
        }
        if (f59893j instanceof StylableContactImage$InternalColorStyle) {
            return ((StylableContactImage$InternalColorStyle) f59893j).getF59803a();
        }
        if (f59893j instanceof StylableContactImage$Style) {
            return zBooleanValue ? io0.a.d(0.1f, kli.a.s(R$attr.uikit_colorAccentNeutral, context)) : kli.a.s(((StylableContactImage$Style) f59893j).f59805a, context);
        }
        if (f59893j == null) {
            return zBooleanValue ? io0.a.d(0.1f, kli.a.s(R$attr.uikit_colorAccentNeutral, context)) : kli.a.s(io0.a.a(seed), context);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final x8.d l(Object key, long j2, long j3) {
        Intrinsics.checkNotNullParameter(key, "key");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(key, "key");
        long jHashCode = key.hashCode();
        long j5 = j2 * CoreConstants.MILLIS_IN_ONE_DAY;
        return new x8.d((((jHashCode % j5) + jCurrentTimeMillis) / j5) + j3);
    }

    public static final int m(yy0.p pVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zBooleanValue = ((Boolean) jo0.g.n().getValue()).booleanValue();
        StylableContactImage$ContactStyle f59893j = pVar != null ? pVar.getE() : null;
        if (f59893j instanceof StylableContactImage$Contextual) {
            return ((StylableContactImage$Contextual) f59893j).getF59802a();
        }
        if (f59893j instanceof StylableContactImage$InternalColorStyle) {
            return ((StylableContactImage$InternalColorStyle) f59893j).getF59804b();
        }
        if (f59893j instanceof StylableContactImage$Style) {
            return zBooleanValue ? io0.a.d(0.8f, kli.a.s(R$attr.uikit_colorForeground, context)) : kli.a.s(((StylableContactImage$Style) f59893j).f59806b, context);
        }
        if (f59893j == null) {
            return zBooleanValue ? io0.a.d(0.8f, kli.a.s(R$attr.uikit_colorForeground, context)) : io0.a.d(0.8f, kli.a.s(R$attr.uikit_colorWhite, context));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean n(List list) {
        if (list == null) {
            list = f0.f322471a;
        }
        return list.isEmpty();
    }

    public static final a2 o(Flow flow, o oVar, CoroutineScope coroutineScope, Function2 function2, aii.a aVar, ActionBreadcrumb actionBreadcrumb, Function1 function1, Function2 function22) {
        Continuation continuation = null;
        return q.G(new y(new t(new q0(flow, new l(function22, actionBreadcrumb, continuation, 23), 1), new x(function1, continuation, 22)), new mki.d(oVar, function2, aVar, actionBreadcrumb, (Continuation) null)), coroutineScope);
    }

    public static final r p(r rVar, Set customKeys) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        r rVarDoOnNext = rVar.doOnNext(new vf0.n(new m0(13, customKeys), 12));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return rVarDoOnNext;
    }

    public static final r q(r rVar, Set customKeys) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        r rVarDoOnError = rVar.doOnError(new s(new u(1, customKeys), 12));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnError, "doOnError(...)");
        return rVarDoOnError;
    }

    public static final pfm.t r(efm.b bVar, Set customKeys) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        pfm.t tVarM = bVar.m(new s(new u(0, customKeys), 13));
        Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
        return tVarM;
    }

    public static final rfm.y s(k kVar, Set customKeys) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        s sVar = new s(new u(3, customKeys), 15);
        kVar.getClass();
        dfm.c cVar = mfm.f.d;
        rfm.y yVar = new rfm.y(kVar, cVar, cVar, sVar, mfm.f.f205043c);
        Intrinsics.checkNotNullExpressionValue(yVar, "doOnError(...)");
        return yVar;
    }

    public static final ufm.f t(d0 d0Var, Set customKeys) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        s sVar = new s(new u(2, customKeys), 14);
        d0Var.getClass();
        ufm.f fVar = new ufm.f(d0Var, sVar, 1);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
        return fVar;
    }

    public static LinkedHashMap u(int i) {
        return new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static pfm.a v(efm.b bVar) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        pfm.a aVar = new pfm.a(r(bVar, customKeys), mfm.f.f205044g, 1);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
        return aVar;
    }

    public static pfm.a w(efm.b bVar, Function1 predicate) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        pfm.a aVar = new pfm.a(r(bVar, customKeys), new a0(22, predicate), 1);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
        return aVar;
    }

    public static rfm.x x(k kVar) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        rfm.x xVar = new rfm.x(s(kVar, customKeys));
        Intrinsics.checkNotNullExpressionValue(xVar, "onErrorComplete(...)");
        return xVar;
    }

    public static final r y(r rVar, Set customKeys, Function1 resumeFunction) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        Intrinsics.checkNotNullParameter(resumeFunction, "resumeFunction");
        r rVarOnErrorResumeNext = q(rVar, customKeys).onErrorResumeNext(new a0(23, resumeFunction));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        return rVarOnErrorResumeNext;
    }

    public static r z(r rVar, r observableSource) {
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(observableSource, "observableSource");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        r rVarOnErrorResumeNext = q(rVar, customKeys).onErrorResumeNext(observableSource);
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        return rVarOnErrorResumeNext;
    }
}
