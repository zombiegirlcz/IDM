package wph;

import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a f299324b;

    public /* synthetic */ a(com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a aVar, int i) {
        this.f299323a = i;
        this.f299324b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f299323a) {
            case 0:
                List collections = (List) obj2;
                Intrinsics.checkNotNullParameter(collections, "collections");
                Iterator it8 = collections.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((ScreenerCollection) next).f105154a, this.f299324b.o.f96234a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (ScreenerCollection) next;
            default:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.f) {
                    com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a aVar = this.f299324b;
                    aVar.n2(new d(aVar, null, 0), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
