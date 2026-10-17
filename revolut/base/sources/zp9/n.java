package zp9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl3.f f324209a;

    public n(dl3.f contactsMapper, r amountIntoMoneyMapper, o valueMapper) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(amountIntoMoneyMapper, "amountIntoMoneyMapper");
        Intrinsics.checkNotNullParameter(valueMapper, "valueMapper");
        this.f324209a = contactsMapper;
    }
}
