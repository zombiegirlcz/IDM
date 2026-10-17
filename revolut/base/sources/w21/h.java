package w21;

import com.revolut.data.network.models.openbanking.penny_verification.AccountInformationServiceUrlResponseDto;
import kotlin.jvm.internal.h0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h extends h0 {
    public static final h f = new h();

    public h() {
        super(AccountInformationServiceUrlResponseDto.class, "authUrl", "getAuthUrl()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.internal.h0, wim.p
    public final Object get(Object obj2) {
        return ((AccountInformationServiceUrlResponseDto) obj2).getAuthUrl();
    }
}
