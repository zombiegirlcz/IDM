package hg6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg6.a f152108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ig6.b f152109b;

    public a(kg6.a indiaUpiAppInteractor, ig6.b indiaNetBankingInstitutionsInteractor) {
        Intrinsics.checkNotNullParameter(indiaUpiAppInteractor, "indiaUpiAppInteractor");
        Intrinsics.checkNotNullParameter(indiaNetBankingInstitutionsInteractor, "indiaNetBankingInstitutionsInteractor");
        this.f152108a = indiaUpiAppInteractor;
        this.f152109b = indiaNetBankingInstitutionsInteractor;
    }
}
