package qha;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f246577b = new d("plan.cancel.fee_breaking");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f246578c = new d("plan.cancel.fee_cards");
    public static final d d = new d("plan.cancel.fee_lounge_pass");
    public static final d e = new d("plan.cancel.fee_fasttrack");
    public static final d f = new d("plan.cancel.fee_cashback");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f246579g = new d("plan.cancel.fee_esim");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f246580h = new d("plan.cancel.new_plan.billing_fee");
    public static final d i = new d("plan.cancel.tax_vat");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f246581j = new d("plan.family_member");
    public static final d k = new d("plan.individual_fee");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246582a;

    public d(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f246582a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f246582a, ((d) obj2).f246582a);
    }

    public final int hashCode() {
        return this.f246582a.hashCode();
    }
}
