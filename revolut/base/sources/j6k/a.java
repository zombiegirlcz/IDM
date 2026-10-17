package j6k;

import com.revolut.shared.feature.payments.money_request.domain.impl.data.network.MoneyRequestService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequestService f171794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f171795b;

    public a(MoneyRequestService moneyRequestService, o moneyRequestRepository) {
        Intrinsics.checkNotNullParameter(moneyRequestService, "moneyRequestService");
        Intrinsics.checkNotNullParameter(moneyRequestRepository, "moneyRequestRepository");
        this.f171794a = moneyRequestService;
        this.f171795b = moneyRequestRepository;
    }
}
