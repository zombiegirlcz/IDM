package iv0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yp0.k0;

/* JADX INFO: loaded from: classes19.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public as0.d f168685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public es0.k f168686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f168687c = new LinkedHashMap();

    public static final class a {

        @NotNull
        public static final C0948a Companion = new C0948a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f168688c = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f168689a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashSet f168690b = new LinkedHashSet();

        /* JADX INFO: renamed from: iv0.o$a$a, reason: collision with other inner class name */
        public static final class C0948a {
            private C0948a() {
            }
        }

        public static String a(String str, String str2) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(str, "::", str2);
        }
    }

    public final void a(uw0.i iVar) {
        as0.d dVar = this.f168685a;
        if (dVar != null) {
            c().removeOnAttachStateChangeListener(dVar);
        }
        if (iVar == null) {
            return;
        }
        if (c().isAttachedToWindow()) {
            g(iVar);
        } else {
            this.f168685a = new as0.d(this, iVar, 2);
            c().addOnAttachStateChangeListener(this.f168685a);
        }
    }

    public final a b(uw0.h scope, View managerHost) {
        LinkedHashMap linkedHashMap = this.f168687c;
        Object aVar = linkedHashMap.get(scope);
        if (aVar == null) {
            a.Companion.getClass();
            Intrinsics.checkNotNullParameter(managerHost, "managerHost");
            Intrinsics.checkNotNullParameter(scope, "scope");
            int i = n.f168684a[scope.ordinal()];
            if (i == 1) {
                Object tag2 = managerHost.getTag(R$id.internal_charts_manager_tag);
                aVar = tag2 instanceof a ? (a) tag2 : null;
                if (aVar == null) {
                    aVar = new a();
                    managerHost.setTag(R$id.internal_charts_manager_tag, aVar);
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = a.f168688c;
            }
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            linkedHashMap.put(scope, aVar);
        }
        return (a) aVar;
    }

    public abstract View c();

    public final void d(uw0.i animationRequest, View managerHost) {
        Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
        Intrinsics.checkNotNullParameter(managerHost, "managerHost");
        es0.k kVar = this.f168686b;
        if (kVar != null) {
            c().removeOnAttachStateChangeListener(kVar);
        }
        this.f168686b = null;
        k0 k0VarP = w.P(managerHost);
        if (k0VarP != null) {
            uw0.f fVar = k0VarP.f315745b;
            a aVarB = b(fVar.m(), managerHost);
            if (aVarB != null) {
                String animationHostId = fVar.getId();
                Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
                Intrinsics.checkNotNullParameter(animationHostId, "animationHostId");
                aVarB.f168689a.remove(a.a(animationHostId, animationRequest.f283502a));
                aVarB.f168690b.add(animationHostId);
            }
        }
    }

    public final void e(uw0.i animationRequest, View managerHost) {
        Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
        Intrinsics.checkNotNullParameter(managerHost, "managerHost");
        if (this.f168686b == null) {
            es0.k kVar = new es0.k(this, 3);
            c().addOnAttachStateChangeListener(kVar);
            this.f168686b = kVar;
        }
        k0 k0VarP = w.P(managerHost);
        if (k0VarP != null) {
            uw0.f fVar = k0VarP.f315745b;
            a aVarB = b(fVar.m(), managerHost);
            if (aVarB != null) {
                String animationHostId = fVar.getId();
                Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
                Intrinsics.checkNotNullParameter(animationHostId, "animationHostId");
                aVarB.f168689a.add(a.a(animationHostId, animationRequest.f283502a));
            }
        }
    }

    public abstract void f();

    public final void g(uw0.i animationRequest) {
        k0 k0VarP;
        View viewB = w.B(c());
        if (viewB == null || (k0VarP = w.P(viewB)) == null) {
            return;
        }
        uw0.f fVar = k0VarP.f315745b;
        a aVarB = b(fVar.m(), viewB);
        if (aVarB == null) {
            return;
        }
        if (!animationRequest.f283504c ? true : Intrinsics.f(fVar.getType(), uw0.c.f283500a)) {
            String animationHostId = fVar.getId();
            Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
            Intrinsics.checkNotNullParameter(animationHostId, "animationHostId");
            if ((aVarB.f168689a.contains(a.a(animationHostId, animationRequest.f283502a)) || animationRequest.f283503b != uw0.g.UNTIL_ANY_FINISHED || aVarB.f168690b.contains(animationHostId)) ? false : true) {
                h(animationRequest, viewB);
            }
        }
    }

    public abstract void h(uw0.i iVar, View view);
}
