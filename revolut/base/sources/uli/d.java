package uli;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281029a;

    public d() {
        String[] elements = {"waiting-list", "send-money-list", "request-money-list", "faq", "institution-auth", "topup-institution-auth", "one-off-topup-institution-auth", "wallet", "payments", "dashboard", "linked-accounts", "gifts", "money-requests", "skip_wallet_screen", "3ds"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f281029a = kotlin.collections.d.L(elements);
    }
}
