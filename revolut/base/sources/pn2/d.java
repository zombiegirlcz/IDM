package pn2;

import com.revolut.feature.bank_account_switching.impl.data.network.BankAccountSwitchingService;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankAccountSwitchingService f237658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f237659b;

    public d(BankAccountSwitchingService service, d0 switchRequestFormMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(switchRequestFormMapper, "switchRequestFormMapper");
        this.f237658a = service;
        this.f237659b = switchRequestFormMapper;
    }
}
