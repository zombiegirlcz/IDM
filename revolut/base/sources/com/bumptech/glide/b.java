package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import e8.s;
import ecm.q;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {
    public static volatile b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile boolean f26071j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f26072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f8.a f26073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g8.e f26074c;
    public final f d;
    public final f8.f e;
    public final r8.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ah.a f26075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f26076h = new ArrayList();

    public b(Context context, s sVar, g8.e eVar, f8.a aVar, f8.f fVar, r8.m mVar, ah.a aVar2, int i2, af.f fVar2, Map map, List list, List list2, s8.a aVar3, g gVar) {
        this.f26072a = sVar;
        this.f26073b = aVar;
        this.e = fVar;
        this.f26074c = eVar;
        this.f = mVar;
        this.f26075g = aVar2;
        this.d = new f(context, fVar, new ch.m(this, list2, aVar3), new ch.b(18), fVar2, map, list, sVar, gVar, i2);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            } catch (InvocationTargetException e5) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e5);
            }
            synchronized (b.class) {
                if (i == null) {
                    if (f26071j) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f26071j = true;
                    try {
                        c(context, generatedAppGlideModule);
                        f26071j = false;
                    } catch (Throwable th10) {
                        f26071j = false;
                        throw th10;
                    }
                }
            }
        }
        return i;
    }

    public static r8.m b(Context context) {
        y8.f.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f;
    }

    public static void c(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        e eVar = new e();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.G();
        }
        if (Log.isLoggable("ManifestParser", 3)) {
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    String str = "Got app info metadata: " + applicationInfo.metaData;
                }
                for (String str2 : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str2))) {
                        arrayList.add(d.y(str2));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            String str3 = "Loaded Glide module: " + str2;
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
            }
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.H().isEmpty()) {
            HashSet hashSetH = generatedAppGlideModule.H();
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it8.next();
                if (hashSetH.contains(okHttpGlideModule.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        String str4 = "AppGlideModule excludes manifest GlideModule: " + okHttpGlideModule;
                    }
                    it8.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                String str5 = "Discovered GlideModule from manifest: " + ((OkHttpGlideModule) it9.next()).getClass();
            }
        }
        eVar.f26086n = generatedAppGlideModule != null ? generatedAppGlideModule.I() : null;
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            ((OkHttpGlideModule) it10.next()).getClass();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.F();
        }
        if (eVar.f26081g == null) {
            h8.b bVar = new h8.b();
            if (h8.e.f149926c == 0) {
                h8.e.f149926c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = h8.e.f149926c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            eVar.f26081g = new h8.e(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new h8.c(bVar, "source", false)));
        }
        if (eVar.f26082h == null) {
            int i3 = h8.e.f149926c;
            h8.b bVar2 = new h8.b();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            eVar.f26082h = new h8.e(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new h8.c(bVar2, "disk-cache", true)));
        }
        if (eVar.o == null) {
            if (h8.e.f149926c == 0) {
                h8.e.f149926c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i5 = h8.e.f149926c >= 4 ? 2 : 1;
            h8.b bVar3 = new h8.b();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            eVar.o = new h8.e(new ThreadPoolExecutor(i5, i5, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new h8.c(bVar3, "animation", true)));
        }
        if (eVar.f26083j == null) {
            eVar.f26083j = new g8.f(new g7.c(applicationContext));
        }
        if (eVar.k == null) {
            eVar.k = new ah.a(12);
        }
        if (eVar.d == null) {
            int i6 = eVar.f26083j.f141227a;
            if (i6 > 0) {
                eVar.d = new f8.g(i6);
            } else {
                eVar.d = new qy5.a(11);
            }
        }
        if (eVar.e == null) {
            eVar.e = new f8.f(eVar.f26083j.f141229c);
        }
        if (eVar.f == null) {
            eVar.f = new g8.e(eVar.f26083j.f141228b);
        }
        if (eVar.i == null) {
            eVar.i = new q(applicationContext);
        }
        if (eVar.f26080c == null) {
            eVar.f26080c = new s(eVar.f, eVar.i, eVar.f26082h, eVar.f26081g, new h8.e(new ThreadPoolExecutor(0, Integer.MAX_VALUE, h8.e.f149925b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new h8.c(new h8.b(), "source-unlimited", false))), eVar.o);
        }
        List list2 = eVar.f26087p;
        if (list2 == null) {
            eVar.f26087p = Collections.EMPTY_LIST;
        } else {
            eVar.f26087p = Collections.unmodifiableList(list2);
        }
        bh.d dVar = eVar.f26079b;
        dVar.getClass();
        b bVar4 = new b(applicationContext, eVar.f26080c, eVar.f, eVar.d, eVar.e, new r8.m(eVar.f26086n), eVar.k, eVar.f26084l, eVar.f26085m, eVar.f26078a, eVar.f26087p, arrayList, generatedAppGlideModule, new g(dVar));
        applicationContext.registerComponentCallbacks(bVar4);
        i = bVar4;
    }

    public static n d(Context context) {
        return b(context).c(context);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static n e(ImageView imageView) {
        r8.m mVarB = b(imageView.getContext());
        mVarB.getClass();
        char[] cArr = y8.l.f311609a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return mVarB.c(imageView.getContext().getApplicationContext());
        }
        y8.f.c(imageView.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = r8.m.a(imageView.getContext());
        if (activityA != null && (activityA instanceof FragmentActivity)) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityA;
            ArrayMap arrayMap = mVarB.f252293c;
            arrayMap.clear();
            r8.m.b(fragmentActivity.getSupportFragmentManager().getFragments(), arrayMap);
            View viewFindViewById = fragmentActivity.findViewById(R.id.content);
            Fragment fragment = null;
            for (View view = imageView; !view.equals(viewFindViewById) && (fragment = (Fragment) arrayMap.get(view)) == null && (view.getParent() instanceof View); view = (View) view.getParent()) {
            }
            arrayMap.clear();
            if (fragment == null) {
                return mVarB.d(fragmentActivity);
            }
            y8.f.c(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
            if (!(Looper.myLooper() == Looper.getMainLooper())) {
                return mVarB.c(fragment.getContext().getApplicationContext());
            }
            if (fragment.getActivity() != null) {
                mVarB.d.a(fragment.getActivity());
            }
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Context context = fragment.getContext();
            return mVarB.e.j(context, a(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
        }
        return mVarB.c(imageView.getContext().getApplicationContext());
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        y8.l.a();
        this.f26074c.e(0L);
        this.f26073b.e();
        f8.f fVar = this.e;
        synchronized (fVar) {
            fVar.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        long j2;
        y8.l.a();
        synchronized (this.f26076h) {
            try {
                Iterator it8 = this.f26076h.iterator();
                while (it8.hasNext()) {
                    ((n) it8.next()).getClass();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        g8.e eVar = this.f26074c;
        eVar.getClass();
        if (i2 >= 40) {
            eVar.e(0L);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (eVar) {
                j2 = eVar.f49606a;
            }
            eVar.e(j2 / 2);
        }
        this.f26073b.d(i2);
        f8.f fVar = this.e;
        synchronized (fVar) {
            if (i2 >= 40) {
                synchronized (fVar) {
                    fVar.b(0);
                }
            } else if (i2 >= 20 || i2 == 15) {
                fVar.b(fVar.e / 2);
            }
        }
    }
}
