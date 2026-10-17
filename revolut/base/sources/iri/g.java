package iri;

import android.os.Bundle;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends fsi.c {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fsi.b f168054n = new fsi.b("FLOW_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f168055h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BaseDelegatesActivity f168056j;
    public final sri.m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f168057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f168058m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j flowLifecycleStateWrapper, m flowState, BaseDelegatesActivity activity, sri.m navigator) {
        super(f168054n);
        Intrinsics.checkNotNullParameter(flowLifecycleStateWrapper, "flowLifecycleStateWrapper");
        Intrinsics.checkNotNullParameter(flowState, "flowState");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f168055h = flowLifecycleStateWrapper;
        this.i = flowState;
        this.f168056j = activity;
        this.k = navigator;
        this.f168057l = yhm.j.b(new androidx.lifecycle.b(this, 29));
        this.f168058m = new f(this);
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.i.s(bundle);
        }
        this.k.d(this.f168058m);
    }

    @Override // fsi.c, fsi.a
    public final void onDestroy() {
        j jVarE;
        ifm.b bVarF;
        NaviCommand naviCommand;
        sri.m mVar = this.k;
        j jVar = this.f168055h;
        super.onDestroy();
        BaseDelegatesActivity baseDelegatesActivity = this.f168056j;
        String flowName = baseDelegatesActivity.getF85962s0();
        boolean zIsFinishing = baseDelegatesActivity.isFinishing();
        boolean zIsChangingConfigurations = baseDelegatesActivity.isChangingConfigurations();
        if (flowName != null) {
            jri.f fVar = (jri.f) this.f168057l.getValue();
            synchronized (fVar) {
                try {
                    Intrinsics.checkNotNullParameter(flowName, "flowName");
                    if (zIsChangingConfigurations) {
                        for (Map.Entry entry : fVar.f178026b.entrySet()) {
                            fVar.f178026b.put((String) entry.getKey(), jri.e.a((jri.e) entry.getValue(), false, true, 0, 27));
                        }
                    } else {
                        jri.e eVar = (jri.e) fVar.f178026b.get(flowName);
                        if (eVar != null) {
                            int i = eVar.d - 1;
                            if (i < 1 && zIsFinishing && eVar.e) {
                                hri.a aVar = eVar.f178022a;
                                if (aVar != null && (bVarF = aVar.f()) != null) {
                                    bVarF.dispose();
                                }
                                if (aVar != null && (jVarE = aVar.e()) != null) {
                                    i state = i.DISPOSED;
                                    Intrinsics.checkNotNullParameter(state, "state");
                                    jVarE.f168059a = state;
                                }
                                fVar.f178026b.remove(flowName);
                            } else {
                                fVar.f178026b.put(flowName, jri.e.a(eVar, false, false, i, 23));
                            }
                        }
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            if (jVar.f168059a == i.DISPOSED && (naviCommand = jVar.f168060b) != null) {
                mVar.c(naviCommand);
            }
        }
        mVar.e(this.f168058m);
    }

    @Override // fsi.c, fsi.a
    public final void onPause() {
        super.onPause();
        BaseDelegatesActivity baseDelegatesActivity = this.f168056j;
        String flowName = baseDelegatesActivity.getF85962s0();
        boolean zIsFinishing = baseDelegatesActivity.isFinishing();
        if (flowName != null) {
            jri.f fVar = (jri.f) this.f168057l.getValue();
            synchronized (fVar) {
                Intrinsics.checkNotNullParameter(flowName, "flowName");
                jri.e eVar = (jri.e) fVar.f178026b.get(flowName);
                if (eVar != null) {
                    fVar.f178026b.put(flowName, jri.e.a(eVar, zIsFinishing, false, 0, 13));
                }
            }
        }
    }

    @Override // fsi.a
    public final void onResume() {
        j jVar = this.f168055h;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (jVar.f168059a == i.TERMINATING) {
            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, this.k);
            return;
        }
        String flowName = this.f168056j.getF85962s0();
        if (flowName == null) {
            ((jri.f) this.f168057l.getValue()).a();
            return;
        }
        jri.f fVar = (jri.f) this.f168057l.getValue();
        synchronized (fVar) {
            try {
                Intrinsics.checkNotNullParameter(flowName, "flowName");
                jri.e eVar = (jri.e) fVar.f178026b.get(flowName);
                if (eVar != null) {
                    fVar.f178026b.put(flowName, jri.e.a(eVar, false, false, 0, 29));
                }
                fVar.a();
                for (Map.Entry entry : fVar.f178026b.entrySet()) {
                    fVar.f178026b.put((String) entry.getKey(), jri.e.a((jri.e) entry.getValue(), false, false, 0, 29));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // fsi.a
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.i.D(outState);
    }
}
