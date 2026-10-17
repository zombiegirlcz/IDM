package q2l;

import com.revolut.retail.feature_widgets.impl.network.WidgetService;
import csh.i;
import elm.f;
import gsh.h;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prl.k;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements i {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetService f241741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f241742b;

    public c(WidgetService service, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f241741a = service;
        this.f241742b = featureToggleInteractor;
    }

    @Override // csh.i
    public final Object a(String str, Map map, gim.c cVar) {
        k kVar = new k(this, str, map, (Continuation) null, 17);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, kVar, cVar);
    }

    @Override // csh.i
    public final Object b(String str, ArrayList arrayList, h hVar) throws Throwable {
        k kVar = new k(this, str, arrayList, (Continuation) null, 18);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, kVar, hVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
