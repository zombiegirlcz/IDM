package wii;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Set;
import jr0.g;
import kotlin.jvm.internal.Intrinsics;
import nhi.k;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements xji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f297904a;

    public a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f297904a = activity;
    }

    public final void a() {
        k.a(this);
    }

    public final void b() {
        k.b(this);
    }

    @Override // xji.a
    public final void q0(com.revolut.kompot.navigable.a controller, boolean z) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (z && controller.q2().d()) {
            Context context = controller.D2().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Activity activityM = kli.a.m(context);
            Activity activity = this.f297904a;
            if (activityM == activity) {
                View rootView = activity.getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(rootView, "getDecorView(...)");
                Intrinsics.checkNotNullParameter(rootView, "rootView");
                g.Companion.getClass();
                Intrinsics.checkNotNullParameter(rootView, "rootView");
                Set set = g.f177903h;
                Intrinsics.checkNotNullExpressionValue(set, "access$getActiveManagers$cp(...)");
                synchronized (set) {
                    Intrinsics.checkNotNullExpressionValue(set, "access$getActiveManagers$cp(...)");
                    arrayList = new ArrayList();
                    for (Object obj2 : set) {
                        if (((g) obj2).f177904a.getRootView() == rootView) {
                            arrayList.add(obj2);
                        }
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((g) arrayList.get(i)).a();
                }
            }
        }
    }
}
