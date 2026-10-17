package ozc;

import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.FragmentDestination;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.IntentCommand;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 extends qri.b implements f {

    @NotNull
    private static final p0 Companion = new p0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f231311c;
    public final l0 d;
    public final s70.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(d presentationModel, l0 sowQuestionRoutingDelegate, s70.a intentProvider) {
        super(presentationModel);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(sowQuestionRoutingDelegate, "sowQuestionRoutingDelegate");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f231311c = presentationModel;
        this.d = sowQuestionRoutingDelegate;
        this.e = intentProvider;
    }

    public static ufm.b q(h hVar) {
        FragmentDestination fragmentDestination;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        switch (q0.f231309a[hVar.ordinal()]) {
            case 1:
                g0d.f.Companion.getClass();
                fragmentDestination = g0d.b.f139456b;
                break;
            case 2:
                c0d.d.Companion.getClass();
                fragmentDestination = c0d.a.f20236b;
                break;
            case 3:
                a0d.d.Companion.getClass();
                fragmentDestination = a0d.a.f321b;
                break;
            case 4:
                tzc.e.Companion.getClass();
                fragmentDestination = tzc.a.f275915b;
                break;
            case 5:
                uzc.e.Companion.getClass();
                fragmentDestination = uzc.a.f284659b;
                break;
            case 6:
                b0d.f.Companion.getClass();
                fragmentDestination = b0d.a.f11649b;
                break;
            case 7:
                pzc.d.Companion.getClass();
                fragmentDestination = pzc.a.f240938b;
                break;
            case 8:
            case 9:
                yzc.k.Companion.getClass();
                fragmentDestination = yzc.g.f318075b;
                break;
            case 10:
            case 11:
                h0d.l.Companion.getClass();
                fragmentDestination = h0d.a.f148349b;
                break;
            case 12:
                wzc.e.Companion.getClass();
                fragmentDestination = wzc.a.f301406b;
                break;
            case 13:
                yzc.k.Companion.getClass();
                fragmentDestination = yzc.g.f318075b;
                break;
            case 14:
                e0d.e.Companion.getClass();
                fragmentDestination = e0d.a.f121559b;
                break;
            case 15:
                xzc.d.Companion.getClass();
                fragmentDestination = xzc.a.f309920b;
                break;
            case 16:
                f0d.g.Companion.getClass();
                fragmentDestination = f0d.a.f131083b;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ufm.b bVarM = efm.d0.m(new FragmentNavigateCommand(fragmentDestination, null, true, 2042));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // swl.b
    public final void a() {
        this.f248734a.onNext(new IntentCommand(((s70.b) this.e).b(), null));
    }

    @Override // qri.b
    public final ufm.b e() {
        ufm.b bVarM = efm.d0.m(new FinishCommand(null, null, null, 7));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // qri.b
    public final ufm.b f() {
        ufm.b bVarM = efm.d0.m(DummyCommand.f98635a);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // qri.b
    public final /* bridge */ /* synthetic */ ufm.b h(Object obj2, Boolean bool) {
        return q((h) obj2);
    }

    @Override // qri.b
    public final efm.k j(Object obj2) {
        h hVar = (h) obj2;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        rfm.u uVarG = efm.k.g(hVar);
        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
        rfm.m mVar = new rfm.m(uVarG, new j0(1, new n0(this, 11)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // qri.b
    public final efm.k k(Object obj2) {
        h hVar = (h) obj2;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        rfm.u uVarG = efm.k.g(hVar);
        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
        rfm.m mVar = new rfm.m(uVarG, new j0(2, new n0(this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // qri.b
    public final efm.d0 n() {
        return te0.w.j(h.STATE);
    }

    public final rfm.j p() {
        ufm.b bVarM = efm.d0.m(Boolean.valueOf(((t) this.f231311c).E3()));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        rfm.j jVar = new rfm.j(bVarM, new j0(12, new n(23)), 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return jVar;
    }

    public final pfm.h r(h hVar) {
        ((t) this.f231311c).c1(hVar);
        pfm.h hVar2 = new pfm.h(new ufm.f(new ufm.i(q(hVar), new j0(19, new n(27)), 1), new j0(20, new n0(this, 10)), 0), 4);
        Intrinsics.checkNotNullExpressionValue(hVar2, "ignoreElement(...)");
        return hVar2;
    }

    public final boolean s() {
        t tVar = (t) this.f231311c;
        if (!tVar.q3().d()) {
            return false;
        }
        gzc.i iVar = (gzc.i) zhm.d0.d0((List) tVar.q3().c());
        return Intrinsics.f(iVar != null ? iVar.f148003a : null, "OTHER");
    }

    public final ufm.i t() {
        efm.d0 d0VarFirstOrError = ((s0) ((t) this.f231311c).f231329b).N0().c(te0.s.f270018a).map(new j0(14, new n(24))).firstOrError();
        j0 j0Var = new j0(15, new n(25));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, j0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
