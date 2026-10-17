package jb3;

import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public static ib3.a a(hb3.i dto, String str) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String id10 = dto.getId();
        DateTime expiresAt = dto.getExpiresAt();
        jo3.a amount = dto.getAmount();
        jo3.a fee2 = dto.getFee();
        hb3.b barcode = dto.getBarcode();
        hb3.a disclaimer = dto.getDisclaimer();
        if (str == null) {
            str = dto.getStoreId();
        }
        return new ib3.a(id10, expiresAt, amount, fee2, barcode, disclaimer, str, dto.getCreatedAt());
    }

    public static BarcodeDetails b(ib3.a entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new BarcodeDetails(entity.getId(), entity.getExpiresAt(), mo3.a.o(entity.getAmount()), mo3.a.o(entity.getFee()), entity.getBarcode().getType(), entity.getBarcode().getValue(), entity.getStoreId(), b7l.b.valueOf(entity.getDisclaimer().getProcessor()), entity.getDisclaimer().getHelpLink(), entity.getCreatedAt());
    }
}
