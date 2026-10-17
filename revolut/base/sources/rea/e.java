package rea;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.y;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f253563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y91.b f253564b;

    static {
        Intrinsics.checkNotNullParameter("HIDE_ACCOUNT_DETAILS", "id");
    }

    public e(mk0.a personalisationStorage, y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f253563a = personalisationStorage;
        this.f253564b = accountsProductFeatureChecker;
    }

    public final y a() {
        Boolean boolA;
        tk0.b bVar = new tk0.b("HIDE_ACCOUNT_DETAILS");
        jla.c cVarC = bla.b.c(this.f253564b.f311735a, "ACCOUNT_DETAILS");
        return oc.c.t(this.f253563a, bVar, Boolean.valueOf((cVarC == null || (boolA = cVarC.a("hide_details")) == null) ? false : boolA.booleanValue()));
    }
}
