package gsh;

import com.revolut.feature.widgets.impl.network.WidgetService;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements csh.i {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetService f146464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2l.a f146465b;

    public c(WidgetService service, q2l.a widgetRemoteExperimentProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(widgetRemoteExperimentProvider, "widgetRemoteExperimentProvider");
        this.f146464a = service;
        this.f146465b = widgetRemoteExperimentProvider;
    }

    @Override // csh.i
    public final Object a(String str, Map map, gim.c cVar) {
        g23.q qVar = new g23.q(this, str, map, null, 26);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, qVar, cVar);
    }

    @Override // csh.i
    public final Object b(String str, ArrayList arrayList, h hVar) throws Throwable {
        g23.q qVar = new g23.q(this, str, arrayList, null, 27);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, qVar, hVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
