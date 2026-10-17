package c4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferNote.StructuredNote f21305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f21307c;

    public e(TransferNote.StructuredNote transferNote, List referenceOptions, List errors) {
        Intrinsics.checkNotNullParameter(transferNote, "transferNote");
        Intrinsics.checkNotNullParameter(referenceOptions, "referenceOptions");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f21305a = transferNote;
        this.f21306b = referenceOptions;
        this.f21307c = errors;
    }

    public static e a(e eVar, TransferNote.StructuredNote transferNote, List errors, int i) {
        List referenceOptions = eVar.f21306b;
        if ((i & 4) != 0) {
            errors = eVar.f21307c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(transferNote, "transferNote");
        Intrinsics.checkNotNullParameter(referenceOptions, "referenceOptions");
        Intrinsics.checkNotNullParameter(errors, "errors");
        return new e(transferNote, referenceOptions, errors);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f21305a, eVar.f21305a) && Intrinsics.f(this.f21306b, eVar.f21306b) && Intrinsics.f(this.f21307c, eVar.f21307c);
    }

    public final int hashCode() {
        return this.f21307c.hashCode() + p.a.d(this.f21305a.hashCode() * 31, 31, this.f21306b);
    }
}
