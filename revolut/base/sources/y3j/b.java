package y3j;

import kotlin.jvm.internal.Intrinsics;
import n4j.h;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s4j.a f310741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f310742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zq.a f310743n;
    public final z3j.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t3j.c f310744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n4j.c f310745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f310746r;

    public b(s4j.a idGenerator, h definitionTransformer, zq.a formattingValidator, z3j.b automaticCountryChangeDelegate, t3j.c countryChangeDelegate, n4j.c beneficiaryCreationUtils, c maskedInputPasteHandler) {
        Intrinsics.checkNotNullParameter(idGenerator, "idGenerator");
        Intrinsics.checkNotNullParameter(definitionTransformer, "definitionTransformer");
        Intrinsics.checkNotNullParameter(formattingValidator, "formattingValidator");
        Intrinsics.checkNotNullParameter(automaticCountryChangeDelegate, "automaticCountryChangeDelegate");
        Intrinsics.checkNotNullParameter(countryChangeDelegate, "countryChangeDelegate");
        Intrinsics.checkNotNullParameter(beneficiaryCreationUtils, "beneficiaryCreationUtils");
        Intrinsics.checkNotNullParameter(maskedInputPasteHandler, "maskedInputPasteHandler");
        this.f310741l = idGenerator;
        this.f310742m = definitionTransformer;
        this.f310743n = formattingValidator;
        this.o = automaticCountryChangeDelegate;
        this.f310744p = countryChangeDelegate;
        this.f310745q = beneficiaryCreationUtils;
        this.f310746r = maskedInputPasteHandler;
    }
}
