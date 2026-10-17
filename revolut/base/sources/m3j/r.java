package m3j;

import com.revolut.domain.models.banktransfer.AccountFieldType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f202587c = v.k(AccountFieldType.CARD_LAST_FOUR, AccountFieldType.CLABE, AccountFieldType.IBAN, AccountFieldType.ACCOUNT_NUMBER, AccountFieldType.ROUTING_NUMBER, AccountFieldType.ALIAS_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f202588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f202589b;

    public r(h accountFieldsMapper, j avatarMapper, c3j.b bankInformationProvider, t copResultMapper) {
        Intrinsics.checkNotNullParameter(accountFieldsMapper, "accountFieldsMapper");
        Intrinsics.checkNotNullParameter(avatarMapper, "avatarMapper");
        Intrinsics.checkNotNullParameter(bankInformationProvider, "bankInformationProvider");
        Intrinsics.checkNotNullParameter(copResultMapper, "copResultMapper");
        this.f202588a = accountFieldsMapper;
        this.f202589b = avatarMapper;
    }
}
