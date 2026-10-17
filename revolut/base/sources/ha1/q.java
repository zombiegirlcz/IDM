package ha1;

import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f150383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f150384c;

    public /* synthetic */ q(u uVar, String str, int i) {
        this.f150382a = i;
        this.f150383b = uVar;
        this.f150384c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ga1.o requestDto = (ga1.o) obj2;
        switch (this.f150382a) {
            case 0:
                Intrinsics.checkNotNullParameter(requestDto, "requestDto");
                u uVar = this.f150383b;
                d0<ga1.p> d0VarAuthorizePayment = uVar.f150389a.authorizePayment(this.f150384c, requestDto);
                j jVar = new j(26, new gwc.h(1, uVar.f150391c, ia1.d.class, "toDomain", "toDomain(Lcom/revolut/feature/acquiring/card_reader/data/impl/data/model/PaymentAuthorizationResponseDto;)Lcom/revolut/feature/acquiring/card_reader/data/api/domain/model/PaymentAuthorization;", 0, 21));
                d0VarAuthorizePayment.getClass();
                return new ufm.i(d0VarAuthorizePayment, jVar, 1);
            default:
                Intrinsics.checkNotNullParameter(requestDto, "requestDto");
                u uVar2 = this.f150383b;
                d0<ga1.p> d0VarAuthenticatePayment = uVar2.f150389a.authenticatePayment(this.f150384c, requestDto);
                j jVar2 = new j(22, new gwc.h(1, uVar2.f150391c, ia1.d.class, "toDomain", "toDomain(Lcom/revolut/feature/acquiring/card_reader/data/impl/data/model/PaymentAuthorizationResponseDto;)Lcom/revolut/feature/acquiring/card_reader/data/api/domain/model/PaymentAuthorization;", 0, 20));
                d0VarAuthenticatePayment.getClass();
                return new ufm.i(d0VarAuthenticatePayment, jVar2, 1);
        }
    }
}
