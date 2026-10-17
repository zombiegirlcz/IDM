package w0a;

import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f293675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ItemizationReceiptDeletionData f293676c;

    public e(String str, List splitLineItems, ItemizationReceiptDeletionData itemizationReceiptDeletionData) {
        Intrinsics.checkNotNullParameter(splitLineItems, "splitLineItems");
        this.f293674a = str;
        this.f293675b = splitLineItems;
        this.f293676c = itemizationReceiptDeletionData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f293674a, eVar.f293674a) && Intrinsics.f(this.f293675b, eVar.f293675b) && Intrinsics.f(this.f293676c, eVar.f293676c);
    }

    public final int hashCode() {
        String str = this.f293674a;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f293675b);
        ItemizationReceiptDeletionData itemizationReceiptDeletionData = this.f293676c;
        return iD + (itemizationReceiptDeletionData != null ? itemizationReceiptDeletionData.hashCode() : 0);
    }
}
