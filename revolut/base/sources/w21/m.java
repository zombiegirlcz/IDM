package w21;

import com.revolut.data.network.models.openbanking.TopUpResponseDto;
import com.revolut.data.network.models.openbanking.mapper.TopupUrlDataMapperKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.q implements Function1 {
    public static final m f = new m();

    public m() {
        super(1, TopupUrlDataMapperKt.class, "toDomain", "toDomain(Lcom/revolut/data/network/models/openbanking/TopUpResponseDto;)Lcom/revolut/domain/models/openbanking/TopupUrlData;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TopUpResponseDto p0 = (TopUpResponseDto) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return TopupUrlDataMapperKt.toDomain(p0);
    }
}
