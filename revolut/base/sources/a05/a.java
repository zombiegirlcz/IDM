package a05;

import a08.m;
import a08.x0;
import a09.z;
import a0d.e;
import a0l.n;
import a2i.h;
import androidx.camera.viewfinder.internal.surface.ViewfinderSurface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.NationalIdentifierDocumentController;
import efm.f;
import efm.h0;
import java.util.List;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zp0.x;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements o, g, x, CallbackToFutureAdapter.Resolver, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f127b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f126a = i;
        this.f127b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((e) this.f127b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f126a) {
            case 0:
                a0.c cVar = (a0.c) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar.invoke(p0);
            case 1:
                m mVar = (m) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x0) mVar.invoke(p0);
            case 2:
                m mVar2 = (m) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) mVar2.invoke(p0);
            case 3:
                m mVar3 = (m) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) mVar3.invoke(p0);
            case 4:
                m mVar4 = (m) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) mVar4.invoke(p0);
            case 5:
                a09.a aVar = (a09.a) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar.invoke(p0);
            case 6:
                a09.a aVar2 = (a09.a) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar2.invoke(p0);
            case 7:
                return (List) ((a09.a) this.f127b).invoke(p0);
            case 8:
                a09.a aVar3 = (a09.a) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar3.invoke(p0);
            case 9:
                z zVar = (z) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) zVar.invoke(p0);
            case 10:
                z zVar2 = (z) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) zVar2.invoke(p0);
            case 11:
                z zVar3 = (z) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (b09.c) zVar3.invoke(p0);
            case 12:
                e eVar = (e) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) eVar.invoke(p0);
            case 13:
                e eVar2 = (e) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) eVar2.invoke(p0);
            case 14:
                e eVar3 = (e) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) eVar3.invoke(p0);
            case 15:
            case 17:
            case 18:
            case 25:
            default:
                a09.a aVar4 = (a09.a) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar4.invoke(p0);
            case 16:
                e eVar4 = (e) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) eVar4.invoke(p0);
            case 19:
                a1l.a aVar5 = (a1l.a) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar5.invoke(p0);
            case 20:
                a1l.a aVar6 = (a1l.a) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) aVar6.invoke(p0);
            case 21:
                h hVar = (h) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) hVar.invoke(p0);
            case 22:
                h hVar2 = (h) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Integer) hVar2.invoke(p0);
            case 23:
                h hVar3 = (h) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (t2i.a) hVar3.invoke(p0);
            case 24:
                h hVar4 = (h) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) hVar4.invoke(p0);
            case 26:
                a0.c cVar2 = (a0.c) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar2.invoke(p0);
            case 27:
                a08.o oVar = (a08.o) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qua.p) oVar.invoke(p0);
            case 28:
                a09.a aVar7 = (a09.a) this.f127b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar7.invoke(p0);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((ViewfinderSurface) this.f127b).lambda$new$0(completer);
    }

    @Override // zp0.x
    public void e(String str, String extractedValue, String formattedValue, boolean z) {
        NationalIdentifierDocumentController nationalIdentifierDocumentController = (NationalIdentifierDocumentController) this.f127b;
        KProperty[] kPropertyArr = NationalIdentifierDocumentController.T;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        a0l.a aVarD3 = nationalIdentifierDocumentController.d();
        xel.a value = new xel.a(extractedValue, formattedValue, z);
        n nVar = (n) aVarD3;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        nVar.H2(nVar.f442q, new a08.o(nVar.f441p.c(nVar.o.f104207a, value, true), value, 2));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        a09.a aVar = (a09.a) this.f127b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }
}
