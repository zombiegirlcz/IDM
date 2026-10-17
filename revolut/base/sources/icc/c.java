package icc;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionController;
import efm.h0;
import efm.w;
import i83.m;
import i9g.e0;
import ice.f;
import ieg.s;
import ieg.t;
import java.util.List;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements o, p, kfm.d, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f160241b;

    public /* synthetic */ c(Function function, int i) {
        this.f160240a = i;
        this.f160241b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((iff.b) this.f160241b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f160240a;
        Function function = this.f160241b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((e0) function).invoke(p0);
                return Boolean.TRUE;
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((f) function).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((f) function).invoke(p0);
            case 3:
            case 4:
            case 5:
            case 26:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((gae.a) function).invoke(p0);
            case 6:
                InstrumentsCollectionController.Companion aVar = InstrumentsCollectionController.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((e0) function).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((id1.a) function).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CatalogueProduct) ((id1.a) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((id1.a) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CatalogueCategory) ((id1.a) function).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((id1.a) function).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((e0) function).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CatalogueProduct) ((id1.a) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((id1.a) function).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((e0) function).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (cd1.f) ((e0) function).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((e0) function).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CatalogueCategory) ((id1.a) function).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((i9e.a) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((s) function).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((s) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((t) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((dqd.a) function).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((t) function).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((iff.b) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((iff.b) function).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dj0.d) ((iff.c) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f160240a;
        Function function = this.f160241b;
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((e0) function).invoke(p0)).booleanValue();
            default:
                InstrumentsCollectionController.Companion aVar = InstrumentsCollectionController.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((i9e.a) function).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.d
    public boolean test(Object p0, Object p17) {
        m mVar = (m) this.f160241b;
        InstrumentsCollectionController.Companion aVar = InstrumentsCollectionController.INSTANCE;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return ((Boolean) mVar.invoke(p0, p17)).booleanValue();
    }
}
