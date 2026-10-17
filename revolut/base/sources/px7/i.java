package px7;

import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.r;
import org.jetbrains.annotations.NotNull;
import te0.j;
import te0.v;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends iri.a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f240580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f240581c;
    public static final /* synthetic */ KProperty[] d = {o0.f186429a.j(new h0(i.class, "dateOfBirth", "getDateOfBirth()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    @NotNull
    private static final a Companion = new a();
    public static final DOBInputData.Empty e = DOBInputData.Empty.d;

    public static final class a {
        private a() {
        }
    }

    public i() {
        j jVar = new j(e);
        this.f240580b = jVar;
        this.f240581c = new r(jVar.getValue(this, d[0]), 1);
    }

    @Override // rz7.g
    public final v getDateOfBirth() {
        return this.f240580b.getValue(this, d[0]);
    }

    @Override // nx7.b0
    public final efm.b reset() {
        pfm.h hVar = new pfm.h(new oma.r(this, 9), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f240581c;
    }
}
