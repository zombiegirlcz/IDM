package r8;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l8.v;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Handler.Callback {
    public static final qf.b f = new qf.b(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.n f252291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf.b f252292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayMap f252293c = new ArrayMap();
    public final g d;
    public final ao.h e;

    public m(qf.b bVar) {
        bVar = bVar == null ? f : bVar;
        this.f252292b = bVar;
        this.e = new ao.h(bVar);
        this.d = (v.f && v.e) ? new f() : new ch.b(12);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, Map map) {
        if (list == null) {
            return;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Fragment fragment = (Fragment) it8.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    public final com.bumptech.glide.n c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = y8.l.f311609a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return d((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f252291a == null) {
            synchronized (this) {
                try {
                    if (this.f252291a == null) {
                        this.f252291a = this.f252292b.c(com.bumptech.glide.b.a(context.getApplicationContext()), new nd.o(), new nd.p(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f252291a;
    }

    public final com.bumptech.glide.n d(FragmentActivity fragmentActivity) {
        char[] cArr = y8.l.f311609a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.d.a(fragmentActivity);
        Activity activityA = a(fragmentActivity);
        return this.e.j(fragmentActivity, com.bumptech.glide.b.a(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), activityA == null || !activityA.isFinishing());
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
