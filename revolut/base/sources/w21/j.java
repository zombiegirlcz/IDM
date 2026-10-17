package w21;

import com.revolut.data.network.models.openbanking.LinkTokenDto;
import kotlin.jvm.internal.h0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j extends h0 {
    public static final j f = new j();

    public j() {
        super(LinkTokenDto.class, "linkToken", "getLinkToken()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.internal.h0, wim.p
    public final Object get(Object obj2) {
        return ((LinkTokenDto) obj2).getLinkToken();
    }
}
