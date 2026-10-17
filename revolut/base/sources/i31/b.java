package i31;

import com.revolut.data.network.models.moneyrequest.TransferLinkResponseDto;
import com.revolut.data.network.models.moneyrequest.mapper.TransferLinkMappingsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, TransferLinkMappingsKt.class, "toDomain", "toDomain(Lcom/revolut/data/network/models/moneyrequest/TransferLinkResponseDto;)Lcom/revolut/domain/models/moneyrequest/TransferLink;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TransferLinkResponseDto p0 = (TransferLinkResponseDto) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return TransferLinkMappingsKt.toDomain(p0);
    }
}
