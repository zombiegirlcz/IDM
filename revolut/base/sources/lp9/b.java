package lp9;

import com.revolut.feature.payments.bills_chooser.impl.data.ItemizationScanBillService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ItemizationScanBillService f198960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f198961b;

    public b(ItemizationScanBillService service, zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f198960a = service;
        this.f198961b = fileSystemRepository;
    }
}
