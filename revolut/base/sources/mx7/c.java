package mx7;

import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;
import org.jetbrains.annotations.NotNull;
import qi3.o;
import te0.s;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements o {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f210221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.chooser.d f210222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx7.f f210223c;
    public final t70.g d;

    public c(i state, com.revolut.feature.chooser.d chooserState, fx7.f petInteractor, t70.g localization) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chooserState, "chooserState");
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f210221a = state;
        this.f210222b = chooserState;
        this.f210223c = petInteractor;
        this.d = localization;
    }

    public static ArrayList b(List list) {
        List<zw7.e> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (zw7.e eVar : list2) {
            String str = eVar.f325773a;
            String str2 = eVar.f325774b;
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            arrayList.add(new ChooserScreenContract$Model(str, str2, null, null, null, null, false, new PetBreedDetailsContract$BreedParam(eVar.f325773a, eVar.f325774b, false), 30700));
        }
        return arrayList;
    }

    @Override // qi3.o
    public final r a() {
        i iVar = this.f210221a;
        r rVarSwitchMap = te0.w.m(iVar.f210229b.h0().a(), iVar.f210230c.q0().a(), ((te0.r) this.f210222b.j()).c(s.f270018a)).switchMap(new bc(new a(this, 0), 5));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return o70.a.a(rVarSwitchMap);
    }
}
