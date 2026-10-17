package mf;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.j;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e extends FragmentManager.FragmentLifecycleCallbacks {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qf.a f204814g = qf.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f204815a = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah.a f204816c;
    public final wf.e d;
    public final c e;
    public final f f;

    public e(ah.a aVar, wf.e eVar, c cVar, f fVar) {
        this.f204816c = aVar;
        this.d = eVar;
        this.e = cVar;
        this.f = fVar;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        com.google.firebase.perf.util.f fVar;
        super.onFragmentPaused(fragmentManager, fragment);
        Object[] objArr = {fragment.getClass().getSimpleName()};
        qf.a aVar = f204814g;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.f204815a;
        if (!weakHashMap.containsKey(fragment)) {
            aVar.g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        f fVar2 = this.f;
        HashMap map = fVar2.f204819c;
        qf.a aVar2 = f.e;
        if (!fVar2.d) {
            aVar2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            fVar = new com.google.firebase.perf.util.f();
        } else if (map.containsKey(fragment)) {
            rf.c cVar = (rf.c) map.remove(fragment);
            com.google.firebase.perf.util.f fVarA = fVar2.a();
            if (fVarA.b()) {
                rf.c cVar2 = (rf.c) fVarA.a();
                fVar = new com.google.firebase.perf.util.f(new rf.c(cVar2.f253665a - cVar.f253665a, cVar2.f253666b - cVar.f253666b, cVar2.f253667c - cVar.f253667c));
            } else {
                aVar2.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                fVar = new com.google.firebase.perf.util.f();
            }
        } else {
            aVar2.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            fVar = new com.google.firebase.perf.util.f();
        }
        if (!fVar.b()) {
            aVar.g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            j.a(trace, (rf.c) fVar.a());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        f204814g.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.d, this.f204816c, this.e);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f204815a.put(fragment, trace);
        f fVar = this.f;
        HashMap map = fVar.f204819c;
        qf.a aVar = f.e;
        if (!fVar.d) {
            aVar.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (map.containsKey(fragment)) {
            aVar.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        com.google.firebase.perf.util.f fVarA = fVar.a();
        if (fVarA.b()) {
            map.put(fragment, (rf.c) fVarA.a());
        } else {
            aVar.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
