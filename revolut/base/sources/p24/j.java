package p24;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.q implements Function1 {
    public static final j f = new j();

    public j() {
        super(1, n14.k.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/application/plugins/impl/network/models/SpousalConsentInfoDto;)Lcom/revolut/feature/credit/application/plugins/api/models/SpousalConsentInfo;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        tz3.m p0 = (tz3.m) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        String phoneNumber = p0.getPhoneNumber();
        String firstName = p0.getFirstName();
        String lastName = p0.getLastName();
        Integer loanDuration = p0.getLoanDuration();
        jo3.a loanAmount = p0.getLoanAmount();
        dj0.d dVarO = loanAmount != null ? mo3.a.o(loanAmount) : null;
        tz3.c content = p0.getContent();
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new au3.d(phoneNumber, firstName, lastName, dVarO, loanDuration, new au3.c(content.getTitle(), content.getTerms()));
    }
}
