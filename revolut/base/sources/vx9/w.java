package vx9;

import com.revolut.data.model.Data;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import tof.i7;
import vy5.l0;
import vy5.p0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w implements kfm.o, efm.x, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f292892b;

    public /* synthetic */ w(Object obj2, int i) {
        this.f292891a = i;
        this.f292892b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((vrl.n) this.f292892b).invoke(obj2);
    }

    @Override // efm.x
    public efm.w apply(efm.r observable) {
        p0 p0Var = (p0) this.f292892b;
        Intrinsics.checkNotNullParameter(observable, "observable");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        lfm.e eVar = lfm.e.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(eVar, "disposed(...)");
        ref$ObjectRef.f186409a = eVar;
        return observable.doOnSubscribe(new w(new vrl.n(ref$ObjectRef, p0Var, 21), 20)).doFinally(new r38.c(ref$ObjectRef, 1));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f292891a) {
            case 24:
                vw4.j jVar = (vw4.j) this.f292892b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) jVar.invoke(p0)).booleanValue();
            default:
                vw4.j jVar2 = (vw4.j) this.f292892b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) jVar2.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f292891a;
        Object obj2 = this.f292892b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((v) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((u) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((vrl.n) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((a0) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((a0) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((a0) obj2).invoke(p0);
            case 6:
                KProperty[] kPropertyArr = CardLabelScreen.f64758b0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((vw4.j) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (vy5.a) ((vw4.j) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((aqd.f) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((cia.b) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((b) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((sc7.b) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((l0) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (nce.a) ((l0) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dj0.d) ((vgc.b) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((vw4.j) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((sx4.b) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) ((dv5.g) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) ((vw4.j) obj2).invoke(p0);
            case 19:
            case 20:
            case 24:
            case 26:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((vz1.h) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((vw4.j) obj2).invoke(p0);
            case 22:
                return (Data) ((uyh.r) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((b) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FeatureCommand) ((pyj.b) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FeatureCommand) ((pyj.b) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((vz1.h) obj2).invoke(p0);
        }
    }
}
