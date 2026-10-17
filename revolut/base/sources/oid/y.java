package oid;

import android.content.Intent;
import android.net.Uri;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreen;
import com.revolut.feature.productintro.view.FullscreenProductIntroView;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import ms0.o0;
import mx0.o1;
import om4.l3;
import om4.m1;
import vkm.z1;
import yhm.m;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y implements kfm.o, kfm.p, kfm.g, ActivityResultCallback, kfm.h, o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f225685b;

    public /* synthetic */ y(Object obj2, int i) {
        this.f225684a = i;
        this.f225685b = obj2;
    }

    @Override // kfm.h
    public Object a(Object p0, Object p17, Object p2) {
        ngh.i iVar = (ngh.i) this.f225685b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return (Data) iVar.invoke(p0, p17, p2);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        o1 o1Var = (o1) this.f225685b;
        FullscreenProductIntroView.Companion aVar = FullscreenProductIntroView.INSTANCE;
        o1Var.invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f225684a) {
            case 0:
                nzj.n nVar = (nzj.n) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (eid.t) nVar.invoke(p0);
            case 1:
                oh3.a aVar = (oh3.a) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (shd.b) aVar.invoke(p0);
            case 2:
            case 3:
            case 7:
            case 17:
            default:
                op0.g gVar = (op0.g) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.a) gVar.invoke(p0);
            case 4:
                ofg.a aVar2 = (ofg.a) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) aVar2.invoke(p0);
            case 5:
                okk.d dVar = (okk.d) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                dVar.invoke(p0);
                return plg.n.f237393a;
            case 6:
                okk.d dVar2 = (okk.d) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kq2.b) dVar2.invoke(p0);
            case 8:
                okk.d dVar3 = (okk.d) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) dVar3.invoke(p0);
            case 9:
                l3 l3Var = (l3) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) l3Var.invoke(p0);
            case 10:
                oma.h hVar = (oma.h) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar.invoke(p0);
            case 11:
                l3 l3Var2 = (l3) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) l3Var2.invoke(p0);
            case 12:
                m1 m1Var = (m1) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) m1Var.invoke(p0);
            case 13:
                oma.h hVar2 = (oma.h) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar2.invoke(p0);
            case 14:
                oma.h hVar3 = (oma.h) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar3.invoke(p0);
            case 15:
                oma.h hVar4 = (oma.h) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar4.invoke(p0);
            case 16:
                oma.h hVar5 = (oma.h) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar5.invoke(p0);
            case 18:
                oma.h hVar6 = (oma.h) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar6.invoke(p0);
            case 19:
                oma.h hVar7 = (oma.h) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar7.invoke(p0);
            case 20:
                oma.h hVar8 = (oma.h) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) hVar8.invoke(p0);
            case 21:
                oma.h hVar9 = (oma.h) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wla.f) hVar9.invoke(p0);
            case 22:
                om4.l0 l0Var = (om4.l0) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) l0Var.invoke(p0);
            case 23:
                l3 l3Var3 = (l3) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kn2.a) l3Var3.invoke(p0);
            case 24:
                ona.f fVar = (ona.f) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) fVar.invoke(p0);
            case 25:
                ooa.c cVar = (ooa.c) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (j7a.c) cVar.invoke(p0);
            case 26:
                ooa.c cVar2 = (ooa.c) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (j7a.c) cVar2.invoke(p0);
            case 27:
                ooa.c cVar3 = (ooa.c) this.f225685b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (j7a.c) cVar3.invoke(p0);
        }
    }

    @Override // ms0.o0
    public void b() {
        ((ky4.f) this.f225685b).invoke();
    }

    @Override // androidx.view.result.ActivityResultCallback
    public void onActivityResult(Object obj2) {
        Object objA;
        List list;
        s96.f fVar;
        oli.g gVar = (oli.g) this.f225685b;
        ActivityResult result = (ActivityResult) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        z1 z1Var = gVar.i;
        int resultCode = result.getResultCode();
        if (resultCode != -1) {
            if (resultCode != 0) {
                z1Var.k(new oli.i(new IllegalStateException("There was an issue when picking result from document scanner")));
                return;
            } else {
                z1Var.k(oli.h.f226433a);
                return;
            }
        }
        Intent activityResultData = result.getData();
        if (activityResultData == null) {
            z1Var.k(new oli.i(new IllegalStateException("Cannot get activity result data for document scanner")));
            return;
        }
        ami.n nVar = gVar.f226426c;
        Intrinsics.checkNotNullParameter(activityResultData, "activityResultData");
        try {
            m.Companion companion = yhm.m.INSTANCE;
            Object obj3 = nVar.f6458a.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            objA = ((s96.a) obj3).extractImageUri(activityResultData);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            z1Var.k(new oli.i(thA));
            return;
        }
        s96.h hVar = (s96.h) objA;
        Continuation continuation = null;
        Uri uri2 = (hVar == null || (list = hVar.f261121a) == null || (fVar = (s96.f) zhm.d0.d0(list)) == null) ? null : fVar.f261119a;
        if (uri2 == null) {
            z1Var.k(new oli.i(new IllegalStateException("Cannot get page from document scanner")));
            return;
        }
        Object obj4 = gVar.d.get();
        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
        skm.e0.C((CoroutineScope) obj4, null, null, new nyd.j(gVar, uri2, continuation, 22), 3);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        ok7.c cVar = (ok7.c) this.f225685b;
        KProperty[] kPropertyArr = CFACInsuranceDocumentsScreen.U;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) cVar.invoke(p0)).booleanValue();
    }
}
